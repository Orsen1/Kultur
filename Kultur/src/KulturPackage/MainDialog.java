package KulturPackage;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainDialog extends javax.swing.JDialog {

  int weizenGesaet, maisGesaet, karotteGesaet, kartofelGesaet = 0;
  int weizenGeerntet, maisGeerntet, karotteGeerntet, kartofelGeerntet = 0;
  ArrayList<JButton> buttons = new ArrayList<>();
  ArrayList<JLabel> gesaetLabel = new ArrayList<>();
  ArrayList<JLabel> geerntetLabel = new ArrayList<>();
  ArrayList<Integer> gesaetInt = new ArrayList<>();
  ArrayList<Integer> geerntetInt = new ArrayList<>();
  
  private static String[] kulturen = {"Weizen", "Mais", "3", "4"};

  public MainDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    
    buttons.add(jButtonWeizen);
    buttons.add(jButtonMais);
    buttons.add(jButtonKarotte);
    buttons.add(jButtonKartofel);
    
    gesaetLabel.add(jLabelWeizenGesaet);
    gesaetLabel.add(jLabelMaisGesaet);
    gesaetLabel.add(jLabelKarotteGesaet);
    gesaetLabel.add(jLabelKartofelGesaet); 
    
    geerntetLabel.add(jLabelWeizenGeerntet);
    geerntetLabel.add(jLabelMaisGeerntet);
    geerntetLabel.add(jLabelKarotteGeerntet);
    geerntetLabel.add(jLabelKartofelGeerntet);
    
    gesaetInt.add(weizenGesaet);
    gesaetInt.add(maisGesaet);
    gesaetInt.add(karotteGesaet);
    gesaetInt.add(kartofelGesaet);
    
    geerntetInt.add(weizenGeerntet);
    geerntetInt.add(maisGeerntet);
    geerntetInt.add(karotteGeerntet);
    geerntetInt.add(kartofelGeerntet);
  }

  private void timesetter(int delay, int period, int nr) {
    if (!buttons.get(nr).getText().contains("Zeit zum Ernten")) {
      Timer timer = new Timer();
      TimerTask task = new TimerTask() {
        int i = 0;

        @Override
        public void run() {

          buttons.get(nr).setText("Noch " + String.valueOf(i++) + " Sek. warten");
          buttons.get(nr).setEnabled(false);

          if (i > 5) {
            timer.cancel();
            buttons.get(nr).setEnabled(true);
            buttons.get(nr).setText("Zeit zum Ernten");
          }
        }
      };
      timer.schedule(task, delay, period);
       gesaetInt.set(nr, gesaetInt.get(nr) + 1);
      gesaetLabel.get(nr).setText(String.valueOf(gesaetInt.get(nr)));
    } else {
      
      buttons.get(nr).setText(kulturen[nr]);
      
      geerntetInt.set(nr, geerntetInt.get(nr) + 1);
      geerntetLabel.get(nr).setText(String.valueOf(geerntetInt.get(nr)));
    }

  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButtonWeizen = new javax.swing.JButton();
    jButtonMais = new javax.swing.JButton();
    jButtonKarotte = new javax.swing.JButton();
    jButtonKartofel = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabelWeizenGesaet = new javax.swing.JLabel();
    jLabelMaisGesaet = new javax.swing.JLabel();
    jLabelKartofelGesaet = new javax.swing.JLabel();
    jLabelKarotteGesaet = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabelWeizenGeerntet = new javax.swing.JLabel();
    jLabelKartofelGeerntet = new javax.swing.JLabel();
    jLabelKarotteGeerntet = new javax.swing.JLabel();
    jLabelMaisGeerntet = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jButtonWeizen.setBackground(new java.awt.Color(204, 204, 255));
    jButtonWeizen.setText("Weizen");
    jButtonWeizen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonWeizenActionPerformed(evt);
      }
    });

    jButtonMais.setBackground(new java.awt.Color(204, 204, 255));
    jButtonMais.setText("Mais");
    jButtonMais.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonMaisActionPerformed(evt);
      }
    });

    jButtonKarotte.setBackground(new java.awt.Color(204, 204, 255));
    jButtonKarotte.setText("Karotte");
    jButtonKarotte.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonKarotteActionPerformed(evt);
      }
    });

    jButtonKartofel.setBackground(new java.awt.Color(204, 204, 255));
    jButtonKartofel.setText("Kartofel");
    jButtonKartofel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonKartofelActionPerformed(evt);
      }
    });

    jLabel1.setBackground(new java.awt.Color(204, 204, 255));
    jLabel1.setText("Weizen");

    jLabel2.setBackground(new java.awt.Color(204, 204, 255));
    jLabel2.setText("Mais");

    jLabel3.setBackground(new java.awt.Color(204, 204, 255));
    jLabel3.setText("Kartofel");

    jLabel4.setBackground(new java.awt.Color(204, 204, 255));
    jLabel4.setText("Karotte");

    jLabelWeizenGesaet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelWeizenGesaet.setText("0");

    jLabelMaisGesaet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelMaisGesaet.setText("0");

    jLabelKartofelGesaet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelKartofelGesaet.setText("0");

    jLabelKarotteGesaet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelKarotteGesaet.setText("0");

    jLabel9.setText("Geerntet");

    jLabel10.setText("Gesät");

    jLabelWeizenGeerntet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelWeizenGeerntet.setText("0");

    jLabelKartofelGeerntet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelKartofelGeerntet.setText("0");

    jLabelKarotteGeerntet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelKarotteGeerntet.setText("0");

    jLabelMaisGeerntet.setBackground(new java.awt.Color(204, 204, 255));
    jLabelMaisGeerntet.setText("0");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButtonKarotte, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonKartofel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButtonWeizen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(126, 126, 126)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWeizenGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMaisGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKarotteGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKartofelGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelWeizenGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelKarotteGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelKartofelGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelMaisGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(241, 241, 241)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
            .addGap(45, 45, 45)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(257, 257, 257))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelWeizenGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelWeizenGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelMaisGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelMaisGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelKarotteGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelKartofelGesaet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabelKarotteGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKartofelGeerntet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButtonWeizen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButtonKarotte, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButtonKartofel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(175, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonWeizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWeizenActionPerformed
    timesetter(200, 1000, 0);
  }//GEN-LAST:event_jButtonWeizenActionPerformed

  private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisActionPerformed
    timesetter(200, 1000, 1);
  }//GEN-LAST:event_jButtonMaisActionPerformed

  private void jButtonKarotteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKarotteActionPerformed
    timesetter(200, 1000, 2);
  }//GEN-LAST:event_jButtonKarotteActionPerformed

  private void jButtonKartofelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKartofelActionPerformed
    timesetter(200, 1000, 3);
  }//GEN-LAST:event_jButtonKartofelActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MainDialog dialog = new MainDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonKarotte;
  private javax.swing.JButton jButtonKartofel;
  private javax.swing.JButton jButtonMais;
  private javax.swing.JButton jButtonWeizen;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JLabel jLabelKarotteGeerntet;
  private javax.swing.JLabel jLabelKarotteGesaet;
  private javax.swing.JLabel jLabelKartofelGeerntet;
  private javax.swing.JLabel jLabelKartofelGesaet;
  private javax.swing.JLabel jLabelMaisGeerntet;
  private javax.swing.JLabel jLabelMaisGesaet;
  private javax.swing.JLabel jLabelWeizenGeerntet;
  private javax.swing.JLabel jLabelWeizenGesaet;
  // End of variables declaration//GEN-END:variables
}
