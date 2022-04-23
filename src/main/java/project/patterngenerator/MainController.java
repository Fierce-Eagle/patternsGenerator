package project.patterngenerator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML
    private VBox factoryMethodVBox, objectPoolVBox, observerVBox, singletonVBox, visitorVBox, adapterVBox, decoratorVBox, flyweightVBox;
    @FXML
    private Button generateButton;
    @FXML
    private ChoiceBox<String> patternChoiceBox, typeChoiceBox;
    @FXML
    private TextArea textPatternArea;

    @FXML
    void initialize() {
        // Click Actions
        typeChoiceBoxClickAction();
        patternChoiceBoxClickAction();
    }
    @FXML
    void generateClick() {
        textPatternArea.setText("some pattern");
    }

    void typeChoiceBoxClickAction() {
        typeChoiceBox.getSelectionModel().selectedIndexProperty().addListener((ov, value, new_value) -> {
            generateButton.setDisable(true);
        });
    }

    void patternChoiceBoxClickAction() {
        patternChoiceBox.getSelectionModel().selectedIndexProperty().addListener((ov, value, new_value) -> {

        });
    }
}