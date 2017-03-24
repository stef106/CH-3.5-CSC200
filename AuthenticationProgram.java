import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;
import java.util.Observable;

public class AuthenticationProgram extends Application {
    @Override
    public void start(Stage PrimaryStage) {
        ObservableList<String> options = FXCollections.observableArrayList("Administrator", "Staff", "Guest", "Faculty", "Student");
        final ComboBox comboBox = new ComboBox(options);
        //Labels
        Label unamelabel = new Label("Username:");
        Label passlabel = new Label("Password:");
        Label accountlabel = new Label("Account Type:");

        //Text Fields
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        //button
        Button button = new Button("Sign in");
        button.setOnAction(e-> {
                    if(usernameField.getText().equals("CaptainStefanL")&& passwordField.getText().equals("SWTOR")) {
                        //check account type since these fields allow for login
                        String actType = (String)comboBox.getValue();
                        switch(actType){
                            case "Administrator":
                                Label administratorlabel = new Label("Welcome " + comboBox.getValue());
                                Scene administrator = new Scene(administratorlabel);
                                Stage administratorstage = new Stage();
                                administratorstage.setHeight(300);
                                administratorstage.setWidth(300);
                                administratorstage.setScene(administrator);
                                administratorstage.show();
                                break;
                            case "Staff":
                                Label stafflabel = new Label("Welcome " + comboBox.getValue());
                                Scene staff = new Scene(stafflabel);
                                Stage staffstage = new Stage();
                                staffstage.setHeight(300);
                                staffstage.setWidth(300);
                                staffstage.setScene(staff);
                                staffstage.show();
                                break;
                            case "Guest":
                                Label guestlabel = new Label("Welcome " + comboBox.getValue());
                                Scene guest = new Scene(guestlabel);
                                Stage gueststage = new Stage();
                                gueststage.setHeight(300);
                                gueststage.setWidth(300);
                                gueststage.setScene(guest);
                                gueststage.show();
                            break;
                            case "Faculty":
                                Label facultylabel = new Label("Welcome " + comboBox.getValue());
                                Scene faculty = new Scene(facultylabel);
                                Stage facultystage = new Stage();
                                facultystage.setHeight(300);
                                facultystage.setWidth(300);
                                facultystage.setScene(faculty);
                                facultystage.show();
                            case "Student":
                                Label studentlabel = new Label("Welcome " + comboBox.getValue());
                                Scene student = new Scene(studentlabel);
                                Stage studentstage = new Stage();
                                studentstage.setHeight(300);
                                studentstage.setWidth(300);
                                studentstage.setScene(student);
                                studentstage.show();
                        }

                    } else {
                        Label rejectionlabel = new Label("Failure to Authorize " + comboBox.getValue());
                        Scene scenereject = new Scene(rejectionlabel);
                        Stage rejectionstage = new Stage();
                        rejectionstage.setHeight(300);
                        rejectionstage.setWidth(300);
                        rejectionstage.setScene(scenereject);
                        rejectionstage.show();

        }});
        //Combobox Instantiation
        VBox flowpane = new VBox();
        flowpane.getChildren().addAll(unamelabel, usernameField, passlabel, passwordField, accountlabel, comboBox, button);

        //Scene instantiation
        Scene scene = new Scene(flowpane, 850, 750);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("User Login");
        PrimaryStage.setHeight(800);
        PrimaryStage.setWidth(900);
        PrimaryStage.show();

    }
    public static void main(String [] args) {
        launch(args);
    }
}

