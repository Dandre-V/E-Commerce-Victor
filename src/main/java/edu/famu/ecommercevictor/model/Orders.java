package edu.famu.ecommercevictor.model;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Array;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Orders {


    @DocumentId
    private @Nullable String orderId;
    private @Nullable String userId;
    private String products;
    private Number totalAmount;
    private String orderStatus;
    private Timestamp createdAt;
    private Object shippingInfo;

}
