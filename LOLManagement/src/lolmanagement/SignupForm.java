package lolmanagement;

import DAO.UserDAO;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SignupForm extends javax.swing.JFrame {

    public SignupForm() {
        //background image
        setContentPane(new JLabel(new ImageIcon(new ImageIcon("src/resources/images/backgrounds/bg-signup.jpg").getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT))));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        initComponents();
        setLocationRelativeTo(null);

        addPlaceholderText(txtEmail, "Email");
        addPlaceholderText(txtPassword, "Password");
        addPlaceholderText(txtConfirmPassword, "Confirm Password");
        // xử lý hiện PlaceholderText, khi nhập pass sẽ mã hoá lại thành dấu *
        txtPassword.setEchoChar('\u0000');
        txtConfirmPassword.setEchoChar('\u0000');
        // cho Password
        txtPassword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            public void update() {
                if (txtPassword.getPassword().length != 0) {
                    txtPassword.setEchoChar('*');
                }
            }
        });
        // cho Confirm Password
        txtConfirmPassword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            public void update() {
                if (txtConfirmPassword.getPassword().length != 0) {
                    txtConfirmPassword.setEchoChar('*');
                }

            }
        });
    }

    public void messageDialog(String e, String type) {
        String s;
        int m;
        switch (type.toLowerCase()) {
            case "error":
                s = "Error";
                m = JOptionPane.ERROR_MESSAGE;
                break;
            case "warning":
                s = "Warning";
                m = JOptionPane.WARNING_MESSAGE;
                break;
            case "information":
                s = "Information";
                m = JOptionPane.INFORMATION_MESSAGE;
                break;
            default:
                s = "Error";
                m = JOptionPane.ERROR_MESSAGE;
        }

        JOptionPane.showMessageDialog(null, "<html>" + e + "</html>", s, m, new ImageIcon(getClass().getResource("/resources/images/icons/" + type.toLowerCase() + "-icon.png")));
    }

    private void addPlaceholderText(JTextField textField, String placeholderText) {
        // Save the default foreground color of the text field
        Color defaultColor = textField.getForeground();

        // Set the placeholder text
        textField.setText(placeholderText);

        // Add a focus listener to handle the placeholder text
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(defaultColor);

                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholderText);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSignupForm = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblForgotPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");

        pnlSignupForm.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(237, 237, 237));
        txtEmail.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(82, 82, 82));
        txtEmail.setText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 3, 5));

        lblTitle.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitle.setText("Sign up");

        btnSignup.setBackground(new java.awt.Color(11, 198, 227));
        btnSignup.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        btnSignup.setText("SIGN UP");
        btnSignup.setBorder(null);
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(237, 237, 237));
        txtPassword.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(82, 82, 82));
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 3, 5));

        lblForgotPassword.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblForgotPassword.setText("ALREADY HAVE AN ACCOUNT? SIGN IN");
        lblForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
        });

        txtConfirmPassword.setBackground(new java.awt.Color(237, 237, 237));
        txtConfirmPassword.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(82, 82, 82));
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 3, 5));

        javax.swing.GroupLayout pnlSignupFormLayout = new javax.swing.GroupLayout(pnlSignupForm);
        pnlSignupForm.setLayout(pnlSignupFormLayout);
        pnlSignupFormLayout.setHorizontalGroup(
            pnlSignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignupFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlSignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addGroup(pnlSignupFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblForgotPassword)
                            .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlSignupFormLayout.setVerticalGroup(
            pnlSignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignupFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblForgotPassword)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(pnlSignupForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(pnlSignupForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        //validate
        String email = txtEmail.getText();
        String password = new String(txtPassword.getPassword());
        String confirmpassword = new String(txtConfirmPassword.getPassword());
        char[] cpass = txtPassword.getPassword();
        char[] cconpass = txtConfirmPassword.getPassword();
        Set<String> setError = new HashSet<String>();

        //txtEmail
        if (email.isBlank() || email.equalsIgnoreCase("email")) {
            setError.add("Vui lòng nhập Email");
            txtEmail.requestFocus();
        } else if (!email.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$")) {
            setError.add("Email sai định dạng");
        }
        
        //txtPassword
        if (password.isBlank() || password.equalsIgnoreCase("password")) {
            setError.add("Vui lòng nhập Password");
            txtPassword.requestFocus();
        } else if (!password.matches("[a-zA-Z0-9]+")) {
            setError.add("Password chỉ được chứa các kí tự [a-zA-Z0-9]");
        }
        // txt confirm password
        if (confirmpassword.isBlank() || confirmpassword.equalsIgnoreCase("Confirm Password")) {
            setError.add("Vui lòng nhập Confirm Password");
            txtConfirmPassword.requestFocus();
        }
        if (confirmpassword.length() != password.length()) { // so sánh theo độ dài
            setError.add("Vui lòng nhập Confirm Password giống với Password đã nhập");
            txtConfirmPassword.requestFocus();
        }
        for (int i = 0; i < password.length(); i++) { // so sánh theo sự khác nhau của phần tử ở vị trí tương ứng
            if (cconpass[i] != cpass[i]) {
                setError.add("Vui lòng nhập Confirm Password giống với Password đã nhập");
                txtConfirmPassword.requestFocus();
            }
        }

        if (!setError.isEmpty()) {
            //neu co loi => hien thi loi
            String errors = "";
            for (String error : setError) {
                errors += error + "<br>";
            }
            messageDialog(errors, "error");
        } else {
            UserDAO userDAO = new UserDAO();
            
            if (userDAO.addAccountkSignup(email, password) == -1) {
                //dang nhap thanh cong
                messageDialog("Đăng ký thành công", "information");
            } else {
                //dang nhap that bai
                messageDialog("Có lỗi xảy ra", "error");
            }
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        dispose();
        new SigninForm().setVisible(true);
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlSignupForm;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
