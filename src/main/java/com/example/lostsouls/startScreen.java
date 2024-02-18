package com.example.lostsouls;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class startScreen {

    @FXML
    private ImageView startBackgroundIVW = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/background.png"))));





    @FXML
    private void initialize(){

        startBackgroundIVW.setTranslateX(0);
        startBackgroundIVW.setTranslateY(0);




    }



















}