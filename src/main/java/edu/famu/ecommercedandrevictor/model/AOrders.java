package edu.famu.ecommercedandrevictor.model;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import com.google.cloud.Timestamp;
import java.text.ParseException;


import com.google.protobuf.util.Timestamps;
import com.google.storage.v2.Object;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AOrders {
    @DocumentId
    private @Nullable String orderId;
    private @Nullable String userId;
    private ArrayList<Products> products;
    private Number totalAmount;
    private String orderStatus;
    private Timestamp createdAt;
    private Object shippingAddress;

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) throws ParseException {
        this.createdAt = Timestamp.fromProto(Timestamps.parse(createdAt)) ;
    }

    public AOrders(ArrayList<Products> products) {
        this.products = products;
    }
}
