package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML
    private Label subKey1, subKey2, subKey3, subKey4;

    /*
     * Une fonction qui genere une cle alphanumerique aleatoire de longeur 4
     * */
    public String alphaNumericStringGenerator(){
        int leftLimit = 48; // code ASCII du nombre 0
        int rightLimit = 90; // code ASCII de la lettre 'Z'
        int subKeyLength = 4; // longueur d'un segment
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65))
                .limit(subKeyLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public void generate() {

        try {
            subKey1.setText(alphaNumericStringGenerator());
            subKey2.setText(alphaNumericStringGenerator());
            subKey3.setText(alphaNumericStringGenerator());
            subKey4.setText(alphaNumericStringGenerator());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
