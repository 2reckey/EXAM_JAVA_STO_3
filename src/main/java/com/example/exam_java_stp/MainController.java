package com.example.exam_java_stp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField fromField;

    @FXML
    private Label nums;

    @FXML
    private Button okBtn;

    @FXML
    private TextField toField;

    @FXML
    void showNums(ActionEvent event) {
        try{
            int fromNum = Integer.parseInt(fromField.getText());
            int toNum = Integer.parseInt(toField.getText());
            if (toNum<fromNum) throw new Exception();
            if (fromNum<10) fromNum=10;
            if (toNum>99) toNum=99;
            String result = "";
            for (int i = fromNum; i <= toNum; ++i) {
                result += i + " ";
            }
            if (result=="") result="Нет указанных чисел из заданного диапазона";
            nums.setText(result);
        }
        catch(Exception e){
            System.out.println("Неверный ввод данных!");
        }
    }

}