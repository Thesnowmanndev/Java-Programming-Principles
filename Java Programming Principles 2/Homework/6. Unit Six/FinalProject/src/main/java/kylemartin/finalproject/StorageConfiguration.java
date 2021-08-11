package kylemartin.finalproject;

public class StorageConfiguration {
    /* Getters */
    public String getStorageSpaceName() {
        return storageSpaceName;
    }

    public double getStorageSpacePrice() {
        return storageSpacePrice;
    }

    public boolean isStorageStageZero() {
        return storageStageZero;
    }

    public boolean isStorageStageOne() {
        return storageStageOne;
    }

    public boolean isStorageStageTwo() {
        return storageStageTwo;
    }

    public boolean isStorageStageThree() {
        return storageStageThree;
    }

    /* Setters */
    public void setStorageSpaceName(String storageSpaceName) {
        this.storageSpaceName = storageSpaceName;
    }

    public void setStorageSpacePrice(double storageSpacePrice) {
        this.storageSpacePrice = storageSpacePrice;
    }

    /* Methods */
    public void setStorageFields() {
        if (this.storageStageZero) {
            setStorageSpaceName("125GB 7.2K RPM SATA");
            setStorageSpacePrice(0.00);
        } else if (this.storageStageOne) {
            setStorageSpaceName("250GB 7.2K RPM SATA");
            setStorageSpacePrice(27.00);
        } else if (this.storageStageTwo) {
            setStorageSpaceName("500GB 7.2K RPM SATA");
            setStorageSpacePrice(50.00);
        } else if (this.storageStageThree) {
            setStorageSpaceName("1TB 7.2K RPM SATA");
            setStorageSpacePrice(105.00);
        }
    }

    public void setStorageState(int selectedIndex) {
        if (selectedIndex == 0) {
            storageStageZero = true;
            storageStageOne = false;
            storageStageTwo = false;
            storageStageThree = false;

        } else if (selectedIndex == 1) {
            storageStageZero = false;
            storageStageOne = true;
            storageStageTwo = false;
            storageStageThree = false;

        } else if (selectedIndex == 2) {
            storageStageZero = false;
            storageStageOne = false;
            storageStageTwo = true;
            storageStageThree = false;

        } else if (selectedIndex == 3) {
            storageStageZero = false;
            storageStageOne = false;
            storageStageTwo = false;
            storageStageThree = true;

        } else if (selectedIndex == 4) {
            storageStageZero = false;
            storageStageOne = false;
            storageStageTwo = false;
            storageStageThree = false;

        }
    }

    /* Fields */
    private String storageSpaceName;

    private double storageSpacePrice;

    private boolean storageStageZero;
    private boolean storageStageOne;
    private boolean storageStageTwo;
    private boolean storageStageThree;
}
