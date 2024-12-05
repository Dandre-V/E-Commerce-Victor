package edu.famu.ecommercedandrevictor.model;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.storage.v2.Object;

public class Users {
    @DocumentId
    private String userId;
    private String email;
    private Object address;
    private String phoneNumber;
    private String role;

}
