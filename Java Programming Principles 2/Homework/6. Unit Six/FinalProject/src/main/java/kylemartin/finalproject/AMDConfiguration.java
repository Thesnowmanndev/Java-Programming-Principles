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

    /* Methods */
    public void transformProcessorFields(boolean processorStage) {
        if (processorStage == cpuStateZero) {
            processorName = "AMD FX-2100";
            processorPrice = 0.00;
        } else if (processorStage == cpuStageOne) {
            processorName = "AMD FX-8350";
            processorPrice = 25.00;
        } else if (processorStage == cpuStageTwo) {
            processorName = "AMD FX-9590";
            processorPrice = 90.00;
        } else if (processorStage == cpuStageThree) {
            processorName = "AMD FX-4100";
            processorPrice = 187.00;
        } else if (processorStage == cpuStageFour) {
            processorName = "AMD FX-4300";
            processorPrice = 280.00;
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
