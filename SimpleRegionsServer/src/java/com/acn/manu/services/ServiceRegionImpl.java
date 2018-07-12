/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.services;

import com.acn.manu.dao.DaoRegionImpl;
import com.acn.manu.model.Regions;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class ServiceRegionImpl implements ServiceRegion {
    
    
    private DaoRegionImpl daoRegion;
    private List<Regions> resultList;
    
    
    public ServiceRegionImpl() {
        this.daoRegion = new DaoRegionImpl();
    }
   
    
    @Override
    public List<Regions> getRegions(EntityManager em){
        resultList = daoRegion.findAllRegions(em);
        return resultList;
    }

    @Override
    public List<Regions> getRegionName(int id, EntityManager em) {
       resultList = daoRegion.findByRegionId(id, em);
        return resultList;
    }

    @Override
    public List<Regions> getRegionID(String name, EntityManager em) {
        resultList = daoRegion.findByRegionName(name, em);
        return resultList;
    }
    
}
