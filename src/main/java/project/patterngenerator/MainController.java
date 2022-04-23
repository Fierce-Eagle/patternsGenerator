package project.patterngenerator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import project.patterngenerator.patterns.Pattern;

/**
 * Контроллер, отвечает за связь между интерфейсом и моделью
 */
public class MainController {

    /**
     * VBox в которые вводится информация о паттернах (поля, названия классов, интерфейсы, методы)
     * Паттерн и соответствующий ему VBox
     * @see Pattern
     * FactoryMethod - factoryMethodVBox
     * ObjectPool - objectPoolVBox
     * Observer - observerVBox
     * Singleton - singletonVBox
     * Visitor - visitorVBox
     * Adapter - adapterVBox
     * Decorator - decoratorVBox
     * Flyweight - flyweightVBox
     */
    @FXML
    private VBox factoryMethodVBox, objectPoolVBox, observerVBox, singletonVBox, visitorVBox, adapterVBox, decoratorVBox, flyweightVBox;
    /**
     * Кнопка "Сгенерировать"
     */
    @FXML
    private Button generateButton;
    /**
     * typeChoiceBox - выпадающий список с выбором вида паттерна
     * patternChoiceBox - выпадающий список с выбором имени паттерна
     */
    @FXML
    private ChoiceBox<String> patternChoiceBox, typeChoiceBox;
    /**
     * Поле для вывода сгенерированного кода
     */
    @FXML
    private TextArea textPatternArea;

    /**
     * Инициализация и создание событий
     */
    @FXML
    void initialize() {
        // Click Actions
        typeChoiceBoxClickAction();
        patternChoiceBoxClickAction();
    }

    /**
     * Нажатие на кнопку "Сгенерировать"
     */
    @FXML
    void generateClick() {
        textPatternArea.setText("some pattern");
    }

    /**
     * Реакция на нажатие ChoiceBox с выбором вида паттерна
     */
    void typeChoiceBoxClickAction() {
        typeChoiceBox.getSelectionModel().selectedIndexProperty().addListener((ov, value, new_value) -> {
            // делает кнопку "Сгенерировать" недоступной, так как изменился вид паттерна, а название еще не выбрано
            generateButton.setDisable(true);
        });
    }

    /**
     * Реакция на нажатие ChoiceBox с выбором имени паттерна
     */
    void patternChoiceBoxClickAction() {
        patternChoiceBox.getSelectionModel().selectedIndexProperty().addListener((ov, value, new_value) -> {

        });
    }
}