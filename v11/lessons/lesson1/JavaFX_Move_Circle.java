package lessons.lesson1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX_Move_Circle extends Application {

	public static final double WINDOW_WIDTH = 500;
	public static final double WINDOW_HEIGHT = 500;
	public static final double SPEED = 5;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		Circle cir = new Circle(40);
		cir.setFill(Color.BLUE);

		cir.setTranslateX(WINDOW_WIDTH / 2);
		cir.setTranslateY(WINDOW_HEIGHT / 2);

		root.getChildren().add(cir);

		scene.setOnKeyPressed(event -> {

			if (event.getCode() == KeyCode.UP) {
				cir.setTranslateY(cir.getTranslateY() - SPEED);
				if(cir.getTranslateY() < cir.getRadius()){
					cir.setTranslateY(cir.getRadius());
				}
			}
			if (event.getCode() == KeyCode.DOWN) {
				cir.setTranslateY(cir.getTranslateY() + SPEED);
				if(cir.getTranslateY() > WINDOW_HEIGHT-cir.getRadius()){
					cir.setTranslateY(WINDOW_HEIGHT-cir.getRadius());
				}
			}
			if (event.getCode() == KeyCode.LEFT) {
				cir.setTranslateX(cir.getTranslateX() - SPEED);
				if(cir.getTranslateX() < cir.getRadius()){
					cir.setTranslateX(cir.getRadius());
				}
			}
			if (event.getCode() == KeyCode.RIGHT) {
				cir.setTranslateX(cir.getTranslateX() + SPEED);
				if(cir.getTranslateX() > WINDOW_WIDTH-cir.getRadius()){
					cir.setTranslateX(WINDOW_WIDTH-cir.getRadius());
				}
			}

		});

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
