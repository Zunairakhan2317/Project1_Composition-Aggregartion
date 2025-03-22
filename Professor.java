import java.util.ArrayList;
import java.util.List;


public class Professor {

    String name;
    University uniname;

    public  Professor(String name){
        this.name=name;
    }

    public University getUniname(){
        return uniname;
    }

    public void setUniname(University un) {
        this.uniname = un;
    }


    public String toString() {
        return name;
    }

    public  String getProfName(){
        return name;
    }


//    private String name;
//    private int yearsOfExpertise;
//
//    public Professor(String name, int yearsOfExpertise) {
//        this.name = name;
//        this.yearsOfExpertise = yearsOfExpertise;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getYearsOfExpertise() {
//        return yearsOfExpertise;
//    }


    }
