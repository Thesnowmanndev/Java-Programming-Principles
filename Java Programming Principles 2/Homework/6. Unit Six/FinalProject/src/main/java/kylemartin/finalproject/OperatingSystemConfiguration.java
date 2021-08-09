package kylemartin.finalproject;

public class OperatingSystemConfiguration {
    /* Getters */
    public double getOperatingSystemPrice() {
        return operatingSystemPrice;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public boolean isOperatingSystemStageZero() {
        return operatingSystemStageZero;
    }

    public boolean isOperatingSystemStageOne() {
        return operatingSystemStageOne;
    }

    public boolean isOperatingSystemStageTwo() {
        return operatingSystemStageTwo;
    }

    /* Setters */
    public void setOperatingSystemPrice(double operatingSystemPrice) {
        this.operatingSystemPrice = operatingSystemPrice;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    /* Methods */
    public void transformOperatingSystemFields() {
        if (this.operatingSystemStageZero) {
            setOperatingSystemName("Windows 8.1");
            setOperatingSystemPrice(0.00);
        } else if (this.operatingSystemStageOne) {
            setOperatingSystemName("Windows 8.1 Pro");
            setOperatingSystemPrice(59.00);
        } else if (this.operatingSystemStageTwo) {
            setOperatingSystemName("Linux");
            setOperatingSystemPrice(-89.00);
        }
    }

    /* Fields */
    private String operatingSystemName;

    private double operatingSystemPrice;

    private boolean operatingSystemStageZero;
    private boolean operatingSystemStageOne;
    private boolean operatingSystemStageTwo;
}
