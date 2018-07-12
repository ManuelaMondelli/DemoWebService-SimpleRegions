/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.dao;

import com.acn.manu.model.Regions;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public class DaoRegionImpl implements DaoRegion {
    
    private List<Regions> resultList;

    @Override
    public List<Regions> findAllRegions(EntityManager em){
        return em.createNamedQuery("Regions.findAll").getResultList();
    }

    @Override
    public List<Regions> findByRegionId(int id, EntityManager em) { 
        return em.createNamedQuery("Regions.findByRegionId", Regions.class).setParameter("regionId", id).getResultList();
    }

    @Override
    public List<Regions> findByRegionName(String name, EntityManager em) {
        return em.createNamedQuery("Regions.findByRegionName", Regions.class).setParameter("regionName", name).getResultList();
    }
    
}
