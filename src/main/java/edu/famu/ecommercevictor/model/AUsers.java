package edu.famu.ecommercevictor.model;

import java.text.ParseException;

import jakarta.annotation.Nullable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

public abstract class AUsers extends Users {

    @DocumentId
    private @Nullable String userId;
    private String email;
    private String name;
    private Object address;
    private String phoneNumber;
    private String role;

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) throws ParseException{
        this.address = address.fromProto(Object.parse(address));
    }
}
