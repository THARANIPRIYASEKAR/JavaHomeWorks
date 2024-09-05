package org.example.e142;

public class SyntaxTechnologies {

    //declaring instance variables
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    //creating non-argument constructor
    public SyntaxTechnologies() {
    }

    //creating parameterized constructor
    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {

        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;

    }

    //creating display method to print the values of the instance
    public void display() {

        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);

    }
}
