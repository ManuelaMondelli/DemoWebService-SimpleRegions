/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.wsimpl;

import com.acn.manu.dto.DtoResponseRegion;
import com.acn.manu.model.Regions;
import com.acn.manu.services.ServiceRegionImpl;
import com.acn.manu.utilities.Utility;
import java.util.List;
import java.util.regex.Pattern;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author manuela.mondelli
 */
@WebService(serviceName = "RegionWSImpl")
public class RegionWSImpl {

    private ServiceRegionImpl serviceRegion;
    private List<Regions> resultList;
    private DtoResponseRegion response;
    private Utility utility;
    private final Pattern patternChar = Pattern.compile("^[a-zA-Z]+$");
    private final Pattern patternNumb = Pattern.compile("[0-9]");

    @PersistenceContext
    private EntityManager em;

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "allRegions")
    public DtoResponseRegion getRegionName() {
        serviceRegion = new ServiceRegionImpl();
        response = new DtoResponseRegion();
        resultList = serviceRegion.getRegions(em);
        response.setMessage("Region List: ");
        response.setListRegions(resultList);
        return response;
    }

    /**
     * Web service operation
     *
     * @param id
     * @return
     */
    @WebMethod(operationName = "RegionByID")
    public DtoResponseRegion RegionByID(@WebParam(name = "Region_ID") String idR) {
        response = new DtoResponseRegion();
        if ((idR == null) || (idR.isEmpty())) {
            response.setMessage("Inserire un Region ID!");
        } else {
            boolean val = false;
            val = patternNumb.matcher(idR).matches();
            if (val == true) {
                int id = Integer.parseInt(idR);
                utility = new Utility();
                if (id > utility.maxId(em)) {
                    response.setMessage("Region ID non presente!");
                } else {
                    serviceRegion = new ServiceRegionImpl();
                resultList = serviceRegion.getRegionName(id, em);
//                response.setMessage("Result of research");
                response.setListRegions(resultList);
                }
            } else {
                response.setMessage("Inserire un Region ID che contenga solo numeri!");
            }
        }
        return response;
    }

    /**
     * Web service operation
     *
     * @param name
     * @return
     */
    @WebMethod(operationName = "RegionByName")
    public DtoResponseRegion RegionByName(@WebParam(name = "Region_Name") String name) {
        response = new DtoResponseRegion();
        if (name.isEmpty()) {
            response.setMessage("Inserire Region Name!");
        } else {
            boolean val = false;
            val = patternChar.matcher(name).matches();
            if (val == true) {
                serviceRegion = new ServiceRegionImpl();
                resultList = serviceRegion.getRegionID(name, em);
                if (resultList.isEmpty()) {
                    response.setMessage("Region Name non presente!");
                } else {
                    response.setMessage("Result of research");
                    response.setListRegions(resultList);
                }
            } else {
                response.setMessage("Inserire Region Name che contenga solo lettere!");
            }
        }
        return response;
    }
}
