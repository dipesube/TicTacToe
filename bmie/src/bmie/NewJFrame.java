/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmie;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajan
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
        btnCalc = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxGender = new javax.swing.JComboBox<>();
        cboxSystem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalc.setText("Calculate");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel2.setText("Height");

        jLabel3.setText("Weight");

        jLabel4.setText("Age");

        cboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imperial", "Metric" }));

        cboxSystem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel6.setText("Please select a Gender");

        jLabel7.setText("Please select a system of measurement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(12, 12, 12))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(15, 15, 15)))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int age; //declaring variables for the user input
        
        double height, weight;
        double bmi;
        double IdealWeight;
        double LoseWeight;
       
        String strHeight;
        String strWeight;
        String strAge;
        
        strHeight = txtHeight.getText();
        strWeight = txtWeight.getText();
        strAge = txtAge.getText();
        height = Double.parseDouble(strHeight);
        weight = Double.parseDouble(strWeight);
        age = Integer.parseInt(strAge);
        
        
       
//        if (rbtnMale.isSelected())
     {
       //   if (rbtnMetric.isSelected()) 
       {
           
          bmi = weight/ (height * height);
      
      
          
          
          JOptionPane.showMessageDialog(null, "Your bmi is" + String.format("%.1f", bmi)); // formatting the value of the bmi to one decimal place
          
        if (age < 20)
        {
            JOptionPane.showMessageDialog(null, "Sorry.. You must be above the age of 20 to calculate your BMI!");
        }
          if ((age >=20) && (age<=29))
          {
              if (bmi > 25.5)
          {
              IdealWeight = 25.5*(Math.pow(height, 2)); //BMI calculated for ideal weight
              LoseWeight = IdealWeight - weight;
              JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
          }
          
          else if (bmi < 25.5)
          {
              JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
          }
          else if (bmi ==25.5)
          {
              JOptionPane.showMessageDialog(null, "You are at the 50th Percentile");
          }
         
     }
          if ((age>=30) && (age<=39))
          
          {
              if (bmi > 27.5)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
              }
              else if (bmi < 27.5)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
              }
          }
              
         
          if ((age>=40) && (age <=49))
          {
              if (bmi >25.7)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
              }
              if (bmi<25.7)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
              }
              if ((age>=50) && (age<=59))
              {
                 if (bmi >28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                 }
                 else if (bmi < 28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                 }
              }
              if ((age>=60) && (age<=69))
              {
                  if (bmi > 28.0)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 28.0)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
              
              if ((age > 70) && (age<79))
                      {
                  if (bmi > 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
                      }
              
              if (age >= 80)
              {
                  if (bmi > 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
          }
          
          
          
          
                        
          }
       }
//       if (rbtnMale.isSelected())
       {
        //   if(rbtnImperial.isSelected())
           {
               bmi = (weight/Math.pow(height, 2))*703;
           
            JOptionPane.showMessageDialog(null, "Your bmi is " + String.format("%.1f", bmi));
      
          
        if (age < 20)
        {
            JOptionPane.showMessageDialog(null, "Sorry.. You must be above the age of 20 to calculate your BMI!");
        }
          if ((age >=20) && (age<=29))
          {
              if (bmi > 25.5)
          {
              JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
          }
          
          else if (bmi < 25.5)
          {
              JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
          }
          else if (bmi ==25.5)
          {
              JOptionPane.showMessageDialog(null, "You are at the 50th Percentile");
          }
         
     }
          if ((age>=30) && (age<=39))
          
          {
              if (bmi > 27.5)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Perentile");
              }
              else if (bmi < 27.5)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Perentile");
              }
          }
              
         
          if ((age>40) && (age < 49))
          {
              if (bmi >25.7)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
              }
              if (bmi<25.7)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
              }
              if ((age>50) && (age<59))
              {
                 if (bmi >28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                 }
                 else if (bmi < 28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                 }
              }
              if ((age>60) && (age<69))
              {
                  if (bmi > 28.0)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 28.0)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
              
              if ((age > 70) && (age<79))
                      {
                  if (bmi > 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
                      }
              
              if (age >= 80)
              {
                  if (bmi > 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
          }
           
           
           }
       }
        
        
//         if (rbtnFemale.isSelected())
     {
    //      if (rbtnMetric.isSelected()) 
       {
           
          bmi = weight/(Math.pow(height, 2));
      
      
          
          
          
          JOptionPane.showMessageDialog(null, "Your bmi is " + String.format("%.1f", bmi));
      
          
        if (age < 20)
        {
            JOptionPane.showMessageDialog(null, "Sorry.. You must be above the age of 20 to calculate your BMI!");
        }
          if ((age >=20) && (age<=29))
          {
              if (bmi > 25.6)
          {
              JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
          }
          
          else if (bmi < 25.6)
          {
              JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
          }
                   
     }
          if ((age>=30) && (age<=39))
          
          {
              if (bmi > 27.6)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Perentile");
              }
              else if (bmi < 27.6)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Perentile");
              }
          }
              
         
          if ((age>=40) && (age <= 49))
          {
              if (bmi >28.1)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
              }
              if (bmi<28.1)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
              }
              if ((age>50) && (age<59))
              {
                 if (bmi >28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                 }
                 else if (bmi < 28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                 }
              }
              if ((age>60) && (age<69))
              {
                  if (bmi > 28.6)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 28.6)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
              
              if ((age > 70) && (age<79))
                      {
                  if (bmi > 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
                      }
              
              if (age >= 80)
              {
                  if (bmi > 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
          }
          
          
          
          
                        
          }
       }
     //  if (rbtnFemale.isSelected())
       {
      //     if(rbtnImperial.isSelected())
           {
               bmi = (weight/Math.pow(height, 2))*703;
           
            JOptionPane.showMessageDialog(null, "Your bmi is " + String.format("%.1f", bmi));
      
          
        if (age < 20)
        {
            JOptionPane.showMessageDialog(null, "Sorry.. You must be above the age of 20 to calculate your BMI!");
        }
          if ((age >=20) && (age<=29))
          {
              if (bmi > 25.5)
          {
              JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
          }
          
          else if (bmi < 25.5)
          {
              JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
          }
          else if (bmi ==25.5)
          {
              JOptionPane.showMessageDialog(null, "You are at the 50th Percentile");
          }
         
     }
          if ((age>=30) && (age<=39))
          
          {
              if (bmi > 27.5)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Perentile");
              }
              else if (bmi < 27.5)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Perentile");
              }
          }
              
         
          if ((age>40) && (age < 49))
          {
              if (bmi >25.7)
              {
                  JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
              }
              if (bmi<25.7)
              {
                  JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
              }
              if ((age>50) && (age<59))
              {
                 if (bmi >28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                 }
                 else if (bmi < 28.3)
                 {
                     JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                 }
              }
              if ((age>60) && (age<69))
              {
                  if (bmi > 28.0)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 28.0)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
              
              if ((age > 70) && (age<79))
                      {
                  if (bmi > 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 27.8)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
                      }
              
              if (age >= 80)
              {
                  if (bmi > 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are above the 50th Percentile");
                  }
                  else if (bmi < 26.3)
                  {
                      JOptionPane.showMessageDialog(null, "You are below the 50th Percentile");
                  }
              }
          }
    }//GEN-LAST:event_btnCalcActionPerformed
       }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JComboBox<String> cboxGender;
    private javax.swing.JComboBox<String> cboxSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
