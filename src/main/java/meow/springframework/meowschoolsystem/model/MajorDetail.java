package meow.springframework.meowschoolsystem.model;

public class MajorDetail {
    private Major major;
    private Student student;

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
