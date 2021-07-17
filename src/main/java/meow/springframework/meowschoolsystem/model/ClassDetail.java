package meow.springframework.meowschoolsystem.model;

public class ClassDetail {
    private Class aClass;
    private Major major;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
