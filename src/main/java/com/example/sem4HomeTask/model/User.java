package com.example.sem4HomeTask.model;


public class User {
    private int id;
    private String firstName;
    private String lastName;
    private UserDecorator decorator;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.decorator = new FullNameDecorator(this);
    }

    public String getFullName() {
        return decorator.getFullName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}

// public class User {

//     private int id;
//     private String firstName;
//     private String lastName;

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public void setFirstName(String firstName) {
//         this.firstName = firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }

//     public void setLastName(String lastName) {
//         this.lastName = lastName;
//     }

// }
