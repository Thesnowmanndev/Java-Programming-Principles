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
        resetIntelLabels();
        intelScreen.setVisible(false);
        AMDScreen.setVisible(false);
        mainScreen.setVisible(true);
        processorName = "Processor";
        memoryName = "Memory";
        storageSpaceName = "Storage";
        graphicsName = "Graphics";
        operatingSystemName = "Operating System";
        opticsName = "Optical Drive";

        basePackagePrice = 0.0;
        processorPrice = 0.0;
        memoryPrice = 0.0;
        storageSpacePrice = 0.0;
        graphicsPrice = 0.0;
        operatingSystemPrice = 0.0;
        opticsPrice = 0.0;

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
    /* THIS METHOD NEEDS TO BE REFACTORED ONCE AMD, INTEL, AND ORDER SCREEN ARE COMPLETE */
    /* Consolidate method into smaller methods each for processor, memory, storage graphics, OS, OD, and additional */
    @FXML
    public void OnIntelScreenButtonClick() {
        resetIntelLabels();
        mainScreen.setVisible(false);
        AMDScreen.setVisible(false);
        intelScreen.setVisible(true);
        usersCustomizedComputer.baseIntel.transformProcessorFields();

        processorName = usersCustomizedComputer.baseIntel.getProcessorName();
        memoryName = usersCustomizedComputer.baseIntel.getMemoryName();
        storageSpaceName = usersCustomizedComputer.baseIntel.getStorageSpaceName();
        graphicsName = usersCustomizedComputer.baseIntel.getGraphicsName();
        operatingSystemName = usersCustomizedComputer.baseIntel.getOperatingSystemName();
        opticsName = usersCustomizedComputer.baseIntel.getOpticalDriveName();

        processorPrice = usersCustomizedComputer.baseIntel.getProcessorPrice();
        memoryPrice = usersCustomizedComputer.baseIntel.getMemoryPrice();
        storageSpacePrice = usersCustomizedComputer.baseIntel.getStorageSpacePrice();
        graphicsPrice = usersCustomizedComputer.baseIntel.getGraphicsPrice();
        operatingSystemPrice = usersCustomizedComputer.baseIntel.getOperatingSystemPrice();
        opticsPrice = usersCustomizedComputer.baseIntel.getOpticalDrivePrice();

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
        memoryChoiceBox.setItems(FXCollections.observableArrayList("4GB DDR3     + $0.0",
                "6GB DDR3     + $28.00",
                "8GB DDR3     + $58.00",
                "12GB DDR3     + $108.00",
                "16GB DDR3     + $176.00"));
        memoryChoiceBox.setOnAction((Event -> {
            int memorySelectedIndex = memoryChoiceBox.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.memoryConfiguration.setMemoryState(memorySelectedIndex);
            usersCustomizedComputer.memoryConfiguration.setMemoryFields();

            memoryName = usersCustomizedComputer.memoryConfiguration.getMemoryName();
            memoryPrice = usersCustomizedComputer.memoryConfiguration.getMemoryPrice();
            selectedMemoryNameLabel.setText(memoryName);
            selectedMemoryPriceLabel.setText(setFieldToString(memoryPrice));
            updateLabels();
        }));

        // Storage Choice
        storageChoiceBox.setItems(FXCollections.observableArrayList("125GB 7.2K RPM SATA    + $0.0",
                "250GB 7.2K RPM SATA     + $27.00",
                "500GB 7.2K RPM SATA   + $50.00",
                "1TB 7.2K RPM SATA    + $105.00"));
        storageChoiceBox.setOnAction((Event -> {
            int storageSelectedIndex = storageChoiceBox.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.storageConfiguration.setStorageState(storageSelectedIndex);
            usersCustomizedComputer.storageConfiguration.setStorageFields();

            storageSpaceName = usersCustomizedComputer.storageConfiguration.getStorageSpaceName();
            storageSpacePrice = usersCustomizedComputer.storageConfiguration.getStorageSpacePrice();
            selectedStorageNameLabel.setText(storageSpaceName);
            selectedStoragePriceLabel.setText(setFieldToString(storageSpacePrice));
            updateLabels();
        }));

        // Optics Choice
        opticsChoiceBox.setItems(FXCollections.observableArrayList("CD-Rom Drive    + $0.0",
                "DVD Drive     + $17.00",
                "Combo DVD/CDRW Drive   + $40.00",
                "DVD and CDRW Drive    + $79.00"));
        opticsChoiceBox.setOnAction((Event -> {
            int opticsSelectedIndex = opticsChoiceBox.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.opticalDriveConfiguration.setOpticsState(opticsSelectedIndex);
            usersCustomizedComputer.opticalDriveConfiguration.setOpticsFields();

            opticsName = usersCustomizedComputer.opticalDriveConfiguration.getOpticalDriveName();
            opticsPrice = usersCustomizedComputer.opticalDriveConfiguration.getOpticalDrivePrice();
            selectedOpticsNameLabel.setText(opticsName);
            selectedOpticsPriceLabel.setText(setFieldToString(opticsPrice));
            updateLabels();
        }));

        // Graphics Choice
        graphicsChoiceBox.setItems(FXCollections.observableArrayList("Integrated 3D Graphics    + $0.0",
                "NVIDIA GeForce G310 512MB DDR3     + $80.00",
                "NVIDIA GeForce GT620 1GB DDR3   + $169.00",
                "NVIDIA GeForce GT640 1GB GDDR5    + $490.00"));
        graphicsChoiceBox.setOnAction((Event -> {
            int graphicsSelectedIndex = graphicsChoiceBox.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.graphicsConfiguration.setGraphicsState(graphicsSelectedIndex);
            usersCustomizedComputer.graphicsConfiguration.setGraphicsFields();

            graphicsName = usersCustomizedComputer.graphicsConfiguration.getGraphicsName();
            graphicsPrice = usersCustomizedComputer.graphicsConfiguration.getGraphicsPrice();
            selectedGraphicsNameLabel.setText(graphicsName);
            selectedGraphicsPriceLabel.setText(setFieldToString(graphicsPrice));
            updateLabels();
        }));

        // Operating System
        operatingSystemChoiceBox.setItems(FXCollections.observableArrayList("Windows 8.1    + $0.0",
                "Windows 8.1 Pro     + $59.00",
                "Linux   - $89.00"));
        operatingSystemChoiceBox.setOnAction((Event -> {
            int operatingSystemSelectedIndex = operatingSystemChoiceBox.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.operatingSystemConfiguration.setOperatingSystemState(operatingSystemSelectedIndex);
            usersCustomizedComputer.operatingSystemConfiguration.setOperatingSystemFields();

            operatingSystemName = usersCustomizedComputer.operatingSystemConfiguration.getOperatingSystemName();
            operatingSystemPrice = usersCustomizedComputer.operatingSystemConfiguration.getOperatingSystemPrice();
            selectedOperatingSystemNameLabel.setText(operatingSystemName);
            selectedOperatingSystemPriceLabel.setText(setFieldToString(operatingSystemPrice));
            updateLabels();
        }));

        // MS Office Student


        // MS Office Business


        // Accounting Software Package


        // Graphics Software Package
    }

    public void resetIntelLabels() {
        selectedCpuNameLabel.setText("Processor");
        selectedCpuPriceLabel.setText(setFieldToString(0.0));
        selectedMemoryNameLabel.setText("Memory");
        selectedMemoryPriceLabel.setText(setFieldToString(0.0));
        selectedStorageNameLabel.setText("Storage");
        selectedStoragePriceLabel.setText(setFieldToString(0.0));
        selectedOpticsNameLabel.setText("Optical Drive");
        selectedOpticsPriceLabel.setText(setFieldToString(0.0));
        selectedGraphicsNameLabel.setText("Graphics");
        selectedGraphicsPriceLabel.setText(setFieldToString(0.0));
        selectedOperatingSystemNameLabel.setText("Operating System");
        selectedOperatingSystemPriceLabel.setText(setFieldToString(0.0));
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
        opticalDriveNameLabel.setText(opticsName);
        opticalDrivePriceLabel.setText(setFieldToString(opticsPrice));

        audioNameLabel.setText(AUDIO_NAME);
        speakersNameLabel.setText(SPEAKERS_NAME);
        keyboardNameLabel.setText(KEYBOARD_NAME);
        mouseNameLabel.setText(MOUSE_NAME);

        // additional software labels

        // Update Subtotal Price
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
    }

    /* Fields */
    private String processorName;
    private String memoryName;
    private String storageSpaceName;
    private String graphicsName;
    private String operatingSystemName;
    private String opticsName;
    private final String AUDIO_NAME = usersCustomizedComputer.getAUDIO_NAME();
    private final String SPEAKERS_NAME = usersCustomizedComputer.getSPEAKERS_NAME();
    private final String KEYBOARD_NAME = usersCustomizedComputer.getKEYBOARD_NAME();
    private final String MOUSE_NAME = usersCustomizedComputer.getMOUSE_NAME();

    private double processorPrice;
    private double memoryPrice;
    private double storageSpacePrice;
    private double graphicsPrice;
    private double operatingSystemPrice;
    private double opticsPrice;

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
    @FXML
    private ChoiceBox<Object> memoryChoiceBox;
    @FXML
    private Label selectedMemoryNameLabel;
    @FXML
    private Label selectedMemoryPriceLabel;
    @FXML
    private ChoiceBox<Object> storageChoiceBox;
    @FXML
    private Label selectedStorageNameLabel;
    @FXML
    private Label selectedStoragePriceLabel;
    @FXML
    private ChoiceBox<Object> opticsChoiceBox;
    @FXML
    private Label selectedOpticsNameLabel;
    @FXML
    private Label selectedOpticsPriceLabel;
    @FXML
    private ChoiceBox<Object> graphicsChoiceBox;
    @FXML
    private Label selectedGraphicsNameLabel;
    @FXML
    private Label selectedGraphicsPriceLabel;
    @FXML
    private ChoiceBox<Object> operatingSystemChoiceBox;
    @FXML
    private Label selectedOperatingSystemNameLabel;
    @FXML
    private Label selectedOperatingSystemPriceLabel;

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