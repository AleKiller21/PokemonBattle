/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokemonbattle;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.*;
public class Opening extends javax.swing.JFrame
{

    /**
     * Creates new form Opening
     */
    public Opening()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("FIGHT!!!");
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("FIGHT!!!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButton1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 10, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Charmeleon_VS_Ivysaur.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 290);

        setSize(new java.awt.Dimension(518, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MousePressed
    {//GEN-HEADEREND:event_jButton1MousePressed
        BattleUI battle = new BattleUI();
        battle.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseEntered
    {//GEN-HEADEREND:event_jButton1MouseEntered
        try
        {
          AudioClip clip = Applet.newAudioClip(new URL("file:/C:/Users/Alejandro/java/NetBeans/PokemonBattle/src/Button_sound.wav"));
          clip.play();
        }
        
        catch(MalformedURLException e)
        {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton1MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Opening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
