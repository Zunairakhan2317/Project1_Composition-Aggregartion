import java.util.ArrayList;

public class Departments {

    String name;
    University uniname;
    ArrayList<Students> listingstud=new ArrayList<Students>();      //creating an array of students in class dept

    Departments(String name){
        this.name=name;
    }

//fetching students  in array

    public void listingstuds(){
        for (int i=0;i<listingstud.size();i++){
            System.out.println(listingstud.get(i));
        }
    }


//    private String name;
//    private String students;
//    private String university;
//
//    public Departments(String name, String students, String university) {
//        this.name = name;
//        this.students = students;
//        this.university = university;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getStudents() {
//        return students;
//    }
//
//    public void setStudents(String students) {
//        this.students = students;
//    }
//
//    public String getUniversity() {
//        return university;
//    }
//
//    public void setUniversity(String university) {
//        this.university = university;
//    }





    }

