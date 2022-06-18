package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("employee")
    public List<EmployeeDto> getEmployeesByName(@RequestParam() String lastName ) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();

        List<Employee> employeeList = repository.findByLastName(lastName);

        employeeList.forEach(employee -> {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setLast_Name(employee.getLastName());
            employeeDto.setEmplyee_id(employee.getId());

            employeeDtoList.add(employeeDto);
        });
        return employeeDtoList;
    }
}
