package edu.famu.ecommercevictor.model;

import com.google.cloud.firestore.annotation.DocumentId;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.google.firebase.database.annotations.Nullable;
import com.google.cloud.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Products {


    @DocumentId
    private @Nullable String productId;
    private String name;
    private String description;
    private Number price;
    private Number stock;
    private String imagineUrl;
    private String category;
    private Timestamp createdAt;

}




