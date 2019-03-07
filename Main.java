package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.EllipseBuilder;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Line line = new Line(100, 10,   10,   110);
			primaryStage.setScene(scene);
			root.getChildren().add(line);
			Line redLine = new Line(10, 10, 200, 10);
			redLine.setStroke(Color.RED);
			redLine.setStrokeWidth(10);
			redLine.setStrokeLineCap(StrokeLineCap.BUTT);
			redLine.getStrokeDashArray().addAll(15d, 5d, 15d, 15d, 20d);
			redLine.setStrokeDashOffset(10);
			root.getChildren().add(redLine);
			Rectangle r = new Rectangle();
	        r.setX(70);
	        r.setY(70);
	        r.setWidth(200);
	        r.setHeight(100);
	        r.setArcHeight(15);
	        r.setArcWidth(15);
	        r.setFill(Color.rgb(100, 0, 100));
	        root.getChildren().add(r);
	        Rectangle p = new Rectangle();
	        p.setX(70);
	        p.setY(70);
	        p.setWidth(80);
	        p.setHeight(120);
	        p.setArcHeight(15);
	        p.setArcWidth(15);
	        p.setFill(Color.rgb(100, 0, 0,0.7));
	        root.getChildren().add(p);

	        LinearGradient cycleGrad = new LinearGradient(50, // start X
	                50, // start Y
	                70, // end X
	                70, // end Y
	                false, // proportional
	                CycleMethod.REFLECT, // cycleMethod
	                new Stop(0f, Color.rgb(21, 25, 0, .784)), new Stop(1.0f, Color.rgb(0,
	                    210, 0, .784)));

	        Ellipse ellipse = new Ellipse();
	        ellipse.setCenterX(200.0f);
	        ellipse.setCenterY(200.0f);
	        ellipse.setRadiusX(50.0f);
	        ellipse.setRadiusY(25.0f);
	        ellipse.setFill(cycleGrad);
	        root.getChildren().add(ellipse);

	        Ellipse bigCircle = new Ellipse();
	        bigCircle.setCenterX(350.0f);
	        bigCircle.setCenterY(350.0f);
	        bigCircle.setRadiusX(50.0f);
	        bigCircle.setRadiusY(50.0f);

	        Ellipse smallCircle =  new Ellipse();
	        smallCircle.setCenterX(350.0f);
	        smallCircle.setCenterY(350.0f);
	        smallCircle.setRadiusX(25.0f);
	        smallCircle.setRadiusY(25.0f);

	        Shape shape = Path.subtract(bigCircle, smallCircle);
	        shape.setStrokeWidth(1);
	        shape.setStroke(Color.BLACK);

	        shape.setFill(Color.rgb(255, 200, 0));

	        root.getChildren().add(shape);

	        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.RED)};
	        LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

	        Arc blarc = new Arc();
	        blarc.setCenterX(140.0f);
	        blarc.setCenterY(240.0f);
	        blarc.setRadiusX(30.0f);
	        blarc.setRadiusY(30.0f);
	        blarc.setStartAngle(45.0f);
	        blarc.setLength(270.0f);
	        blarc.setType(ArcType.ROUND);
	        blarc.setFill(lg1);

	        root.getChildren().add(blarc);

	        Arc arc = new Arc();
	        arc.setCenterX(300.0f);
	        arc.setCenterY(300.0f);
	        arc.setRadiusX(25.0f);
	        arc.setRadiusY(25.0f);
	        arc.setStartAngle(45.0f);
	        arc.setLength(270.0f);
	        arc.setType(ArcType.ROUND);
	        arc.setFill(Color.rgb(200, 70, 20));

	        root.getChildren().add(arc);

	        Polygon polygon = new Polygon();
	        polygon.getPoints().addAll(new Double[]{
	            50.0, 300.0,
	            70.0, 310.0,
	            60.0, 320.0 });
	        polygon.setFill(Color.rgb(100, 200, 50));

	        root.getChildren().add(polygon);



			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
