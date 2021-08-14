package kylemartin.finalproject;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.text.DecimalFormat;

public class ConfiguratorController {
    CustomizedComputer usersCustomizedComputer = new CustomizedComputer();
    DecimalFormat decimalFormat = new DecimalFormat("#,###.##");

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
        SubmitScreen.setVisible(false);

        processorName = "Processor";
        memoryName = "Memory";
        storageSpaceName = "Storage";
        graphicsName = "Graphics";
        operatingSystemName = "Operating System";
        opticsName = "Optical Drive";

        resetPrices();

        resetIntelScreen();
        resetSidebarLabels();
        updateLabels();

        audioNameLabel.setText("Audio Device");
        speakersNameLabel.setText("Speakers");
        keyboardNameLabel.setText("Keyboard");
        mouseNameLabel.setText("Mouse");
    }

    // AMD Screen
    /* THIS METHOD NEEDS TO BE REFACTORED ONCE AMD, INTEL, AND ORDER SCREEN ARE COMPLETE */
    /* Consolidate method into smaller methods each for processor, memory, storage graphics, OS, OD, and additional */
    @FXML
    public void OnAMDScreenButtonClick() {
        resetSidebarLabels();
        resetAMDScreen();
        setAMDChoiceBoxes();
        updateLabels();
        usersCustomizedComputer.baseAMD.transformProcessorFields();

        mainScreen.setVisible(false);
        SubmitScreen.setVisible(false);
        intelScreen.setVisible(false);
        AMDScreen.setVisible(true);

        processorName =  usersCustomizedComputer.baseAMD.getProcessorName();
        memoryName =  usersCustomizedComputer.baseAMD.getMemoryName();
        storageSpaceName = usersCustomizedComputer.baseAMD.getStorageSpaceName();
        graphicsName =  usersCustomizedComputer.baseAMD.getGraphicsName();
        operatingSystemName = usersCustomizedComputer.baseAMD.getOperatingSystemName();
        opticsName = usersCustomizedComputer.baseAMD.getOpticalDriveName();

        processorPrice = usersCustomizedComputer.baseAMD.getProcessorPrice();
        memoryPrice = usersCustomizedComputer.baseAMD.getMemoryPrice();
        storageSpacePrice = usersCustomizedComputer.baseAMD.getStorageSpacePrice();
        graphicsPrice = usersCustomizedComputer.baseAMD.getGraphicsPrice();
        operatingSystemPrice = usersCustomizedComputer.baseAMD.getOperatingSystemPrice();
        opticsPrice = usersCustomizedComputer.baseAMD.getOpticalDrivePrice();

        basePackagePrice = 599.00;

        updateLabels();

        // CPU Choice
        cpuChoiceBoxAMD.setOnAction((Event -> {
            int cpuSelectedIndex = cpuChoiceBoxAMD.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.amdConfiguration.setCpuState(cpuSelectedIndex);
            usersCustomizedComputer.amdConfiguration.transformProcessorFields();

            processorName = usersCustomizedComputer.amdConfiguration.getProcessorName();
            processorPrice = usersCustomizedComputer.amdConfiguration.getProcessorPrice();
            selectedCpuNameLabelAMD.setText(processorName);
            selectedCpuPriceLabelAMD.setText(setFieldToString(processorPrice));
            updateLabels();
        }));

        // Memory Choice
        memoryChoiceBoxAMD.setOnAction((Event -> {
            int memorySelectedIndex = memoryChoiceBoxAMD.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.memoryConfiguration.setMemoryState(memorySelectedIndex);
            usersCustomizedComputer.memoryConfiguration.setMemoryFields();

            memoryName = usersCustomizedComputer.memoryConfiguration.getMemoryName();
            memoryPrice = usersCustomizedComputer.memoryConfiguration.getMemoryPrice();
            selectedMemoryNameLabelAMD.setText(memoryName);
            selectedMemoryPriceLabelAMD.setText(setFieldToString(memoryPrice));
            updateLabels();
        }));

        // Storage Choice
        storageChoiceBoxAMD.setOnAction((Event -> {
            int storageSelectedIndex = storageChoiceBoxAMD.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.storageConfiguration.setStorageState(storageSelectedIndex);
            usersCustomizedComputer.storageConfiguration.setStorageFields();

            storageSpaceName = usersCustomizedComputer.storageConfiguration.getStorageSpaceName();
            storageSpacePrice = usersCustomizedComputer.storageConfiguration.getStorageSpacePrice();
            selectedStorageNameLabelAMD.setText(storageSpaceName);
            selectedStoragePriceLabelAMD.setText(setFieldToString(storageSpacePrice));
            updateLabels();
        }));

        // Optics Choice
        opticsChoiceBoxAMD.setOnAction((Event -> {
            int opticsSelectedIndex = opticsChoiceBoxAMD.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.opticalDriveConfiguration.setOpticsState(opticsSelectedIndex);
            usersCustomizedComputer.opticalDriveConfiguration.setOpticsFields();

            opticsName = usersCustomizedComputer.opticalDriveConfiguration.getOpticalDriveName();
            opticsPrice = usersCustomizedComputer.opticalDriveConfiguration.getOpticalDrivePrice();
            selectedOpticsNameLabelAMD.setText(opticsName);
            selectedOpticsPriceLabelAMD.setText(setFieldToString(opticsPrice));
            updateLabels();
        }));

        // Graphics Choice
        graphicsChoiceBoxAMD.setOnAction((Event -> {
            int graphicsSelectedIndex = graphicsChoiceBoxAMD.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.graphicsConfiguration.setGraphicsState(graphicsSelectedIndex);
            usersCustomizedComputer.graphicsConfiguration.setGraphicsFields();

            graphicsName = usersCustomizedComputer.graphicsConfiguration.getGraphicsName();
            graphicsPrice = usersCustomizedComputer.graphicsConfiguration.getGraphicsPrice();
            selectedGraphicsNameLabelAMD.setText(graphicsName);
            selectedGraphicsPriceLabelAMD.setText(setFieldToString(graphicsPrice));
            updateLabels();
        }));

        // Operating System
        operatingSystemChoiceBoxAMD.setOnAction((Event -> {
            int operatingSystemSelectedIndex = operatingSystemChoiceBoxAMD.getSelectionModel().getSelectedIndex();
            usersCustomizedComputer.operatingSystemConfiguration.setOperatingSystemState(operatingSystemSelectedIndex);
            usersCustomizedComputer.operatingSystemConfiguration.setOperatingSystemFields();

            operatingSystemName = usersCustomizedComputer.operatingSystemConfiguration.getOperatingSystemName();
            operatingSystemPrice = usersCustomizedComputer.operatingSystemConfiguration.getOperatingSystemPrice();
            selectedOperatingSystemNameLabelAMD.setText(operatingSystemName);
            selectedOperatingSystemPriceLabelAMD.setText(setFieldToString(operatingSystemPrice));
            updateLabels();
        }));
    }

    // Intel Screen
    /* THIS METHOD NEEDS TO BE REFACTORED ONCE AMD, INTEL, AND ORDER SCREEN ARE COMPLETE */
    /* Consolidate method into smaller methods each for processor, memory, storage graphics, OS, OD, and additional */
    @FXML
    public void OnIntelScreenButtonClick() {
        resetSidebarLabels();
        resetIntelScreen();
        setIntelChoiceBoxes();
        updateLabels();

        mainScreen.setVisible(false);
        SubmitScreen.setVisible(false);
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
    }

    @FXML
    public void submitOrderButtonClick() {
        mainScreen.setVisible(false);
        AMDScreen.setVisible(false);
        intelScreen.setVisible(false);
        SubmitScreen.setVisible(true);

        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;

        double salesTax = calculateSalesTax(subtotalPrice);
        double shippingCost = calculateShipping(subtotalPrice);
        double grandTotal = subtotalPrice + salesTax + shippingCost;

        String formattedSubtotalPrice = decimalFormat.format(subtotalPrice);
        String formattedSalesTax = decimalFormat.format(salesTax);
        String formattedShippingCost = decimalFormat.format(shippingCost);
        String formattedGrandTotal = decimalFormat.format(grandTotal);

        cpuNameLabelSubmit.setText(processorName);
        memoryNameLabelSubmit.setText(memoryName);
        storageNameLabelSubmit.setText(storageSpaceName);
        graphicsNameLabelSubmit.setText(graphicsName);
        operatingSystemNameLabelSubmit.setText(operatingSystemName);
        opticalDriveNameLabelSubmit.setText(opticsName);

        cpuPriceLabelSubmit.setText(setFieldToString(processorPrice));
        memoryPriceLabelSubmit.setText(setFieldToString(memoryPrice));
        storagePriceLabelSubmit.setText(setFieldToString(storageSpacePrice));
        graphicsPriceLabelSubmit.setText(setFieldToString(graphicsPrice));
        operatingSystemPriceLabelSubmit.setText(setFieldToString(operatingSystemPrice));
        opticalDrivePriceLabelSubmit.setText(setFieldToString(opticsPrice));
        msStudentPriceLabelSubmit.setText(setFieldToString(msStudentPackagePrice));
        msBusinessPriceLabelSubmit.setText(setFieldToString(msBusinessPackagePrice));
        accountingPriceLabelSubmit.setText(setFieldToString(accountingPackagePrice));
        graphicsPackagePriceLabelSubmit.setText(setFieldToString(graphicsPackagePrice));

        audioNameLabelSubmit.setText(AUDIO_NAME);
        speakersNameLabelSubmit.setText(SPEAKERS_NAME);
        keyboardNameLabelSubmit.setText(KEYBOARD_NAME);
        mouseNameLabelSubmit.setText(MOUSE_NAME);

        basePackagePriceSubmit.setText(setFieldToString(basePackagePrice));
        subTotalPriceSubmit.setText(formattedSubtotalPrice);
        salesTaxTotalSubmit.setText(formattedSalesTax);
        shippingTotalSubmit.setText(formattedShippingCost);
        grandTotalPriceSubmit.setText(formattedGrandTotal);
    }

    public double calculateSalesTax(double price) {
        return price * 0.078;
    }

    public double calculateShipping (double ship) {
        return ship * 0.025;
    }

    @FXML
    public void msStudentIsSelected() {
        boolean msStudentPackage = msStudentCheckbox.isSelected();
        if (msStudentPackage) {
            msStudentPackageName = usersCustomizedComputer.additionalPackages.getMsStudentPackageName();
            msStudentPackagePrice = usersCustomizedComputer.additionalPackages.getMsStudentPackagePrice();
            selectedMsStudentPriceLabel.setText(setFieldToString(msStudentPackagePrice));
        } else {
            msStudentPackageName = DECLINED_TEXT;
            msStudentPackagePrice = 0.0;
            msStudentNameLabel.setText(DECLINED_TEXT);
            msStudentPriceLabel.setText(setFieldToString(0.0));
            selectedMsStudentPriceLabel.setText(setFieldToString(0.0));
        }
        updateLabels();
    }

    @FXML
    public void msStudentIsSelectedAMD() {
        boolean msStudentPackage = msStudentCheckboxAMD.isSelected();
        if (msStudentPackage) {
            msStudentPackageName = usersCustomizedComputer.additionalPackages.getMsStudentPackageName();
            msStudentPackagePrice = usersCustomizedComputer.additionalPackages.getMsStudentPackagePrice();
            selectedMsStudentPriceLabelAMD.setText(setFieldToString(msStudentPackagePrice));
        } else {
            msStudentPackageName = DECLINED_TEXT;
            msStudentPackagePrice = 0.0;
            msStudentNameLabel.setText(DECLINED_TEXT);
            msStudentPriceLabel.setText(setFieldToString(0.0));
            selectedMsStudentPriceLabelAMD.setText(setFieldToString(0.0));
        }
        updateAdditionalLabels( msStudentCheckboxAMD, msStudentNameLabel, msStudentPriceLabel, msStudentPackagePrice,
                msBusinessCheckboxAMD, msBusinessNameLabel, msBusinessPriceLabel, msBusinessPackagePrice);
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
    }

    @FXML
    public void msBusinessIsSelected() {
        boolean msBusinessPackage = msBusinessCheckbox.isSelected();
        if (msBusinessPackage) {
            msBusinessPackageName = usersCustomizedComputer.additionalPackages.getMsBusinessPackageName();
            msBusinessPackagePrice =  usersCustomizedComputer.additionalPackages.getMsBusinessPackagePrice();
            selectedMsBusinessPriceLabel.setText(setFieldToString(msBusinessPackagePrice));
        } else {
            msBusinessPackageName = DECLINED_TEXT;
            msBusinessPackagePrice = 0.0;
            msBusinessNameLabel.setText(DECLINED_TEXT);
            msBusinessPriceLabel.setText(setFieldToString(0.0));
            selectedMsBusinessPriceLabel.setText(setFieldToString(0.0));
        }
        updateLabels();
    }

    @FXML
    public void msBusinessIsSelectedAMD() {
        boolean msBusinessPackage = msBusinessCheckboxAMD.isSelected();
        if (msBusinessPackage) {
            msBusinessPackageName = usersCustomizedComputer.additionalPackages.getMsBusinessPackageName();
            msBusinessPackagePrice =  usersCustomizedComputer.additionalPackages.getMsBusinessPackagePrice();
            selectedMsBusinessPriceLabelAMD.setText(setFieldToString(msBusinessPackagePrice));
        } else {
            msBusinessPackageName = DECLINED_TEXT;
            msBusinessPackagePrice = 0.0;
            msBusinessNameLabel.setText(DECLINED_TEXT);
            msBusinessPriceLabel.setText(setFieldToString(0.0));
            selectedMsBusinessPriceLabelAMD.setText(setFieldToString(0.0));
        }
        updateAdditionalLabels( msStudentCheckboxAMD, msStudentNameLabel, msStudentPriceLabel, msStudentPackagePrice,
                msBusinessCheckboxAMD, msBusinessNameLabel, msBusinessPriceLabel, msBusinessPackagePrice);
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
    }

    @FXML
    public void accountingIsSelected() {
        boolean accountingPackage = accountingCheckbox.isSelected();
        if (accountingPackage) {
            accountingPackageName = usersCustomizedComputer.additionalPackages.getAccountingPackageName();
            accountingPackagePrice = usersCustomizedComputer.additionalPackages.getAccountingPackagePrice();
            selectedAccountingPriceLabel.setText(setFieldToString(accountingPackagePrice));
        } else {
            accountingPackageName = DECLINED_TEXT;
            accountingPackagePrice = 0.0;
            accountingNameLabel.setText(DECLINED_TEXT);
            accountingPriceLabel.setText(setFieldToString(0.0));
            selectedAccountingPriceLabel.setText(setFieldToString(0.0));
        }
        updateLabels();
    }

    @FXML
    public void accountingIsSelectedAMD() {
        boolean accountingPackage = accountingCheckboxAMD.isSelected();
        if (accountingPackage) {
            accountingPackageName = usersCustomizedComputer.additionalPackages.getAccountingPackageName();
            accountingPackagePrice = usersCustomizedComputer.additionalPackages.getAccountingPackagePrice();
            selectedAccountingPriceLabelAMD.setText(setFieldToString(accountingPackagePrice));
        } else {
            accountingPackageName = DECLINED_TEXT;
            accountingPackagePrice = 0.0;
            accountingNameLabel.setText(DECLINED_TEXT);
            accountingPriceLabel.setText(setFieldToString(0.0));
            selectedAccountingPriceLabelAMD.setText(setFieldToString(0.0));
        }
        updateAdditionalLabels( accountingCheckboxAMD, accountingNameLabel, accountingPriceLabel, accountingPackagePrice,
                graphicsPackageCheckboxAMD, graphicsPackageNameLabel, graphicsPackagePriceLabel,
                graphicsPackagePrice);
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
    }

    @FXML
    public void graphicsPackageIsSelected() {
        boolean graphicsPackage = graphicsPackageCheckbox.isSelected();
        if (graphicsPackage) {
            graphicsPackageName = usersCustomizedComputer.additionalPackages.getGraphicsPackageName();
            graphicsPackagePrice =  usersCustomizedComputer.additionalPackages.getGraphicsPackagePrice();
            selectedGraphicsPackagePriceLabel.setText(setFieldToString(graphicsPackagePrice));
        } else {
            graphicsPackageName = DECLINED_TEXT;
            graphicsPackagePrice = 0.0;
            graphicsPackageNameLabel.setText(DECLINED_TEXT);
            graphicsPackagePriceLabel.setText(setFieldToString(0.0));
            selectedGraphicsPackagePriceLabel.setText(setFieldToString(0.0));
        }
        updateLabels();
    }

    @FXML
    public void graphicsPackageIsSelectedAMD() {
        boolean graphicsPackage = graphicsPackageCheckboxAMD.isSelected();
        if (graphicsPackage) {
            graphicsPackageName = usersCustomizedComputer.additionalPackages.getGraphicsPackageName();
            graphicsPackagePrice =  usersCustomizedComputer.additionalPackages.getGraphicsPackagePrice();
            selectedGraphicsPackagePriceLabelAMD.setText(setFieldToString(graphicsPackagePrice));
        } else {
            graphicsPackageName = DECLINED_TEXT;
            graphicsPackagePrice = 0.0;
            graphicsPackageNameLabel.setText(DECLINED_TEXT);
            graphicsPackagePriceLabel.setText(setFieldToString(0.0));
            selectedGraphicsPackagePriceLabelAMD.setText(setFieldToString(0.0));
        }
        updateAdditionalLabels( accountingCheckboxAMD, accountingNameLabel, accountingPriceLabel, accountingPackagePrice,
                graphicsPackageCheckboxAMD, graphicsPackageNameLabel, graphicsPackagePriceLabel,
                graphicsPackagePrice);
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
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
        updateAdditionalLabels( msStudentCheckbox, msStudentNameLabel, msStudentPriceLabel, msStudentPackagePrice,
                                msBusinessCheckbox, msBusinessNameLabel, msBusinessPriceLabel, msBusinessPackagePrice);
        updateAdditionalLabels( accountingCheckbox, accountingNameLabel, accountingPriceLabel, accountingPackagePrice,
                                graphicsPackageCheckbox, graphicsPackageNameLabel, graphicsPackagePriceLabel,
                                graphicsPackagePrice);

        // Update Subtotal Price
        double subtotalPrice = processorPrice + memoryPrice + storageSpacePrice + graphicsPrice + operatingSystemPrice +
                opticsPrice + msStudentPackagePrice + msBusinessPackagePrice + accountingPackagePrice +
                graphicsPackagePrice + basePackagePrice;
        subTotalPriceLabel.setText(setFieldToString(subtotalPrice));
    }

    public void updateAdditionalLabels(CheckBox accountingCheckbox, Label accountingNameLabel, Label accountingPriceLabel,
                                       double accountingPackagePrice, CheckBox graphicsPackageCheckbox,
                                       Label graphicsPackageNameLabel, Label graphicsPackagePriceLabel,
                                       double graphicsPackagePrice) {
        if (accountingCheckbox.isSelected()) {
            accountingNameLabel.setText(ACCEPTED_TEXT);
            accountingPriceLabel.setText(setFieldToString(accountingPackagePrice));
        } else {
            accountingNameLabel.setText(DECLINED_TEXT);
            accountingPriceLabel.setText(setFieldToString(0.0));
        }
        if (graphicsPackageCheckbox.isSelected()) {
            graphicsPackageNameLabel.setText(ACCEPTED_TEXT);
            graphicsPackagePriceLabel.setText(setFieldToString(graphicsPackagePrice));
        } else {
            graphicsPackageNameLabel.setText(DECLINED_TEXT);
            graphicsPackagePriceLabel.setText(setFieldToString(0.0));
        }
    }

    public void setAMDChoiceBoxes() {
        cpuChoiceBoxAMD.setItems(FXCollections.observableArrayList("AMD FX-2100     + $0.0",
                "AMD FX-8350     + $25.00",
                "AMD FX-9590     + $90.00",
                "AMD FX-4100     + $187.00",
                "AMD FX-4300     + $280.00"));

        memoryChoiceBoxAMD.setItems(FXCollections.observableArrayList("4GB DDR3     + $0.0",
                "6GB DDR3     + $28.00",
                "8GB DDR3     + $58.00",
                "12GB DDR3     + $108.00",
                "16GB DDR3     + $176.00"));
        storageChoiceBoxAMD.setItems(FXCollections.observableArrayList("125GB 7.2K RPM SATA    + $0.0",
                "250GB 7.2K RPM SATA     + $27.00",
                "500GB 7.2K RPM SATA   + $50.00",
                "1TB 7.2K RPM SATA    + $105.00"));
        opticsChoiceBoxAMD.setItems(FXCollections.observableArrayList("CD-Rom Drive    + $0.0",
                "DVD Drive     + $17.00",
                "Combo DVD/CDRW Drive   + $40.00",
                "DVD and CDRW Drive    + $79.00"));
        graphicsChoiceBoxAMD.setItems(FXCollections.observableArrayList("Integrated 3D Graphics    + $0.0",
                "NVIDIA GeForce G310 512MB DDR3     + $80.00",
                "NVIDIA GeForce GT620 1GB DDR3   + $169.00",
                "NVIDIA GeForce GT640 1GB GDDR5    + $490.00"));
        operatingSystemChoiceBoxAMD.setItems(FXCollections.observableArrayList("Windows 8.1    + $0.0",
                "Windows 8.1 Pro     + $59.00",
                "Linux   - $89.00"));
    }

    public void setIntelChoiceBoxes() {
        cpuChoiceBox.setItems(FXCollections.observableArrayList("Intel Celeron G1610 2.3GHz     + $0.0",
                "Intel Celeron G1620 2.7GHz     + $50.00",
                "Intel Celeron G1630 2.8GHz     + $90.00",
                "Intel Celeron G1820 2.7GHz     + $105.00",
                "Intel Celeron G1830 2.8GHz     + $130.00"));
        memoryChoiceBox.setItems(FXCollections.observableArrayList("4GB DDR3     + $0.0",
                "6GB DDR3     + $28.00",
                "8GB DDR3     + $58.00",
                "12GB DDR3     + $108.00",
                "16GB DDR3     + $176.00"));
        storageChoiceBox.setItems(FXCollections.observableArrayList("125GB 7.2K RPM SATA    + $0.0",
                "250GB 7.2K RPM SATA     + $27.00",
                "500GB 7.2K RPM SATA   + $50.00",
                "1TB 7.2K RPM SATA    + $105.00"));
        opticsChoiceBox.setItems(FXCollections.observableArrayList("CD-Rom Drive    + $0.0",
                "DVD Drive     + $17.00",
                "Combo DVD/CDRW Drive   + $40.00",
                "DVD and CDRW Drive    + $79.00"));
        graphicsChoiceBox.setItems(FXCollections.observableArrayList("Integrated 3D Graphics    + $0.0",
                "NVIDIA GeForce G310 512MB DDR3     + $80.00",
                "NVIDIA GeForce GT620 1GB DDR3   + $169.00",
                "NVIDIA GeForce GT640 1GB GDDR5    + $490.00"));
        operatingSystemChoiceBox.setItems(FXCollections.observableArrayList("Windows 8.1    + $0.0",
                "Windows 8.1 Pro     + $59.00",
                "Linux   - $89.00"));
    }

    public void resetSidebarLabels() {
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
        msStudentNameLabel.setText(DECLINED_TEXT);
        msStudentPriceLabel.setText(setFieldToString(0.0));
        msBusinessNameLabel.setText(DECLINED_TEXT);
        msBusinessPriceLabel.setText(setFieldToString(0.0));
        accountingNameLabel.setText(DECLINED_TEXT);
        accountingPriceLabel.setText(setFieldToString(0.0));
        graphicsPackageNameLabel.setText(DECLINED_TEXT);
        graphicsPackagePriceLabel.setText(setFieldToString(0.0));
    }

    public void resetAMDScreen() {
        resetNames();
        resetPrices();

        cpuChoiceBoxAMD.setValue("AMD FX-2100     + $0.0");

        memoryChoiceBoxAMD.setValue("4GB DDR3     + $0.0");
        storageChoiceBoxAMD.setValue("125GB 7.2K RPM SATA    + $0.0");
        opticsChoiceBoxAMD.setValue("CD-Rom Drive    + $0.0");
        graphicsChoiceBoxAMD.setValue("Integrated 3D Graphics    + $0.0");
        operatingSystemChoiceBoxAMD.setValue("Windows 8.1    + $0.0");
        selectedCpuNameLabelAMD.setText("CPU Name");
        selectedMemoryNameLabelAMD.setText("Memory Name");
        selectedStorageNameLabelAMD.setText("Storage Name");
        selectedOpticsNameLabelAMD.setText("Optics Name");
        selectedGraphicsNameLabelAMD.setText("Graphics Name");
        selectedOperatingSystemNameLabelAMD.setText("Operating System Name");

        msStudentCheckboxAMD.setSelected(false);
        msBusinessCheckboxAMD.setSelected(false);
        accountingCheckboxAMD.setSelected(false);
        graphicsPackageCheckboxAMD.setSelected(false);

        selectedCpuPriceLabelAMD.setText(setFieldToString(0.0));
        selectedMemoryPriceLabelAMD.setText(setFieldToString(0.0));
        selectedStoragePriceLabelAMD.setText(setFieldToString(0.0));
        selectedOpticsPriceLabelAMD.setText(setFieldToString(0.0));
        selectedGraphicsPriceLabelAMD.setText(setFieldToString(0.0));
        selectedOperatingSystemPriceLabelAMD.setText(setFieldToString(0.0));
        selectedMsStudentPriceLabelAMD.setText(setFieldToString(0.0));
    }

    public void resetIntelScreen() {
        resetNames();
        resetPrices();

        cpuChoiceBox.setValue("Intel Celeron G1610 2.3GHz     + $0.0");

        memoryChoiceBox.setValue("4GB DDR3     + $0.0");
        storageChoiceBox.setValue("125GB 7.2K RPM SATA    + $0.0");
        opticsChoiceBox.setValue("CD-Rom Drive    + $0.0");
        graphicsChoiceBox.setValue("Integrated 3D Graphics    + $0.0");
        operatingSystemChoiceBox.setValue("Windows 8.1    + $0.0");
        selectedCpuNameLabel.setText("CPU Name");
        selectedMemoryNameLabel.setText("Memory Name");
        selectedStorageNameLabel.setText("Storage Name");
        selectedOpticsNameLabel.setText("Optics Name");
        selectedGraphicsNameLabel.setText("Graphics Name");
        selectedOperatingSystemNameLabel.setText("Operating System Name");

        msStudentCheckbox.setSelected(false);
        msBusinessCheckbox.setSelected(false);
        accountingCheckbox.setSelected(false);
        graphicsPackageCheckbox.setSelected(false);

        selectedCpuPriceLabel.setText(setFieldToString(0.0));
        selectedMemoryPriceLabel.setText(setFieldToString(0.0));
        selectedStoragePriceLabel.setText(setFieldToString(0.0));
        selectedOpticsPriceLabel.setText(setFieldToString(0.0));
        selectedGraphicsPriceLabel.setText(setFieldToString(0.0));
        selectedOperatingSystemPriceLabel.setText(setFieldToString(0.0));
        selectedMsStudentPriceLabel.setText(setFieldToString(0.0));
        msBusinessPriceLabel.setText(setFieldToString(0.0));
        accountingPriceLabel.setText(setFieldToString(0.0));
        graphicsPackagePriceLabel.setText(setFieldToString(0.0));
    }

    public void resetNames() {
        processorName = "";
        memoryName = "";
        storageSpaceName = "";
        graphicsName = "";
        operatingSystemName = "";
        opticsName = "";
    }

    public void resetPrices() {
        processorPrice = 0.0;
        memoryPrice = 0.0;
        storageSpacePrice = 0.0;
        graphicsPrice = 0.0;
        operatingSystemPrice = 0.0;
        opticsPrice = 0.0;
        msStudentPackagePrice = 0.0;
        msBusinessPackagePrice = 0.0;
        accountingPackagePrice = 0.0;
        graphicsPackagePrice = 0.0;
        basePackagePrice = 0.0;
    }

    /* Fields */
    private String processorName;
    private String memoryName;
    private String storageSpaceName;
    private String graphicsName;
    private String operatingSystemName;
    private String opticsName;

    private String msStudentPackageName;
    private String msBusinessPackageName;
    private String accountingPackageName;
    private String graphicsPackageName;

    private final String AUDIO_NAME = usersCustomizedComputer.getAUDIO_NAME();
    private final String SPEAKERS_NAME = usersCustomizedComputer.getSPEAKERS_NAME();
    private final String KEYBOARD_NAME = usersCustomizedComputer.getKEYBOARD_NAME();
    private final String MOUSE_NAME = usersCustomizedComputer.getMOUSE_NAME();

    private final String DECLINED_TEXT = "Declined";
    private final String ACCEPTED_TEXT = "Accepted";

    private double processorPrice = 0.0;
    private double memoryPrice;
    private double storageSpacePrice;
    private double graphicsPrice;
    private double operatingSystemPrice;
    private double opticsPrice;

    private double msStudentPackagePrice;
    private double msBusinessPackagePrice;
    private double accountingPackagePrice;
    private double graphicsPackagePrice;
    private double basePackagePrice = 0.0;

    // Main Screen
    @FXML
    private AnchorPane mainScreen;

    // Submit Screen
    @FXML
    private AnchorPane SubmitScreen;
    @FXML
    private Label cpuNameLabelSubmit;
    @FXML
    private Label memoryNameLabelSubmit;
    @FXML
    private Label storageNameLabelSubmit;
    @FXML
    private Label graphicsNameLabelSubmit;
    @FXML
    private Label operatingSystemNameLabelSubmit;
    @FXML
    private Label opticalDriveNameLabelSubmit;
    @FXML
    private Label cpuPriceLabelSubmit;
    @FXML
    private Label memoryPriceLabelSubmit;
    @FXML
    private Label storagePriceLabelSubmit;
    @FXML
    private Label graphicsPriceLabelSubmit;
    @FXML
    private Label operatingSystemPriceLabelSubmit;
    @FXML
    private Label opticalDrivePriceLabelSubmit;
    @FXML
    private Label msStudentPriceLabelSubmit;
    @FXML
    private Label msBusinessPriceLabelSubmit;
    @FXML
    private Label accountingPriceLabelSubmit;
    @FXML
    private Label graphicsPackagePriceLabelSubmit;
    @FXML
    private Label audioNameLabelSubmit;
    @FXML
    private Label speakersNameLabelSubmit;
    @FXML
    private Label keyboardNameLabelSubmit;
    @FXML
    private Label mouseNameLabelSubmit;
    @FXML
    private Label basePackagePriceSubmit;
    @FXML
    private Label subTotalPriceSubmit;
    @FXML
    private Label salesTaxTotalSubmit;
    @FXML
    private Label shippingTotalSubmit;
    @FXML
    private Label grandTotalPriceSubmit;

    // AMD Screen
    @FXML
    private AnchorPane AMDScreen;
    @FXML
    private ChoiceBox<Object> cpuChoiceBoxAMD;
    @FXML
    private Label selectedCpuNameLabelAMD;
    @FXML
    private Label selectedCpuPriceLabelAMD;
    @FXML
    private ChoiceBox<Object> memoryChoiceBoxAMD;
    @FXML
    private Label selectedMemoryNameLabelAMD;
    @FXML
    private Label selectedMemoryPriceLabelAMD;
    @FXML
    private ChoiceBox<Object> storageChoiceBoxAMD;
    @FXML
    private Label selectedStorageNameLabelAMD;
    @FXML
    private Label selectedStoragePriceLabelAMD;
    @FXML
    private ChoiceBox<Object> opticsChoiceBoxAMD;
    @FXML
    private Label selectedOpticsNameLabelAMD;
    @FXML
    private Label selectedOpticsPriceLabelAMD;
    @FXML
    private ChoiceBox<Object> graphicsChoiceBoxAMD;
    @FXML
    private Label selectedGraphicsNameLabelAMD;
    @FXML
    private Label selectedGraphicsPriceLabelAMD;
    @FXML
    private ChoiceBox<Object> operatingSystemChoiceBoxAMD;
    @FXML
    private Label selectedOperatingSystemNameLabelAMD;
    @FXML
    private Label selectedOperatingSystemPriceLabelAMD;

    // Intel Screen
    @FXML
    private AnchorPane intelScreen;
    @FXML
    private ChoiceBox<Object> cpuChoiceBox;
    @FXML
    private Label selectedCpuNameLabel;
    @FXML
    private Label selectedCpuPriceLabel;

    // Both Screens
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

    // Additional Software
    @FXML
    private CheckBox msStudentCheckbox;
    @FXML
    private Label selectedMsStudentPriceLabel;
    @FXML
    private CheckBox msBusinessCheckbox;
    @FXML
    private Label selectedMsBusinessPriceLabel;
    @FXML
    private CheckBox accountingCheckbox;
    @FXML
    private Label selectedAccountingPriceLabel;
    @FXML
    private CheckBox graphicsPackageCheckbox;
    @FXML
    private Label selectedGraphicsPackagePriceLabel;
    @FXML
    private CheckBox msStudentCheckboxAMD;
    @FXML
    private Label selectedMsStudentPriceLabelAMD;
    @FXML
    private CheckBox msBusinessCheckboxAMD;
    @FXML
    private Label selectedMsBusinessPriceLabelAMD;
    @FXML
    private CheckBox accountingCheckboxAMD;
    @FXML
    private Label selectedAccountingPriceLabelAMD;
    @FXML
    private CheckBox graphicsPackageCheckboxAMD;
    @FXML
    private Label selectedGraphicsPackagePriceLabelAMD;

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
    @FXML
    private Label msStudentNameLabel;
    @FXML
    private Label msStudentPriceLabel;
    @FXML
    private Label msBusinessNameLabel;
    @FXML
    private Label msBusinessPriceLabel;
    @FXML
    private Label accountingNameLabel;
    @FXML
    private Label accountingPriceLabel;
    @FXML
    private Label graphicsPackageNameLabel;
    @FXML
    private Label graphicsPackagePriceLabel;
}