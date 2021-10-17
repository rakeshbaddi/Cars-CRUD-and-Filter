/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Car;
import model.CarsHistory;

/**
 *
 * @author rakeshbaddi
 */
public class AddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddJPanel
     */
    
    CarsHistory history;
    
    public AddJPanel(CarsHistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AvailGroup = new javax.swing.ButtonGroup();
        CertGroup = new javax.swing.ButtonGroup();
        labelTitle = new javax.swing.JLabel();
        labelBrand = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelBrand1 = new javax.swing.JLabel();
        labelAvailability = new javax.swing.JLabel();
        labelSeats = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        labelSerial = new javax.swing.JLabel();
        labelCertificate = new javax.swing.JLabel();
        textBrand = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textCity = new javax.swing.JTextField();
        textSeats = new javax.swing.JTextField();
        textYear = new javax.swing.JTextField();
        textSerial = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        radioButtonAvailYes = new javax.swing.JRadioButton();
        radioButtonAvailNo = new javax.swing.JRadioButton();
        radioButtonCertYes = new javax.swing.JRadioButton();
        radioButtonCertNo = new javax.swing.JRadioButton();
        labelErr1 = new javax.swing.JLabel();
        labelErr2 = new javax.swing.JLabel();
        labelErr3 = new javax.swing.JLabel();
        labelErr4 = new javax.swing.JLabel();
        labelErr5 = new javax.swing.JLabel();
        labelErr6 = new javax.swing.JLabel();
        labelAvailableIn = new javax.swing.JLabel();
        textAvailableIn = new javax.swing.JTextField();
        labelErr7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("ADD CARS");

        labelBrand.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelBrand.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelBrand.setText("Car Brand :");

        labelName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelName.setText("Model Name :");

        labelBrand1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelBrand1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelBrand1.setText("City :");

        labelAvailability.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelAvailability.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelAvailability.setText("Availability :");

        labelSeats.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelSeats.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSeats.setText("No. of Seats :");

        labelYear.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelYear.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelYear.setText("Manufacturing Year :");

        labelSerial.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelSerial.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSerial.setText("Serial No :");

        labelCertificate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelCertificate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelCertificate.setText("Maintenance Certificate :");

        textBrand.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textBrand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textBrand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textBrandFocusLost(evt);
            }
        });
        textBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBrandActionPerformed(evt);
            }
        });

        textName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNameFocusLost(evt);
            }
        });
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        textCity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCityFocusLost(evt);
            }
        });
        textCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCityActionPerformed(evt);
            }
        });

        textSeats.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textSeats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textSeats.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSeatsFocusLost(evt);
            }
        });
        textSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSeatsActionPerformed(evt);
            }
        });

        textYear.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textYearFocusLost(evt);
            }
        });
        textYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYearActionPerformed(evt);
            }
        });

        textSerial.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textSerial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textSerial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSerialFocusLost(evt);
            }
        });
        textSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSerialActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 204, 255));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        radioButtonAvailYes.setBackground(new java.awt.Color(255, 255, 255));
        AvailGroup.add(radioButtonAvailYes);
        radioButtonAvailYes.setSelected(true);
        radioButtonAvailYes.setText("Yes");
        radioButtonAvailYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAvailYesActionPerformed(evt);
            }
        });

        radioButtonAvailNo.setBackground(new java.awt.Color(255, 255, 255));
        AvailGroup.add(radioButtonAvailNo);
        radioButtonAvailNo.setText("No");
        radioButtonAvailNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAvailNoActionPerformed(evt);
            }
        });

        CertGroup.add(radioButtonCertYes);
        radioButtonCertYes.setSelected(true);
        radioButtonCertYes.setText("Yes");
        radioButtonCertYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCertYesActionPerformed(evt);
            }
        });

        CertGroup.add(radioButtonCertNo);
        radioButtonCertNo.setText("No");
        radioButtonCertNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCertNoActionPerformed(evt);
            }
        });

        labelErr1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr1.setForeground(java.awt.Color.red);

        labelErr2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr2.setForeground(java.awt.Color.red);

        labelErr3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr3.setForeground(java.awt.Color.red);

        labelErr4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr4.setForeground(java.awt.Color.red);

        labelErr5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr5.setForeground(java.awt.Color.red);

        labelErr6.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr6.setForeground(java.awt.Color.red);

        labelAvailableIn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelAvailableIn.setText("Available In (Minutes) :");

        textAvailableIn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textAvailableIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textAvailableIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textAvailableInFocusLost(evt);
            }
        });

        labelErr7.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelErr7.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAvailableIn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSerial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelBrand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioButtonAvailYes)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonAvailNo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioButtonCertYes)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonCertNo))
                    .addComponent(textAvailableIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelErr7)
                            .addComponent(labelErr6)
                            .addComponent(labelErr5)
                            .addComponent(labelErr4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelErr3)
                            .addComponent(labelErr2)
                            .addComponent(labelErr1))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(labelTitle)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBrand)
                    .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBrand1)
                    .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAvailability)
                    .addComponent(radioButtonAvailYes)
                    .addComponent(radioButtonAvailNo))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSerial)
                    .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioButtonCertYes)
                        .addComponent(radioButtonCertNo))
                    .addComponent(labelCertificate))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAvailableIn)
                    .addComponent(textAvailableIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelErr7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrandActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCityActionPerformed

    private void textSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSeatsActionPerformed

    private void textYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYearActionPerformed

    private void textSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSerialActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // labelErr1.getText().equals("") && labelErr2.getText().equals("") && labelErr3.getText().equals("") && 
                //labelErr4.getText().equals("") && labelErr5.getText().equals("") && labelErr6.getText().equals("") && labelErr7.getText().equals("")
        
        if(!textBrand.getText().isBlank() && !textName.getText().isBlank() && !textCity.getText().isBlank() && !textSeats.getText().isBlank() && 
            !textYear.getText().isBlank() && !textSerial.getText().isBlank() && !textAvailableIn.getText().isBlank()) {
            
            String brand = textBrand.getText();
            String name = textName.getText();
            String city = textCity.getText();
            String availability = radioButtonSelection(radioButtonAvailYes, radioButtonAvailNo, AvailGroup);
            int seats = Integer.parseInt(textSeats.getText());
            int year = Integer.parseInt(textYear.getText());
            String serial = textSerial.getText();
            String certificate = radioButtonSelection(radioButtonCertYes, radioButtonCertNo, CertGroup);
            int availableIn = Integer.parseInt(textAvailableIn.getText());
        
            Car car = history.addNewCars();
            car.setBrand(brand);
            car.setModelName(name);        
            car.setCity(city);
            car.setAvailability(availability);
            car.setSeats(seats);
            car.setYear(year);
            car.setSerialNumber(serial);
            car.setCertificate(certificate);
            car.setAvailableIn(availableIn);
        
            JOptionPane.showMessageDialog(this, "New Car added succesfully");
        
            textBrand.setText("");
            textName.setText("");
            textCity.setText("");
            textSeats.setText("");
            textYear.setText("");
            textSerial.setText("");
            textAvailableIn.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Please enter valid details!");
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void radioButtonAvailYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAvailYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonAvailYesActionPerformed

    private void radioButtonAvailNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAvailNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonAvailNoActionPerformed

    private void radioButtonCertYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCertYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCertYesActionPerformed

    private void radioButtonCertNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCertNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCertNoActionPerformed

    private void textBrandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textBrandFocusLost
        // TODO add your handling code here:
        validateLength(textBrand, labelErr1, "Brand");
    }//GEN-LAST:event_textBrandFocusLost

    private void textNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNameFocusLost
        // TODO add your handling code here:
        validateLength(textName, labelErr2, "Model Name");
    }//GEN-LAST:event_textNameFocusLost

    private void textCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCityFocusLost
        // TODO add your handling code here:
        validateLength(textCity, labelErr3, "City");
    }//GEN-LAST:event_textCityFocusLost

    private void textSerialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSerialFocusLost
        // TODO add your handling code here:
        validateLength(textSerial, labelErr6, "Serial Number");
        
        if(history.getHistory().size()>0) {
            for(Car car : history.getHistory()) {
                if(textSerial.getText().equalsIgnoreCase(car.getSerialNumber())) {
                    labelErr6.setText("Serial Number has to be unique");
                }
            }
        }
    }//GEN-LAST:event_textSerialFocusLost

    private void textYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textYearFocusLost
        // TODO add your handling code here:
        validateYear(textYear);
    }//GEN-LAST:event_textYearFocusLost

    private void textSeatsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSeatsFocusLost
        // TODO add your handling code here:
        validateSeats(textSeats);
    }//GEN-LAST:event_textSeatsFocusLost

    private void textAvailableInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAvailableInFocusLost
        // TODO add your handling code here:
        validateAvailableIn(textAvailableIn);
    }//GEN-LAST:event_textAvailableInFocusLost

    public String radioButtonSelection(JRadioButton btnYes, JRadioButton btnNo, ButtonGroup btnGroup) {
        btnYes.setActionCommand("Yes");
        btnNo.setActionCommand("No");
        
        return btnGroup.getSelection().getActionCommand();
    }
    
    private void validateLength(JTextField textField, JLabel label, String msg) {
        if(textField.getText().isBlank()) {
            label.setText("Enter Valid " + msg);
        } else {
            label.setText("");
        }
    }
    
    private void validateSeats(JTextField textField) {
        if(!textField.getText().matches("[1-9]")) {
            labelErr4.setText("Enter Valid Number between 1 to 9");
        } else {
            labelErr4.setText("");
        }
    }
    
    private void validateYear(JTextField textField) {
        if(!textField.getText().matches("\\d{4}")) {
            labelErr5.setText("Enter Valid Year");
        } else {
            labelErr5.setText("");
        }
        
        if(Integer.parseInt(textField.getText())>2021) {
            labelErr5.setText("Year cannot be greater than 2021");
        }
    }
    
    private void validateAvailableIn(JTextField textField) {
        if(!textField.getText().matches("\\d+")) {
            labelErr7.setText("Enter Valid Number");
        } else {
            labelErr7.setText("");
        }
        
        if(Integer.parseInt(textField.getText())<0) {
            labelErr7.setText("Available In cannot be less than 0");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AvailGroup;
    private javax.swing.ButtonGroup CertGroup;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel labelAvailability;
    private javax.swing.JLabel labelAvailableIn;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelBrand1;
    private javax.swing.JLabel labelCertificate;
    private javax.swing.JLabel labelErr1;
    private javax.swing.JLabel labelErr2;
    private javax.swing.JLabel labelErr3;
    private javax.swing.JLabel labelErr4;
    private javax.swing.JLabel labelErr5;
    private javax.swing.JLabel labelErr6;
    private javax.swing.JLabel labelErr7;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSeats;
    private javax.swing.JLabel labelSerial;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JRadioButton radioButtonAvailNo;
    private javax.swing.JRadioButton radioButtonAvailYes;
    private javax.swing.JRadioButton radioButtonCertNo;
    private javax.swing.JRadioButton radioButtonCertYes;
    private javax.swing.JTextField textAvailableIn;
    private javax.swing.JTextField textBrand;
    private javax.swing.JTextField textCity;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textSeats;
    private javax.swing.JTextField textSerial;
    private javax.swing.JTextField textYear;
    // End of variables declaration//GEN-END:variables

}