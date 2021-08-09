package kylemartin.finalproject;

public class MemoryConfiguration {
    /* Getters */
    public String getMemoryName() {
        return memoryName;
    }

    public double getMemoryPrice() {
        return memoryPrice;
    }

    public boolean isMemoryStageZero() {
        return memoryStageZero;
    }

    public boolean isMemoryStageOne() {
        return memoryStageOne;
    }

    public boolean isMemoryStageTwo() {
        return memoryStageTwo;
    }

    public boolean isMemoryStageThree() {
        return memoryStageThree;
    }

    public boolean isMemoryStageFour() {
        return memoryStageFour;
    }

    /* Methods */
    public void setMemoryFields(boolean memoryStage) {
        if (memoryStage == memoryStageZero) {
            memoryName = "4GB DDR3";
            memoryPrice = 0.00;
        } else if (memoryStage == memoryStageOne) {
            memoryName = "6GB DDR3";
            memoryPrice = 28.00;
        } else if (memoryStage == memoryStageTwo) {
            memoryName = "8GB DDR3";
            memoryPrice = 58.00;
        } else if (memoryStage == memoryStageThree) {
            memoryName = "12GB DDR3";
            memoryPrice = 108.00;
        } else if (memoryStage == memoryStageFour) {
            memoryName = "16GB DDR3";
            memoryPrice = 176.00;
        }
    }
    
    /* Fields */
    private String memoryName;

    private double memoryPrice;

    private boolean memoryStageZero;
    private boolean memoryStageOne;
    private boolean memoryStageTwo;
    private boolean memoryStageThree;
    private boolean memoryStageFour;
}
