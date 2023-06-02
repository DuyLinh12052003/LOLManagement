package lolmanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ViewSkin extends javax.swing.JFrame {

    public ViewSkin() {
        initComponents();
        setLocationRelativeTo(null);
        
        pnlList.setLayout(new GridLayout(0, 4, 20, 20));
        pnlList.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        for(int i = 0; i < 14; i++) {
            JPanel pnl = new ImagePanel("src/resources/images/skins/project-ashe.jpg");
            pnl.setLayout(new BorderLayout());
            pnl.setBorder(new LineBorder(new Color(60, 60, 65), 2));
            
            JPanel pnlInfo = null;
            pnlInfo = new JPanel(new GridLayout(2, 1, 10, 5));
            pnlInfo.setOpaque(false);
            
            JLabel lblName = new JLabel("Project Ashe");
            lblName.setHorizontalAlignment(JLabel.CENTER);
            lblName.setFont(new Font("Roboto", 1, 16));
            lblName.setForeground(new Color(238, 228, 208));
            pnlInfo.add(lblName);
            
            JLabel lblPrice = new JLabel("1280", new ImageIcon(new ImageIcon("src/resources/images/icons/rp.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT)), JLabel.LEFT);
            lblPrice.setHorizontalAlignment(JLabel.CENTER);
            lblPrice.setFont(new Font("Roboto", 0, 14));
            lblPrice.setForeground(new Color(194, 164, 106));
            pnlInfo.add(lblPrice);
            
            pnl.add(pnlInfo, BorderLayout.SOUTH);

            pnlList.add(pnl);
        }
    }
    
    
    
    class ImagePanel extends JPanel {
        private Image img;

        public ImagePanel(String img) {
          this(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(200, 266, Image.SCALE_DEFAULT)).getImage());
        }

        public ImagePanel(Image img) {
          this.img = img;
          Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
          setPreferredSize(size);
          setMinimumSize(size);
          setMaximumSize(size);
          setSize(size);
          setLayout(null);
        }

        public void paintComponent(Graphics g) {
          g.drawImage(img, 0, 0, null);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlList = new javax.swing.JPanel();
        pnlSetting = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Available Skins");

        jScrollPane1.setBorder(null);

        pnlList.setBackground(new java.awt.Color(1, 10, 19));

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlList);

        pnlSetting.setBackground(new java.awt.Color(1, 10, 19));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(195, 190, 160));
        jLabel1.setText("SEARCH AND FILTER");

        lblTitle.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(195, 190, 160));
        lblTitle.setText("AVAILABLE SKINS");

        javax.swing.GroupLayout pnlSettingLayout = new javax.swing.GroupLayout(pnlSetting);
        pnlSetting.setLayout(pnlSettingLayout);
        pnlSettingLayout.setHorizontalGroup(
            pnlSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSettingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblTitle))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        pnlSettingLayout.setVerticalGroup(
            pnlSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSettingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlSetting;
    // End of variables declaration//GEN-END:variables
}
