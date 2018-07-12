package com.acn.manu.model;

import com.acn.manu.model.Countries;
import com.acn.manu.model.Departments;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T17:27:39")
@StaticMetamodel(Locations.class)
public class Locations_ { 

    public static volatile SingularAttribute<Locations, String> streetAddress;
    public static volatile SingularAttribute<Locations, String> city;
    public static volatile SingularAttribute<Locations, Short> locationId;
    public static volatile ListAttribute<Locations, Departments> departmentsList;
    public static volatile SingularAttribute<Locations, String> postalCode;
    public static volatile SingularAttribute<Locations, String> stateProvince;
    public static volatile SingularAttribute<Locations, Countries> countryId;

}