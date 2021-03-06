import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class ExceptionTest extends Application {

	public ExceptionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        launch(args);
	}

	private static void printError(Exception e, String fileName) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Exception Dialog");
		alert.setHeaderText("Look, an Exception Dialog");
		alert.setContentText("Could not find file " + fileName);

		Exception ex = new FileNotFoundException("Could not find file blabla.txt");

		// Create expandable Exception.
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		ex.printStackTrace(pw);
		String exceptionText = sw.toString();

		Label label = new Label("The exception stacktrace was:");

		TextArea textArea = new TextArea(exceptionText);
		textArea.setEditable(false);
		textArea.setWrapText(true);

		textArea.setMaxWidth(Double.MAX_VALUE);
		textArea.setMaxHeight(Double.MAX_VALUE);
		GridPane.setVgrow(textArea, Priority.ALWAYS);
		GridPane.setHgrow(textArea, Priority.ALWAYS);

		GridPane expContent = new GridPane();
		expContent.setMaxWidth(Double.MAX_VALUE);
		expContent.add(label, 0, 0);
		expContent.add(textArea, 0, 1);

		// Set expandable Exception into the dialog pane.
		alert.getDialogPane().setExpandableContent(expContent);

		alert.showAndWait();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		printError(new Exception(), "test.txt");		
	}
}
