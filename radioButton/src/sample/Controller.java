package sample;

import com.jfoenix.controls.JFXRadioButton;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
    @FXML
    ImageView imageView;

    @FXML
    JFXRadioButton rb1, rb2;

    public void selectedImage() {
        Image image;
        if (rb1.isSelected()) {

            image = new Image("sample/images/home.png");

        } else if (rb2.isSelected()) {

            image = new Image("sample/images/contact.png");

        } else {

            image = new Image("sample/images/calendar.png");

        }

        imageView.setImage(image);
    }
}
