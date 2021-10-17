package ru.ivlasov.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ivlasov.spring.rest.entity.Employee;
import ru.ivlasov.spring.rest.exceptionHandlers.EmployeeIncorrectData;
import ru.ivlasov.spring.rest.exceptionHandlers.NoSuchEmployeeException;
import ru.ivlasov.spring.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FRestController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        Employee e = employeeService.findEmployeeById(id);
        if (e == null) {
            throw new NoSuchEmployeeException("There is no Employee with id = "
                    + id + " in database");
        }
        return e;
    }

}
