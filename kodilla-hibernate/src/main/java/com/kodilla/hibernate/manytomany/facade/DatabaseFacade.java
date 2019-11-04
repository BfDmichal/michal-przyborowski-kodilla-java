package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public void retrieveEmployeesWithFragmentOfName(final String nameFragment) {
        String name = "%" + nameFragment + "%";
        List<Employee> employees = employeeDao.retrieveEmployeesWithFragmentOfName(name);
        if (employees.isEmpty()) {
            System.out.println("Not found employees");
        } else {
            System.out.println("Employees found");
            employees.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));
        }
    }

    public void retrieveCompaniesWihFragmentOfName(final String nameFragment) {
        String name = "%" + nameFragment + "%";
        List<Company> companies = companyDao.retrieveCompaniesWithFragmentOfName(name);
        if (companies.isEmpty()) {
            System.out.println("Not found companies");
        } else {
            System.out.println("Companies found");
            companies.forEach(company -> System.out.println(company.getId() + " " + company.getName()));
        }
    }
}