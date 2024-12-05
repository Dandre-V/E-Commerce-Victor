package edu.famu.ecommercedandrevictor.model;

import com.google.cloud.firestore.DocumentReference;
import com.google.firebase.database.annotations.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor

public class RestCarts extends ACarts {
    private @Nullable ArrayList<DocumentReference>productId;



    public RestCarts(ArrayList<DocumentReference> productId) {
        this.productId = productId;
    }
}
