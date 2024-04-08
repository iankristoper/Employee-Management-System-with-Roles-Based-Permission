package com.ian.employee_management_system_role_based_permissions;

/**
 *
 * @author Ian Tagano
 */

public class StaffRole implements EmployeeRole
{
    @Override
    public void viewEmployeeDetails() 
    {
        System.out.println("Staff can view employee details.");
    }

    @Override
    public void editEmployeeDetails() 
    {
        System.out.println("Staff cannot edit employee details.");
    }

    @Override
    public void deleteEmployee() 
    {
        System.out.println("Staff cannot delete employee.");
    }
}
