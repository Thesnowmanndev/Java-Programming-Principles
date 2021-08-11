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
    public void setMemoryFields() {
        if (this.memoryStageZero) {
            memoryName = "4GB DDR3";
            memoryPrice = 0.00;
        } else if (this.memoryStageOne) {
            memoryName = "6GB DDR3";
            memoryPrice = 28.00;
        } else if (this.memoryStageTwo) {
            memoryName = "8GB DDR3";
            memoryPrice = 58.00;
        } else if (this.memoryStageThree) {
            memoryName = "12GB DDR3";
            memoryPrice = 108.00;
        } else if (this.memoryStageFour) {
            memoryName = "16GB DDR3";
            memoryPrice = 176.00;
        }
    }

    public void setMemoryState(int selectedIndex) {
        if (selectedIndex == 0) {
            memoryStageZero = true;
            memoryStageOne = false;
            memoryStageTwo = false;
            memoryStageThree = false;
            memoryStageFour = false;
        } else if (selectedIndex == 1) {
            memoryStageZero = false;
            memoryStageOne = true;
            memoryStageTwo = false;
            memoryStageThree = false;
            memoryStageFour = false;
        } else if (selectedIndex == 2) {
            memoryStageZero = false;
            memoryStageOne = false;
            memoryStageTwo = true;
            memoryStageThree = false;
            memoryStageFour = false;
        } else if (selectedIndex == 3) {
            memoryStageZero = false;
            memoryStageOne = false;
            memoryStageTwo = false;
            memoryStageThree = true;
            memoryStageFour = false;
        } else if (selectedIndex == 4) {
            memoryStageZero = false;
            memoryStageOne = false;
            memoryStageTwo = false;
            memoryStageThree = false;
            memoryStageFour = true;
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
