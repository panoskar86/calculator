/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Πανος
 */
public class calc extends javax.swing.JFrame {
    double first;
    double second;
    double result;
    boolean add=false;
    boolean abstraction=false;
    boolean multiply=false;
    boolean divide=false;
    boolean cube=false;
    math m1=new math();
    boolean mod=false;
    boolean power=false;
    
    /**
     * Creates new form calc
     */
    public calc() {
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

        Display = new javax.swing.JTextField();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        two = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        synplin = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        komma = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        multipl = new javax.swing.JButton();
        squar = new javax.swing.JButton();
        afer = new javax.swing.JButton();
        cub = new javax.swing.JButton();
        powerr = new javax.swing.JButton();
        dier = new javax.swing.JButton();
        modu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setForeground(new java.awt.Color(51, 51, 51));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setForeground(new java.awt.Color(51, 51, 51));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setForeground(new java.awt.Color(51, 51, 51));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setForeground(new java.awt.Color(51, 51, 51));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setForeground(new java.awt.Color(51, 51, 51));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setForeground(new java.awt.Color(51, 51, 51));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setForeground(new java.awt.Color(51, 51, 51));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setForeground(new java.awt.Color(51, 51, 51));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setForeground(new java.awt.Color(51, 51, 51));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        synplin.setBackground(new java.awt.Color(255, 255, 255));
        synplin.setForeground(new java.awt.Color(51, 51, 51));
        synplin.setText("+/-");
        synplin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                synplinActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setForeground(new java.awt.Color(51, 51, 51));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        komma.setBackground(new java.awt.Color(255, 255, 255));
        komma.setForeground(new java.awt.Color(51, 51, 51));
        komma.setText(",");
        komma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kommaActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setForeground(new java.awt.Color(51, 51, 51));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(255, 255, 255));
        equals.setForeground(new java.awt.Color(51, 51, 51));
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        sum.setBackground(new java.awt.Color(255, 255, 255));
        sum.setForeground(new java.awt.Color(51, 51, 51));
        sum.setText("+");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        multipl.setBackground(new java.awt.Color(255, 255, 255));
        multipl.setForeground(new java.awt.Color(51, 51, 51));
        multipl.setText("*");
        multipl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplActionPerformed(evt);
            }
        });

        squar.setBackground(new java.awt.Color(255, 255, 255));
        squar.setForeground(new java.awt.Color(51, 51, 51));
        squar.setText("x^2");
        squar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarActionPerformed(evt);
            }
        });

        afer.setBackground(new java.awt.Color(255, 255, 255));
        afer.setForeground(new java.awt.Color(51, 51, 51));
        afer.setText("-");
        afer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aferActionPerformed(evt);
            }
        });

        cub.setBackground(new java.awt.Color(255, 255, 255));
        cub.setForeground(new java.awt.Color(51, 51, 51));
        cub.setText("x^3");
        cub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubActionPerformed(evt);
            }
        });

        powerr.setBackground(new java.awt.Color(255, 255, 255));
        powerr.setForeground(new java.awt.Color(51, 51, 51));
        powerr.setText("x^y");
        powerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerrActionPerformed(evt);
            }
        });

        dier.setBackground(new java.awt.Color(255, 255, 255));
        dier.setForeground(new java.awt.Color(51, 51, 51));
        dier.setText("/");
        dier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dierActionPerformed(evt);
            }
        });

        modu.setBackground(new java.awt.Color(255, 255, 255));
        modu.setForeground(new java.awt.Color(51, 51, 51));
        modu.setText("mod");
        modu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Display)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(komma, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multipl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(synplin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dier, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(powerr, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(afer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cub, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(squar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seven)
                                    .addComponent(eight)
                                    .addComponent(nine)
                                    .addComponent(clear))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(five)
                                            .addComponent(six)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sum))))
                            .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one)
                            .addComponent(two)
                            .addComponent(three)
                            .addComponent(multipl)
                            .addComponent(cub)
                            .addComponent(afer)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modu)
                        .addGap(23, 23, 23)
                        .addComponent(squar)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(komma)
                    .addComponent(synplin)
                    .addComponent(powerr)
                    .addComponent(dier))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        Display.setText(Display.getText()+seven.getText());
    }//GEN-LAST:event_sevenActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Display.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        Display.setText(Display.getText()+one.getText());    
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        Display.setText(Display.getText()+two.getText());
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        Display.setText(Display.getText()+three.getText());
    }//GEN-LAST:event_threeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        Display.setText(Display.getText()+zero.getText());     
    }//GEN-LAST:event_zeroActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        Display.setText(Display.getText()+four.getText());
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        Display.setText(Display.getText()+five.getText());
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        Display.setText(Display.getText()+six.getText());
    }//GEN-LAST:event_sixActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        Display.setText(Display.getText()+eight.getText());
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        Display.setText(Display.getText()+nine.getText());
    }//GEN-LAST:event_nineActionPerformed

    private void kommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kommaActionPerformed
        if(!Display.getText().contains(","))
        {
        Display.setText(Display.getText()+komma.getText());
        }
    }//GEN-LAST:event_kommaActionPerformed

    private void synplinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_synplinActionPerformed
        double temp = Double.parseDouble(Display.getText());
        temp = temp*(-1);
        String retval = String.valueOf(temp);
        Display.setText(retval);
    }//GEN-LAST:event_synplinActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        add=true;
        this.first = Double.parseDouble(Display.getText());
        Display.setText("");
    }//GEN-LAST:event_sumActionPerformed

    private void aferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aferActionPerformed
        abstraction=true;
        this.first = Double.parseDouble(Display.getText());
        Display.setText("");
    }//GEN-LAST:event_aferActionPerformed

    private void multiplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplActionPerformed
        multiply=true;
        this.first = Double.parseDouble(Display.getText());
        Display.setText("");
    }//GEN-LAST:event_multiplActionPerformed

    private void dierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dierActionPerformed
        divide=true;
        this.first = Double.parseDouble(Display.getText());
        Display.setText("");
    }//GEN-LAST:event_dierActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
       String screen = Display.getText();
        
        String result;
        double newres;
        
        if(!screen.isEmpty())
        {
        second = Double.parseDouble(Display.getText());    
        
        if(add)
        {
            
            result = String.valueOf(m1.add(first,second));
            Display.setText(result);
            add=false;
            
        }
        else if(abstraction)
        {
            result = String.valueOf(m1.abstraction(first, second));
            Display.setText(result);
        }
        else if(divide && second!=0)
        { 
            result = String.valueOf(m1.divide(this.first,this. second));
            Display.setText(result);
            }
        
        else if(multiply)
        {
            result = String.valueOf(m1.multiply(first,second));
            Display.setText(result);
        }
        else if(power)
        {
            
            result=String.valueOf(m1.power(first,second));
            Display.setText(result);
        }
        else if(mod)
        {
            result=String.valueOf(m1.mod(this.first,this.second));
            Display.setText(result);
        }
        
       }
        
        
    }//GEN-LAST:event_equalsActionPerformed

    private void squarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarActionPerformed
       
        Display.setText(String.valueOf(m1.square(Double.parseDouble(Display.getText()))));
        
    }//GEN-LAST:event_squarActionPerformed

    private void cubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubActionPerformed
        Display.setText(String.valueOf(m1.cube(Double.parseDouble(Display.getText()))));
    }//GEN-LAST:event_cubActionPerformed

    private void powerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerrActionPerformed
       power=true;
        this.first = Double.parseDouble(Display.getText());
       Display.setText("");
       
    }//GEN-LAST:event_powerrActionPerformed

    private void moduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduActionPerformed
        mod=true;
        this.first=Double.parseDouble(Display.getText());
        Display.setText("");
    }//GEN-LAST:event_moduActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton afer;
    private javax.swing.JButton clear;
    private javax.swing.JButton cub;
    private javax.swing.JButton dier;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton komma;
    private javax.swing.JButton modu;
    private javax.swing.JButton multipl;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton powerr;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton squar;
    private javax.swing.JButton sum;
    private javax.swing.JButton synplin;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
