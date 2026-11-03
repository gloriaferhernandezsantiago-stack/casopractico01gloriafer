package com.mycompany.casopractico01gloriafer;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextArea txtProductos;
    @FXML
    private TextField txtProducto;
    @FXML
    private TextField txtProductoSel;

    private Producto[] prods;

    @FXML
    private void btnAgregar_click() {
        try {
            int index = Integer.parseInt(txtProducto.getText().trim()) - 1;
            if (index >= 0 && index < prods.length) {
                Producto p = prods[index];
                txtProductoSel.setText("Pediste unos " + p.getNombre() + " de " + p.getPrecio() + " pesos");
            } else {
                txtProductoSel.setText("Producto no encontrado");
            }
        } catch (NumberFormatException e) {
            txtProductoSel.setText("Ingresa un número válido");
        }
    }

    public void initialize() {
        prods = new Producto[] {
            new Producto("Hamburguesa", 25),
            new Producto("Cheetos", 17),
            new Producto("Mazapán", 5),
            new Producto("Coca-Cola", 25)
        };

        int i = 1;
        for (Producto p : prods) {
            txtProductos.appendText(i + ", " + p.toString() + "\n");
            i++;
        }
    }
}