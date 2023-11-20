package com.workintech.company;

import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(long id, String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors){
        super(id,name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;

    }

    public void work(){
        setSalary(50000);
        System.out.println(getName() + " HR Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        try {
            if (juniors[index] == null) {
                juniors[index] = juniorDeveloper;
            } else {
                System.out.println("Index is full");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper){
        try {
            if (mids[index] == null) {
                mids[index] = midDeveloper;
            } else {
                System.out.println("Index is full");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        try {
            if (seniors[index] == null) {
                seniors[index] = seniorDeveloper;
            } else {
                System.out.println("Index is full");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public String toString() {
        return super.toString() + " HRManager{" +
                "juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) +
                '}';
    }


}
