import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class question15 extends Application {
    public void start(Stage stage) {
        // BorderPane layout
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Button("Top"));
        borderPane.setBottom(new Button("Bottom"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setRight(new Button("Right"));
        borderPane.setCenter(new Button("Center"));

        // VBox layout
        VBox vbox = new VBox(10, new Button("VBox 1"), new Button("VBox 2"));
        vbox.setAlignment(Pos.CENTER);

        // HBox layout
        HBox hbox = new HBox(10, new Button("HBox 1"), new Button("HBox 2"));
        hbox.setAlignment(Pos.CENTER);

        // GridPane layout
        GridPane grid = new GridPane();
        grid.add(new Button("0,0"), 0, 0);
        grid.add(new Button("1,0"), 1, 0);
        grid.add(new Button("0,1"), 0, 1);
        grid.add(new Button("1,1"), 1, 1);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        // FlowPane layout
        FlowPane flow = new FlowPane(10, 10, new Button("Flow 1"), new Button("Flow 2"), new Button("Flow 3"));
        flow.setAlignment(Pos.CENTER);

        // StackPane layout
        StackPane stack = new StackPane(new Button("Stack Centered"));
        stack.setPadding(new Insets(10));

        // AnchorPane layout
        AnchorPane anchor = new AnchorPane();
        Button anchorBtn = new Button("Anchored");
        AnchorPane.setTopAnchor(anchorBtn, 20.0);
        AnchorPane.setLeftAnchor(anchorBtn, 30.0);
        anchor.getChildren().add(anchorBtn);

        // Wrap all in a VBox to switch views
        VBox allLayouts = new VBox(15,
                titled("BorderPane", borderPane),
                titled("VBox", vbox),
                titled("HBox", hbox),
                titled("GridPane", grid),
                titled("FlowPane", flow),
                titled("StackPane", stack),
                titled("AnchorPane", anchor)
        );
        allLayouts.setPadding(new Insets(10));

        Scene scene = new Scene(allLayouts, 400, 600);
        stage.setTitle("Khusboo Karki");
        stage.setScene(scene);
        stage.show();
    }

    // Helper method to add titles to each layout section
    private VBox titled(String title, Pane pane) {
        VBox box = new VBox(5, new javafx.scene.control.Label(title), pane);
        box.setPadding(new Insets(5));
        box.setStyle("-fx-border-color: black; -fx-border-radius: 5; -fx-padding: 5;");
        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
