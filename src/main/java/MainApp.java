
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(); // throws IllegalAccessError
	}

	public static void main(String[] args) {
		launch(MainApp.class, args);
	}

}