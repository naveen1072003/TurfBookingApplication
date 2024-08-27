package com.turfbookingcustomerservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO {

    /**
     * Contains response message
     */
    private String message;

    /**
     * Contains the response data
     */
    private Object data;
}
