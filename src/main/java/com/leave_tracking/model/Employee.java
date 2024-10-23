package com.leave_tracking.model;

import com.leave_tracking.utility.LeaveType;

import java.time.LocalDate;
import java.util.Map;

public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private Long managerId;
    private LocalDate joinDate;
    private Map<LeaveType, Double> leaveBalance;
}
