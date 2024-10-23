package com.leave_tracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDTO  {
    private Long empId;
    private String firstname;
    private String lastname;
    private String email;
    private String salary; // Assuming salary is a String for simplicity
    private String address;
    private String mobile;

    // Department details (nested object)
    private DepartmentResponseDTO department;

    // Job role details (nested object)
    private JobRoleResponseDTO jobRole;

}
