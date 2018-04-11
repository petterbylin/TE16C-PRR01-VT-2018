package lessons.lesson1;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class space extends Application {
	
	Scene scene;
	Rocket rocket;
	public static final ArrayList<KeyCode> keys = new ArrayList<KeyCode>();;

	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		scene = new Scene(root, 500, 500, Color.BLACK);
		setKeyPress();
		startAnimationTimer();
		
		for (int i = 0; i < 142; i++) {

			Circle star = new Circle(Math.random() * 4);
			star.setFill(Color.YELLOW);
			star.setTranslateX(Math.random() * 500);
			star.setTranslateY(Math.random() * 500);

			root.getChildren().add(star);

		}

		for (int i = 0; i < 3; i++) {

			Circle planet = new Circle(Math.random() * 15 + 15);
			planet.setFill(Color.BLUE);
			planet.setTranslateX(Math.random() * 300 + 100);
			planet.setTranslateY(Math.random() * 300 + 100);

			root.getChildren().add(planet);

		}

		rocket = new Rocket();

		root.getChildren().add(rocket);
		
		
		
		

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	
	private void startAnimationTimer() {

		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long now) {

				for (KeyCode key : keys) {

					switch (key) {

					case W:
						double deg = Math.toRadians(rocket.getRotate());
						rocket.moveForward();
						break;
					
					case Q:
						rocket.rotateLeft();
						break;
					case E:
						rocket.rotateRight();
						break;

					}

				}

			}

		};

		at.start();

	}
	

	private void setKeyPress() {

		scene.setOnKeyPressed(event -> {

			KeyCode key = event.getCode();

			if (!keys.contains(key)) {
				keys.add(key);
			}

		});

		scene.setOnKeyReleased(event -> {

			KeyCode key = event.getCode();

			if (keys.contains(key)) {
				keys.remove(key);
			}

		});
	}
}