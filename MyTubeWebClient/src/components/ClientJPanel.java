/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */
package components;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import mytube.VideoFile;

/**
 *
 * @author Rodrigo Nascimento de Carvalho 380067
 * @author Philippe Cesar Ramos 380415
 */
public class ClientJPanel extends javax.swing.JPanel {
    private File uploadFile;
    private File downloadFile;
    private String videoId;
    
    public static void main(String args[]){
        JFrame frame = new JFrame("MyTubeClient");
        frame.add(new ClientJPanel());
        frame.setSize(800, 500);        
        frame.setVisible(true);

    }

    
    /**
     * Creates new form ClientJPanel
     */
    public ClientJPanel() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VideoDescriptionArea = new javax.swing.JTextArea();
        UploadButton = new javax.swing.JButton();
        UploadPathTextField = new javax.swing.JTextField();
        BrowseVideoButton = new javax.swing.JButton();
        UploadProgressLabel = new javax.swing.JLabel();
        UploadProgressLabel.setVisible(false);
        UploadProgressBar = new javax.swing.JProgressBar();
        UploadProgressBar.setVisible(false);
        UploadProgressBar.setIndeterminate(true);
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        VideoIDField = new javax.swing.JTextField();
        DownloadVideoButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        DownloadPathTextField = new javax.swing.JTextField();
        BrowseFilesButton = new javax.swing.JButton();
        DownloadingLabel = new javax.swing.JLabel();
        DownloadProgressBar = new javax.swing.JProgressBar();

        jTabbedPane1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setText("Description:");

        jLabel2.setText("File:");

        VideoDescriptionArea.setColumns(20);
        VideoDescriptionArea.setRows(5);
        jScrollPane1.setViewportView(VideoDescriptionArea);

        UploadButton.setText("Upload Video");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        UploadPathTextField.setText("Path To File...");
        UploadPathTextField.setEnabled(false);
        UploadPathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPathTextFieldActionPerformed(evt);
            }
        });

        BrowseVideoButton.setText("Browse Video...");
        BrowseVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseVideoButtonActionPerformed(evt);
            }
        });

        UploadProgressLabel.setText("Uploading File...");

        UploadProgressBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UploadPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BrowseVideoButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(UploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UploadProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                                .addComponent(UploadProgressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseVideoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(UploadProgressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UploadProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(UploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Upload Video", jPanel1);

        jLabel4.setText("Video ID:");

        VideoIDField.setText("Insert Video ID to Download Video...");

        DownloadVideoButton.setText("Download Video");
        DownloadVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadVideoButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Save File To Path:");

        DownloadPathTextField.setText("File Path...");
        DownloadPathTextField.setEnabled(false);

        BrowseFilesButton.setText("Browse Files...");
        BrowseFilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseFilesButtonActionPerformed(evt);
            }
        });

        DownloadingLabel.setText("Downloading Video...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VideoIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                            .addComponent(DownloadPathTextField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BrowseFilesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DownloadVideoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DownloadProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                            .addComponent(DownloadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VideoIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DownloadPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseFilesButton))
                .addGap(71, 71, 71)
                .addComponent(DownloadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DownloadProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(DownloadVideoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DownloadingLabel.setVisible(false);
        DownloadProgressBar.setVisible(false);
        DownloadProgressBar.setIndeterminate(true);

        jTabbedPane1.addTab("Download Video", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        Path path = Paths.get(uploadFile.getPath());
        byte[] data;
        try {
            data = Files.readAllBytes(path);
            
            //UploadProgressLabel.setVisible(true);
            //UploadProgressBar.setVisible(true);
            
            String id = uploadVideo(uploadFile.getName(), data, VideoDescriptionArea.getText());
            
            //UploadProgressLabel.setVisible(false);
            //UploadProgressBar.setVisible(false);
            
            JTextArea textarea= new JTextArea("Your video id: "+id);
            textarea.setEditable(true);
            
            JOptionPane.showMessageDialog(ClientJPanel.this,
                    textarea, 
                    "Upload Completed",
                    JOptionPane.INFORMATION_MESSAGE);
            
            this.videoId = id;
        } catch (IOException ex) {
            
        }
       
            
        //System.out.println(id);
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void UploadPathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadPathTextFieldActionPerformed

    private void BrowseVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseVideoButtonActionPerformed
        final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(ClientJPanel.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            uploadFile = file;
            UploadPathTextField.setText(file.getPath());
        }
    }//GEN-LAST:event_BrowseVideoButtonActionPerformed

    private void DownloadVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadVideoButtonActionPerformed
            //DownloadingLabel.setVisible(false);
            //DownloadProgressBar.setVisible(false);
            
            VideoFile f=null;
        try {
            f = downloadVideo(VideoIDField.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            //DownloadingLabel.setVisible(true);
            //DownloadProgressBar.setVisible(true);
            
            if(f != null){
                    try (FileOutputStream fos = new FileOutputStream(downloadFile.getPath()+"/"+f.getFilename())) {
                        fos.write(f.getData());
                    } catch (FileNotFoundException ex) {
                        //Logger.getLogger(ClientJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        //Logger.getLogger(ClientJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    JOptionPane.showMessageDialog(ClientJPanel.this,
                    "Filename: "+ f.getFilename() +"\nVideo Id: "+f.getId()+"\nVideo Description: "+f.getDescription()+"\n",
                    "Download Completed",
                    JOptionPane.INFORMATION_MESSAGE);
                    
            }else{
                JOptionPane.showMessageDialog(ClientJPanel.this,
                    "O video com a id especificada nao foi encontrado.\n",
                    "Download Error",
                    JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_DownloadVideoButtonActionPerformed

    private void BrowseFilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseFilesButtonActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(ClientJPanel.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            downloadFile = file;
            DownloadPathTextField.setText(file.getPath());
        }
    }//GEN-LAST:event_BrowseFilesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseFilesButton;
    private javax.swing.JButton BrowseVideoButton;
    private javax.swing.JTextField DownloadPathTextField;
    private javax.swing.JProgressBar DownloadProgressBar;
    private javax.swing.JButton DownloadVideoButton;
    private javax.swing.JLabel DownloadingLabel;
    private javax.swing.JButton UploadButton;
    private javax.swing.JTextField UploadPathTextField;
    private javax.swing.JProgressBar UploadProgressBar;
    private javax.swing.JLabel UploadProgressLabel;
    private javax.swing.JTextArea VideoDescriptionArea;
    private javax.swing.JTextField VideoIDField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private static String uploadVideo(java.lang.String filename, byte[] filedata, java.lang.String filedescription) throws MalformedURLException {
        URL myURL = new URL("http://192.168.11.1:4848/MyTubeFinal/MyTubeWS?wsdl");
        mytube.MyTubeWS_Service service = new mytube.MyTubeWS_Service(myURL);
        mytube.MyTubeWS port = service.getMyTubeWSPort();
        return port.uploadVideo(filename, filedata, filedescription);
    }

    private static VideoFile downloadVideo(java.lang.String id) throws MalformedURLException {
        
        URL myURL = new URL("http://192.168.11.1:4848/MyTubeFinal/MyTubeWS?wsdl");
        mytube.MyTubeWS_Service service = new mytube.MyTubeWS_Service(myURL);
        mytube.MyTubeWS port = service.getMyTubeWSPort();
        return port.downloadVideo(id);
    }
    
    

}
