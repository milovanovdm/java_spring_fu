module com.hoteljavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hoteljavafx to javafx.fxml;
    exports com.hoteljavafx;
}
