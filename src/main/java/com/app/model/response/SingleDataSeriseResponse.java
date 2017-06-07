package com.app.model.response;

import com.app.model.data.SingleSerise;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * This is a common http response model for providing data series
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SingleDataSeriseResponse extends OperationResponse {
    private List<SingleSerise> items;
}
