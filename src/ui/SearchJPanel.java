/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarsHistory;

/**
 *
 * @author rakeshbaddi
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    CarsHistory history;
    ArrayList<Car> searchHistory = new ArrayList<Car>();
    
    public SearchJPanel(CarsHistory history) {
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

        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCars = new javax.swing.JTable();
        btnFirstAvailable = new javax.swing.JButton();
        btnAvailable = new javax.swing.JButton();
        btnAllManufacturers = new javax.swing.JButton();
        btnCatalogUpdate = new javax.swing.JButton();
        btnCertificate = new javax.swing.JButton();
        labelBrand = new javax.swing.JLabel();
        textBrand = new javax.swing.JTextField();
        btnBrand = new javax.swing.JButton();
        labelYear = new javax.swing.JLabel();
        textYear = new javax.swing.JTextField();
        btnYear = new javax.swing.JButton();
        labelSeats = new javax.swing.JLabel();
        textSeatsMin = new javax.swing.JTextField();
        labelTo = new javax.swing.JLabel();
        textSeatsMax = new javax.swing.JTextField();
        btnSeats = new javax.swing.JButton();
        labelSerial = new javax.swing.JLabel();
        textSerial = new javax.swing.JTextField();
        btnSerial = new javax.swing.JButton();
        labelCity = new javax.swing.JLabel();
        textCity = new javax.swing.JTextField();
        btnCity = new javax.swing.JButton();
        labelErr1 = new javax.swing.JLabel();
        labelErr2 = new javax.swing.JLabel();
        labelErr3 = new javax.swing.JLabel();
        labelErr4 = new javax.swing.JLabel();
        labelErr5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setBackground(new java.awt.Color(255, 255, 255));
        labelTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("SEARCH CARS BY");

        tableCars.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        tableCars.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Brand", "Model Name", "City", "Availability", "No. of Seats", "Manufacturing Year", "Serial Number", "Maintenance Certificate", "Available In (Minutes)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCars);

        btnFirstAvailable.setBackground(new java.awt.Color(153, 204, 255));
        btnFirstAvailable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFirstAvailable.setText("First Available Car");
        btnFirstAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableActionPerformed(evt);
            }
        });

        btnAvailable.setBackground(new java.awt.Color(153, 204, 255));
        btnAvailable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAvailable.setText("All Available Cars");
        btnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableActionPerformed(evt);
            }
        });

        btnAllManufacturers.setBackground(new java.awt.Color(153, 204, 255));
        btnAllManufacturers.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAllManufacturers.setText("All Car Manufacturers");
        btnAllManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllManufacturersActionPerformed(evt);
            }
        });

        btnCatalogUpdate.setBackground(new java.awt.Color(153, 204, 255));
        btnCatalogUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCatalogUpdate.setText("Catalog Update Time");
        btnCatalogUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogUpdateActionPerformed(evt);
            }
        });

        btnCertificate.setBackground(new java.awt.Color(153, 204, 255));
        btnCertificate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCertificate.setText("Maintenance Certificate");
        btnCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificateActionPerformed(evt);
            }
        });

        labelBrand.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelBrand.setText("Car Brand:");

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

        btnBrand.setBackground(new java.awt.Color(153, 204, 255));
        btnBrand.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBrand.setText("GO!");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        labelYear.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelYear.setText("Manufacturing Year:");

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

        btnYear.setBackground(new java.awt.Color(153, 204, 255));
        btnYear.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnYear.setText("GO!");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        labelSeats.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelSeats.setText("No. of Seats:");

        textSeatsMin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textSeatsMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textSeatsMin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSeatsMinFocusLost(evt);
            }
        });
        textSeatsMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSeatsMinActionPerformed(evt);
            }
        });

        labelTo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelTo.setText("to");

        textSeatsMax.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        textSeatsMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        textSeatsMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSeatsMaxFocusLost(evt);
            }
        });
        textSeatsMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSeatsMaxActionPerformed(evt);
            }
        });

        btnSeats.setBackground(new java.awt.Color(153, 204, 255));
        btnSeats.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSeats.setText("GO!");
        btnSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatsActionPerformed(evt);
            }
        });

        labelSerial.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelSerial.setText("Serial Number:");

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

        btnSerial.setBackground(new java.awt.Color(153, 204, 255));
        btnSerial.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSerial.setText("GO!");
        btnSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialActionPerformed(evt);
            }
        });

        labelCity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelCity.setText("City:");

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

        btnCity.setBackground(new java.awt.Color(153, 204, 255));
        btnCity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCity.setText("GO!");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFirstAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBrand)
                            .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelBrand))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelErr1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(labelYear))
                                    .addComponent(btnYear)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(labelErr2)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAllManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSeats)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(labelErr3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSeats)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textSeatsMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelTo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textSeatsMax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCatalogUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelSerial))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelErr4))
                            .addComponent(btnSerial))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelErr5))
                            .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelCity))
                            .addComponent(btnCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCity))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirstAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatalogUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAllManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(labelErr5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCity))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelErr1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelErr2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelYear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBrand)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnYear)
                                .addComponent(btnSeats))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSeats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textSeatsMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTo)
                                    .addComponent(textSeatsMax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelErr3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelErr4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSerial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSerial)))
                .addGap(144, 144, 144)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(labelTitle)
                    .addContainerGap(823, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableActionPerformed
        // TODO add your handling code here:
        int countYes = 0, countNo = 0;
        for(Car car : history.getHistory()) {
            if(car.getAvailability().equals("Yes")) {
                searchHistory.add(car);
                countYes++;
            } else {
                countNo++;
            }
        }
        
        populateTable();
        JOptionPane.showMessageDialog(this, "Cars currently available are " + countYes + "\nCars currently unavailable are " + countNo);  
    }//GEN-LAST:event_btnAvailableActionPerformed

    private void btnFirstAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableActionPerformed
        // TODO add your handling code here:
        
        int min = history.getHistory().get(0).getAvailableIn();
        String brand = history.getHistory().get(0).getBrand();
        String model = history.getHistory().get(0).getModelName();
        
        for (int i=0; i<history.getHistory().size(); i++) {
            if(history.getHistory().get(i).getAvailableIn() < min) {
                brand = history.getHistory().get(i).getBrand();
                model = history.getHistory().get(i).getModelName();
                min = history.getHistory().get(i).getAvailableIn();
            }
        }
        
        JOptionPane.showMessageDialog(this, "The first available car is " + brand + " " + model + " and is " + min + " minutes away");
    }//GEN-LAST:event_btnFirstAvailableActionPerformed

    private void btnCatalogUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogUpdateActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "The last updated catalog time: " + history.timeStamp);
    }//GEN-LAST:event_btnCatalogUpdateActionPerformed

    private void btnAllManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllManufacturersActionPerformed
        // TODO add your handling code here:
        ArrayList<String> tempList = new ArrayList<String>();
       
        for (Car car : history.getHistory()) {
            tempList.add(car.getBrand());
        }
        
        tempList = (ArrayList<String>) tempList.stream().distinct().collect(Collectors.toList());
        
        String msg = "List of all Car Manufacturers: \n";
        for (int i=0; i<tempList.size(); i++) {
            msg += tempList.get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(this, msg);
        
        tempList.clear();
    }//GEN-LAST:event_btnAllManufacturersActionPerformed

    private void btnCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificateActionPerformed
        // TODO add your handling code here:
        for(Car car : history.getHistory()) {
            if(car.getCertificate().equals("Yes")) {
                searchHistory.add(car);
            }
        }
        
        populateTable();
    }//GEN-LAST:event_btnCertificateActionPerformed

    private void textBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrandActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        // TODO add your handling code here:
        String brand = textBrand.getText();
        for(Car car : history.getHistory()) {
            if(car.getBrand().equalsIgnoreCase(brand)) {
                searchHistory.add(car);
            }
        }
        
        populateTable();
        textBrand.setText("");
    }//GEN-LAST:event_btnBrandActionPerformed

    private void textYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYearActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
        // TODO add your handling code here:
        int year = Integer.parseInt(textYear.getText());
        for(Car car : history.getHistory()) {
            if(car.getYear() == year) {
                searchHistory.add(car);
            }
        }
        
        populateTable();
        textYear.setText("");
    }//GEN-LAST:event_btnYearActionPerformed

    private void textSeatsMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSeatsMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSeatsMinActionPerformed

    private void btnSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatsActionPerformed
        // TODO add your handling code here:
        int min = Integer.parseInt(textSeatsMin.getText());
        int max = Integer.parseInt(textSeatsMax.getText());
        for(Car car : history.getHistory()) {
            if(car.getSeats() >= min && car.getSeats() <= max) {
                searchHistory.add(car);
            }
        }
        
        populateTable();
        textSeatsMin.setText("");
        textSeatsMax.setText("");
    }//GEN-LAST:event_btnSeatsActionPerformed

    private void textSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSerialActionPerformed

    private void btnSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialActionPerformed
        // TODO add your handling code here:
        String serial = textSerial.getText();
        for(Car car : history.getHistory()) {
            if(car.getSerialNumber().equalsIgnoreCase(serial)) {
                searchHistory.add(car);
            }
        }
        
        populateTable();
        textSerial.setText("");
    }//GEN-LAST:event_btnSerialActionPerformed

    private void textCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCityActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        // TODO add your handling code here:
        String city = textCity.getText();
        for(Car car : history.getHistory()) {
            if(car.getCity().equalsIgnoreCase(city)) {
                searchHistory.add(car);
            }
        }
        
        populateTable();
        textCity.setText("");
    }//GEN-LAST:event_btnCityActionPerformed

    private void textSeatsMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSeatsMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSeatsMaxActionPerformed

    private void textYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textYearFocusLost
        // TODO add your handling code here:
        validateYear(textYear);
    }//GEN-LAST:event_textYearFocusLost

    private void textSeatsMinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSeatsMinFocusLost
        // TODO add your handling code here:
        validateSeats(textSeatsMin);
    }//GEN-LAST:event_textSeatsMinFocusLost

    private void textSeatsMaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSeatsMaxFocusLost
        // TODO add your handling code here:
        validateSeats(textSeatsMax);
    }//GEN-LAST:event_textSeatsMaxFocusLost

    private void textBrandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textBrandFocusLost
        // TODO add your handling code here:
        validateLength(textBrand, labelErr1, "Brand");
    }//GEN-LAST:event_textBrandFocusLost

    private void textSerialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSerialFocusLost
        // TODO add your handling code here:
        validateLength(textBrand, labelErr4, "Serial Number");
    }//GEN-LAST:event_textSerialFocusLost

    private void textCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCityFocusLost
        // TODO add your handling code here:
        validateLength(textCity, labelErr5, "City");
    }//GEN-LAST:event_textCityFocusLost

    private void validateLength(JTextField textField, JLabel label, String msg) {
        if(textField.getText().isBlank()) {
            label.setText("Enter Valid " + msg);
        } else {
            label.setText("");
        }
    }
    
    private void validateSeats(JTextField textField) {
        if(!textField.getText().matches("[1-9]")) {
            labelErr3.setText("Enter Valid Number between 1 to 9");
        } else {
            labelErr3.setText("");
        }
    }
    
    private void validateYear(JTextField textField) {
        if(!textField.getText().matches("\\d{4}")) {
            labelErr2.setText("Enter Valid Year");
        } else {
            labelErr2.setText("");
        }
        
        if(Integer.parseInt(textField.getText())>2021) {
            labelErr2.setText("Year cannot be greater than 2021");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllManufacturers;
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCatalogUpdate;
    private javax.swing.JButton btnCertificate;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnFirstAvailable;
    private javax.swing.JButton btnSeats;
    private javax.swing.JButton btnSerial;
    private javax.swing.JButton btnYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelErr1;
    private javax.swing.JLabel labelErr2;
    private javax.swing.JLabel labelErr3;
    private javax.swing.JLabel labelErr4;
    private javax.swing.JLabel labelErr5;
    private javax.swing.JLabel labelSeats;
    private javax.swing.JLabel labelSerial;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTo;
    private javax.swing.JLabel labelYear;
    private javax.swing.JTable tableCars;
    private javax.swing.JTextField textBrand;
    private javax.swing.JTextField textCity;
    private javax.swing.JTextField textSeatsMax;
    private javax.swing.JTextField textSeatsMin;
    private javax.swing.JTextField textSerial;
    private javax.swing.JTextField textYear;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableCars.getModel();
        model.setRowCount(0);
        
        for(Car car : searchHistory) {
            
            Object[] row = new Object[9];
            row[0] = car;
            row[1] = car.getModelName();
            row[2] = car.getCity();
            row[3] = car.getAvailability();
            row[4] = car.getSeats();
            row[5] = car.getYear();
            row[6] = car.getSerialNumber();
            row[7] = car.getCertificate();
            row[8] = car.getAvailableIn();
            
            model.addRow(row);
        }
        
        searchHistory.clear();
    }
}
