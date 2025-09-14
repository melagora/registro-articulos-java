package gr16078_parcial1_poo_;

import javax.swing.JOptionPane;

public class VistaIngresoArticulos extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaIngresoArticulos.class.getName());
    private int contador = 1;

    public VistaIngresoArticulos() {

        initComponents();

        jtxVista.setEditable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        txtId.setEditable(false);
        txtId.setText(String.valueOf(contador));
        bloquearCampos();
        //Integer.parseInt(txtId.set(contador));
        txtRefrigeracion.setEditable(false);
        txtNombre.requestFocusInWindow();

        btnGuardar.addActionListener(e -> {
            txtNombre.requestFocusInWindow();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jblRefrigeracion = new javax.swing.JLabel();
        lblTipoArticulo = new javax.swing.JLabel();
        jlbContenido = new javax.swing.JLabel();
        jlbPeso = new javax.swing.JLabel();
        jlbRango = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cbxTipoArticulo = new javax.swing.JComboBox<>();
        txtRefrigeracion = new javax.swing.JTextField();
        txtRango = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtContenido = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxVista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("INGRESO DE ARTICULOS");

        lblId.setText("id:");

        lblNombre.setText("Nombre:");

        lblPrecio.setText("Precio:");

        lblFecha.setText("Fecha de vencimiento:");

        jblRefrigeracion.setText("Refrigeración:");

        lblTipoArticulo.setText("Tipo de articulo:");

        jlbContenido.setText("Contenido en Gramos:");

        jlbPeso.setText("Peso en kilogramos:");

        jlbRango.setText("Rango de refrigeración:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        cbxTipoArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Enlatado", "Refrigerado", "Empacado" }));
        cbxTipoArticulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoArticuloItemStateChanged(evt);
            }
        });

        txtRango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRangoKeyTyped(evt);
            }
        });

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        txtContenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContenidoKeyTyped(evt);
            }
        });

        btnGuardar.setText("GUARDAR ARTICULO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jtxVista.setColumns(20);
        jtxVista.setRows(5);
        jScrollPane1.setViewportView(jtxVista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblPrecio)
                            .addComponent(lblFecha)
                            .addComponent(lblTipoArticulo)
                            .addComponent(jblRefrigeracion)
                            .addComponent(jlbRango)
                            .addComponent(jlbPeso)
                            .addComponent(jlbContenido))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addComponent(txtPeso)
                                .addComponent(txtContenido)
                                .addComponent(txtRango)
                                .addComponent(txtFecha)
                                .addComponent(txtPrecio))
                            .addComponent(txtRefrigeracion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecha)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoArticulo)
                            .addComponent(cbxTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblRefrigeracion)
                            .addComponent(txtRefrigeracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbRango)
                            .addComponent(txtRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbPeso)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbContenido)
                            .addComponent(txtContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String seleccionado = cbxTipoArticulo.getSelectedItem().toString();

            if (seleccionado.equals("Seleccione una opción")) {
                throw new ValidacionException("Debe seleccionar un tipo de artículo.");
            }

            if (txtNombre.getText().trim().isEmpty()) {
                throw new ValidacionException("El nombre no puede estar vacío.");
            }

            if (txtPrecio.getText().trim().isEmpty()) {
                throw new ValidacionException("El precio es obligatorio.");
            }

            double precio;
            try {
                precio = Double.parseDouble(txtPrecio.getText());
            } catch (NumberFormatException e) {
                throw new ValidacionException("El precio debe ser un número válido.");
            }

            // Validar fecha completa y correcta
            String fecha = txtFecha.getText().trim();
            if (fecha.length() != 10) {
                throw new ValidacionException("La fecha debe estar completa (dd/MM/yyyy).");
            }

            // Validar formato y valores reales
            String[] partes = fecha.split("/");
            if (partes.length != 3) {
                throw new ValidacionException("Formato de fecha inválido.");
            }

            int dia, mes, anio;
            try {
                dia = Integer.parseInt(partes[0]);
                mes = Integer.parseInt(partes[1]);
                anio = Integer.parseInt(partes[2]);
            } catch (NumberFormatException e) {
                throw new ValidacionException("La fecha contiene valores no numéricos.");
            }

            // Validación básica de rango de mes
            if (mes < 1 || mes > 12) {
                throw new ValidacionException("El mes es inválido.");
            }

            // Validación básica de rango de día según mes (considerando años bisiestos)
            int maxDia;
            switch (mes) {
                case 2:
                    maxDia = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDia = 30;
                    break;
                default:
                    maxDia = 31;
            }
            if (dia < 1 || dia > maxDia) {
                throw new ValidacionException("El día es inválido para el mes indicado.");
            }

            // ================== ENLATADO ==================
            if (seleccionado.equals("Enlatado")) {
                if (txtContenido.getText().trim().isEmpty()) {
                    throw new ValidacionException("El contenido en gramos es obligatorio.");
                }

                Enlatados enlatados = new Enlatados();
                enlatados.setId(contador);
                enlatados.setNombre(txtNombre.getText());
                enlatados.setPrecio(precio);
                enlatados.setFechaVencimiento(txtFecha.getText());
                enlatados.setRefrigeracion(txtRefrigeracion.getText());
                enlatados.setContenidoEnGramos(Integer.parseInt(txtContenido.getText()));

                jtxVista.append(
                        "=== Enlatado ===\n"
                        + "id: " + enlatados.getId()
                        + "\nNombre: " + enlatados.getNombre()
                        + "\nPrecio: $" + enlatados.getPrecio()
                        + "\nRefrigeración: " + enlatados.getRefrigeracion()
                        + "\nFecha: " + enlatados.getFechaVencimiento()
                        + "\nContenido en gramos: " + enlatados.getContenidoEnGramos()
                        + "\n\n"
                );
            } // ================== EMPACADO ==================
            else if (seleccionado.equals("Empacado")) {
                if (txtPeso.getText().trim().isEmpty()) {
                    throw new ValidacionException("El peso en kilogramos es obligatorio.");
                }

                Empacados empacados = new Empacados();
                empacados.setId(contador);
                empacados.setNombre(txtNombre.getText());
                empacados.setPrecio(precio);
                empacados.setFechaVencimiento(txtFecha.getText());
                empacados.setRefrigeracion(txtRefrigeracion.getText());
                empacados.setPesoEnKilogramos(Double.parseDouble(txtPeso.getText()));

                jtxVista.append(
                        "=== Empacado ===\n"
                        + "id: " + empacados.getId()
                        + "\nNombre: " + empacados.getNombre()
                        + "\nPrecio: $" + empacados.getPrecio()
                        + "\nRefrigeración: " + empacados.getRefrigeracion()
                        + "\nFecha: " + empacados.getFechaVencimiento()
                        + "\nPeso (kg): " + empacados.getPesoEnKilogramos()
                        + "\n\n"
                );
            } // ================== REFRIGERADO ==================
            else if (seleccionado.equals("Refrigerado")) {
                if (txtRango.getText().trim().isEmpty()) {
                    throw new ValidacionException("El rango de refrigeración es obligatorio.");
                }

                Refrigerados refrigerados = new Refrigerados();
                refrigerados.setId(contador);
                refrigerados.setNombre(txtNombre.getText());
                refrigerados.setPrecio(precio);
                refrigerados.setFechaVencimiento(txtFecha.getText());
                refrigerados.setRefrigeracion(txtRefrigeracion.getText());
                refrigerados.setRangoValido(Integer.parseInt(txtRango.getText()));

                jtxVista.append(
                        "=== Refrigerado ===\n"
                        + "id: " + refrigerados.getId()
                        + "\nNombre: " + refrigerados.getNombre()
                        + "\nPrecio: $" + refrigerados.getPrecio()
                        + "\nRefrigeración: " + refrigerados.getRefrigeracion()
                        + "\nFecha: " + refrigerados.getFechaVencimiento()
                        + "\nRango válido: " + refrigerados.getRangoValido()
                        + "\n\n"
                );
            }

            // Si llega aquí, todo fue correcto
            contador++;
            txtId.setText(String.valueOf(contador));
            JOptionPane.showMessageDialog(null, "✔ Producto agregado con éxito ✔");
            limpiar();

        } catch (ValidacionException ex) {
            // Error de validación personalizado
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage() + "\n\n");
        } catch (Exception e) {
            // Error general inesperado
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage() + "\n\n");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();

        // Permitir letras, números, espacios y guiones bajos
        if (!Character.isLetterOrDigit(c) && c != ' ' && c != '_' && c != '\b') {
            evt.consume(); // Ignora el caracter no permitido
        }

        // Limitar longitud a 50 caracteres
        if (txtNombre.getText().length() >= 25) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        String texto = txtPrecio.getText();

        // Permitir dígitos, backspace y un solo punto decimal
        if (!Character.isDigit(c) && c != '\b' && c != '.') {
            evt.consume();
            return;
        }

        // Evitar más de un punto
        if (c == '.' && texto.contains(".")) {
            evt.consume();
            return;
        }

        // Limitar longitud total
        if (texto.length() >= 10) {  // por ejemplo máximo 10 caracteres
            evt.consume();
            return;
        }

        // Limitar decimales a 2 dígitos después del punto
        if (texto.contains(".")) {
            int index = texto.indexOf(".");
            String decimales = texto.substring(index + 1);
            if (decimales.length() >= 2 && texto.length() > index) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrecioKeyTyped


    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        char c = evt.getKeyChar();
        String texto = txtFecha.getText();

        // Solo permitir dígitos y backspace
        if (!Character.isDigit(c) && c != '\b') {
            evt.consume();
            return;
        }

        // Evitar que pase de 10 caracteres
        if (texto.length() >= 10) {
            evt.consume();
            return;
        }

        // Insertar automáticamente plecas al digitar
        if (Character.isDigit(c)) {
            if (texto.length() == 2 || texto.length() == 5) {
                txtFecha.setText(texto + "/");
            }
        }
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtRangoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRangoKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir dígitos y backspace
        if (!Character.isDigit(c) && c != '\b') {
            evt.consume();
            return;
        }

        // Limitar el valor a 0-10
        String texto = txtRango.getText() + c; // Considera el carácter que se está escribiendo
        try {
            int valor = Integer.parseInt(texto);
            if (valor < 0 || valor > 10) {
                evt.consume(); // Ignora si está fuera del rango
            }
        } catch (NumberFormatException e) {
            // Ignorar si aún no se puede parsear (por ejemplo, campo vacío)
        }
    }//GEN-LAST:event_txtRangoKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char c = evt.getKeyChar();
        String texto = txtPeso.getText();

        // Permitir dígitos, backspace y un solo punto decimal
        if (!Character.isDigit(c) && c != '\b' && c != '.') {
            evt.consume(); // ignora cualquier otro caracter
            return;
        }

        // Evitar más de un punto decimal
        if (c == '.' && texto.contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtContenidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContenidoKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir dígitos y borrar (backspace)
        if (!Character.isDigit(c) && c != '\b') {
            evt.consume();
            return;
        }

        // Limitar longitud a 6 dígitos
        if (txtContenido.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContenidoKeyTyped

    private void cbxTipoArticuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoArticuloItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String seleccionado = cbxTipoArticulo.getSelectedItem().toString();

            bloquearCampos(); // Reiniciar todo

            switch (seleccionado) {
                case "Enlatado":
                    txtRefrigeracion.setText("NO");
                    txtContenido.setEditable(true);
                    break;

                case "Empacado":
                    txtRefrigeracion.setText("NO");
                    txtPeso.setEditable(true);
                    break;

                case "Refrigerado":
                    txtRefrigeracion.setText("SI");
                    txtRango.setEditable(true);
                    break;

                default: // "Seleccione una opción"
                    bloquearCampos();
                    break;
            }
        }
    }//GEN-LAST:event_cbxTipoArticuloItemStateChanged

    // Método para LIMPIAR los campos despues de guardar
    public void limpiar() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtFecha.setText("");
        cbxTipoArticulo.setSelectedIndex(0);
        bloquearCampos();
    }

    // Método para bloquear los campos por defecto al No seleccionar algun tipo
    // de producto
    private void bloquearCampos() {
        txtRefrigeracion.setEditable(false);
        txtRango.setEditable(false);
        txtPeso.setEditable(false);
        txtContenido.setEditable(false);

        //limpiar valores
        txtRefrigeracion.setText("");
        txtRango.setText("");
        txtPeso.setText("");
        txtContenido.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VistaIngresoArticulos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipoArticulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblRefrigeracion;
    private javax.swing.JLabel jlbContenido;
    private javax.swing.JLabel jlbPeso;
    private javax.swing.JLabel jlbRango;
    private javax.swing.JTextArea jtxVista;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoArticulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtContenido;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRango;
    private javax.swing.JTextField txtRefrigeracion;
    // End of variables declaration//GEN-END:variables
}
