package com.leave_tracking.controller;

import com.leave_tracking.dao.AttendenceDao;
import com.leave_tracking.dto.EmployeeResponseDTO;
import com.leave_tracking.model.Attendance;
import com.leave_tracking.service.AttendenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendence")
public class AttendenceController {

    @Autowired
    AttendenceService attendenceService;

    @PostMapping
    public String checkIn(){
        System.out.println("checkIn() invoked");
        return "checkIn";
    }

    @GetMapping
    public ResponseEntity<EmployeeResponseDTO> markAttendance(Attendance attendance){
        return new ResponseEntity<EmployeeResponseDTO>(attendenceService.markAttendance(attendance),HttpStatus.OK);
    }
}
