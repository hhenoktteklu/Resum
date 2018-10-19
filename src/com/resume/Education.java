package com.resume;

public class Education {
    private String school;
    private long year;
    private String degree;
    private String major;

    public Education(String school, long year, String degree, String major) {
        this.school = school;
        this.year = year;
        this.degree = degree;
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
