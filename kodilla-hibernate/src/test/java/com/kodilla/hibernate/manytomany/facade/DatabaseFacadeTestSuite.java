package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseFacadeTestSuite {
    @Autowired
    private DatabaseFacade databaseFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testFindEmployees() {
        //Given
        Employee employee1 = new Employee("Anthony", "Sanber");
        Employee employee2 = new Employee("Miriam", "Amber");
        Employee employee3 = new Employee("John", "Al");

        employeeDao.save(employee1);
        int id1 = employee1.getId();
        employeeDao.save(employee2);
        int id2 = employee2.getId();
        employeeDao.save(employee3);
        int id3 = employee3.getId();

        //When, Then

        databaseFacade.retrieveEmployeesWithFragmentOfName("ber");

        employeeDao.deleteById(id1);
        employeeDao.deleteById(id2);
        employeeDao.deleteById(id3);
    }

    @Test
    public void testFindCompanies() {
        //Given
        Company company1 = new Company("Net");
        Company company2 = new Company("AlanNet");
        Company company3 = new Company("WebBreaker");

        companyDao.save(company1);
        int id1 = company1.getId();
        companyDao.save(company2);
        int id2 = company2.getId();
        companyDao.save(company3);
        int id3 = company3.getId();

        //When, Then
        databaseFacade.retrieveCompaniesWihFragmentOfName("Net");
        companyDao.deleteById(id1);
        companyDao.deleteById(id2);
        companyDao.deleteById(id3);
    }
}