package com.sahil.newdbdbd;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class ModelUser {
    @Id
    private String id;
    @Field
    private String Firstname;
    @Field
    private String Lastname;

    public ModelUser(){}

    public ModelUser( String firstname, String lastname) {

        Firstname = firstname;
        Lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return "ModelUser[id='%s',Firstname='%s',Lastname='%s',id,Firstname,Lastname]";

    }
}
