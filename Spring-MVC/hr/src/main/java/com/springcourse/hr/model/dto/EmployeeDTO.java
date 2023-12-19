package com.springcourse.hr.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {
    private String username;
    private int age;
    private String email;
    private String tel;
    private AddressDTO address;
}
