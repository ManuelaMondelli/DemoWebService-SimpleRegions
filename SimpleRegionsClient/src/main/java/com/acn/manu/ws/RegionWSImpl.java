
package com.acn.manu.wsimpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RegionWSImpl", targetNamespace = "http://wsimpl.manu.acn.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RegionWSImpl {


    /**
     * 
     * @return
     *     returns com.acn.manu.wsimpl.DtoResponseRegion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "allRegions", targetNamespace = "http://wsimpl.manu.acn.com/", className = "com.acn.manu.wsimpl.AllRegions")
    @ResponseWrapper(localName = "allRegionsResponse", targetNamespace = "http://wsimpl.manu.acn.com/", className = "com.acn.manu.wsimpl.AllRegionsResponse")
    @Action(input = "http://wsimpl.manu.acn.com/RegionWSImpl/allRegionsRequest", output = "http://wsimpl.manu.acn.com/RegionWSImpl/allRegionsResponse")
    public DtoResponseRegion allRegions();

    /**
     * 
     * @param regionID
     * @return
     *     returns com.acn.manu.wsimpl.DtoResponseRegion
     */
    @WebMethod(operationName = "RegionByID")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RegionByID", targetNamespace = "http://wsimpl.manu.acn.com/", className = "com.acn.manu.wsimpl.RegionByID")
    @ResponseWrapper(localName = "RegionByIDResponse", targetNamespace = "http://wsimpl.manu.acn.com/", className = "com.acn.manu.wsimpl.RegionByIDResponse")
    @Action(input = "http://wsimpl.manu.acn.com/RegionWSImpl/RegionByIDRequest", output = "http://wsimpl.manu.acn.com/RegionWSImpl/RegionByIDResponse")
    public DtoResponseRegion regionByID(
        @WebParam(name = "Region_ID", targetNamespace = "")
        String regionID);

    /**
     * 
     * @param regionName
     * @return
     *     returns com.acn.manu.wsimpl.DtoResponseRegion
     */
    @WebMethod(operationName = "RegionByName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RegionByName", targetNamespace = "http://wsimpl.manu.acn.com/", className = "com.acn.manu.wsimpl.RegionByName")
    @ResponseWrapper(localName = "RegionByNameResponse", targetNamespace = "http://wsimpl.manu.acn.com/", className = "com.acn.manu.wsimpl.RegionByNameResponse")
    @Action(input = "http://wsimpl.manu.acn.com/RegionWSImpl/RegionByNameRequest", output = "http://wsimpl.manu.acn.com/RegionWSImpl/RegionByNameResponse")
    public DtoResponseRegion regionByName(
        @WebParam(name = "Region_Name", targetNamespace = "")
        String regionName);

}
