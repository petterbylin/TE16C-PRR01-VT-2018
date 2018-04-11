package lessons.lesson1;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Rocket extends Group {

	public Rocket() {

		Polygon top = new Polygon(25, 0, 15, 20, 35, 20);

		Rectangle body = new Rectangle(15, 20, 20, 80);

		Polygon wings = new Polygon(0, 100, 50, 100, 25, 50);

		top.setFill(Color.RED);
		body.setFill(Color.WHITE);
		wings.setFill(Color.RED);

		this.getChildren().addAll(top, wings, body);

	}

	public void moveForward() {

		double radians = Math.toRadians(this.getRotate() - 90);

		this.setTranslateX(this.getTranslateX() + Math.cos(radians) * 5);
		this.setTranslateY(this.getTranslateY() + Math.sin(radians) * 5);

	}

	public void rotateLeft() {
		this.setRotate(this.getRotate() - 2);
	}

	public void rotateRight() {
		this.setRotate(this.getRotate() + 2);
	}

}
