/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.utilities;

import com.acn.manu.model.Regions;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author manuela.mondelli
 */
public class Utility {
    
    private Query query;
    private int maxID;
    private Regions region;
    private boolean result;
    private List<Regions> Lista;

    public Utility(){
        
    }

    public int maxId(EntityManager em){
        maxID = em.createQuery("select max(r.regionId) from Regions r", BigDecimal.class).getSingleResult().intValue();
        return maxID;
}
    
}