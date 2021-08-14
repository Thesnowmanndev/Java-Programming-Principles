package kylemartin.finalproject;

public class AMDConfiguration {
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
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public void setProcessorPrice(double processorPrice) {
        this.processorPrice = processorPrice;
    }

    public void setCpuStateZero(boolean cpuStateZero) {
        this.cpuStateZero = cpuStateZero;
    }

    public void setCpuStageOne(boolean cpuStageOne) {
        this.cpuStageOne = cpuStageOne;
    }

    public void setCpuStageTwo(boolean cpuStageTwo) {
        this.cpuStageTwo = cpuStageTwo;
    }

    public void setCpuStageThree(boolean cpuStageThree) {
        this.cpuStageThree = cpuStageThree;
    }

    public void setCpuStageFour(boolean cpuStageFour) {
        this.cpuStageFour = cpuStageFour;
    }

    /* Methods */
    public void transformProcessorFields() {
        if (this.cpuStateZero) {
            processorName = "AMD FX-2100";
            processorPrice = 0.00;
        } else if (this.cpuStageOne) {
            processorName = "AMD FX-8350";
            processorPrice = 25.00;
        } else if (this.cpuStageTwo) {
            processorName = "AMD FX-9590";
            processorPrice = 90.00;
        } else if (this.cpuStageThree) {
            processorName = "AMD FX-4100";
            processorPrice = 187.00;
        } else if (this.cpuStageFour) {
            processorName = "AMD FX-4300";
            processorPrice = 280.00;
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
