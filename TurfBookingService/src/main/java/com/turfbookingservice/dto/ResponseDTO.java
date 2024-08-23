package com.turfbookingservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO {

    private String message;

    private int code;

    private Object object;
}
