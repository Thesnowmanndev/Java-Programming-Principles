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
    public void setOpticsFields() {
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

    public void setOpticsState(int selectedIndex) {
        if (selectedIndex == 0) {
            opticalDriveStageZero = true;
            opticalDriveStageOne = false;
            opticalDriveStageTwo = false;
            opticalDriveStageThree = false;

        } else if (selectedIndex == 1) {
            opticalDriveStageZero = false;
            opticalDriveStageOne = true;
            opticalDriveStageTwo = false;
            opticalDriveStageThree = false;

        } else if (selectedIndex == 2) {
            opticalDriveStageZero = false;
            opticalDriveStageOne = false;
            opticalDriveStageTwo = true;
            opticalDriveStageThree = false;

        } else if (selectedIndex == 3) {
            opticalDriveStageZero = false;
            opticalDriveStageOne = false;
            opticalDriveStageTwo = false;
            opticalDriveStageThree = true;

        } else if (selectedIndex == 4) {
            opticalDriveStageZero = false;
            opticalDriveStageOne = false;
            opticalDriveStageTwo = false;
            opticalDriveStageThree = false;

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
