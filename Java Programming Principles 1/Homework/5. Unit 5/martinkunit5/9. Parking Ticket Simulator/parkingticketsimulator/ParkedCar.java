/*
 * This program was written by Kyle Martin on 6/20/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to check if a parked vehicle is illegally parked and if it is issue a fine.
 * See Chapter 8 Programming Challenge 8. Parking Ticket Simulator
 *
 */
package parkingticketsimulator;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int numberOfMinutesParked;

    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public int getNumberOfMinutesParked() {
        return numberOfMinutesParked;
    }

    // Setters
    public void setMake(String makeCompany) {
        make = makeCompany;
    }
    public void setModel(String modelType) {
        model = modelType;
    }
    public void setColor(String colorTint) {
        color = colorTint;
    }
    public void setLicenseNumber(String fullLicenseNumber) {
        licenseNumber = fullLicenseNumber;
    }
    public void setNumberOfMinutesParked(int parkedTime) {
        numberOfMinutesParked = parkedTime;
    }

    // Constructor
    public ParkedCar(String makeCompany, String modelType, String colorTint, String fullLicenseNumber, int parkedTime) {
        make = makeCompany;
        model = modelType;
        color = colorTint;
        licenseNumber = fullLicenseNumber;
        numberOfMinutesParked = parkedTime;
    }
}
