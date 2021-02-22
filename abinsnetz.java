package ab.ins.netz;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author biond
 */
public class AbInsNetz extends Application {
    
    public static void main (String[] args){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        WebView myWebView = new WebView();
        WebEngine engine = myWebView.getEngine();
        
        Button btn = new Button();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){
               engine.load("https://www.google.com/maps/@47.4808621,8.299981,289m/data=!3m1!1e3");
            }
            
        });
        
        Button suissbtn = new Button();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){
               engine.load("https://www.google.com/maps/@46.7847719,8.3338441,293898m/data=!3m1!1e3");
            }
            
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(myWebView, btn);
        
        Scene scene = new Scene(root, 800, 500);
        
        stage.setScene(scene);
        stage.show();
    }   
}
