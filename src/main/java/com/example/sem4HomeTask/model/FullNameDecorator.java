package com.example.sem4HomeTask.model;

public class FullNameDecorator implements UserDecorator {
    private User user;

    public FullNameDecorator(User user){
        this.user = user;
    }

    @Override
    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }
}