package lessons.lesson1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFX_Former extends Application{
	
	public static final double WINDOW_WIDTH = 400;
	public static final double WINDOW_HEIGHT = 400;
	
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		
		Scene scene = new Scene(root,WINDOW_WIDTH,WINDOW_HEIGHT);
		
		Rectangle rect = new Rectangle(80,80);
		rect.setFill(Color.RED);
		
		rect.setTranslateX(WINDOW_WIDTH/2-80/2);
		rect.setTranslateY(WINDOW_HEIGHT/2-80/2);

		root.getChildren().add(rect);
		
		Circle cir = new Circle(40);
		cir.setFill(Color.BLUE);
		
		cir.setTranslateX(WINDOW_WIDTH/2);
		cir.setTranslateY(WINDOW_HEIGHT/2);

		root.getChildren().add(cir);
		
		
		Polygon triangel = new Polygon( 0,0 , 40,40 , 0,40);
		triangel.setFill(Color.GREEN);
		
		triangel.setTranslateX(WINDOW_WIDTH/2-40/2);
		triangel.setTranslateY(WINDOW_HEIGHT/2-40/2);
		
		root.getChildren().add(triangel);

		
		Polygon triangel2 = new Polygon( 0,0 , 40,0 , 40,40);
		triangel2.setFill(Color.YELLOW);
		
		triangel2.setTranslateX(WINDOW_WIDTH/2-40/2);
		triangel2.setTranslateY(WINDOW_HEIGHT/2-40/2);
		
		
		root.getChildren().add(triangel2);
		
		

		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
