/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.dto;

import com.acn.manu.model.Regions;
import java.util.List;

/**
 *
 * @author manuela.mondelli
 */
public class DtoResponseRegion {
    private String message;
    private List<Regions> listRegions;

    public DtoResponseRegion() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Regions> getListRegions() {
        return listRegions;
    }

    public DtoResponseRegion(String message, List<Regions> listRegions) {
        this.message = message;
        this.listRegions = listRegions;
    }

    public void setListRegions(List<Regions> listRegions) {
        this.listRegions = listRegions;
    }

    @Override
    public String toString() {
        return "DtoResponseRegion{" + "message=" + message + ", nameRegion=" + listRegions + '}';
    }

  
    
}
