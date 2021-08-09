package kylemartin.finalproject;

public class BaseIntel {
    /* Getters */
    public String getProcessorName() {
        return processorName;
    }

    public double getProcessorPrice() {
        return processorPrice;
    }

    public String getMemoryName() {
        return memoryName;
    }

    public double getMemoryPrice() {
        return memoryPrice;
    }

    public String getStorageSpaceName() {
        return storageSpaceName;
    }

    public String getGraphicsName() {
        return graphicsName;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public String getOpticalDriveName() {
        return opticalDriveName;
    }

    public double getStorageSpacePrice() {
        return storageSpacePrice;
    }

    public double getGraphicsPrice() {
        return graphicsPrice;
    }

    public double getOperatingSystemPrice() {
        return operatingSystemPrice;
    }

    public double getOpticalDrivePrice() {
        return opticalDrivePrice;
    }
    /* Setters */

    /* Methods */
    public void transformProcessorFields() {
        this.processorName = "Intel Celeron G1610 2.3GHz";
        this.processorPrice = 0.0;
        this.memoryName = "4GB DDR3";
        this.memoryPrice = 0.0;
        this.storageSpaceName = "125GB 7.2K RPM SATA";
        this.storageSpacePrice = 0.0;
        this.graphicsName = "Integrated 3D Graphics";
        this.graphicsPrice = 0.0;
        this.operatingSystemName = "Windows 8.1";
        this.operatingSystemPrice = 0.0;
        this.opticalDriveName = "CD-Rom Drive";
        this.opticalDrivePrice = 0.0;
    }
    /* Fields */
    private String processorName;
    private String memoryName;
    private String storageSpaceName;
    private String graphicsName;
    private String operatingSystemName;
    private String opticalDriveName;

    private double processorPrice;
    private double memoryPrice;
    private double storageSpacePrice;
    private double graphicsPrice;
    private double operatingSystemPrice;
    private double opticalDrivePrice;
}
