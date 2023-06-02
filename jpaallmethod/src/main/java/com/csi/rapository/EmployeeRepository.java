package com.csi.rapository;

import com.csi.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

    public List<Employee>findDataByEmpFirstName(String empFirstName);

    public List<Employee>findDataByEmpFirstNameAndEmpLastName(String empFirstName,String empLastName);

    public Employee findDataByEmpContact(String  empContact);

    public Employee findDataByEmpEmailIdAndEmpPassword(String empEmailId,String empPassword);

    public Employee findDataByEmpEmailId(String empEmailId);
}
