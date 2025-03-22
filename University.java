import java.util.ArrayList;


public class University {String uniName;
    ArrayList<Professor> profs = new ArrayList<Professor>();

    ArrayList<Departments> depts = new ArrayList<Departments>();


    public University(String uniName) {
        this.uniName = uniName;
    }

    public University(String uniName, String[] deptname) {

        this.uniName = uniName;

        for (int i = 0; i < deptname.length; i++) {
            Departments temp = new Departments(deptname[i]);
            depts.add(temp);
            temp.uniname = this;  //implementing that uniname belongs to university class
        }
    }

    public void addDept(Departments dep) {
        depts.add(dep);
        dep.uniname = this;
    }

    public void addProfessor(Professor prof) {
        profs.add(prof);

        prof.setUniname(this);
    }


    Departments getDepartment(String name) {

        for (int i = 0; i < depts.size(); i++) {
            if (depts.get(i).name.equals(name)) {
                return depts.get(i);
            }

        }

        return null;
    }

    Professor getProfessor(String name){

        for (int i=0;i< profs.size();i++){
            if (profs.get(i).getProfName().equals(name)){
                return profs.get(i);

            }

        }
        return  null;
    }

    public void enrollin(Departments d,Students s){
        s.nameofdept=d;
        s.uniname=this;
        d.listingstud.add(s);

    }

    public String toString(){
        return "University :"+uniName;
    }
//    private String name;
//    private ArrayList<Professor> professors;
//    private ArrayList<Students> students;
//
//    public University(String name) {
//        this.name = name;
//        this.professors = new ArrayList<>();
//        this.students = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void addProfessor(Professor professor) {
//        professors.add(professor);
//    }
//
//    public void addStudent(Students student) {
//        students.add(student);
//    }
//
//    public String getDept(String studentName) {
//        for (Students student : students) {
//            if (student.getName().equalsIgnoreCase(studentName)) {
//                return student.getDepartment();
//            }
//        }
//        return "Department not found!";
//    }
//    public void searchStudent(int rollNo) {
//        for (Students student : students) {
//            if (student.getRollNo() == rollNo) {
//                System.out.println("Student Found: " + student.getName() + ", Department: " + student.getDepartment());
//                return;
//            }
//        }
//        System.out.println("Student with Roll No " + rollNo + " not found.");
//}


}
