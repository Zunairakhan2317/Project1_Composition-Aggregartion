public class Main {
    public static void main(String[] args) {

        String arrofdepts[] ={"Software","Civil"};
        University uni1=new University("Muet",arrofdepts);
        University uni2=new University("LUMHS");

        Students stud1=new Students("Student 1");
        Students stud2=new Students("Student 2");
        Students stud3=new Students("Student 3");

        uni1.enrollin(uni1.getDepartment("Software"),stud1);
        uni1.enrollin(uni1.getDepartment("Civil"),stud2);
        uni1.enrollin(uni1.getDepartment("Software"),stud3);

        System.out.println("Printing department objects: ");
        System.out.println(uni1.getDepartment("Software"));
        System.out.println("Listing Students of Software");
        uni1.getDepartment("Software").listingstuds();
        System.out.println("Printing student 1 objects:");
        System.out.println(stud1);

        //method 2

        uni2.addDept(new Departments("BDS"));
        uni2.addDept(new Departments("MLT"));
        uni2.addDept(new Departments("D-Pharm"));

        Students stud4=new Students("student 4");
        Students stud5=new Students("student 5");
        Students stud6=new Students("student 6");

        uni2.enrollin(uni2.getDepartment("BDS"),stud4);
        uni2.enrollin(uni2.getDepartment("MLT"),stud5);
        uni2.enrollin(uni2.getDepartment("D-Pharm"),stud1);

        System.out.println("Printing department objects: ");
        System.out.println(uni1.getDepartment("BDS"));
        System.out.println("Listing Students of Software");
        uni1.getDepartment("Software").listingstuds();
        System.out.println("Printing student 1 objects:");
        System.out.println(stud1);





//        University uni = new University("Tech University");
//
//        // Adding Professors
//        uni.addProfessor(new Professor("Dr. Smith", 10));
//        uni.addProfessor(new Professor("Dr. Johnson", 15));
//
//        // Adding Students
//        uni.addStudent(new Students("Alice", 101, "Computer Science"));
//        uni.addStudent(new Students("Bob", 102, "Electrical Engineering"));
//
//        // Fetching Department of a Student
//        System.out.println("Alice's Department: " + uni.getDept("Alice"));
//
//        // Searching for a Student
//        uni.searchStudent(102);
//        uni.searchStudent(999);  }




    }}
