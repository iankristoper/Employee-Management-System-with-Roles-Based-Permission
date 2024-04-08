package com.ian.employee_management_system_role_based_permissions;

/**
 *
 * @author Ian Tagano
 */

public class ManagerRole implements EmployeeRole
{
    @Override
    public void viewEmployeeDetails() 
    {
        System.out.println("Manager can view employee details.");
    }

    @Override
    public void editEmployeeDetails() 
    {
        System.out.println("Manager can edit employee details.");
    }

    @Override
    public void deleteEmployee() 
    {
        System.out.println("Manager can delete employee.");
    }
}
