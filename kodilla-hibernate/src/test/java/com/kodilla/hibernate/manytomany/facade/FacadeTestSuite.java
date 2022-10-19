package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private TasksFacade tasksFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testEmployeeSearch() {

        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Jack", "Brown");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        //When
        List<Employee> result = tasksFacade.findEmployeeByPartName("row");
        //Then
        assertEquals(1, result.size());
        //Cleanup
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
    }

    @Test
    public void testCompanySearch() {
        //Given
        Company company1 = new Company("Google");
        Company company2 = new Company("Empik");
        companyDao.save(company1);
        companyDao.save(company2);
        //When
        List<Company> result = tasksFacade.findCompanyByPartName("mpi");
        //Then
        assertEquals(1, result.size());
        //Cleanup
        companyDao.delete(company1);
        companyDao.delete(company2);
    }
}
