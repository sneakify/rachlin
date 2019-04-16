package edu.northeastern.cs5200.docpat;

public class Doctor {

    private int doctorID;
    private String lastName;
    private String firstName;
    private boolean newPatients;
    private String specialty;


    public Doctor(String lastName, String firstName, boolean newPatients, String specialty) {
        this.doctorID = -1;
        this.lastName = lastName;
        this.firstName = firstName;
        this.newPatients = newPatients;
        this.specialty = specialty;
    }

    public Doctor(int doctorID, String lastName, String firstName, boolean newPatients, String specialty) {
        this.doctorID = doctorID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.newPatients = newPatients;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorID=" + doctorID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", newPatients=" + newPatients +
                ", specialty='" + specialty + '\'' +
                '}';
    }




    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAcceptingNewPatients() {
        return newPatients;
    }

    public void setAcceptingNewPatients(boolean newPatients) {
        this.newPatients = newPatients;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
