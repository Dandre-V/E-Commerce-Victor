package edu.famu.ecommercedandrevictor.model;


import com.google.cloud.firestore.annotation.DocumentId;
import com.google.protobuf.Timestamp;

public class Products {
    @DocumentId
    private String productId;
    private String name;
    private String description;
    private Number price;
    private Number stock;
    private String imagineUrl;
    private String category;
    private Timestamp createdAt;

}
