package lessons.lesson1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFX_Mall extends Application {

	public static final double WINDOW_WIDTH = 500;
	public static final double WINDOW_HEIGHT = 500;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
