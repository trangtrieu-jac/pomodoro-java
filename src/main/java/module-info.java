module com.example.pomodoro {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.pomodoro to javafx.fxml;
    exports com.example.pomodoro;
}