package kylemartin.finalproject;

public class CustomizedComputer {
    BaseIntel baseIntel =  new BaseIntel();
    BaseAMD baseAMD = new BaseAMD();
    IntelConfiguration intelConfiguration = new IntelConfiguration();
    AMDConfiguration amdConfiguration = new AMDConfiguration();
    MemoryConfiguration memoryConfiguration = new MemoryConfiguration();
    StorageConfiguration storageConfiguration= new StorageConfiguration();
    OpticalDriveConfiguration opticalDriveConfiguration = new OpticalDriveConfiguration();
    GraphicsConfiguration graphicsConfiguration = new GraphicsConfiguration();
    OperatingSystemConfiguration operatingSystemConfiguration = new OperatingSystemConfiguration();


    /* Getters */
    public String getAUDIO_NAME() {
        return "Integrated Audio";
    }

    public double getAUDIO_PRICE() {
        return 0.0;
    }

    public String getSPEAKERS_NAME() {
        return " 2 Piece Powered Speaker Set";
    }

    public double getSPEAKERS_PRICE() {
        return 0.0;
    }

    public String getKEYBOARD_NAME() {
        return "USB Wired Keyboard";
    }

    public double getKEYBOARD_PRICE() {
        return 0.0;
    }

    public String getMOUSE_NAME() {
        return "USB Optical Mouse";
    }

    public double getMOUSE_PRICE() {
        return 0.0;
    }

    /* Setters */

    /* Prices */
    private double totalPrice;

    private double operatingSystemPrice;
    private double msOfficeStudentPrice;
    private double msOfficeBusinessPrice;
    private double accountingPackagePrice;
    private double graphicsPackagePrice;

}
