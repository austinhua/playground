package FrontEnd;
import java.util.Map;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
 

public class GraphicsTest extends Application {
	public static final double WIDTH = 500;
	public static final double HEIGHT = 500;
	Canvas c;
	GraphicsContext gc;
	private Group root;
	private Scene scene;
	
    @Override
    public void start(Stage stage) {
    	Setup(stage);
    	
		double[] polyX = {0, 100, 250, 300};
		double[] polyY = {0, 10, 250, 170};
		
		Rectangle r = new Rectangle(100, 100, Color.WHITE);
		root.getChildren().add(r);
		Polyline l = new Polyline();
		root.getChildren().add(l);

		for (int i = 0; i < polyX.length; i++) {
			addData(l, polyX[i], polyY[i]);
		}
		
		//gc.strokePolygon(polyX, polyY, polyX.length);
		//gc.strokeText("Test", 100, 100);
		
 
        stage.show();
    }
    
	public void addData(Polyline polyline, double x, double y) {
//		Map<Integer, Integer> stateCount = getStateCount(grid);
//		for (int state : stateCount.keySet()) {
			//Polyline polyline = stateData.containsKey(state) ? stateData.get(state) : makeNewPolyline(state);
			polyline.getPoints().addAll(new Double[]{x, y});
//		}
	}

    
	private void Setup(Stage stage) {
		root = new Group();
        scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
    	c = new Canvas(scene.getWidth(), scene.getHeight());
    	gc = c.getGraphicsContext2D();
		root.getChildren().add(c);
		
		ScrollPane scroll = new ScrollPane();
        scroll.relocate(WIDTH*.1, HEIGHT*.1);
		//scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setMaxHeight(400);
        scroll.setContent(c);
        root.getChildren().add(scroll);
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