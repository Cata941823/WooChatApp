/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woochatapp.GUI;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import woochatapp.login.Login;
import woochatapp.user.User;

/**
 *
 * @author anton
 */
public class InterfataUser extends javax.swing.JFrame{

    /**
     * Creates new form InterfataUser
     */
    public InterfataUser() throws SQLException{
    try{
        initComponents();
            jTextArea1.setVisible(false);
            addPhotoButton.setVisible(false);
            sendButton.setVisible(false);
            jTextField1.setVisible(false);
            jTextArea1.setEnabled(false);
            addPhotoButton.setEnabled(false);
            sendButton.setEnabled(false);
            jTextField1.setEnabled(false);
        BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\Cata\\Desktop\\LoggedInfo.txt")); //change the path
         {
            loggedName = buff.readLine();
            userLoggedName.setText(loggedName);
            
        }
    }
    catch(Exception e1){
            JOptionPane.showMessageDialog(null, e1);
        }
    }
    private String loggedName;
    private String emailinitiator;
    private String emailreceptor;
    private int idconv;
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userLoggedName = new javax.swing.JLabel();
        userTextLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchInputField = new javax.swing.JTextField();
        openConversation = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        addPhotoButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        button2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WooChatApp");
        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(1140, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1140, 500));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1122, 500));

        userLoggedName.setBackground(new java.awt.Color(102, 102, 102));
        userLoggedName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userLoggedName.setForeground(new java.awt.Color(255, 255, 255));
        userLoggedName.setText("Nume - prenume user");

        userTextLabel.setBackground(new java.awt.Color(102, 102, 102));
        userTextLabel.setForeground(new java.awt.Color(102, 102, 102));
        userTextLabel.setText(" List of users");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "E-mail user"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        searchButton.setText("Cauta");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchInputField.setText("Cauta utilizator...");

        openConversation.setText("Deschide conversatia");
        openConversation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openConversationActionPerformed(evt);
            }
        });

        jTextField1.setText("Trimite mesaj...");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        addPhotoButton.setText("Receive msg");
        addPhotoButton.setEnabled(false);
        addPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoButtonActionPerformed(evt);
            }
        });

        sendButton.setText("Send");
        sendButton.setEnabled(false);
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        button2.setText("jButton1");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLoggedName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userTextLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(openConversation, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userLoggedName)
                .addGap(18, 18, 18)
                .addComponent(userTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openConversation)
                    .addComponent(searchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(jTextField1)
                    .addComponent(addPhotoButton)
                    .addComponent(sendButton)
                    .addComponent(button2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:

        System.out.println(this.emailinitiator+" "+this.emailreceptor);

        try{
            Connection con=null;
            ResultSet rs;
            PreparedStatement pst;
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/dxm4AFuYMf?useSSL=false","dxm4AFuYMf","sdsKcU3uUv");
            String query = "SELECT * FROM dxm4AFuYMf.conversations WHERE (emailinitiator = ? AND emailreceptor = ?) OR (emailinitiator = ? AND emailreceptor = ?) ";
            pst = con.prepareStatement(query);
            pst.setString(1, this.emailinitiator);
            pst.setString(2, this.emailreceptor);
            pst.setString(3, this.emailreceptor);
            pst.setString(4, this.emailinitiator);
            rs = pst.executeQuery();
            if(rs.next())
            {
                this.idconv = rs.getInt("idconv");
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            Connection con;
            PreparedStatement pst;
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/dxm4AFuYMf?useSSL=false","dxm4AFuYMf","sdsKcU3uUv");
            String queryInsert = "INSERT INTO messages (scriitor, idconversatie, mesaj) VALUES(?, ?, ?)";
            PreparedStatement stmtInser = con.prepareStatement(queryInsert);
            System.out.println(this.emailinitiator+" "+this.emailreceptor);

            stmtInser.setString(1,this.emailinitiator);
            stmtInser.setInt(2, this.idconv);
            stmtInser.setString(3,jTextField1.getText().toString());
            stmtInser.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        jTextField1.setText(" ");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void addPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoButtonActionPerformed
        // TODO add your handling code here:
        try{
            jTextArea1.setText("");
            Connection con;
            ResultSet rs;
            PreparedStatement pst;
            String conversatie = null;
            String textAfisat = null;
            String user = null;
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/dxm4AFuYMf?useSSL=false","dxm4AFuYMf","sdsKcU3uUv");
            String query = "SELECT * FROM dxm4AFuYMf.messages WHERE idconversatie=?";
            pst = con.prepareStatement(query);
            pst.setInt(1,this.idconv);
            rs = pst.executeQuery();
            while(rs.next())
            {
                user = rs.getNString("scriitor");
                textAfisat= rs.getNString("mesaj");
                conversatie = user + ":" + textAfisat + "\n";
                jTextArea1.append(conversatie);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_addPhotoButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void openConversationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openConversationActionPerformed
        // TODO add your handling code here:
        boolean convIncep = false;
        int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();
        this.emailreceptor = (String)jTable1.getValueAt(row,column);
        File file = new File("C:\\Users\\Cata\\Desktop\\LoggedEmailInfo.txt");
        Scanner sc=null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfataUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.emailinitiator = sc.next();
        System.out.println(this.emailinitiator+" "+this.emailreceptor);
        ResultSet rs;
        PreparedStatement pst;
        try{
            Connection con=null;
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/dxm4AFuYMf?useSSL=false","dxm4AFuYMf","sdsKcU3uUv");
            String query = "SELECT * FROM dxm4AFuYMf.conversations "
            + "WHERE (emailinitiator LIKE '%"+this.emailinitiator+"%' "
            + "AND emailreceptor LIKE '%"+this.emailreceptor+"%' "
            + ") OR (emailinitiator LIKE '%"+this.emailreceptor+"%' "
            + "AND emailreceptor LIKE '%"+this.emailinitiator+"%')";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            if(rs.next())
            {
                if((rs.getNString("emailinitiator").equals(emailinitiator) & rs.getNString("emailreceptor").equals(emailreceptor)) | ((rs.getNString("emailinitiator").equals(emailreceptor) & rs.getNString("emailreceptor").equals(emailinitiator))))
                convIncep = true;
                else convIncep=false;
            }
            if(!convIncep)
            {
                System.out.println("Conversatia nu exista, deci se va creea...");
                if(!(jTable1.getSelectionModel().isSelectionEmpty()))
                {
                    jTextArea1.setVisible(true);
                    addPhotoButton.setVisible(true);
                    sendButton.setVisible(true);
                    jTextField1.setVisible(true);
                    jTextArea1.setEnabled(true);
                    addPhotoButton.setEnabled(true);
                    sendButton.setEnabled(true);
                    jTextField1.setEnabled(true);
                    String queryInsert = "INSERT INTO conversations (nume, emailinitiator, emailreceptor) VALUES(?, ?, ?)";
                    PreparedStatement stmtInser = con.prepareStatement(queryInsert);
                    stmtInser.setString(1, this.emailinitiator+", "+this.emailreceptor);
                    stmtInser.setString(2, this.emailinitiator);
                    stmtInser.setString(3, this.emailreceptor);
                    stmtInser.executeUpdate();
                }
            }
            if(convIncep)
            {
                System.out.println("Conversatia exista deja...");
                jTextArea1.setVisible(true);
                addPhotoButton.setVisible(true);
                sendButton.setVisible(true);
                jTextField1.setVisible(true);
                jTextArea1.setEnabled(true);
                addPhotoButton.setEnabled(true);
                sendButton.setEnabled(true);
                jTextField1.setEnabled(true);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_openConversationActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        gasesteUseri();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
              }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
         }
        try{
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
               PreparedStatement ps = con.prepareStatement("insert into myimages(ID,Name,Description,Image) values(?,?,?,?)");
               InputStream is = new FileInputStream(new File(s));
               ps.setString(1, textID.getText());
               ps.setString(2, textNAME.getText());
               ps.setString(3, area.getText());
               ps.setBlob(4,is);
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data Inserted");
           }catch(Exception ex){
               ex.printStackTrace();
           }
    }//GEN-LAST:event_button2ActionPerformed

    
    public ArrayList<User> afiseazaUseri(String cautare){
        ArrayList<User> users = new ArrayList<User>();
        ResultSet rs;
        Statement st;
        try{
            Connection con = getConnection();
            st = con.createStatement();
            String query = "SELECT * FROM dxm4AFuYMf.users WHERE CONCAT(`nume`, `prenume`, `email`) LIKE '%"+cautare+"%'";
            rs = st.executeQuery(query);
            User user=null;
            while (rs.next()){
                user = new User();
                users.add(user);
                user.setEmail(rs.getString("email"));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return users;
    }
    public void gasesteUseri(){
        ArrayList<User> utilizatoriGasiti = afiseazaUseri(searchInputField.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"email"});
        Object[] randuri = new Object[1];
        for(int i=0;i<utilizatoriGasiti.size();i++){
            randuri[0]=utilizatoriGasiti.get(i).getEmail();
            model.addRow(randuri);
        }
        jTable1.setModel(model);
    }   
    public Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/dxm4AFuYMf?useSSL=false","dxm4AFuYMf","sdsKcU3uUv");
        
        }catch(Exception el){
            System.out.println(el.getMessage());
        }
        return con;
    }    
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
            java.util.logging.Logger.getLogger(InterfataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login interfata=new Login();
                    interfata.setVisible(true);
                    interfata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    interfata.setSize(800,640);
                }catch(Exception e1){
                JOptionPane.showMessageDialog(null, e1);
        }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhotoButton;
    private javax.swing.JButton button2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton openConversation;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInputField;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel userLoggedName;
    private javax.swing.JLabel userTextLabel;
    // End of variables declaration//GEN-END:variables

}
