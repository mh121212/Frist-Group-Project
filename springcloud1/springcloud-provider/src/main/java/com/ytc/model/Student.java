package com.ytc.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer studentid;
    private String studentname;
    private String studentdate;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentdate() {
        return studentdate;
    }

    public void setStudentdate(String studentdate) {
        this.studentdate = studentdate;
    }

    public Student() {
    }

    public Student(Integer studentid, String studentname, String studentdate) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentdate = studentdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentdate='" + studentdate + '\'' +
                '}';
    }
}