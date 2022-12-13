package com.project.conveyor.exception;

import com.project.conveyor.model.ReasonsForRefusal;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PrescoringException extends RuntimeException{
    private List<ReasonsForRefusal> reasons;
}
