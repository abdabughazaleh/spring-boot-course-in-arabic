package com.springcourse.hr.service;

import com.springcourse.hr.model.dto.AddressDTO;
import com.springcourse.hr.model.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl {
    public List<EmployeeDTO> getEmployees(){
        List<EmployeeDTO> employees = new ArrayList<>();
        employees.add(EmployeeDTO
                .builder()
                .age(50)
                .email("test@gmail.com")
                .tel("+9666666565")
                .username("abdabughazaleh")
                .address(AddressDTO.builder()
                        .city("Amman")
                        .street("Masff....")
                        .build())
                .build());
        employees.add(EmployeeDTO
                .builder()
                .age(40)
                .email("rrrrr@gmail.com")
                .tel("+966641514525")
                .username("ahmad")
                .address(AddressDTO.builder()
                        .city("Doha")
                        .street("xxxx....")
                        .build())
                .build());
        employees.add(EmployeeDTO
                .builder()
                .age(40)
                .email("testtttt@gmail.com")
                .tel("+96664188888888")
                .username("test")
                .address(AddressDTO.builder()
                        .city("Riyadh")
                        .street("yyyyyyyyy....")
                        .build())
                .build());

        return employees;

    }
}
