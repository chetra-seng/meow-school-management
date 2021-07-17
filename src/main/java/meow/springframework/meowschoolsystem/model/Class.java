package meow.springframework.meowschoolsystem.model;

import java.util.Set;
import java.util.TreeSet;

public class Class {
    private Long id;
    private Character building;
    private Set<ClassDetail> classDetails = new TreeSet<ClassDetail>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getBuilding() {
        return building;
    }

    public void setBuilding(Character building) {
        this.building = building;
    }

    public Set<ClassDetail> getClassDetails() {
        return classDetails;
    }
}
