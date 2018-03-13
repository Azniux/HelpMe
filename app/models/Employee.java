package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {
    
        // Properties
        @Id
        private Long id;
        @Constraints.Required
        private String name;
        @ManyToOne
        private Department department;
        @ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")
        public List<Project> projects;
        @ManyToOne
        private Project project;
        @Constraints.Required
        private String description; 
        public List<Long> projSelect = new ArrayList<Long>();

        public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
    

        public static final List<Employee> findAll() { 
            
                    return Employee.find.all();
        }
        // Default Constructor
        public Employee() {
        }
    
        // Constructor to initialise object
        public Employee(Long id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }
    
        // Accessor methods
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Department getDepartment() {
            return department;
        }
        
        public void setDepartment(Department c) {
            this.department = c;
        }
        public String getDescription() { 
            return description; 
        } 

        
        public void setDescription(String description) { 
            this.description = description; 
        } 
        
       
        
        public List<Long> getProjSelect(){
            return projSelect;
        }

        public Project getProject() {
            return project;
        }
        
        public void setProject(Project c) {
            this.project = c;
        }
        
    }
    