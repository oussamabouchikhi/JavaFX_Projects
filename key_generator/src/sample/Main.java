package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Key Generator");
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setResizable(false);

        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
            System.out.println("Key pressed: " + event.toString());

            switch (event.getCode().impl_getCode()) {
                case 27: { // 27 = ESC key code ascii
                    primaryStage.close(); //fermer fenetre
                    break;
                }
                default: {
                    System.out.println("Unrecognized key");
                }
            }
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
