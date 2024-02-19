
package aplikasikalkulator24;


public class aplikasikalkulator25 extends javax.swing.JFrame {
String angka;
Double jumlah,bil1,bil2;
int pilih;
    
    public aplikasikalkulator25() {
        initComponents();
        setLocationRelativeTo(this);
        angka="";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TampilHasil = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        angka8 = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        btnpersen = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        btntitik = new javax.swing.JButton();
        btnsamadengan = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Application Calculator");

        TampilHasil.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        TampilHasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TampilHasil.setText("0");
        TampilHasil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(TampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        angka8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka8.setText("8");
        angka8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        btnkali.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnkali.setText("*");
        btnkali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        angka9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka9.setText("9");
        angka9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        angka4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka4.setText("4");
        angka4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnreset.setText("CE");
        btnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        angka7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka7.setText("7");
        angka7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka6.setText("6");
        angka6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka1.setText("1");
        angka1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        btntambah.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btntambah.setText("+");
        btntambah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        angka3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka3.setText("3");
        angka3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        btnpersen.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnpersen.setText("%");
        btnpersen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpersenActionPerformed(evt);
            }
        });

        angka5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka5.setText("5");
        angka5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka2.setText("2");
        angka2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        btnbagi.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnbagi.setText("/");
        btnbagi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        btnkurang.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnkurang.setText("-");
        btnkurang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        angka0.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        angka0.setText("0");
        angka0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        btntitik.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btntitik.setText(".");
        btntitik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btntitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntitikActionPerformed(evt);
            }
        });

        btnsamadengan.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnsamadengan.setText("=");
        btnsamadengan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btndelete.setText("DEL");
        btndelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
angka +="1";
TampilHasil.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
angka +="2";
TampilHasil.setText(angka);        
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
angka +="3";
TampilHasil.setText(angka);       
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
angka +="4";
TampilHasil.setText(angka);       
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
angka +="5";
TampilHasil.setText(angka);        
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
angka +="6";
TampilHasil.setText(angka);       
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
angka +="7";
TampilHasil.setText(angka);      
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
angka +="8";
TampilHasil.setText(angka);      
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
angka +="9";
TampilHasil.setText(angka);       
    }//GEN-LAST:event_angka9ActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
angka +="0";
TampilHasil.setText(angka);      
    }//GEN-LAST:event_angka0ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
bil1 =Double.parseDouble(angka);
TampilHasil.setText("+");
angka ="";
pilih =1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
bil1 =Double.parseDouble(angka);
TampilHasil.setText("-");
angka ="";
pilih =2;       
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
bil1 =Double.parseDouble(angka);
TampilHasil.setText("*");
angka ="";
pilih =3;    
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
bil1 =Double.parseDouble(angka);
TampilHasil.setText("/");
angka ="";
pilih =4;      
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpersenActionPerformed
bil1 =Double.parseDouble(angka);
TampilHasil.setText("%");
angka ="";
pilih =5;        
    }//GEN-LAST:event_btnpersenActionPerformed

    private void btntitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntitikActionPerformed
angka +=".";
TampilHasil.setText(angka);      
    }//GEN-LAST:event_btntitikActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
switch (pilih){
        case 1:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1+bil2;
            angka = Double.toString(jumlah);
            TampilHasil.setText(angka);
            break;
            case 2:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1-bil2;
            angka = Double.toString(jumlah);
            TampilHasil.setText(angka);
            break;
            case 3:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1*bil2;
            angka = Double.toString(jumlah);
            TampilHasil.setText(angka);
            break;
            case 4:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1/bil2;
            angka = Double.toString(jumlah);
            TampilHasil.setText(angka);
            break;
            case 5:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1%bil2/100;
            angka = Double.toString(jumlah);
            TampilHasil.setText(angka);
            break;
}
              
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
 TampilHasil.setText(angka);
 bil1 =0.0;
 bil2 =0.0;
 jumlah =0.0;
 angka ="";
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
if (TampilHasil.getText().length()<=1){
        angka="";
        TampilHasil.setText("0");
    }else{
            angka=TampilHasil.getText().substring(0, TampilHasil.getText().length()-1);
            TampilHasil.setText(angka);
}
        
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(aplikasikalkulator25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasikalkulator25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasikalkulator25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasikalkulator25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasikalkulator25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TampilHasil;
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnpersen;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsamadengan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntitik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
