package edu.famu.ecommercedandrevictor.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Orders extends AOrders {
    private String orderId;
    private String userId;
    private ArrayList<Products> products;

    public Orders(ArrayList<Products> products) {
        this.products = products;
    }
}
