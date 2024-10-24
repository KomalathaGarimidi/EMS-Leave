package com.leave_tracking.dao.impl;

import com.leave_tracking.dao.AttendenceDao;
import com.leave_tracking.dto.EmployeeResponseDTO;
import com.leave_tracking.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
@Repository
public class AttendenceDaoImpl implements AttendenceDao {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    JdbcTemplate jdbcTemplate;


    //checking whether the attendence is marked or not
    @Override
    public EmployeeResponseDTO markAttendance(Attendance attendance) {

        EmployeeResponseDTO employeeResponseDTO = restTemplate.getForObject("http://localhost:8080/ems/api/4",EmployeeResponseDTO.class);
        System.out.println("markattendence || "+employeeResponseDTO);

        return employeeResponseDTO;
    }
}
