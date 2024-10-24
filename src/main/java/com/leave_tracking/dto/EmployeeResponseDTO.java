package com.leave_tracking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.leave_tracking.utility.LeaveType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDate;
import java.util.Map;

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
    @JsonProperty("departmentid")
    private DepartmentResponseDTO department;

    // Job role details (nested object)
    @JsonProperty("jobRoleid")
    private JobRoleResponseDTO jobRole;

    private ManagersResponseDTO managerId;
    private LocalDate joinDate;
    private Map<LeaveType, Double> leaveBalance;

}
