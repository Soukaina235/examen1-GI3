module com.soukaina.clientdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.soukaina.clientdesktop to javafx.fxml;
    exports com.soukaina.clientdesktop;
}