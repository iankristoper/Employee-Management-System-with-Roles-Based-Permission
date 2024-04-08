package com.ian.employee_management_system_role_based_permissions;

/**
 *
 * @author Ian Tagano
 */

public class Employee 
{
    //private instance variable for the emplyee
    private String name;
    private EmployeeRole role;  //uses the interface as data type reference
    
    
    //constrcutor for the class employee 
    public Employee(String name, EmployeeRole role)
    {
        this.name = name;
        this.role = role;
    }
    
    //accessing the methods in the interface
    public void viewEmployeeDetails()
    {
        role.viewEmployeeDetails();
    }
    
    public void editEmployeeDetails() 
    {
        role.editEmployeeDetails();
    }

    public void deleteEmployee() 
    {
        role.deleteEmployee();
    }
}
