package project.patterngenerator.patterns.creational;

import javafx.scene.layout.VBox;
import project.patterngenerator.patterns.Pattern;

/**
 * Класс для вывода реализации FactoryMethod
 */
public class FactoryMethod extends Pattern {

    /**
     * Конструктор
     * @see Pattern
     * @param box VBox паттерна
     */
    public FactoryMethod(VBox box) {
        super(box);
    }

    /**
     * Возвращает реализацию паттерна
     * @see project.patterngenerator.patterns.IPattern
     * @return строку с реализацией паттерна
     */
    @Override
    public String getCode() {
        // todo сделать привязку к VBox, считывание и отдельный метод
        return "FactoryMethod code";
    }

    /**
     * Возвращает вид паттерна
     * @see project.patterngenerator.patterns.IPattern
     * @return вид паттерна (на английском)
     */
    @Override
    public String getType() {
        return "creational";
    }

    /**
     * Возвращает название паттерна
     * @see project.patterngenerator.patterns.IPattern
     * @return название паттерна (на английском)
     */
    @Override
    public String getName() {
        return "FactoryMethod";
    }
}
