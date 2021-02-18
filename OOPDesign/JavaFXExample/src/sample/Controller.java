package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;

import java.net.ServerSocket;

public class Controller {


    @FXML
    private ListView listView;
    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label progressLabel;

    private Service<ObservableList<String>> service;

    public void initialize() {
//        task = new Task<ObservableList<String>>() {
//            @Override
//            protected ObservableList<String> call() throws Exception {
//
//            }
//        };
        service = new EmployeeService();
        progressBar.progressProperty().bind(service.progressProperty());
        progressLabel.textProperty().bind(service.messageProperty());
        listView.itemsProperty().bind(service.valueProperty());


//        service.setOnRunning(event -> {
//            progressBar.setVisible(true);
//            progressLabel.setVisible(true);
//        });
//
//        service.setOnSucceeded(event -> {
//            progressBar.setVisible(false);
//            progressLabel.setVisible(false);
//        });

        progressBar.visibleProperty().bind(service.runningProperty());
        progressLabel.visibleProperty().bind(service.runningProperty());

    }

    @FXML
    public void buttonPressed() {
        if(service.getState() == Worker.State.SUCCEEDED){
            service.reset();
            service.start();
        }else if (service.getState() == Worker.State.READY){
            service.start();
        }
    }
}
