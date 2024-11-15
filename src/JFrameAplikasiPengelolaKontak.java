/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author x
 */
public final class JFrameAplikasiPengelolaKontak extends javax.swing.JFrame {
    
    private List<Kontak> daftarKontak = new ArrayList<>();
    private Utilities utils;
    
    /**
     * Creates new form JFrameAplikasiPengelolaKontak
     */
    public JFrameAplikasiPengelolaKontak() {
        initComponents();
        
        this.utils = new Utilities(this);
        this.setLocationRelativeTo(null);
        
        Kontak.conn = SQLiteDatabase.connect();
        this.updateData();
        this.updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jListKontak = new javax.swing.JList<>();
        jTextFieldID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomor = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jButtonTambah = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxFilterKategori = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldCari = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemEkspor = new javax.swing.JMenuItem();
        jMenuItemImpor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jListKontak.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nomor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jLabel1, gridBagConstraints);

        jLabel3.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Kategori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jLabel4, gridBagConstraints);

        jTextFieldNomor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNomorFocusLost(evt);
            }
        });
        jTextFieldNomor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomorKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jTextFieldNomor, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jTextFieldNama, gridBagConstraints);

        jComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kerja" }));
        jComboBoxKategori.setSelectedIndex(-1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jComboBoxKategori, gridBagConstraints);

        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jButtonTambah, gridBagConstraints);

        jButtonEdit.setText("Edit");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jButtonEdit, gridBagConstraints);

        jButtonHapus.setText("Hapus");
        jButtonHapus.setEnabled(false);
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jButtonHapus, gridBagConstraints);

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel7.add(jButtonReset, gridBagConstraints);

        jPanel1.add(jPanel7, java.awt.BorderLayout.NORTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 160));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nomor", "Nama", "Kategori"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jLabel2.setText("Filter Kategori");
        jPanel4.add(jLabel2);

        jComboBoxFilterKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Keluarga", "Teman", "Kerja" }));
        jComboBoxFilterKategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFilterKategoriItemStateChanged(evt);
            }
        });
        jPanel4.add(jComboBoxFilterKategori);

        jPanel6.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jTextFieldCari.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel5.add(jTextFieldCari);

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonCari);

        jPanel6.add(jPanel5);

        jPanel1.add(jPanel6, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItemEkspor.setText("Ekspor data (CSV)");
        jMenuItemEkspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEksporActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEkspor);

        jMenuItemImpor.setText("Impor data (CSV)");
        jMenuItemImpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImporActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemImpor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Keluar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        var kontakOptional = this.getKontakFromInput();
        if (kontakOptional.isEmpty()) {
            return;
        }

        var kontak = kontakOptional.get();
        if (kontak.exists()) {
            utils.showErrorDialog("kontak dengan nomor %s sudah ada!".formatted(kontak.nomor));
        } else {
            kontak.insert();
        }

        this.reset();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        var kontakOptional = this.getKontakFromInput();
        if (kontakOptional.isEmpty()) {
            return;
        }
        
        var kontak = kontakOptional.get();
        kontak.delete();
        this.reset();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        var kontakOptional = this.getKontakFromInput();
        if (kontakOptional.isEmpty()) {
            return;
        }

        var kontak = kontakOptional.get();
        kontak.update();
        this.reset();
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.rowAtPoint(evt.getPoint());
        if (row < 0) {
            return;
        }

        var kontak = this.daftarKontak.get(row);
        jTextFieldID.setText(String.valueOf(kontak.id));
        jTextFieldNomor.setText(kontak.nomor);
        jTextFieldNama.setText(kontak.nama);
        jComboBoxKategori.setSelectedItem(kontak.kategori);

        jButtonTambah.setEnabled(false);
        jButtonEdit.setEnabled(true);
        jButtonHapus.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxFilterKategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFilterKategoriItemStateChanged
        this.updateTable();
    }//GEN-LAST:event_jComboBoxFilterKategoriItemStateChanged

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        this.reset();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        var search = jTextFieldCari.getText();
        if (search.isBlank()) {
            return;
        }

        this.updateData();
        this.daftarKontak = this.daftarKontak
                .stream()
                .filter(
                        kontak -> kontak.nomor.contains(search)
                        || kontak.nama.contains(search)
                )
                .collect(Collectors.toList());
        this.updateTable();
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jTextFieldNomorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomorKeyTyped
        if (utils.validasiInputHanyaAngka(evt)) {
        } else if (jTextFieldNomor.getText().length() == 13 && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            utils.showErrorDialog("panjang nomor tidak boleh lebih dari 13!");
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomorKeyTyped

    private void jTextFieldNomorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomorFocusLost
        var nomor = jTextFieldNomor.getText();
        if (!nomor.isEmpty() && nomor.length() < 10) {
            utils.showErrorDialog("panjang nomor terlalu pendek!");
            jTextFieldNomor.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldNomorFocusLost

    private void jMenuItemEksporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEksporActionPerformed
        var chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new FileNameExtensionFilter("CSV files", "csv"));
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            FileWriter writer = null;
            try {
                var file = chooser.getSelectedFile();
                var path = file.getPath();
                if (!path.endsWith(".csv")) {
                    path += ".csv";
                }

                writer = new FileWriter(path);
                writer.write("id,nomor,nama,kategori\n");
                var data = Kontak.getAll();
                for (var kontak : data) {
                    writer.write(String.join(",",
                            new String[]{
                                String.valueOf(kontak.id),
                                kontak.nomor,
                                kontak.nama,
                                kontak.kategori
                            }
                    ));
                    writer.write('\n');
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jMenuItemEksporActionPerformed

    private void jMenuItemImporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImporActionPerformed
        var chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileFilter(new FileNameExtensionFilter("CSV files", "csv"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                var data = new ArrayList<Kontak>();

                var file = chooser.getSelectedFile();
                var lines = Files.lines(file.toPath()).iterator();
                lines.next(); // skip header
                while (lines.hasNext()) {
                    var line = lines.next();
                    var split = line.split(",");
                    data.add(new Kontak(
                            Integer.valueOf(split[0]),
                            split[1], split[2], split[3]
                    ));
                }

                for (var kontak : data) {
                    if ((kontak.exists())) {
                        kontak.update();
                    } else {
                        kontak.insert();
                    }
                }

                this.reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jMenuItemImporActionPerformed

    void reset() {
        jButtonTambah.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonHapus.setEnabled(false);

        this.updateData();
        this.updateTable();
        utils.clearInput(new Object[]{
            jTextFieldID, jTextFieldNomor, jTextFieldNama, jComboBoxKategori
        });
    }

    void updateTable() {
        var model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for (var kontak : this.daftarKontak) {
            model.addRow(new String[]{kontak.nomor, kontak.nama, kontak.kategori});
        }
    }

    void updateData() {
        var filterKategori = (String) jComboBoxFilterKategori.getSelectedItem();
        this.daftarKontak = Kontak.getAll()
                .stream()
                .filter(
                        kontak -> filterKategori == null
                        || filterKategori.equals("Semua")
                        || filterKategori.equals(kontak.kategori))
                .collect(Collectors.toList());
    }

    Optional<Kontak> getKontakFromInput() {
        if (utils.validasiTidakKosong(jTextFieldNomor, "nomor")
                || utils.validasiTidakKosong(jTextFieldNama, "nama")
                || utils.validasiTidakNull(jComboBoxKategori, "kategori kontak")) {
            return Optional.empty();
        }

        var id = jTextFieldID.getText();
        return Optional.of(new Kontak(
                (id.isEmpty() ? null : Integer.valueOf(id)),
                jTextFieldNomor.getText(),
                jTextFieldNama.getText(),
                (String) jComboBoxKategori.getSelectedItem()
        ));
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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAplikasiPengelolaKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JComboBox<String> jComboBoxFilterKategori;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListKontak;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEkspor;
    private javax.swing.JMenuItem jMenuItemImpor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNomor;
    // End of variables declaration//GEN-END:variables
}
