package ru.ivlasov.spring.rest.service;

import ru.ivlasov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee e);

    public Employee findEmployeeById(int id);

    public void deleteEmployee(int id);
}
