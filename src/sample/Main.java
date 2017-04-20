package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        Circle circle = new Circle(20, 20, 20);
        pane.getChildren().add(circle);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    circle.setCenterY(circle.getCenterY() >
                            circle.getRadius() ? circle.getCenterY() - 10 :
                            circle.getCenterY());
                    break;
                case DOWN:
                    circle.setCenterY(circle.getCenterY() <
                            pane.getHeight() - circle.getRadius() ?
                            circle.getCenterY() + 10 : circle.getCenterY());
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() >
                            circle.getRadius() ? circle.getCenterX() - 10 :
                            circle.getCenterX());
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() <
                            pane.getWidth() - circle.getRadius() ?
                            circle.getCenterX() + 10 : circle.getCenterX());
            }
        });

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
