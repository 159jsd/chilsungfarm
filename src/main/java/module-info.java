module com.chilsung.farm.chilsungfarm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chilsung.farm.chilsungfarm to javafx.fxml;
    exports com.chilsung.farm.chilsungfarm;
}