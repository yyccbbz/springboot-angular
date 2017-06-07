package com.app.model.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * This is the common structure for all responses
 * if the response contains a list(array) then it will have 'items' field
 * if the response contains a single item then it will have 'item'  field
 */
@Data
public class OperationResponse {

    public enum ResponseStatusEnum {SUCCESS, ERROR, WARNING, NO_ACCESS};

    @ApiModelProperty(required = true)
    private ResponseStatusEnum operationStatus;

    private String operationMessage;
}
