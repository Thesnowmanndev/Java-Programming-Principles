package kylemartin.finalproject;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ConfiguratorController {
    CustomizedComputer usersCustomizedComputer = new CustomizedComputer();

    /* Methods */
    public String setFieldToString (Double price) {
        return price.toString();
    }

    // Main Screen
    @FXML
    protected void OnMainScreenButtonClick() {
        intelScreen.setVisible(false);
        AMDScreen.setVisible(false);
        mainScreen.setVisible(true);
        processorName = "Processor";
        memoryName = "Memory";
        storageSpaceName = "Storage";
        graphicsName = "Graphics";
        operatingSystemName = "Operating System";
        opticalDriveName = "Optical Drive";

        basePackagePrice = 0.0;
        processorPrice = 0.0;

        updateLabels();

        audioNameLabel.setText("Audio Device");
        speakersNameLabel.setText("Speakers");
        keyboardNameLabel.setText("Keyboard");
        mouseNameLabel.setText("Mouse");
    }

    // AMD Screen
    @FXML
    public void OnAMDScreenButtonClick() {
        mainScreen.setVisible(false);
        intelScreen.setVisible(false);
        AMDScreen.setVisible(true);
    }

    // Intel Screen
    @FXML
    public void OnIntelScreenButtonClick() {
        mainScreen.setVisible(false);
        AMDScreen.setVisible(false);
        intelScreen.setVisible(true);
        usersCustomizedComputer.baseIntel.transformProcessorFields();

        processorName = usersCustomizedComputer.baseIntel.getProcessorName();
        memoryName = usersCustomizedComputer.baseIntel.getMemoryName();
        storageSpaceName = usersCustomizedComputer.baseIntel.getStorageSpaceName();
        graphicsName = usersCustomizedComputer.baseIntel.getGraphicsName();
        operatingSystemName = usersCustomizedComputer.baseIntel.getOperatingSystemName();
        opticalDriveName = usersCustomizedComputer.baseIntel.getOpticalDriveName();

        processorPrice = usersCustomizedComputer.baseIntel.getProcessorPrice();
        memoryPrice = usersCustomizedComputer.baseIntel.getMemoryPrice();
        storageSpacePrice = usersCustomizedComputer.baseIntel.getStorageSpacePrice();
        graphicsPrice = usersCustomizedComputer.baseIntel.getGraphicsPrice();
        operatingSystemPrice = usersCustomizedComputer.baseIntel.getOperatingSystemPrice();
        opticalDrivePrice = usersCustomizedComputer.baseIntel.getOpticalDrivePrice();

        basePackagePrice = 499.0;

        updateLabels();

        // CPU Choice
        cpuChoiceBox.setItems(FXCollections.observableArrayList("Intel Celeron G1610 2.3GHz     + $0.0",
                                                                "Intel Celeron G1620 2.7GHz     + $50.00",
                                                                "Intel Celeron G1630 2.8GHz     + $90.00",
                                                                "Intel Celeron G1820 2.7GHz     + $105.00",
                                                                "Intel Celeron G1830 2.8GHz     + $130.00"));
        cpuChoiceBox.setOnAction((Event -> {
            int cpuSelectedIndex = cpuChoiceBox.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.intelConfiguration.setCpuState(cpuSelectedIndex);
            usersCustomizedComputer.intelConfiguration.transformProcessorFields();

            processorName = usersCustomizedComputer.intelConfiguration.getProcessorName();
            processorPrice = usersCustomizedComputer.intelConfiguration.getProcessorPrice();
            selectedCpuNameLabel.setText(processorName);
            selectedCpuPriceLabel.setText(setFieldToString(processorPrice));
            updateLabels();
        }));

        // Memory Choice


        // Storage Choice


        // Graphics Choice


        // Optics Choice


        // MS Office Student


        // MS Office Business


        // Accounting Software Package


        // Graphics Software Package
    }

    @FXML
    public void updateLabels() {
        cpuNameLabel.setText(processorName);
        cpuPriceLabel.setText(setFieldToString(processorPrice));
        memoryNameLabel.setText(memoryName);
        memoryPriceLabel.setText(setFieldToString(memoryPrice));
        storageNameLabel.setText(storageSpaceName);
        storagePriceLabel.setText(setFieldToString(storageSpacePrice));
        graphicsNameLabel.setText(graphicsName);
        graphicsPriceLabel.setText(setFieldToString(graphicsPrice));
        operatingSystemNameLabel.setText(operatingSystemName);
        operatingSystemPriceLabel.setText(setFieldToString(operatingSystemPrice));
        opticalDriveNameLabel.setText(opticalDriveName);
        opticalDrivePriceLabel.setText(setFieldToString(opticalDrivePrice));

        audioNameLabel.setText(AUDIO_NAME);
        speakersNameLabel.setText(SPEAKERS_NAME);
        keyboardNameLabel.setText(KEYBOARD_NAME);
        mouseNameLabel.setText(MOUSE_NAME);

        // additional software labels

        // Update Subtotal Price
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticalDrivePrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
    }

    /* Fields */
    private String processorName;
    private String memoryName;
    private String storageSpaceName;
    private String graphicsName;
    private String operatingSystemName;
    private String opticalDriveName;
    private final String AUDIO_NAME = usersCustomizedComputer.getAUDIO_NAME();
    private final String SPEAKERS_NAME = usersCustomizedComputer.getSPEAKERS_NAME();
    private final String KEYBOARD_NAME = usersCustomizedComputer.getKEYBOARD_NAME();
    private final String MOUSE_NAME = usersCustomizedComputer.getMOUSE_NAME();

    private double processorPrice;
    private double memoryPrice;
    private double storageSpacePrice;
    private double graphicsPrice;
    private double operatingSystemPrice;
    private double opticalDrivePrice;

    private double msStudentPackagePrice;
    private double msBusinessPackagePrice;
    private double accountingPackagePrice;
    private double graphicsPackagePrice;
    private double basePackagePrice;

    // Main Screen
    @FXML
    private AnchorPane mainScreen;

    // AMD Screen
    @FXML
    private AnchorPane AMDScreen;

    // Intel Screen
    @FXML
    private AnchorPane intelScreen;
    @FXML
    private ChoiceBox<Object> cpuChoiceBox;
    @FXML
    private Label selectedCpuNameLabel;
    @FXML
    private Label selectedCpuPriceLabel;

    // Side Panel
    @FXML
    private Label cpuNameLabel;
    @FXML
    private Label cpuPriceLabel;
    @FXML
    private Label memoryNameLabel;
    @FXML
    private Label memoryPriceLabel;
    @FXML
    private Label storageNameLabel;
    @FXML
    private Label storagePriceLabel;
    @FXML
    private Label graphicsNameLabel;
    @FXML
    private Label graphicsPriceLabel;
    @FXML
    private Label operatingSystemNameLabel;
    @FXML
    private Label operatingSystemPriceLabel;
    @FXML
    private Label opticalDriveNameLabel;
    @FXML
    private Label opticalDrivePriceLabel;
    @FXML
    private Label audioNameLabel;
    @FXML
    private Label speakersNameLabel;
    @FXML
    private Label keyboardNameLabel;
    @FXML
    private Label mouseNameLabel;
    @FXML
    private Label subTotalPriceLabel;
}