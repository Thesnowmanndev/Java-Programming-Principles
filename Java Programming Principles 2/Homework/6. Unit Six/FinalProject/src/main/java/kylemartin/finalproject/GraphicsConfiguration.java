package kylemartin.finalproject;

public class GraphicsConfiguration {
    /* Getters */
    public double getGraphicsPrice() {
        return graphicsPrice;
    }

    public String getGraphicsName() {
        return graphicsName;
    }

    public boolean isGraphicsStageZero() {
        return graphicsStageZero;
    }

    public boolean isGraphicsStageOne() {
        return graphicsStageOne;
    }

    public boolean isGraphicsStageTwo() {
        return graphicsStageTwo;
    }

    public boolean isGraphicsStageThree() {
        return graphicsStageThree;
    }

    /* Setters */
    public void setGraphicsName(String graphicsName) {
        this.graphicsName = graphicsName;
    }

    public void setGraphicsPrice(double graphicsPrice) {
        this.graphicsPrice = graphicsPrice;
    }

    /* Methods */
    public void setGraphicsFields() {
        if (this.isGraphicsStageZero()) {
             setGraphicsName("Integrated 3D Graphics");
             setGraphicsPrice(0.0);
        } else if (this.isGraphicsStageOne()) {
            setGraphicsName("NVIDIA GeForce G310 512MB DDR3");
            setGraphicsPrice(80.00);
        } else if (this.isGraphicsStageTwo()) {
            setGraphicsName("NVIDIA GeForce GT620 1GB DDR3");
            setGraphicsPrice(169.00);
        } else if (this.isGraphicsStageThree()) {
            setGraphicsName("NVIDIA GeForce GT640 1GB GDDR5");
            setGraphicsPrice(490.00);
        }
    }

    public void setGraphicsState(int selectedIndex) {
        if (selectedIndex == 0) {
            graphicsStageZero = true;
            graphicsStageOne = false;
            graphicsStageTwo = false;
            graphicsStageThree = false;

        } else if (selectedIndex == 1) {
            graphicsStageZero = false;
            graphicsStageOne = true;
            graphicsStageTwo = false;
            graphicsStageThree = false;

        } else if (selectedIndex == 2) {
            graphicsStageZero = false;
            graphicsStageOne = false;
            graphicsStageTwo = true;
            graphicsStageThree = false;

        } else if (selectedIndex == 3) {
            graphicsStageZero = false;
            graphicsStageOne = false;
            graphicsStageTwo = false;
            graphicsStageThree = true;

        } else if (selectedIndex == 4) {
            graphicsStageZero = false;
            graphicsStageOne = false;
            graphicsStageTwo = false;
            graphicsStageThree = false;

        }
    }

    /* Fields */
    private String graphicsName;

    private double graphicsPrice;

    private boolean graphicsStageZero;
    private boolean graphicsStageOne;
    private boolean graphicsStageTwo;
    private boolean graphicsStageThree;
}
