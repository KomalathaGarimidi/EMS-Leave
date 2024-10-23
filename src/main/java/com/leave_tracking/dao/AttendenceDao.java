package com.leave_tracking.dao;

import com.leave_tracking.dto.EmployeeResponseDTO;
import com.leave_tracking.model.Attendance;

public interface AttendenceDao {

    EmployeeResponseDTO markAttendance(Attendance attendance);
}
