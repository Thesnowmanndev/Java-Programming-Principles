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
 * NOTE: THERE IS CURRENTLY A BUG IN examineParkedCar() at line 60-61. Has to do with keyboard buffer.
 */
package parkingticketsimulator;

import java.util.Scanner;

public class PoliceOfficer {
    private String officerName;
    private int officerBadgeNumber;

    public void examineParkedCar() {
        // Scanner for officer input
        Scanner input =  new Scanner(System.in);

        // Questions about Car
        System.out.println("What is the make of the vehicle?");
        String makeCompany = input.nextLine();
        System.out.println("What is the model of the vehicle?");
        String modelType = input.nextLine();
        System.out.println("What is the color of the vehicle?");
        String colorTint = input.nextLine();
        System.out.println("What is the license plate number of the vehicle?");
        String fullLicenseNumber = input.nextLine();
        System.out.println("How long has the car been parked?");
        int parkedTime = input.nextInt();

        System.out.println( "The vehicle is a " + colorTint + " " + makeCompany + " " + modelType + " with the license " +
                            "plate number " + fullLicenseNumber + " and it has been parked for " + parkedTime + " minutes.");

        // Questions about meter
        System.out.println("\n\n");
        System.out.println("How many minutes were purchased for the parked vehicle?");
        int minutesPurchased = input.nextInt();
        System.out.println(minutesPurchased + " minutes were purchased.");

        // Generate Objects
        ParkedCar car = new ParkedCar(makeCompany, modelType, colorTint, fullLicenseNumber, parkedTime);
        ParkingMeter meter = new ParkingMeter(minutesPurchased);

        // Check if expired
        boolean isExpired;
        if (car.getNumberOfMinutesParked() > meter.getAmountOfMinutesPurchased()) {
            isExpired = true;
            System.out.println("The vehicles parking rights are expired.");
            System.out.println("\n\n");

            // Question officer details for parking ticket
            input.reset();
            System.out.println("What is your name officer?");
            officerName = input.nextLine();
            System.out.println("What is your badge number?");
            officerBadgeNumber = input.nextInt();

            // Create Parking ticket information
            ParkingTicket ticket = new ParkingTicket(car.getMake(), car.getModel(), car.getColor(), car.getLicenseNumber());
            int minutesIllegallyParked = car.getNumberOfMinutesParked() - meter.getAmountOfMinutesPurchased();
            ticket.setMinutesIllegallyParked(minutesIllegallyParked);
            ticket.calculateFine();

            // Report Parking ticket information
            System.out.println( "\n\nParking Ticket Information:" +
                                "\n------------------------------" +
                                "\nCar Details: " + " " + car.getColor() + " " + car.getMake() + " " + car.getModel() +
                                "\nLicense Plate Number: " + car.getLicenseNumber() +
                                "\n----------------" +
                                "\nOfficer Name: " + officerName +
                                "\nOfficer Badge #: " + officerBadgeNumber +
                                "\n----------------" +
                                "\nHours Illegally Parked: " + (ticket.getMinutesIllegallyParked() / 60) +
                                "\nTotal minutes Illegally Parked: " + ticket.getMinutesIllegallyParked() +
                                "\nTotal fine: $" + ticket.getTotalFineInDollars());
        } else {
            int minutesRemaining = meter.getAmountOfMinutesPurchased() - car.getNumberOfMinutesParked();
            System.out.println("The vehicle still has " + minutesRemaining + " minutes of park time remaining.");
        }
    }

    public static void main(String[] args) {
        PoliceOfficer officer = new PoliceOfficer();
        officer.examineParkedCar();
    }
}
