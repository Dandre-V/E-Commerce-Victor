package edu.famu.ecommercedandrevictor.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Carts extends ACarts {

    private ArrayList<Products> products;

    public Carts(ArrayList<Products> products, ArrayList<Products> products1) {
        super(products);
        this.products = products1;
    }
}
