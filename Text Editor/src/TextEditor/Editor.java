/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TextEditor;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author umeshsahijwani
 */
public class Editor extends javax.swing.JFrame {

    private static JTextArea area;
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        setTitle("Text Editor");
        this.setLocation(300, 200);
        //setBackground(RED);
        getContentPane().setBackground(new java.awt.Color(204,204,255));
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Theme = new javax.swing.JMenu();
        Light = new javax.swing.JMenuItem();
        Dark = new javax.swing.JMenuItem();
        Cyan = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        File.setText("File");

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        MenuBar.add(File);

        Edit.setText("Edit");

        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        Cut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CutKeyPressed(evt);
            }
        });
        Edit.add(Cut);

        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Copy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CopyKeyPressed(evt);
            }
        });
        Edit.add(Copy);

        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        Paste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasteKeyPressed(evt);
            }
        });
        Edit.add(Paste);

        MenuBar.add(Edit);

        Theme.setText("Theme");

        Light.setText("Light");
        Light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LightActionPerformed(evt);
            }
        });
        Theme.add(Light);

        Dark.setText("Dark");
        Dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkActionPerformed(evt);
            }
        });
        Theme.add(Dark);

        Cyan.setText("Cyan");
        Cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CyanActionPerformed(evt);
            }
        });
        Theme.add(Cyan);

        MenuBar.add(Theme);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // this is the code for file menu
    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
        TextArea.setText("");
    }//GEN-LAST:event_NewActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();

                // Show the dialog and get the user's choice
                int option = fileChooser.showOpenDialog(area);

                if (option == JFileChooser.APPROVE_OPTION) {
                    // User clicked the Open button
                    File selectedFile = fileChooser.getSelectedFile();

                    // Perform open operation with the selected file
                     try {
                        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                        StringBuilder content = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                        reader.close();
                        TextArea.setText(content.toString());
                    } catch (IOException ex) {                    }
                    // ...
                } else if (option == JFileChooser.CANCEL_OPTION) {
                    // User clicked the Cancel button or closed the dialog
                    // ...
                }
    }//GEN-LAST:event_OpenActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

                // Show the dialog and get the user's choice
                int option = fileChooser.showSaveDialog(area);

                if (option == JFileChooser.APPROVE_OPTION) {
                    // User clicked the Save button
                    File fileToSave = fileChooser.getSelectedFile();

                    // Perform save operation with the selected file
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave));
                        writer.write(TextArea.getText());
                        writer.close();
                    } catch (IOException ex) {                }
                    // ...
                } else if (option == JFileChooser.CANCEL_OPTION) {
                    // User clicked the Cancel button or closed the dialog
                    // ...
                }
    }//GEN-LAST:event_SaveActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_ExitActionPerformed

    // this is the code for the edit menu
    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        // TODO add your handling code here:
        String selectedText = TextArea.getSelectedText();
                StringSelection selection = new StringSelection(selectedText);
                clipboard.setContents(selection, null);
                TextArea.replaceSelection("");
    }//GEN-LAST:event_CutActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        // TODO add your handling code here:
        String selectedText = TextArea.getSelectedText();
                StringSelection selection = new StringSelection(selectedText);
                clipboard.setContents(selection, null);
    }//GEN-LAST:event_CopyActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        // TODO add your handling code here:
        Transferable clipboardContents = clipboard.getContents(null);
                if (clipboardContents != null && clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    try {
                        String clipboardText = (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
                        TextArea.replaceSelection(clipboardText);
                    } catch (UnsupportedFlavorException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
    }//GEN-LAST:event_PasteActionPerformed

    private void LightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LightActionPerformed
        // TODO add your handling code here:
        TextArea.setBackground(WHITE);
        this.setBackground(Color.WHITE);
        MenuBar.setBackground(Color.WHITE);
        

    }//GEN-LAST:event_LightActionPerformed

    private void DarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkActionPerformed
        // TODO add your handling code here:
        Color bgw = new Color(211,211,211);
        TextArea.setBackground(bgw);
        this.setBackground(new Color(211,211,211));
        MenuBar.setBackground(new Color(211,211,211));

    }//GEN-LAST:event_DarkActionPerformed

    private void CyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CyanActionPerformed
        // TODO add your handling code here:
        MenuBar.setBackground(Color.cyan);
        TextArea.setBackground(new Color(224, 255, 255));
        this.setBackground(Color.cyan);
    }//GEN-LAST:event_CyanActionPerformed

    private void CutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CutKeyPressed
        // TODO add your handling code here:
        String selectedText = TextArea.getSelectedText();
                StringSelection selection = new StringSelection(selectedText);
                clipboard.setContents(selection, null);
                TextArea.replaceSelection("");
    }//GEN-LAST:event_CutKeyPressed

    private void CopyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CopyKeyPressed
        // TODO add your handling code here:
        String selectedText = TextArea.getSelectedText();
                StringSelection selection = new StringSelection(selectedText);
                clipboard.setContents(selection, null);
    }//GEN-LAST:event_CopyKeyPressed

    private void PasteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasteKeyPressed
        // TODO add your handling code here:
        Transferable clipboardContents = clipboard.getContents(null);
                if (clipboardContents != null && clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    try {
                        String clipboardText = (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
                        TextArea.replaceSelection(clipboardText);
                    } catch (UnsupportedFlavorException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
    }//GEN-LAST:event_PasteKeyPressed

    
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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Editor editor = new Editor();
                editor.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Cyan;
    private javax.swing.JMenuItem Dark;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem Light;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenu Theme;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
