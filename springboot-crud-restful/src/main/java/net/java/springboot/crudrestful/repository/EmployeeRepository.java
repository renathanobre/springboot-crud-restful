package net.java.springboot.crudrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.crudrestful.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
