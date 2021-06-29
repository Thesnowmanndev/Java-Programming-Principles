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

public class ParkingMeter {
    private int amountOfMinutesPurchased;

    // Getter
    public int getAmountOfMinutesPurchased() {
        return amountOfMinutesPurchased;
    }

    // Setter
    public void setAmountOfMinutesPurchased(int minutesPurchased) {
        amountOfMinutesPurchased = minutesPurchased;
    }

    public ParkingMeter(int minutesPurchased) {
        amountOfMinutesPurchased = minutesPurchased;
    }
}
