package com.ibm.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ibm.model.Employee;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/user/getEmployeesList", produces = "application/json")
    @ResponseBody
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setEmpId("emp1");
        emp1.setEmpName("emp1");
        employees.add(emp1);
        Employee emp2 = new Employee();
        emp2.setEmpId("emp2");
        emp2.setEmpName("emp2");
        employees.add(emp2);
        Employee emp3 = new Employee();
        emp3.setEmpId("emp3");
        emp3.setEmpName("emp3");
        employees.add(emp3);
        return employees;

    }

}