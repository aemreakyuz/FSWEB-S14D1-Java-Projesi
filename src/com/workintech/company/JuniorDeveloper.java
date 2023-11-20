package com.workintech.company;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name){
        super(id,name);
    }

    public void work(){
        setSalary(20000);
        System.out.println(getName() + " Junior Developer starts to working");
    }
}
