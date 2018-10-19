package com.resume;

import java.io.Serializable;

public class Experience implements Serializable{
    private String company;
    private String title;
    private long startingDate;
    private long endingDate;
    private String description;

    public Experience(String company, String title, long startingDate, long endingDate, String description) {
        this.company = company;
        this.title = title;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(long startingDate) {
        this.startingDate = startingDate;
    }

    public long getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(long endingDate) {
        this.endingDate = endingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
