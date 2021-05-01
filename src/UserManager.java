public class UserManager extends User{

    public void StudentAdd(Student student) {
        System.out.println("Öğrenci Eklendi!!!" + getName());
    }
    public void InstructorAdd(Instructor instructor) {
        System.out.println("Eğitmen Eklendi!!!" + getName());
    }
    public void StudentRemove(Student student) {
        System.out.println("Öğrenci Silindi!!!" + getName());
    }
    public void InstructorRemove(Instructor instructor) {
        System.out.println("Eğitmen Silindi!!!" + getName());
    }
    public void StudentUpdate(Student student) {
        System.out.println("Öğrenci Güncellendi!!!" + getName());
    }
    public void InstructorUpdate(Instructor instructor) {
        System.out.println("Eğitmen Güncellendi!!!" + getName());
    }

}
