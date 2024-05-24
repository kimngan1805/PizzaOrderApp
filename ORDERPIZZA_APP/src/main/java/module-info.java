module com.example.orderpizza_app {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.persistence;

    opens com.example.orderpizza_app to javafx.fxml;
    exports com.example.orderpizza_app;
    exports com.example.orderpizza_app.Controller;
    opens com.example.orderpizza_app.Controller to javafx.fxml;
    opens com.example.orderpizza_app.Model to org.hibernate.orm.core, javafx.fxml, javafx.base;
    exports com.example.orderpizza_app.Model;
}