package com.eis.conspect.java.serialization.jaxb.model;


import com.eis.conspect.java.serialization.jaxb.adapter.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "testModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Model {

    @XmlElement(name = "birthDate")
    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDate dob;

    @XmlElement(name = "userName")
    private String name;

    private int age;

    @XmlElement(name = "subject")
    @XmlElementWrapper(name = "subjects")
    private List<SubjectModel> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<SubjectModel> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectModel> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Model{" +
                "dob=" + dob +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}
