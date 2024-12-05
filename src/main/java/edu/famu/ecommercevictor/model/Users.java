package edu.famu.ecommercevictor.model;

import com.google.cloud.firestore.annotation.DocumentId;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.google.firebase.database.annotations.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {

    private @Nullable String userId;
    private String email;
    private String name;
    private Object address;
    private String phoneNumber;
    private String role;



}
