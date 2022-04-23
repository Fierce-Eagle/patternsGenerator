package project.patterngenerator.patterns;

import javafx.scene.layout.VBox;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.patterngenerator.patterns.creational.FactoryMethod;

import static org.junit.jupiter.api.Assertions.*;

class PatternTest {

    @Test
    void notifyAllPatternsFactoryMethod() {
        Pattern factory = new FactoryMethod(new VBox());
        factory.notifyAllPatterns();
        assertTrue(factory.box.isVisible());
    }

    @Test
    void getFactoryMethod() {
        Pattern factory = Pattern.get("FactoryMethod");
            assertEquals(factory.getName(), "FactoryMethod");
    }

    @Test
    void defineTypeFactoryMethod() {
        Pattern factory = new FactoryMethod(new VBox());
        if (factory.getName().equals("FactoryMethod")) {
            assertNotNull(Pattern.creational);
        }
    }
}