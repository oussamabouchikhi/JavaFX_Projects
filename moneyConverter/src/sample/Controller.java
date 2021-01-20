package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private Label priceLabel;
    @FXML
    private Label priceInput;


    /*
    * Convert a given amount in DA to euros
    * The converted amount will be only 2 digits after the point
    * */
    public void convert() {
        final double  EURO_BLACK_MARKET_PRICE = 200;
        double price = Double.parseDouble(priceInput.getText());
        Double priceInEuros = Math.floor((price / EURO_BLACK_MARKET_PRICE) * 100) / 100;
        priceLabel.setText(priceInEuros.toString());
    }

    /*
    * Updates the priceInput with the clicked button text
    * */
    public void handleClick(MouseEvent mouseEvent) {
        Button clickedButton = (Button) mouseEvent.getSource();
        String amount = clickedButton.getText();
        priceInput.setText(priceInput.getText() + amount);
    }

    /*
     * Resets the priceInput & priceLabel to empty string
     * */
    public void clearInput() {
        priceInput.setText("");
        priceLabel.setText("");
    }
}
