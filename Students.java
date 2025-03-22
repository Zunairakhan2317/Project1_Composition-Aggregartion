public class Students {

    String name;
    Departments nameofdept;
    University uniname;

    Students(String name){
        this.name=name;
    }


    public String toString() {
        return "Student Name: "+this.name+"\nDepartment Name:"+nameofdept.name+"\nUniversity: "+uniname.uniName;
    }



//    private String name;
//    private int rollNo;
//    private String department;
//
//    public Students(String name, int rollNo, String department) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.department = department;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public String getDepartment() {
//        return department;
//    }


    }

