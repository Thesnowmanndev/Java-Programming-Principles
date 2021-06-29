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

public class ParkingTicket {
    private String reportMake;
    private String reportModel;
    private String reportColor;
    private String reportLicenseNumber;
    private int minutesIllegallyParked;
    private int minutesPurchased;
    private int totalFineInDollars;

    // Setters
    public void setMinutesIllegallyParked(int setMinutesParked) {
        minutesIllegallyParked = setMinutesParked;
    }

    public void setMinutesPurchased(int setMinutesPurchased) {
        minutesPurchased = setMinutesPurchased;
    }

    public void calculateFine() {
        final int MINUTES_IN_HOUR = 60;
        final int STANDARD_FINE = 25;
        int totalHoursParked =  minutesIllegallyParked / MINUTES_IN_HOUR;

        if (totalHoursParked > 1) {
            totalFineInDollars = ((totalHoursParked - 1) * 10) + STANDARD_FINE;
        } else if (totalHoursParked <= 1 && totalHoursParked > 0) {
            totalFineInDollars = STANDARD_FINE;
        } else {
            System.out.println("Total hours of illegally parked is less than 0.");
            System.out.println("Total hours illegally parked: " + totalHoursParked);
        }
    }

    // Getters
    public int getMinutesIllegallyParked() {
        return minutesIllegallyParked;
    }
    public int getTotalFineInDollars() {
        return  totalFineInDollars;
    }

    // Constructor
    public ParkingTicket(String make, String model, String color, String LicenseNumber) {
        reportMake = make;
        reportModel = model;
        reportColor = color;
        reportLicenseNumber = LicenseNumber;
    }
}
