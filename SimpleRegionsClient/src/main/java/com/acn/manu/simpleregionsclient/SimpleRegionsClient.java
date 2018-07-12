/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.simpleregionsclient;

import com.acn.manu.wsimpl.RegionWSImpl_Service;
import com.acn.manu.wsimpl.Regions;
import java.util.List;

/**
 *
 * @author manuela.mondelli
 */
public class SimpleRegionsClient {

    public static void main(String[] args) {

        String name = args[0];

        RegionWSImpl_Service regionWS = new RegionWSImpl_Service();
        List<Regions> list = regionWS.getRegionWSImplPort().regionByName(name).getListRegions();
        System.out.println("Result of research: ");
        for (Regions regions : list) {
            System.out.println(" id: "+regions.getRegionId()+ " name: "+regions.getRegionName());
        }
    }

}
