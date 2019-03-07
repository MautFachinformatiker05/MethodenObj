package application;

import javafx.application.Application;						// HOLY SHIT SIND DAS VIELE IMPORTE
import javafx.beans.value.ObservableValue;
import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Button2 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) {				// Theater-Methapher mit Stage


		Button btn = new Button();					// Der Hello-Button
		final Label lbl = new Label();			// Das Hello-World Label

		lbl.setLayoutX(1);
		lbl.setLayoutY(125);

		btn.setLayoutX(1);
		btn.setLayoutY(100);
		btn.setText("  Hello!  ");

		btn.setOnAction(new EventHandler<ActionEvent>() {		// tut Zeug beim anklicken

			@Override
			public void handle(ActionEvent event) {
				lbl.setText("Hello, World.");
			}
		});

		Group root = new Group();					// von allen Buttons in einer Gruppe kann nur einer aktiv sein

		root.getChildren().add(btn);			// Zeug wird zur Leinwand dazuaddiert
		root.getChildren().add(lbl);

		final ToggleGroup group = new ToggleGroup();

		RadioButton rb1 = new RadioButton("A");				// runde Buttons
		rb1.setToggleGroup(group);
		rb1.setUserData("A");

		RadioButton rb2 = new RadioButton("B");
		rb2.setToggleGroup(group);
		rb2.setUserData("B");

		RadioButton rb3 = new RadioButton("C");
		rb3.setToggleGroup(group);
		rb3.setUserData("C");

		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			public void changed(ObservableValue<? extends Toggle> ov,
					Toggle old_toggle, Toggle new_toggle) {
				if (group.getSelectedToggle() != null) {
					System.out.println(group.getSelectedToggle().getUserData().toString());
				}
			}
		});

		rb1.setLayoutX(1);
		rb1.setLayoutY(10);
		rb2.setLayoutX(1);
		rb2.setLayoutY(40);
		rb3.setLayoutX(1);
		rb3.setLayoutY(70);
		root.getChildren().add(rb1);
		root.getChildren().add(rb2);
		root.getChildren().add(rb3);

		ToggleButton tb1 = new ToggleButton("+ D");					// viereckiger Button
		tb1.setLayoutX(35);
		tb1.setLayoutY(6);
		root.getChildren().add(tb1);

		PasswordField passwordField = new PasswordField();				// eingegebener Text nicht sichtbar, weil passwort
		passwordField.setPromptText("Passwort eingeben");
		passwordField.setPrefColumnCount(15);
		passwordField.setLayoutX(74);
		passwordField.setLayoutY(33);
		root.getChildren().add(passwordField);

		TextField titleTextField;
		titleTextField = new TextField();						// Textfeld
		titleTextField.setText("Testfeld");
		titleTextField.setPrefColumnCount(15);
		root.getChildren().add(titleTextField);
		titleTextField.setLayoutX(74);
		titleTextField.setLayoutY(6);
		StringProperty title = new SimpleStringProperty();			// Wieso ist das der Name des Fensters?!?
		title.bind(titleTextField.textProperty());				// Fenstername = Textfeld

		IntegerProperty r = new IntegerProperty() {				// int-Werte kann ich nicht binden, darum die Properties

			@Override
			public void set(int value) {
				// TODO Auto-generated method stub

			}

			@Override
			public int get() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void removeListener(InvalidationListener arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(InvalidationListener arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeListener(ChangeListener<? super Number> listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(ChangeListener<? super Number> listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getBean() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void unbind() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isBound() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void bind(ObservableValue<? extends Number> observable) {
				// TODO Auto-generated method stub

			}
		};
		r.set(0);
		IntegerProperty g = new IntegerProperty() {

			@Override
			public void set(int value) {
				// TODO Auto-generated method stub

			}

			@Override
			public int get() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void removeListener(InvalidationListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(InvalidationListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeListener(ChangeListener<? super Number> listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(ChangeListener<? super Number> listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getBean() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void unbind() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isBound() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void bind(ObservableValue<? extends Number> observable) {
				// TODO Auto-generated method stub

			}
		};
		g.set(0);
		IntegerProperty b = new IntegerProperty() {

			@Override
			public void set(int value) {
				// TODO Auto-generated method stub

			}

			@Override
			public int get() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void removeListener(InvalidationListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(InvalidationListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeListener(ChangeListener<? super Number> listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(ChangeListener<? super Number> listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getBean() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void unbind() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isBound() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void bind(ObservableValue<? extends Number> observable) {
				// TODO Auto-generated method stub

			}
		};
		b.set(0);

		Slider sl1 = new Slider(0, 255, 0);					// ein Slider
		sl1.setShowTickMarks(true);
		sl1.setShowTickLabels(true);
		sl1.setMajorTickUnit(50f);
		sl1.setBlockIncrement(5f);
		sl1.setLayoutX(74);
		sl1.setLayoutY(60);
		sl1.setPrefWidth(180);
		r.bind(sl1.valueProperty());					// r hat den Wert des Sliders

		Slider sl2 = new Slider(0, 255, 0);
		sl2.setShowTickMarks(true);
		sl2.setShowTickLabels(true);
		sl2.setMajorTickUnit(50f);
		sl2.setBlockIncrement(5f);
		sl2.setLayoutX(74);
		sl2.setLayoutY(90);
		sl2.setPrefWidth(180);
		b.bind(sl2.valueProperty());

		Slider sl3 = new Slider(0, 255, 0);
		sl3.setShowTickMarks(true);
		sl3.setShowTickLabels(true);
		sl3.setMajorTickUnit(50f);
		sl3.setBlockIncrement(5f);
		sl3.setLayoutX(74);
		sl3.setLayoutY(120);
		sl3.setPrefWidth(180);
		g.bind(sl3.valueProperty());

		final Label lb2 = new Label();
		lb2.setLayoutX(270);
		lb2.setLayoutY(0);
		lb2.setMinHeight(100);
		lb2.setMaxWidth(30);
		lb2.setText("T\nE\nS\nT\n5");
		lb2.setFont(Font.font(null,FontWeight.BOLD,34));
		Paint fill;																// geht nicht mit  = new Paint   usw
		fill.valueOf("red").bind(r.get());	// muss irgendwie gebindet werden
		lb2.textFillProperty().bind(fill.??);									// das auch      Paint muss doch Properties haben?!?
												// und wft ist das? http://javafxscripting.blogspot.com/2010/06/rgb-colour-mixer-application.html
		root.getChildren().add(sl1);

		root.getChildren().add(sl2);
		root.getChildren().add(sl3);
		root.getChildren().add(lb2);

		final Label lbR = new Label();
		lbR.setLayoutX(5);
		lbR.setLayoutY(200);
		lbR.textProperty().bind(r.asString());			// geht wohl nicht wie gedacht - wie dann?

		root.getChildren().add(lbR);

		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.titleProperty().bind(title);
		primaryStage.show();
	}
}