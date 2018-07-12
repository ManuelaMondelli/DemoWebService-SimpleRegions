/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.services;

import com.acn.manu.model.Regions;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author manuela.mondelli
 */
public interface ServiceRegion {
    
    public List<Regions> getRegions(EntityManager em);
    
    public List<Regions> getRegionName(int id, EntityManager em);
    
    public List<Regions> getRegionID(String name, EntityManager em);
}
