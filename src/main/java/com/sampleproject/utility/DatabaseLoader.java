package com.sampleproject.utility;

import com.sampleproject.models.Employee;
import com.sampleproject.models.Project;
import com.sampleproject.repositories.EmployeeRepository;
import com.sampleproject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by MK on 09.06.2016.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final ProjectRepository projectRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository, ProjectRepository projectRepository) {
        this.employeeRepository = employeeRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.employeeRepository.save(new Employee("Bilbo", "Baggins", "tr-8r"));
        this.employeeRepository.save(new Employee("Swagnalf", "The white", "shitty wizard"));
        this.projectRepository.save(new Project("Proj1"));
        this.projectRepository.save(new Project("Proj2"));
        this.projectRepository.save(new Project("Proj3"));
    }
}