package why.listen.timbersword.launch;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @brief
 * @author Haoye
 * @blog http://www.cnblogs.com/laishenghao
 * @date 2018/11/25
 */
public class Launcher extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPrefSize(360, 280);
        root.setStyle("-fx-background-color: slategrey");

        Label appNameLabel = new Label("Timber Sword");
        Font font = Font.font("Serif", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50);
        appNameLabel.setFont(font);

        root.getChildren().add(appNameLabel);

        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

}
