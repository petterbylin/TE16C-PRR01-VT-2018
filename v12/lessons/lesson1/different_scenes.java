package lessons.lesson1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class different_scenes extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = uppgift2();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public Scene uppgift1() {

		double WIDTH = 500;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		Rectangle r = new Rectangle(200,100);

		r.setTranslateX(WIDTH/2 - r.getWidth()/2);
		r.setTranslateY(HEIGHT/2 - r.getHeight()/2);
		
		r.setFill(Color.RED);
		root.getChildren().add(r);
		
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		return scene;
	}

	public Scene uppgift2() {

		double WIDTH = 500;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		
		for (int i = 0; i < 50; i++) {
			
			Circle cir = new Circle();
			
//			cir.setTranslateX(RANDOM);
//			cir.setTranslateY(RANDOM);
			
			root.getChildren().add(cir);
			
		}
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		return scene;
	}

	public Scene uppgift3() {

		double WIDTH = 500;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		return scene;
	}

}
