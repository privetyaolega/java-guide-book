package com.eis.conspect.java.serialization.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SubjectModel {
    @XmlElement
    private double point;
    @XmlElement
    private String name;

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubjectModel{" +
                "point=" + point +
                ", name='" + name + '\'' +
                '}';
    }
}
