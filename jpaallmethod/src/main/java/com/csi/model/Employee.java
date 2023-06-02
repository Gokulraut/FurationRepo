package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private int empId;

    @Size(min = 2, message = "Employee First Name should be atleast 2 character")
    @Pattern(regexp = "[A-Za-z]*", message = "Last name should not contain space and special characters")
    private String empFirstName;


    @Size(min = 2, message = "Employee First Name should be atleast 2 character")
    @Pattern(regexp = "[A-Za-z]*", message = "Last name should not contain space and special characters")
    private String  empLastName;


    @NotNull
    private String  empAddress;

    @Size(min = 10,max = 10,message = "Please enter valid number")
    private String empContact;

    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empdob;

    @NotNull
    private double empSalary;

    @Email(message = "please enter valid emailid")
    private String empEmailId;

    @Size(min = 4,message = "password must be more than 4 characters")
    private String  empPassword;

}
