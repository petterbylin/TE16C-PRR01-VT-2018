package lessons.lesson1;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX_Animation extends Application{
	
	public static final double WINDOW_WIDTH = 500;
	public static final double WINDOW_HEIGHT = 500;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		
		Scene scene = new Scene(root,WINDOW_WIDTH,WINDOW_HEIGHT);

		
		Circle cir = new Circle(50);
		cir.setFill(Color.BLUE);
		
		root.getChildren().add(cir);
		
		primaryStage.setScene(scene);
		primaryStage.show();

		AnimationTimer at = new AnimationTimer(){

			@Override
			public void handle(long now) {
				cir.setTranslateX(cir.getTranslateX() + WINDOW_WIDTH/60);
				cir.setTranslateY(cir.getTranslateY() + WINDOW_HEIGHT/60);
				if(cir.getTranslateX() > WINDOW_WIDTH+cir.getRadius()){
					cir.setTranslateX(-cir.getRadius());
					cir.setFill(new Color(Math.random(),Math.random(),Math.random(),1));
				}
				if(cir.getTranslateY() > WINDOW_WIDTH+cir.getRadius()){
					cir.setTranslateY(-cir.getRadius());
				}
			}
			
		};
		at.start();

	}
	
	public static void main(String[] args) {
		launch();
	}
	
}
