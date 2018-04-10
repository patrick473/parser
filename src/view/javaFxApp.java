package view;

import Controller.MainInterpreter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class javaFxApp extends Application {
MainInterpreter mip = new MainInterpreter();
    public void start (Stage stage){
        stage.setTitle("Translator");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text scenetitle = new Text("Translate");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label dutchlabel = new Label("Dutch:");
        grid.add(dutchlabel, 0, 1);

        TextField dutchtext = new TextField();
        grid.add(dutchtext, 1, 1);

        Label en = new Label("english:");
        grid.add(en, 0, 2);

        Text rep1 = new Text();
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(rep1, 1, 2);
        Button btn = new Button("Translate");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 3);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                rep1.setText(mip.interpret(dutchtext.getText()));

            }
        });
        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);
        stage.show();
    }
}
