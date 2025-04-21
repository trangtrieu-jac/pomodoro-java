package com.example.pomodoro;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class HelloController {
    @FXML private Label titleLabel;
    @FXML private Label timerLabel;
    @FXML private Label sessionCountLabel;
    @FXML private Label workTime;
    @FXML private Label breakTime;

    @FXML private Button startButton;
    @FXML private Button pauseButton;
    @FXML private Button resetButton;

    @FXML private ComboBox<Integer> workDurationCombo;
    @FXML private ComboBox<Integer> breakDurationCombo;

    @FXML private ProgressBar progressBar;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//
//    @FXML
//    protected void onClickMeButtonClick() {
//        ClickMeLabel.setText("You clicked me. Yay!");
    }
}