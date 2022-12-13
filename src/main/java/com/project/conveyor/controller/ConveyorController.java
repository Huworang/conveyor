package com.project.conveyor.controller;

import com.project.conveyor.model.LoanApplicationRequestDTO;
import com.project.conveyor.model.ScoringDataDTO;
import com.project.conveyor.service.ConveyorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(
        name = "Пользователи",
        description = "Все методы для работы с пользователями системы"
)
@RequiredArgsConstructor
public class ConveyorController{

    @Autowired
    private ConveyorService conveyorService;

    @PostMapping("/conveyor/offers")
    public ResponseEntity<?> GetOffers(@RequestBody LoanApplicationRequestDTO req){
        return conveyorService.getOffers(req);
    }

    @PostMapping("/conveyor/calculation")
    public ResponseEntity<?> calculationCreditParams(@RequestBody ScoringDataDTO req){
        return conveyorService.calculationCreditParams(req);
    }

}
