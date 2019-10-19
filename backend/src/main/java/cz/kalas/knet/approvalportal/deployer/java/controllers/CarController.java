package cz.kalas.knet.approvalportal.deployer.java.controllers;


import cz.kalas.knet.approvalportal.deployer.kotlin.model.Car;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/car")
@Slf4j
@RequiredArgsConstructor
public class CarController {

    @RequestMapping(method = GET, value = "/")
    public ResponseEntity processConfirm() {

        var cars = List.of(new Car("Happy Car"), new Car("Sad Car"));

        log.info("Backend is about return some car for this API call..");

        return ResponseEntity.ok().body(cars);
    }


}

