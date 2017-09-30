package com.github.lany192.dagger2.demo.entity;

import java.util.List;

public class Classes {
    private Teacher teacher;
    private List<Student> students;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
