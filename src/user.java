import java.util.ArrayList;

public class user {
    private final LoginCredentials loginCredentials;
    private String name;
    private int age;
    private String location;
    private double experience_time;
    private ArrayList<String> academicExperience;
    private ArrayList<String> professionalExperience;
    private ArrayList<String> hardSkills;

    private ArrayList<String> softSkills;
    private ArrayList<String> personality;
    private ArrayList<String> hobbies;
    private ArrayList<String> jobPreferences;
    private ArrayList<ApplicationS> applications;

    // CONSTRUCTOR
    public user(LoginCredentials loginCredentials, String name) {
        this.loginCredentials = loginCredentials;
        this.name = name;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getExperience_time() {
        return experience_time;
    }

    public void setExperience_time(double experience_time) {
        this.experience_time = experience_time;
    }

    public ArrayList<String> getAcademicExperience() {
        return academicExperience;
    }

    public void setAcademicExperience(ArrayList<String> academicExperience) {
        this.academicExperience = academicExperience;
    }

    public ArrayList<String> getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(ArrayList<String> professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public ArrayList<String> getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(ArrayList<String> hardSkills) {
        this.hardSkills = hardSkills;
    }

    public ArrayList<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(ArrayList<String> softSkills) {
        this.softSkills = softSkills;
    }

    public ArrayList<String> getPersonality() {
        return personality;
    }

    public void setPersonality(ArrayList<String> personality) {
        this.personality = personality;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public ArrayList<String> getJobPreferences() {
        return jobPreferences;
    }

    public void setJobPreferences(ArrayList<String> jobPreferences) {
        this.jobPreferences = jobPreferences;
    }

    public ArrayList<ApplicationS> getApplications() {
        return applications;
    }

    public void setApplications(ArrayList<ApplicationS> applications) {
        this.applications = applications;
    }


