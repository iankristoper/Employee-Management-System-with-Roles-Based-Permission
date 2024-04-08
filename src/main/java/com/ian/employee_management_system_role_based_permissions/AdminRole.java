package com.ian.employee_management_system_role_based_permissions;

/**
 *
 * @author Ian Tagano
 */

public class AdminRole implements EmployeeRole
{
    @Override
    public void viewEmployeeDetails() 
    {
        System.out.println("Admin can view employee details.");
    }

    @Override
    public void editEmployeeDetails() 
    {
        System.out.println("Admin can edit employee details.");
    }

    @Override
    public void deleteEmployee() 
    {
        System.out.println("Admin can delete employee.");
    }
}
