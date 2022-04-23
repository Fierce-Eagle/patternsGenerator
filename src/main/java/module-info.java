module patterns.pattern {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens project.patterngenerator to javafx.fxml;
    exports project.patterngenerator;
}