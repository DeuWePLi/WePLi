/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WePLi;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Donghyeon <20183188>
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        setResizable(false); // 크기 변경 불가능하도록 함
        setUndecorated(true); // 프레임의 타이틀바를 없앰
        
        initComponents();

        setVisible(true);
        // 화면 중앙에서 실행
        setLocationRelativeTo(null);
        
//        IdTextField.setForeground(new Color(187,187,187, 255));
//        PwTextField.setForeground(new Color(187,187,187, 255));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        SignUpTextLabel = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        PwTextField = new javax.swing.JPasswordField();
        IdFieldLabel = new javax.swing.JLabel();
        PwFieldLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpTextLabel.setFont(new java.awt.Font("나눔스퀘어", 0, 13)); // NOI18N
        SignUpTextLabel.setForeground(new java.awt.Color(102, 102, 102));
        SignUpTextLabel.setText("회원가입");
        SignUpTextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpTextLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpTextLabelMouseExited(evt);
            }
        });
        BackgroundPanel.add(SignUpTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 50, 30));

        IdTextField.setBackground(new java.awt.Color(255,255,255,0));
        IdTextField.setForeground(new java.awt.Color(51, 51, 51));
        IdTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IdTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IdTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdTextFieldFocusLost(evt);
            }
        });
        BackgroundPanel.add(IdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 263, 240, 30));

        PwTextField.setBackground(new java.awt.Color(255,255,255,0)
        );
        PwTextField.setForeground(new java.awt.Color(51, 51, 51));
        PwTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PwTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PwTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PwTextFieldFocusLost(evt);
            }
        });
        BackgroundPanel.add(PwTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 325, 240, 30));

        IdFieldLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/button/normal/id_field.png"))); // NOI18N
        BackgroundPanel.add(IdFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 266, 20));

        PwFieldLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/button/normal/pw_field.png"))); // NOI18N
        BackgroundPanel.add(PwFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 266, 22));

        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/button/normal/login_btn.png"))); // NOI18N
        LoginLabel.setText("jLabel1");
        LoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginLabelMouseExited(evt);
            }
        });
        BackgroundPanel.add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 194, 41));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/background/Login.png"))); // NOI18N
        BackgroundPanel.add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Controller 이벤트 리스너(컨트롤러) 등록 메소드 */
    public void setLoginListner(MouseListener listener){
        this.LoginLabel.addMouseListener(listener);
    }
    
    /* 로그인 버튼 마우스 이벤트 */
    private void LoginLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseEntered
        // TODO add your handling code here:
        LoginLabel.setIcon(new ImageIcon("./src/resources/layout/button/hover/login_hover.png"));
        LoginLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LoginLabelMouseEntered

    private void LoginLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseExited
        // TODO add your handling code here:
        LoginLabel.setIcon(new ImageIcon("./src/resources/layout/button/normal/login_btn.png"));
        LoginLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_LoginLabelMouseExited

    /* 아이디 필드 포커스 이벤트 */
    private void IdTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdTextFieldFocusGained
        // TODO add your handling code here:
        IdFieldLabel.setIcon(new ImageIcon("./src/resources/layout/field/focus/id_field_focus.png"));
    }//GEN-LAST:event_IdTextFieldFocusGained

    private void IdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdTextFieldFocusLost
        // TODO add your handling code here:
        IdFieldLabel.setIcon(new ImageIcon("./src/resources/layout/field/normal/id_field.png"));
    }//GEN-LAST:event_IdTextFieldFocusLost
    
    /* 패스워드 필드 포커스 이벤트 */
    private void PwTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PwTextFieldFocusGained
        // TODO add your handling code here:
        PwFieldLabel.setIcon(new ImageIcon("./src/resources/layout/field/focus/pw_field_focus.png"));
    }//GEN-LAST:event_PwTextFieldFocusGained

    private void PwTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PwTextFieldFocusLost
        // TODO add your handling code here:
        PwFieldLabel.setIcon(new ImageIcon("./src/resources/layout/field/normal/pw_field.png"));
    }//GEN-LAST:event_PwTextFieldFocusLost

    private void SignUpTextLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTextLabelMouseEntered
        // TODO add your handling code here:
        SignUpTextLabel.setForeground(new Color(0, 142, 244, 255));
        SignUpTextLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_SignUpTextLabelMouseEntered

    private void SignUpTextLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTextLabelMouseExited
        // TODO add your handling code here:
        SignUpTextLabel.setForeground(new Color(102, 102, 102, 255));
        SignUpTextLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_SignUpTextLabelMouseExited

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    public JLabel getBackgroundLabel() {
        return BackgroundLabel;
    }

    public JPanel getBackgroundPanel() {
        return BackgroundPanel;
    }

    public JLabel getIdFieldLabel() {
        return IdFieldLabel;
    }

    public JTextField getIdTextField() {
        return IdTextField;
    }

    public JLabel getLoginLabel() {
        return LoginLabel;
    }

    public JLabel getPwFieldLabel() {
        return PwFieldLabel;
    }

    public JPasswordField getPwTextField() {
        return PwTextField;
    }

    public JLabel getSignUpTextLabel() {
        return SignUpTextLabel;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel IdFieldLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel PwFieldLabel;
    private javax.swing.JPasswordField PwTextField;
    private javax.swing.JLabel SignUpTextLabel;
    // End of variables declaration//GEN-END:variables
}
