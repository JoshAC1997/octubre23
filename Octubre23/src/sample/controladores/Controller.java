package sample.controladores;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.modelos.Persona;

public class Controller {

    public TextField txfApellido;
    public TextField txfNombre;
    public TextField txfEdad;
    public TextField txfBuscar;



    private Persona buscarPorNombre(ActionEvent actionEvent){
    return Persona.buscarporNombre(txfBuscar.getText());
    }



    public void realizarComparacion(ActionEvent actionEvent) {

        try {
            Persona Busqueda = this.buscarPorNombre(actionEvent);
            txfNombre.setText(Busqueda.nombre);
            txfApellido.setText(Busqueda.apellido);
            txfEdad.setText(String.valueOf(Busqueda.edad));

        } catch (NullPointerException e) {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText("no se encontraron los datos");

            alert.showAndWait();

        }

    }




}