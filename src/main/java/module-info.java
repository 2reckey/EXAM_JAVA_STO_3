module com.example.exam_java_stp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exam_java_stp to javafx.fxml;
    exports com.example.exam_java_stp;
}