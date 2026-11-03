module com.mycompany.casopractico01gloriafer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.casopractico01gloriafer to javafx.fxml;
    exports com.mycompany.casopractico01gloriafer;
}
