package io.devik.hello_spring.repos;

import io.devik.hello_spring.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
