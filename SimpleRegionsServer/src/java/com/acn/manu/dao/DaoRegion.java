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
public interface DaoRegion{
    
    public List<Regions> findAllRegions(EntityManager em);
    
    public List<Regions> findByRegionId(int id, EntityManager em);
    
    public List<Regions> findByRegionName(String name, EntityManager em);
    
}
