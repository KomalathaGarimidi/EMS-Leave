package com.leave_tracking.service;

import com.leave_tracking.dto.EmployeeResponseDTO;
import com.leave_tracking.model.Attendance;

public interface AttendenceService {

    EmployeeResponseDTO markAttendance(Attendance attendance);
}
