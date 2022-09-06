package com.example.newcw;

public class Student {

      private String studentName;
      private int studentage;
      private int studentgrade;
      private int studentImg;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }

    public Student(String studentName, int studentage, int studentgrade, int studentImg) {
        this.studentName = studentName;
        this.studentage = studentage;
        this.studentgrade = studentgrade;
        this.studentImg = studentImg;
    }
}
