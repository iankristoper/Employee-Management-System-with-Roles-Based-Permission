package com.ian.employee_management_system_role_based_permissions;

/**
 *
 * @author Ian Tagano
 */

public class Employee_Management_System_Role_based_Permissions 
{

    public static void main(String[] args) 
    {
        // Create employees with different roles
        Employee manager = new Employee("John", new ManagerRole());
        Employee staff = new Employee("Alice", new StaffRole());
        Employee admin = new Employee("Bob", new AdminRole());

        // Perform actions based on roles
        manager.viewEmployeeDetails();
        manager.editEmployeeDetails();
        manager.deleteEmployee();

        staff.viewEmployeeDetails();
        staff.editEmployeeDetails();
        staff.deleteEmployee();

        admin.viewEmployeeDetails();
        admin.editEmployeeDetails();
        admin.deleteEmployee();
    }
}
