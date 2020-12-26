package com.example.recyclerview;

public class model {


    String Person;

    model(){

    }

    public model(String User) {
        Person = User;

    }

    public String getPerson() {
        return Person;
    }

    public void setPerson(String person) {
        Person = person;
    }
}
