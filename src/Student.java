public class Student extends User{

    private String registeredCourse;
    private String instructor;

    public String getRegisteredCourse() {
        return registeredCourse;
    }

    public void setRegisteredCourse(String registeredCourse) {
        this.registeredCourse = registeredCourse;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
