package why.listen.timbersword;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @brief main form
 * @author Haoye
 * @blog http://www.cnblogs.com/laishenghao
 * @date 2018/11/22
 */
public class MainApplication extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Label label = new Label("Hello World");
        root.getChildren().add(label);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Timber Sword");
        stage.show();
    }

}
