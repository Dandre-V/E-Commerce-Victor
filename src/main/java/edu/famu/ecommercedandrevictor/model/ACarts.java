package edu.famu.ecommercedandrevictor.model;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ACarts {
    @DocumentId
    private @Nullable String cartId;
    private @Nullable String userId;
    private ArrayList<Products> products;
    private Number totalAmount;

    public ACarts(ArrayList<Products> products) {
        this.products = products;
    }


}
