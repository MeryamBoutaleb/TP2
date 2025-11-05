module ca.qc.bdeb.sim.tp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.qc.bdeb.sim.tp2 to javafx.fxml;
    exports ca.qc.bdeb.sim.tp2;
}