package com.workintech.company;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name){
        super(id,name);
    }

    public void work(){
        System.out.println(getName() + " Senior Developer starts to working");
        setSalary(30000);
    }
}
