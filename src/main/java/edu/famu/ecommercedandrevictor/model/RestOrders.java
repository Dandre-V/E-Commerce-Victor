package edu.famu.ecommercedandrevictor.model;

import com.google.cloud.firestore.DocumentReference;
import com.google.protobuf.Timestamp;
import com.google.storage.v2.Object;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class RestOrders extends AOrders {

    private DocumentReference productId;
    private ArrayList<DocumentReference> quantity;

    public RestOrders(ArrayList<Products> products, DocumentReference productId,
                      ArrayList<DocumentReference> quantity) {
        super(products);
        this.productId = productId;
        this.quantity = quantity;
    }
}
