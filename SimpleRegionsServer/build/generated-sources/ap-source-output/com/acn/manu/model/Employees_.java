package com.acn.manu.model;

import com.acn.manu.model.Departments;
import com.acn.manu.model.Employees;
import com.acn.manu.model.Jobs;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T17:27:39")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, String> lastName;
    public static volatile SingularAttribute<Employees, Date> hireDate;
    public static volatile ListAttribute<Employees, Employees> employeesList;
    public static volatile SingularAttribute<Employees, Departments> departmentId;
    public static volatile SingularAttribute<Employees, Integer> employeeId;
    public static volatile SingularAttribute<Employees, Employees> managerId;
    public static volatile SingularAttribute<Employees, BigDecimal> salary;
    public static volatile SingularAttribute<Employees, BigDecimal> commissionPct;
    public static volatile SingularAttribute<Employees, String> firstName;
    public static volatile SingularAttribute<Employees, Jobs> jobId;
    public static volatile SingularAttribute<Employees, String> phoneNumber;
    public static volatile ListAttribute<Employees, Departments> departmentsList;
    public static volatile SingularAttribute<Employees, String> email;

}