package com.leave_tracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRoleResponseDTO {
    private Long id;
    private String title;
    private String description;
}
