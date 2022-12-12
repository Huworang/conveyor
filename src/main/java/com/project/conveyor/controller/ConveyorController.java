package com.project.conveyor.controller;

import com.project.conveyor.model.LoanApplicationRequestDTO;
import com.project.conveyor.model.ScoringDataDTO;
import com.project.conveyor.service.ConveyorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConveyorController{

    @Autowired
    private ConveyorService conveyorService;

    @GetMapping("/")
    public String Test() {
        System.out.println("OK!!!");
        return "OK!!";
    }

    @PostMapping("/conveyor/offers")
    public ResponseEntity<?> GetOffers(@RequestBody LoanApplicationRequestDTO req){
        return conveyorService.getOffers(req);
    }

    @PostMapping("/conveyor/calculation")
    public ResponseEntity<?> calculationCreditParams(@RequestBody ScoringDataDTO req){
        return conveyorService.calculationCreditParams(req);
    }

}
