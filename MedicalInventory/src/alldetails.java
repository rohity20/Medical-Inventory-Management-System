import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.connectionProvider;
import project.*;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohit
 */
public class alldetails extends javax.swing.JFrame {

    /**
     * Creates new form alldetails
     */
    public alldetails() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("ALL DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 12, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 1149, 12));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CUSTOMER DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CU_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 128, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 207, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CONTACT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CITY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 122, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1149, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SALES DETAILS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("S_ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("TYPE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 114, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("AMOUNT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 109, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("QUANTITY");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 84, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("DATE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 139, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("CU_ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 310, 75, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 372, 1149, 10));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S_ID", "TYPE", "AMOUNT", "QUANTITY", "DATE", "CU_ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 388, 870, 110));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\OneDrive\\Desktop\\print_white.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 70, 70));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1106, 12, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\OneDrive\\Desktop\\bg_new2.png")); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String CU_ID=jTextField1.getText();
        try
        {
         Connection con=connectionProvider.getCon();
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("Select *from customer where CU_ID='"+CU_ID+"'");
         if(rs.next())
         {
             jTextField1.setText(rs.getString(1));
             jTextField2.setText(rs.getString(2));
             jTextField3.setText(rs.getString(3));
             jTextField4.setText(rs.getString(6));
            
         }
         else
             JOptionPane.showMessageDialog(null,"Customer CU_ID does not exist!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //String CU_ID=jTextField11.getText();
        try
        {
         Connection con=connectionProvider.getCon();
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("Select *from Sales where CU_ID='"+CU_ID+"'");
         if(rs.next())
         {
             jTextField5.setText(rs.getString(1));
             jTextField6.setText(rs.getString(2));
             jTextField7.setText(rs.getString(3));
             jTextField8.setText(rs.getString(4));
             jTextField9.setText(rs.getString(5));
             jTextField10.setText(rs.getString(6));
             
         }
         else
             JOptionPane.showMessageDialog(null,"S_ID does not exist!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //String CU_ID=jTextField1.getText();
        ResultSet rs=Select.getData("select *from sales where CU_ID='"+CU_ID+"'");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       
        model.setRowCount(0);
        
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
            rs.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
        ResultSet rs=Select.getData("select *from sales where CU_ID is not NULL");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
            rs.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1ComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try
        {
            int row = jTable1.getSelectedRow();
            String Table_click = (jTable1.getModel().getValueAt(row, 0).toString());
           
             Connection con=connectionProvider.getCon();
             Statement st=con.createStatement();
              ResultSet rs=st.executeQuery("select * from sales where S_ID='"+Table_click+"' ");
        
            
            if(rs.next())
            {
                String add1 =rs.getString("S_ID");
                jTextField5.setText(add1);
                String add2 =rs.getString("TYPE");
                jTextField6.setText(add2);
                String add3 =rs.getString("AMOUNT");
                jTextField7.setText(add3);
                String add4 =rs.getString("QUANTITY");
                jTextField8.setText(add4);
                String add5 =rs.getString("DATE");
                jTextField9.setText(add5);
                String add6 =rs.getString("CU_ID");
                jTextField10.setText(add6);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        /*
        String path="G:\\";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        */
        String CU_ID=jTextField1.getText();
        String NAME=jTextField2.getText();
        String CONTACT=jTextField3.getText();
        String CITY=jTextField4.getText();

        String S_ID=jTextField5.getText();
        String TYPE=jTextField6.getText();
        String AMOUNT=jTextField7.getText();
        String QUANTITY=jTextField8.getText();
        String DATE=jTextField9.getText();
        //String CU_ID=jTextField10.getText();
        String Query = "update customer set NAME='"+NAME+"',CONTACT='"+CONTACT+"',CITY='"+CITY+"' where CU_ID='"+CU_ID+"' ";
        InsertUpdateDelete.setData(Query,"");
        Query ="update Sales set S_ID='"+S_ID+"',TYPE='"+TYPE+"',AMOUNT='"+AMOUNT+"',QUANTITY='"+QUANTITY+"',DATE='"+DATE+"',CU_ID='"+CU_ID+"' where S_ID='"+S_ID+"' ";
        InsertUpdateDelete.setData(Query,"");

        String path="H:\\";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();

        try
        {

            PdfWriter.getInstance(doc, new FileOutputStream(path+""+S_ID+".pdf"));
            doc.open();
            float col=280f;
            float columnWidth[]={col, col};

            Paragraph paragraph1=new Paragraph("                                                            SALES\n                                                          REPORT\n");
            doc.add(paragraph1);
            Paragraph paragraph2=new Paragraph("____________________________________________________________________________");
            doc.add(paragraph2);
            Paragraph paragraph3=new Paragraph("CUSTOMER DEATILS\n\n\t"+CU_ID+"            "+NAME+"\n"+CONTACT+"\n"+CITY);
            doc.add(paragraph3);
            Paragraph paragraph4=new Paragraph("*******************************************************************************************************");
            doc.add(paragraph4);
            Paragraph paragraph5=new Paragraph("SALES DETAILS\n\n\tSales ID: "+S_ID+"\nSales Type: "+TYPE+"\nSales Amount: "+AMOUNT+"\nSales Quantity: "+QUANTITY+"\nSales Date: "+DATE);
            doc.add(paragraph5);
            Paragraph paragraph6=new Paragraph("******************************************************************************************************\n");
            doc.add(paragraph6);

            //jTable1.print(JTable.PrintMode.FIT_WIDTH);

            PdfPTable tb1=new PdfPTable(5);

            tb1.addCell("S_ID");
            tb1.addCell("TYPE");
            tb1.addCell("AMOUNT");
            tb1.addCell("QUANTITY");
            tb1.addCell("DATE");

            for(int i=0;i<jTable1.getRowCount();i++)
            {
                String n=jTable1.getValueAt(i, 0).toString();
                String n1=jTable1.getValueAt(i, 1).toString();
                String n2=jTable1.getValueAt(i, 2).toString();
                String n3=jTable1.getValueAt(i, 3).toString();
                String n4=jTable1.getValueAt(i, 4).toString();
                tb1.addCell(n);
                tb1.addCell(n1);
                tb1.addCell(n2);
                tb1.addCell(n3);
                tb1.addCell(n4);
            }

            /*
            MessageFormat header=new MessageFormat("oooo");
            MessageFormat footer=new MessageFormat("pppp");
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer);
            */

            doc.add(tb1);
            doc.add(paragraph2);
            Paragraph paragraph9=new Paragraph("Thank you, Please Visit Again");
            doc.add(paragraph9);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        int a=JOptionPane.showConfirmDialog(null,"Do you want to Print Bill","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            try
            {
                if((new File("H:\\"+S_ID+".pdf")).exists())
                    {
                        Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler H:\\"+S_ID+".pdf");
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                setVisible(false);
                new alldetails().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(alldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alldetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
