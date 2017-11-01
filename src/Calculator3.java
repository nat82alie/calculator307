import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator3 extends Application {
	
	Label label1;
	Button button1;
	int result;
	MathFactory mathFac;
	String res;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Natalie's Calculator");
		label1 = new Label();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Scene scene = new Scene(grid, 400, 300);
		stage.setScene(scene);
		
		Text title = new Text("Integer Calculator");
		title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(title, 0, 0, 2, 1);

		Label inputPrompt = new Label("Equation: ");
		grid.add(inputPrompt, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		button1 = new Button("Calculate");
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				mathFac = new MathFactory(label1);
				res = mathFac.calculateResult(userTextField.getText());
				label1.setText(res);
			}
		});
		
		grid.add(button1, 1, 4);
		grid.add(label1, 1, 5);
		stage.show();
	}
}
