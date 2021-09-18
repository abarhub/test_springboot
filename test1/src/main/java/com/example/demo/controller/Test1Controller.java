package com.example.demo.controller;

import com.example.demo.config.WebConfig;
import com.example.demo.dto.EmployeeDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test1Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test1Controller.class);

    @GetMapping("/test1")
    List<EmployeeDto> all() {
        LOGGER.info("/test1");
        List<EmployeeDto> liste=new ArrayList<>();
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setNom("nom1");
        employeeDto.setPrenom("prenom1");
        liste.add(employeeDto);
        return liste;
    }

    @GetMapping("/test01")
    String all2() {
        LOGGER.info("/test01");
        return "test01";
    }

}
