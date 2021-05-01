public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(8564);
        student1.setName("Yusuf");
        student1.setRegisteredCourse("Java&React");
        student1.setEmail("student1@gmail.com");
        student1.setPassword("8sdf86");

        Instructor instructor = new Instructor();
        instructor.setId(8466);
        instructor.setName("Ahmet");
        instructor.setCourseNumber("8");
        instructor.setStudentNumber("8");

        UserManager student = new UserManager();
        student.StudentAdd(student1);
        student.StudentRemove(student1);
        student.StudentUpdate(student1);

        UserManager instructor1 = new UserManager();
        instructor1.InstructorAdd(instructor);
        instructor1.InstructorRemove(instructor);
        instructor1.InstructorUpdate(instructor);



    }
}
