/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.simpleregionsclient;

import com.acn.manu.wsimpl.DtoResponseRegion;
import com.acn.manu.wsimpl.RegionWSImpl_Service;
import com.acn.manu.wsimpl.Regions;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author manuela.mondelli
 */
public class SimpleRegionsJaxB {

    public static void main(String[] args) throws JAXBException {
         
       RegionWSImpl_Service regionWS = new RegionWSImpl_Service();
       DtoResponseRegion list = regionWS.getRegionWSImplPort().allRegions(); 

        File file = new File("C:\\Project\\TestClientSimpleRegions.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(DtoResponseRegion.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(list,  file);
        jaxbMarshaller.marshal(list,  System.out);
        
    }
}
