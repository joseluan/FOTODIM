/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.sistemaOffGrid;

import GUI.utils.Mensagem;
import java.awt.HeadlessException;

/**
 *
 * @author Marlon
 */
public class Bateria extends javax.swing.JFrame {

    /**
     * Creates new form Bateria
     */
    double energiaTotal;
    double potenciaTotal;

    public Bateria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Bateria(Double energia, Double potencia) {
        initComponents();
        this.setLocationRelativeTo(null);
        energiaTotal = energia;
        potenciaTotal = potencia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tensaoBateria = new javax.swing.JSpinner();
        capacidade = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        descarga = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        autonomia = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radiacao = new javax.swing.JFormattedTextField();
        tensaoBanco = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setTitle("FOTODIM");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("FOTODIM");

        jLabel1.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(195, 15, 11));
        jLabel1.setText("SISTEMA OFF GRID - BATERIA");

        jLabel5.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 130, 65));
        jLabel5.setText("Tensão da bateria (V)");

        tensaoBateria.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        capacidade.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 130, 65));
        jLabel6.setText("Capacidade (Ah)");

        descarga.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 130, 65));
        jLabel7.setText("descarga máxima (%)");

        autonomia.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 130, 65));
        jLabel8.setText("Autonomia do sistema em dias");

        jLabel9.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 130, 65));
        jLabel9.setText("Radiação solar (kWh/m2/dia)");

        radiacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        radiacao.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        tensaoBanco.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 130, 65));
        jLabel10.setText("Tensão da banco (V)");

        add2.setBackground(new java.awt.Color(1, 127, 66));
        add2.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        add2.setForeground(new java.awt.Color(254, 254, 254));
        add2.setText("Calcular");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        add3.setBackground(new java.awt.Color(1, 127, 66));
        add3.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        add3.setForeground(new java.awt.Color(254, 254, 254));
        add3.setText("Próximo");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/utils/imagens/logo_BRANCO_FOTODIM.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tensaoBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tensaoBanco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(capacidade, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tensaoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tensaoBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        try {
            Double eqpTensaoBanco = Double.parseDouble(tensaoBanco.getValue().toString());
            Double eqpTensaoBateria = Double.parseDouble(tensaoBateria.getValue().toString());
            Double eqpCapacidade = Double.parseDouble(capacidade.getValue().toString());
            Double dias = Double.parseDouble(autonomia.getValue().toString());
            Double descargaMaxima = Double.parseDouble(descarga.getValue().toString());

            if (eqpTensaoBanco > 0 && eqpTensaoBateria > 0
                    && eqpCapacidade > 0 && dias > 0 && descargaMaxima > 0) {

                Double energiaArmazenada = (dias * energiaTotal) / (descargaMaxima / 100);
                long bSerie = Math.round(eqpTensaoBanco / eqpTensaoBateria);
                Double capacidadeBanco = energiaArmazenada / eqpTensaoBanco;
                long bParalelo = Math.round(capacidadeBanco / eqpCapacidade);

                Mensagem m = new Mensagem("O banco de baterias será composto"
                        + " por " + bParalelo + " conjuntos de baterias em paralelo,"
                        + " com " + bSerie + " baterias em série em cada conjunto. "
                        + "\nO banco terá então um total de " + bParalelo * bSerie
                        + " baterias. \n"
                        + "Baterias de " + eqpTensaoBateria + " V\n"
                        + "Capacidade de " + capacidadeBanco + "Ah", "RESULTADO");
                m.setVisible(true);
            } else {
                Mensagem m = new Mensagem("Algum valor informado está negativo!", "Dados do circuito");
                m.setVisible(true);
            }
        } catch (HeadlessException | NumberFormatException e) {
            Mensagem m = new Mensagem("Houve um erro, tente novamente!", "Dados do circuito");
            m.setVisible(true);
        }
    }//GEN-LAST:event_add2ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        try {
            Double eqpTensaoBanco = Double.parseDouble(tensaoBanco.getValue().toString());
            if (eqpTensaoBanco > 0) {
                Double radiacaoLocal = Double.parseDouble(radiacao.getValue().toString());
                Modulo m = new Modulo(energiaTotal, potenciaTotal, radiacaoLocal, eqpTensaoBanco);
                m.setVisible(true);
                this.setVisible(false);
            } else {
                Mensagem m = new Mensagem("Há campos vazios no formulário!", "Dados do circuito");
                m.setVisible(true);
            }
        } catch (NumberFormatException e) {
            Mensagem m = new Mensagem("Houve um erro, tente novamente!", "Dados do circuito");
            m.setVisible(true);
        }
    }//GEN-LAST:event_add3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bateria().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JSpinner autonomia;
    private javax.swing.JSpinner capacidade;
    private javax.swing.JSpinner descarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField radiacao;
    private javax.swing.JSpinner tensaoBanco;
    private javax.swing.JSpinner tensaoBateria;
    // End of variables declaration//GEN-END:variables
}
