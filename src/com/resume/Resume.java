package com.resume;

import java.io.Serializable;
import java.util.List;

public class Resume implements Serializable{
    private Person person;
    private List<Education> educationList;
    private List<Experience> experienceList;
    private List<Skill> skillList;

    public Resume(Person person, List<Education> educationList, List<Experience> experienceList, List<Skill> skillList) {
        this.person = person;
        this.educationList = educationList;
        this.experienceList = experienceList;
        this.skillList = skillList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}
