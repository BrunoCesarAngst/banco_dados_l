/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagramas.eap;

import controlador.Editor;
import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author ccandido
 */
public class EapFormManual extends javax.swing.JDialog {

    public EapCLI eapCLI = null;

    /**
     * Creates new form EapFormManual
     */
    public EapFormManual(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public EapFormManual(Dialog dialog) {
        super(dialog);
        initComponents();
    }

    public EapFormManual(Dialog dialog, boolean bln) {
        super(dialog, bln);
        initComponents();
    }
    protected void btnCancelarAction(java.awt.event.ActionEvent evt) {                                            
        setResultado(JOptionPane.CANCEL_OPTION);
        setVisible(false);
    }                                           

    protected void btnOKAction(java.awt.event.ActionEvent evt) {                                         
        setResultado(JOptionPane.OK_OPTION);
        setVisible(false);
    }                                        

    private int resultado = JOptionPane.CANCEL_OPTION;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbVertical = new javax.swing.JRadioButton();
        rbHCentro = new javax.swing.JRadioButton();
        rbHEsquerda = new javax.swing.JRadioButton();
        rbHDireita = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProcessos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtPrincipal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("principal/Formularios_pt_BR"); // NOI18N
        jLabel2.setText(bundle.getString("EapFormManual.jLabel2.text")); // NOI18N

        buttonGroup1.add(rbVertical);
        rbVertical.setText(bundle.getString("EapFormManual.rbVertical.text")); // NOI18N

        buttonGroup1.add(rbHCentro);
        rbHCentro.setSelected(true);
        rbHCentro.setText(bundle.getString("EapFormManual.rbHCentro.text")); // NOI18N

        buttonGroup1.add(rbHEsquerda);
        rbHEsquerda.setText(bundle.getString("EapFormManual.rbHEsquerda.text")); // NOI18N

        buttonGroup1.add(rbHDireita);
        rbHDireita.setText(bundle.getString("EapFormManual.rbHDireita.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbVertical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHCentro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHEsquerda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHDireita)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbVertical)
                    .addComponent(rbHCentro)
                    .addComponent(rbHEsquerda)
                    .addComponent(rbHDireita))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText(bundle.getString("EapFormManual.jLabel3.text")); // NOI18N

        txtProcessos.setColumns(20);
        txtProcessos.setRows(5);
        txtProcessos.setPreferredSize(new java.awt.Dimension(164, 194));
        jScrollPane1.setViewportView(txtProcessos);

        jLabel1.setText(bundle.getString("EapFormManual.jLabel1.text")); // NOI18N

        jLabel4.setText(bundle.getString("EapFormManual.jLabel4.text")); // NOI18N

        txtX.setText(bundle.getString("EapFormManual.txtX.text")); // NOI18N
        txtX.setToolTipText(bundle.getString("EapFormManual.txtX.toolTipText")); // NOI18N

        jLabel5.setText(bundle.getString("EapFormManual.jLabel5.text")); // NOI18N

        txtY.setText(bundle.getString("EapFormManual.txtY.text")); // NOI18N
        txtY.setToolTipText(bundle.getString("EapFormManual.txtY.toolTipText")); // NOI18N
        txtY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnOK.setText(bundle.getString("EapFormManual.btnOK.text")); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancelar.setText(bundle.getString("EapFormManual.btnCancelar.text")); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOK)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancelar))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnCancelarAction(evt);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        btnOKAction(evt);
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYActionPerformed
    }//GEN-LAST:event_txtYActionPerformed

    public String getValor() {
        String tmp = util.Utilidades.TryIntStr(txtX.getText(), "200");
        eapCLI.SetDirectVar(eapCLI.varScrPosX, tmp);
        tmp = util.Utilidades.TryIntStr(txtY.getText(), "200");
        eapCLI.SetDirectVar(eapCLI.varScrPosY, tmp);
        String nv = eapCLI.getPrincipalCMD(eapCLI.cmdNOVO) + " " + eapCLI.getPrincipalCMD(eapCLI.cmdEAP);
        if (rbVertical.isSelected()) {
            nv += " " + eapCLI.getPrincipalCMD(eapCLI.cmdVERTICAL);
        } else {
            nv += " " + eapCLI.getPrincipalCMD(eapCLI.cmdHORIZONTAL);
            if (rbHCentro.isSelected()) {
                nv += " " + eapCLI.getPrincipalCMD(eapCLI.cmdCENTRO);
            } else if (rbHDireita.isSelected()) {
                nv += " " + eapCLI.getPrincipalCMD(eapCLI.cmdDIREITA);
            } else if (rbHEsquerda.isSelected()) {
                nv += " " + eapCLI.getPrincipalCMD(eapCLI.cmdESQUERDA);
            }
        }
        nv += " {\n" + 
                txtPrincipal.getText() + "\n" +
                txtProcessos.getText() +
                "\n}";
        return nv;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JRadioButton rbHCentro;
    private javax.swing.JRadioButton rbHDireita;
    private javax.swing.JRadioButton rbHEsquerda;
    private javax.swing.JRadioButton rbVertical;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextArea txtProcessos;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

    public void SetEapCLI(EapCLI tmp) {
        eapCLI = tmp;
        txtX.setText(tmp.Ambiente.get(tmp.varScrPosX));
        txtY.setText(tmp.Ambiente.get(tmp.varScrPosY));
    }
}
