/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author Pedro
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarPedido = new javax.swing.JRadioButton();
        entregarPedido = new javax.swing.JRadioButton();
        cobrarPedido = new javax.swing.JRadioButton();
        reabastecerStock = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(30, 114, 141));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        setMaximumSize(new java.awt.Dimension(270, 490));
        setMinimumSize(new java.awt.Dimension(270, 490));

        agregarPedido.setBackground(new java.awt.Color(30, 114, 141));
        agregarPedido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        agregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        agregarPedido.setText("Agregar Pedido");

        entregarPedido.setBackground(new java.awt.Color(30, 114, 141));
        entregarPedido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        entregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        entregarPedido.setText("Entregar Pedido");

        cobrarPedido.setBackground(new java.awt.Color(30, 114, 141));
        cobrarPedido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cobrarPedido.setForeground(new java.awt.Color(255, 255, 255));
        cobrarPedido.setText("Cobrar Pedido");

        reabastecerStock.setBackground(new java.awt.Color(30, 114, 141));
        reabastecerStock.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reabastecerStock.setForeground(new java.awt.Color(255, 255, 255));
        reabastecerStock.setText("Reabastecer Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reabastecerStock)
                    .addComponent(cobrarPedido)
                    .addComponent(agregarPedido)
                    .addComponent(entregarPedido))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(agregarPedido)
                .addGap(41, 41, 41)
                .addComponent(entregarPedido)
                .addGap(46, 46, 46)
                .addComponent(cobrarPedido)
                .addGap(33, 33, 33)
                .addComponent(reabastecerStock)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agregarPedido;
    private javax.swing.JRadioButton cobrarPedido;
    private javax.swing.JRadioButton entregarPedido;
    private javax.swing.JRadioButton reabastecerStock;
    // End of variables declaration//GEN-END:variables
}
