package com.example.testexam;

public class SinhVien {
    private int id;
    private String name;
    private int yearOfBirth;
    private double mark;

    public SinhVien(int id, String name, int yearOfBirth, double mark) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.mark = mark;
    }

    // Getters và setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
