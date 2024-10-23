package com.leave_tracking.service.impl;

import com.leave_tracking.dao.AttendenceDao;
import com.leave_tracking.dto.EmployeeResponseDTO;
import com.leave_tracking.model.Attendance;
import com.leave_tracking.service.AttendenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendenceServiceImpl implements AttendenceService {
    @Autowired
    AttendenceDao attendenceDao;
    @Override
    public EmployeeResponseDTO markAttendance(Attendance attendance) {

        return attendenceDao.markAttendance(attendance);
    }
}
