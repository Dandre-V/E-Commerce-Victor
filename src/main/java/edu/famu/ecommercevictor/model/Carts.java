package edu.famu.ecommercevictor.model;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Array;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Carts {

    @DocumentId
    private @Nullable String cartId;
    private @Nullable String userId;
    private String products;
    private Array address;
    private Number totalAmount;


}
