package com.resume;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Resume> resumes = new ArrayList<Resume>();
        ArrayList<Education> educations = new ArrayList<Education>();
        ArrayList<Experience> experiences = new ArrayList<Experience>();
        ArrayList<Skill> skills = new ArrayList<Skill>();
        String[] rating = {"Fundamental,", "Novice,", "Intermediate,", "Advanced,", "Expert"};
        boolean check = false;

        do {
            System.out.println("\nCreate Resume");
            System.out.print("Enter name: ");
            String personName = keyboard.nextLine();
            System.out.print("Enter email: ");
            String personEmail = keyboard.nextLine();
            System.out.print("Enter phone number: ");
            long personPhoneNumber = keyboard.nextLong();
            keyboard.nextLine();
            Person person = new Person(personName, personEmail, personPhoneNumber);


            do {

                System.out.println("\nAdd Education: ");
                System.out.print("School: ");
                String educationSchool = keyboard.nextLine();
                System.out.print("Year: ");
                long educationYear = keyboard.nextLong();
                keyboard.nextLine();
                System.out.print("Degree: ");
                String educationDegree = keyboard.nextLine();
                System.out.print("Major: ");
                String educationMajor = keyboard.nextLine();
                educations.add(new Education(educationSchool, educationYear, educationDegree, educationMajor));

                System.out.print("Do you want to add education? (y/n)");
                String addMoreEducation = keyboard.nextLine();
                if (addMoreEducation.equalsIgnoreCase("y")) {
                    check = true;
                } else {
                    check = false;
                }

            } while (check);

            do {
                System.out.println("\nAdd Experience");
                System.out.print("Company: ");
                String experienceCompany = keyboard.nextLine();
                System.out.print("Title: ");
                String experienceTitle = keyboard.nextLine();
                System.out.print("Enter year starting from: ");
                long experienceStartingDate = keyboard.nextInt();
                keyboard.nextLine();
                System.out.print("to: ");
                long experienceEndDate = keyboard.nextInt();
                keyboard.nextLine();
                System.out.print("Description: ");
                String experienceDescription = keyboard.nextLine();
                experiences.add(new Experience(experienceCompany, experienceTitle, experienceStartingDate, experienceEndDate, experienceDescription));

                System.out.print("Do you want to add experience? (y/n)");
                String addMoreExperience = keyboard.nextLine();
                if (addMoreExperience.equalsIgnoreCase("y")) {
                    check = true;
                } else {
                    check = false;
                }

            } while (check);

            do {

                System.out.println("\nAdd Skill");
                System.out.print("Skill: ");
                String skillSkill = keyboard.nextLine();
                System.out.print("Choose rating: ");
                for (String string : rating) {
                    System.out.print(string + " ");
                }
                do {
                    System.out.print("\nRate your skill: ");

                    String rateSkill = keyboard.nextLine();
                    String returnRating = checkRating(rateSkill);
                    if (returnRating == null) {
                        System.out.println("Not right input!");
                        check = true;
                    } else {
                        skills.add(new Skill(skillSkill, returnRating));
                        check = false;
                    }
                } while (check);


                System.out.print("Do you want to add skill? (y/n)");
                String addMoreSkill = keyboard.nextLine();
                if (addMoreSkill.equalsIgnoreCase("y")) {
                    check = true;
                } else {
                    check = false;
                }

            } while (check);

            resumes.add(new Resume(person, educations, experiences, skills));
            System.out.print("Do you want to create new resume? (y/n)");
            String addMoreResume = keyboard.nextLine();
            if (addMoreResume.equalsIgnoreCase("y")) {
                check = true;
            } else {
                check = false;
            }
        } while (check);
        for (Resume resume : resumes) {

            System.out.println("\n===============================================================================");
            System.out.println(resume.getPerson().getName() + "\n" + resume.getPerson().getEmail() + "\n" + resume.getPerson().getPhoneNumber());

            System.out.println("\nEducation");

            for (Education education : resume.getEducationList()) {
                System.out.println(education.getDegree() + " in " + education.getMajor() + ",");
                System.out.println(education.getSchool() + ", " + education.getYear() + "\n");
            }

            System.out.println("\nExperience");
            for (Experience experience : resume.getExperienceList()) {
                System.out.println(experience.getTitle());
                System.out.println(experience.getCompany() + ", " + experience.getStartingDate() + " - " + experience.getEndingDate());
                System.out.println("Duty: " + experience.getDescription() + "\n");
            }

            System.out.println("\nSkills");
            for (Skill skill : resume.getSkillList()) {
                System.out.println(skill.getSkill() + ", " + skill.getRating());
            }
            try {
                FileOutputStream out = new FileOutputStream("C:\\Users\\GBTC440012ur\\Desktop\\resume Folder\\resume.txt");
                ObjectOutputStream oout = new ObjectOutputStream(out);
                oout.writeObject(resume);
                oout.close();
                System.out.println("Saved.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static String checkRating(String str) {
        String[] rating = {"Fundamental", "Novice", "Intermediate", "Advanced", "Expert"};
        String returnRating = null;
        for (String eachString : rating) {
            if (str.equalsIgnoreCase(eachString)) {
                returnRating = eachString;
            }
        }
        return returnRating;
    }
}
