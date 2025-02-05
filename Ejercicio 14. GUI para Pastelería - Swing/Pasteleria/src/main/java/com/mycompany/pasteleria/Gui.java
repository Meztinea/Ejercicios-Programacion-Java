package com.mycompany.pasteleria;

// @author mezti

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Gui extends JFrame{
    public Gui(){
        setSize(700,500);
        setTitle("La receta de la abuela");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    
    private void iniciarComponentes(){
        // Panel de Productos 
        JPanel panelProductos = new JPanel();
        panelProductos.setBackground(Color.GREEN);
        panelProductos.setSize(700,500);
        panelProductos.setVisible(false);
        panelProductos.setLayout(null);
        getContentPane().add(panelProductos);
        // Pasteles 
        JLabel pasteles = new JLabel("Pasteles");
        panelProductos.add(pasteles);
        JComboBox<String> comboPasteles = new JComboBox<>();
        panelProductos.add(comboPasteles);
        comboPasteles.addItem("Pastel de Chocolate. Descripción: Relleno de fresa. Precio: 259.85");
        comboPasteles.addItem("Pastel de Vainilla. Descripción: Relleno de Durazno. Precio 320.15");
        comboPasteles.addItem("Pastel de Durazno. Descripción: Relleno de piña. Precio 299.75");
        comboPasteles.addItem("Pastel de Fresa. Descripcion: Tres leches relleno. Precio 389.42");
        comboPasteles.addItem("Pastel de Guayaba. Descripción: Sin semillas. Precio 466.25");
        pasteles.setBounds(50, 50, 100, 30);
        comboPasteles.setBounds(180, 50, 450, 30);
        
        // Tartas 
        JLabel tartas = new JLabel("Tartas");
        panelProductos.add(tartas);
        JComboBox<String> comboTartas = new JComboBox<>();
        panelProductos.add(comboTartas);
        comboTartas.addItem("Tarta de tres chocolates. Descripción: Choc. Blanco, amargo y negro. Precio 210.47");
        comboTartas.addItem("Tarta de manzana. Descripción: Manzana y piña. Precio 189.23");
        comboTartas.addItem("Tarta de Zanahoria. Descripción: Zanahora Carrot. Precio 148.75");
        comboTartas.addItem("Tarta Sacher. Descripción:  Bizcocho con mermelada. Precio 220.14");
        comboTartas.addItem("Tarta de Fresa. Descripción: Mucha fresa. Precio 214.85");
        tartas.setBounds(50, 130, 100, 30);
        comboTartas.setBounds(180, 130, 450, 30);
        
        
        // Galletas
        JLabel galletas = new JLabel("Galletas");
        panelProductos.add(galletas);
        JComboBox<String> comboGalletas = new JComboBox<>();
        panelProductos.add(comboGalletas);
        comboGalletas.addItem("Galletas de fresa y crema. Descripcion: Bañadas en chocolate. Precio 15.75 c/u");
        comboGalletas.addItem("Galletas de chocolate y menta. Descripción: Con avena y miel. Precio 17.89 c/u");
        comboGalletas.addItem("Galletas de avena salada. Descripción: Crujientes y saladas. Precio 13.42 c/u");
        comboGalletas.addItem("Galletas de coco. Descripción: Coco tostado y dulce. Precio 15.46 c/u");
        comboGalletas.addItem("Galletas de jengibre picantes. Descripción. Muy picantes. Precio 14.66");
        galletas.setBounds(50, 210, 100, 30);
        comboGalletas.setBounds(180, 210, 450, 30);
        
        
        // Botón Salir Productos
        JButton botonSalirProductos = new JButton("Regresar");
        panelProductos.add(botonSalirProductos);
        botonSalirProductos.setBounds(180, 290, 100, 30);
        
        
        
        // Panel de Pedidos
        JPanel panelPedidos = new JPanel();
        panelPedidos.setBackground(Color.BLUE);
        panelPedidos.setSize(700,500);
        panelPedidos.setVisible(false);
        panelPedidos.setLayout(null);
        getContentPane().add(panelPedidos);

        
        // Etiquetas - TextField - Botones
        JLabel nombre = new JLabel("Nombre del cliente: ");
        JTextField nombretext = new JTextField();
        JLabel domicilio = new JLabel("Domicilio: ");
        JTextField domiciliotext = new JTextField();
        JLabel telefono = new JLabel("Teléfono: ");
        JTextField telefonotext = new JTextField();
        JLabel productos = new JLabel("Productos solicitados:  ");
        JTextField productostext = new JTextField();
        JLabel fecha = new JLabel("Fecha de entrega: ");
        JTextField fechatext = new JTextField();
        JButton guardarPedido = new JButton("Guardar Pedido");
        JButton botonSalirPedidos = new JButton("Regresar");
        
        // Ordenando Etiquetas - Textfield - Botones
        nombre.setBounds(50, 50, 200, 30);
        nombretext.setBounds(280, 50, 200, 30);
        domicilio.setBounds(50, 100, 200, 30);
        domiciliotext.setBounds(280, 100, 200, 30);
        telefono.setBounds(50, 150, 200, 30);
        telefonotext.setBounds(280, 150, 200, 30);
        productos.setBounds(50, 200, 200, 30);
        productostext.setBounds(280, 200, 200, 30);
        fecha.setBounds(50, 250, 200, 30);
        fechatext.setBounds(280, 250, 200, 30);
        guardarPedido.setBounds(50, 300, 200, 30);
        botonSalirPedidos.setBounds(280, 300, 200, 30);
        
        // Mostrando las etiquetas - textfield - botones
        panelPedidos.add(nombre);
        panelPedidos.add(nombretext);
        panelPedidos.add(domicilio);
        panelPedidos.add(domiciliotext);
        panelPedidos.add(telefono);
        panelPedidos.add(telefonotext);
        panelPedidos.add(productos);
        panelPedidos.add(productostext);
        panelPedidos.add(fecha);
        panelPedidos.add(fechatext);
        panelPedidos.add(guardarPedido);
        panelPedidos.add(botonSalirPedidos);
        
        
        
        
        // Panel de Pagos
        JPanel panelPagos = new JPanel();
        panelPagos.setBackground(Color.PINK);
        panelPagos.setSize(700,500);
        panelPagos.setVisible(false);
        panelPagos.setLayout(null);
        getContentPane().add(panelPagos, BorderLayout.CENTER);
        
        // Tabla
        Object[][] datos = {
            {"Producto 1", "Descripción 1", 10},
            {"Producto 2", "Descripción 2", 20},
            {"Producto 3", "Descripción 3", 30},
            {"", "Total", 60},
        };
        
        
        
        String[] columnas = {"Producto", "Descripción", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        panelPagos.add(scrollPane);
        scrollPane.setBounds(50, 50, 400, 200);

        
        // Radio Button
        JRadioButton opcion1 = new JRadioButton("Efectivo");
        JRadioButton opcion2 = new JRadioButton("Tarjeta");
        JRadioButton opcion3 = new JRadioButton("Transferencia");
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(opcion1);
        grupo1.add(opcion2);
        grupo1.add(opcion3);
        panelPagos.add(opcion1);
        panelPagos.add(opcion2);
        panelPagos.add(opcion3);
        opcion1.setBounds(50, 300, 120, 30);
        opcion2.setBounds(180, 300, 120, 30);
        opcion3.setBounds(330, 300, 120, 30);
        
        JButton realizarPago = new JButton("Realizar Pago");
        panelPagos.add(realizarPago);
        realizarPago.setBounds(50, 360, 150, 30);
        
        // Botón Salir Pagos
        JButton botonSalirPagos = new JButton("Regresar");
        panelPagos.add(botonSalirPagos);
        botonSalirPagos.setBounds(230, 360, 150, 30);
        
        
        // Panel Principal
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        // Botones Pricipales
        // Botón Productos
        JButton botonProductos = new JButton("Productos");
        panel.add(botonProductos);
        // Botón Pedidos
        JButton botonPedidos = new JButton("Pedidos");
        panel.add(botonPedidos);
        // Botón Pagos
        JButton botonPagos = new JButton("Pagos");
        panel.add(botonPagos);
        // Boton Salir
        JButton botonSalir = new JButton("Salir");
        panel.add(botonSalir);
        
        
        // Eventos Botones Principales
        botonProductos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonProductos.setVisible(false);
                botonPedidos.setVisible(false);
                botonPagos.setVisible(false);
                botonSalir.setVisible(false);
                panelProductos.setVisible(true);
            }
        });
        botonPedidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonProductos.setVisible(false);
                botonPedidos.setVisible(false);
                botonPagos.setVisible(false);
                botonSalir.setVisible(false);
                panelPedidos.setVisible(true);
            }
        });
        botonPagos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonProductos.setVisible(false);
                botonPedidos.setVisible(false);
                botonPagos.setVisible(false);
                botonSalir.setVisible(false);
                panelPagos.setVisible(true);
            }
        });
        botonSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        botonSalirProductos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelProductos.setVisible(false);
                botonProductos.setVisible(true);
                botonPedidos.setVisible(true);
                botonPagos.setVisible(true);
                botonSalir.setVisible(true);
            }
        });
        botonSalirPedidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelPedidos.setVisible(false);
                botonProductos.setVisible(true);
                botonPedidos.setVisible(true);
                botonPagos.setVisible(true);
                botonSalir.setVisible(true);
            }
        });
        botonSalirPagos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelPagos.setVisible(false);
                botonProductos.setVisible(true);
                botonPedidos.setVisible(true);
                botonPagos.setVisible(true);
                botonSalir.setVisible(true);
            }
        });
        guardarPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombretext.getText();
                String domicilio = domiciliotext.getText();
                String telefono = telefonotext.getText();
                String productos = productostext.getText();
                String fecha = fechatext.getText();
                JOptionPane.showMessageDialog(panelPedidos, "Nombre: " + nombre + "\nDomicilio: " + domicilio +
                        "\nTeléfono: " + telefono + "\nProductos: " + productos + "\nFecha: " + fecha);
            }
        });
        realizarPago.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = (int)datos[3][2];
                JOptionPane.showMessageDialog(panelPedidos, "Pago realizado por: " + total);
            }
        });
        
        // Imágen
        ImageIcon pastel = new ImageIcon("C:\\Users\\mezti\\OneDrive\\Documentos\\NetBeansProjects\\Pasteleria\\src\\main\\java\\com\\mycompany\\pasteleria\\cake.png");
        JLabel imagen = new JLabel(pastel);
        panel.add(imagen);
    }
}
