package org.example.e150;

public class Person {

    //declaring instance variables
    private String name;
    private String lastName;
    private int age;

    //getter
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
