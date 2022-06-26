package com.company.Assignments.Assignment2;

public class Assignment2Q1 {
    public static void main(String[] args) {
        ex object=ex.return_obj();
    }
}

class ex{
    static ex obj= new ex();
    private ex(){

    }
    public static ex return_obj(){
        return obj;
    }
}