/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woochatapp.login;

import java.io.FileWriter;
import woochatapp.GUI.InterfataUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import woochatapp.register.Register;


/**
 *
 * @author anton
 */
public class Login extends javax.swing.JFrame {
 
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private String loggedName; 
    private String loggedSurname;

    public String getLoggedName() {
        return loggedName;
    }

    public String getLoggedSurname(){
        return loggedSurname;
    }

    
    /**
     * Creates new form Login
     */
    public Login() {
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

        Login = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        emailLoginLabel = new javax.swing.JLabel();
        passwordLoginLabel = new javax.swing.JLabel();
        passwordInputField = new javax.swing.JPasswordField();
        emailInputField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        registerButtonLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(300, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));

        Login.setBackground(new java.awt.Color(51, 51, 51));

        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("Login to WooChatApp");

        emailLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLoginLabel.setText("Email");

        passwordLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLoginLabel.setText("Parola");

        passwordInputField.setBackground(new java.awt.Color(51, 51, 51));
        passwordInputField.setForeground(new java.awt.Color(255, 255, 255));
        passwordInputField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwordInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputFieldActionPerformed(evt);
            }
        });

        emailInputField.setBackground(new java.awt.Color(51, 51, 51));
        emailInputField.setForeground(new java.awt.Color(255, 255, 255));
        emailInputField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        loginButton.setBackground(new java.awt.Color(0, 102, 153));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 102, 153));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Inregistrare");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registerButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerButtonLabel.setText("Nu ai cont?");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addComponent(registerButtonLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerButton)
                        .addGap(28, 28, 28))))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordLoginLabel)
                            .addComponent(emailInputField)
                            .addComponent(emailLoginLabel)
                            .addComponent(passwordInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(loginLabel)
                .addGap(45, 45, 45)
                .addComponent(emailLoginLabel)
                .addGap(18, 18, 18)
                .addComponent(emailInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(registerButtonLabel))
                .addGap(42, 42, 42))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/woochatapp/login/WooChatAppLogo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        Register register = new Register();
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String query = "SELECT * FROM dxm4AFuYMf.users WHERE email=? AND parola=?";
        boolean ok = true;

        try{

            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/dxm4AFuYMf?useSSL=false","dxm4AFuYMf","sdsKcU3uUv");
            pst = con.prepareStatement(query);
            pst.setString(1,emailInputField.getText());
            pst.setString(2,passwordInputField.getText().toString());
            System.out.println(emailInputField.getText()+" "+passwordInputField.getText().toString());
            rs = pst.executeQuery();
            if(rs.next())
            {
                ok = true;
                JOptionPane.showMessageDialog(null, "Logarea a fost facuta cu succes!");
                loggedName = rs.getString("nume");
                loggedSurname = rs.getString("prenume");
                String loggedEmail = rs.getString("email");
                String loggedPass = rs.getString("parola");
                System.out.println(loggedEmail+" "+loggedPass);
                FileWriter loggedInfo = new FileWriter("C:\\Users\\Cata\\Desktop\\LoggedInfo.txt",false);//change the path
                loggedInfo.write(loggedName+" "+loggedSurname+"\n"+loggedEmail);
                loggedInfo.close();
                InterfataUser interfata = new InterfataUser();
                interfata.setVisible(true);
                this.setVisible(false);
                interfata.setTitle("WooChatApp");

            }
            else
            {
                ok = false;
                JOptionPane.showMessageDialog(null, "Parametrii incorecti...");
            }
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, e1);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JTextField emailInputField;
    private javax.swing.JLabel emailLoginLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordInputField;
    private javax.swing.JLabel passwordLoginLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerButtonLabel;
    // End of variables declaration//GEN-END:variables
}