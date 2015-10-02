package DAO;

/**
 * Created by Andrea on 01/10/2015.
 */

//Clase Objeto
public class Student {
    private String name;
    private int rollNo;

    //costructor
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //Gets y sets
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
