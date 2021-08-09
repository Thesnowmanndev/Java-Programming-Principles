package kylemartin.finalproject;

public class IntelConfiguration {
    /* Getters */
    public String getProcessorName() {
        return processorName;
    }

    public double getProcessorPrice() {
        return processorPrice;
    }

    public boolean isCpuStateZero() {
        return cpuStateZero;
    }

    public boolean isCpuStageOne() {
        return cpuStageOne;
    }

    public boolean isCpuStageTwo() {
        return cpuStageTwo;
    }

    public boolean isCpuStageThree() {
        return cpuStageThree;
    }

    public boolean isCpuStageFour() {
        return cpuStageFour;
    }

    /* Setters */


    /* Methods */
    public void transformProcessorFields() {
        if (this.cpuStateZero) {
            processorName = "Intel Celeron G1610 2.3GHz";
            processorPrice = 0.00;
        } else if (this.cpuStageOne) {
            processorName = "Intel Celeron G1620 2.7GHz";
            processorPrice = 50.00;
        } else if (this.cpuStageTwo) {
            processorName = "Intel Celeron G1630 2.8GHz";
            processorPrice = 90.00;
        } else if (this.cpuStageThree) {
            processorName = "Intel Celeron G1820 2.7GHz";
            processorPrice = 105.00;
        } else if (this.cpuStageFour) {
            processorName = "Intel Celeron G1830 2.8GHz";
            processorPrice = 130.00;
        }
    }

    public void setCpuState(int selectedIndex) {
        if (selectedIndex == 0) {
            cpuStateZero = true;
            cpuStageOne = false;
            cpuStageTwo = false;
            cpuStageThree = false;
            cpuStageFour = false;
        } else if (selectedIndex == 1) {
            cpuStateZero = false;
            cpuStageOne = true;
            cpuStageTwo = false;
            cpuStageThree = false;
            cpuStageFour = false;
        } else if (selectedIndex == 2) {
            cpuStateZero = false;
            cpuStageOne = false;
            cpuStageTwo = true;
            cpuStageThree = false;
            cpuStageFour = false;
        } else if (selectedIndex == 3) {
            cpuStateZero = false;
            cpuStageOne = false;
            cpuStageTwo = false;
            cpuStageThree = true;
            cpuStageFour = false;
        } else if (selectedIndex == 4) {
            cpuStateZero = false;
            cpuStageOne = false;
            cpuStageTwo = false;
            cpuStageThree = false;
            cpuStageFour = true;
        }
    }

    /* Fields */
    private String processorName;

    private double processorPrice;

    private boolean cpuStateZero;
    private boolean cpuStageOne;
    private boolean cpuStageTwo;
    private boolean cpuStageThree;
    private boolean cpuStageFour;
}
