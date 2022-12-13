package com.project.conveyor.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
public class ExceptionResponse {
    private String timestamp;
    private List<?> details;
}
