package kylemartin.finalproject;

public class OpticalDriveConfiguration {
    /* Getters */
    public double getOpticalDrivePrice() {
        return opticalDrivePrice;
    }

    public String getOpticalDriveName() {
        return opticalDriveName;
    }

    public boolean isOpticalDriveStageZero() {
        return opticalDriveStageZero;
    }

    public boolean isOpticalDriveStageOne() {
        return opticalDriveStageOne;
    }

    public boolean isOpticalDriveStageTwo() {
        return opticalDriveStageTwo;
    }

    public boolean isOpticalDriveStageThree() {
        return opticalDriveStageThree;
    }

    /* Setters */
    public void setOpticalDrivePrice(double opticalDrivePrice) {
        this.opticalDrivePrice = opticalDrivePrice;
    }

    public void setOpticalDriveName(String opticalDriveName) {
        this.opticalDriveName = opticalDriveName;
    }

    /* Methods */
    public void transformOpticalDriveFields() {
        if (this.opticalDriveStageZero) {
            setOpticalDriveName("CD-Rom Drive");
            setOpticalDrivePrice(0.0);
        } else if (this.opticalDriveStageOne) {
            setOpticalDriveName("DVD Drive");
            setOpticalDrivePrice(17.00);
        } else if (this.opticalDriveStageTwo) {
            setOpticalDriveName("Combo DVD/CDRW Drive");
            setOpticalDrivePrice(40.00);
        } else if (this.opticalDriveStageThree) {
            setOpticalDriveName("DVD and CDRW Drive");
            setOpticalDrivePrice(79.00);
        }
    }

    /* Fields */
    private String opticalDriveName;

    private double opticalDrivePrice;

    private boolean opticalDriveStageZero;
    private boolean opticalDriveStageOne;
    private boolean opticalDriveStageTwo;
    private boolean opticalDriveStageThree;
}
