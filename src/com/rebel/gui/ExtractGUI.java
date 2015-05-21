package com.rebel.gui;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

class CustomFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file){
    
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
    }
    
    @Override
    public String getDescription(){
    
        return "Text documents (*.txt)";
    }
}

public class ExtractGUI extends javax.swing.JFrame {

    public ExtractGUI() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/com/rebel/icon/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        fileSeparator = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        findItem = new javax.swing.JMenuItem();
        replaceItem = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        backgroundItem = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("C:\\"));
            fileChooser.setDialogTitle("Open Dialog");
            fileChooser.setFileFilter(new CustomFilter());

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Extract 1.0");
            setPreferredSize(new java.awt.Dimension(550, 400));

            textArea.setColumns(20);
            textArea.setLineWrap(true);
            textArea.setRows(5);
            textArea.setWrapStyleWord(true);
            jScrollPane.setViewportView(textArea);

            fileMenu.setText("File");

            fileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
            fileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/new.png"))); // NOI18N
            fileMenuItem.setText("New");
            fileMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fileMenuItemActionPerformed(evt);
                }
            });
            fileMenu.add(fileMenuItem);

            openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
            openItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/open.png"))); // NOI18N
            openItem.setText("Open");
            openItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    openItemActionPerformed(evt);
                }
            });
            fileMenu.add(openItem);

            saveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
            saveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/save.png"))); // NOI18N
            saveItem.setText("Save");
            saveItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    saveItemActionPerformed(evt);
                }
            });
            fileMenu.add(saveItem);
            fileMenu.add(fileSeparator);

            exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
            exitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/close.png"))); // NOI18N
            exitItem.setText("Exit");
            exitItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exitItemActionPerformed(evt);
                }
            });
            fileMenu.add(exitItem);

            menuBar.add(fileMenu);

            editMenu.setText("Edit");

            findItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
            findItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/find.png"))); // NOI18N
            findItem.setText("Find");
            findItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    findItemActionPerformed(evt);
                }
            });
            editMenu.add(findItem);

            replaceItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
            replaceItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/replace.png"))); // NOI18N
            replaceItem.setText("Replace");
            replaceItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    replaceItemActionPerformed(evt);
                }
            });
            editMenu.add(replaceItem);

            menuBar.add(editMenu);

            settingsMenu.setText("Settings");

            backgroundItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
            backgroundItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/background.png"))); // NOI18N
            backgroundItem.setText("Set Background");
            backgroundItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backgroundItemActionPerformed(evt);
                }
            });
            settingsMenu.add(backgroundItem);

            menuBar.add(settingsMenu);

            setJMenuBar(menuBar);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        
        int returnValue =  fileChooser.showOpenDialog(this);
        
        if(returnValue == JFileChooser.APPROVE_OPTION){
        
            File file = fileChooser.getSelectedFile();
            
            try{
                
                textArea.read(new FileReader(file.getAbsolutePath()),null);
                
            }
            catch(IOException ex){
                
                System.out.println("Problem finding file: " + file.getAbsolutePath());
            }
        }
        else{
        
            System.out.println("File Access canceled by user!");
        }
    }//GEN-LAST:event_openItemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        int returnValue = chooser.showSaveDialog(this);
        
        if(returnValue == JFileChooser.APPROVE_OPTION){
        
            try {
                
                PrintWriter pwriter = new PrintWriter(chooser.getSelectedFile());
                pwriter.print(textArea.getText());
                pwriter.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExtractGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveItemActionPerformed

    private void backgroundItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundItemActionPerformed
        
        Color color = JColorChooser.showDialog(null, "Please choose a color", Color.white);
        textArea.setBackground(color);
    }//GEN-LAST:event_backgroundItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void fileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuItemActionPerformed
        
        textArea.setText("");
    }//GEN-LAST:event_fileMenuItemActionPerformed

    private void findItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findItemActionPerformed
        
        String find = JOptionPane.showInputDialog("Find:");
        String text = textArea.getText();
        
        Highlighter highlighter = textArea.getHighlighter();
        HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.cyan);
        
        int p0 = text.indexOf(find);
        int p1 = p0 + find.length();
        
        try {
            highlighter.addHighlight(p0, p1, painter);
        } catch (BadLocationException ex) {
            Logger.getLogger(ExtractGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_findItemActionPerformed

    private void replaceItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceItemActionPerformed
        
        String find = JOptionPane.showInputDialog("Find:");
        String replace = JOptionPane.showInputDialog("Replace with:");
        int start = 0;
        boolean loop = true;
        
        while (loop) {
            int found = textArea.getText().indexOf(find, start)+1;
            if (found != -1) {
                textArea.setText(textArea.getText().replaceAll(find, replace));
                loop = false;
            }
            if (found == -1) {
                JOptionPane.showMessageDialog(null, "Not Found");
                break;
            }
            start = found + 2;
        }
    }//GEN-LAST:event_replaceItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem backgroundItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuItem;
    private javax.swing.JPopupMenu.Separator fileSeparator;
    private javax.swing.JMenuItem findItem;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem replaceItem;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
