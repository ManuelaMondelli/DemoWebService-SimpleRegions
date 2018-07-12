/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.utilities;

import com.acn.manu.model.Regions;
import java.sql.Connection;
import java.util.List;
import javax.activation.DataSource;
import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author manuela.mondelli
 */
public class TestConn {
    
    @PersistenceContext(unitName = "SimpleRegionsPU" )
    static EntityManager em;
    static EntityManagerFactory emf;
    
    public static void main(String...args){
        
         emf= Persistence.createEntityManagerFactory("SimpleRegionsPU");
         List<Regions> list = emf.createEntityManager().createNamedQuery("Regions.findAll", Regions.class).getResultList();
         list.forEach(System.out::println);
        
       
    }
    
    
   
}
