package FrontEnd;
import java.util.Map;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.scene.*;
import javafx.scene.control.Label;

import javafx.scene.control.TabPane;
import javafx.scene.input.KeyCode;
import javafx.stage.*;
 

public class Tabs extends Application {
	public static final double WIDTH = 500;
	public static final double HEIGHT = 500;
	private Group root;
	private Scene scene;
	private TabPane myTabPane;
	
    @Override
    public void start(Stage stage) {
    	Setup(stage);
    	

    	
        stage.show();
    }

    
	private void Setup(Stage stage) {
		root = new Group();
		scene = new Scene(root, WIDTH, HEIGHT);
        myTabPane = new TabPane();
        root.getChildren().add(myTabPane);
	}
  
	public void setUpInputResponses(Scene myScene) {
        myScene.setOnKeyPressed(e -> handleKeyInput(e.getCode()));
        //myScene.setOnMousePressed(e -> handleMousePressed(e.getX(), e.getY()));
        //myScene.setOnMouseReleased(e -> handleMouseReleased(e.getX(), e.getY()));
    }
	
	private void handleKeyInput(KeyCode code) {
	     switch (code) {
         case ESCAPE:
         case I:
         default:
     }
	}
	
    public static void main(String[] args) {
        launch(args);
    }
}