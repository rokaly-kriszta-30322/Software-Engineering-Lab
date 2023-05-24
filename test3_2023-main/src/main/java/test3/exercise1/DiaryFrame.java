package test3.exercise1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class DiaryFrame extends JFrame {

    private JTextField UserName;
    private JTextArea txtContent;
    private JButton btnLogin;
    private JButton btnSave;
    private SaveThread saveThread;

    public DiaryFrame() throws IOException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(235, 204, 454, 520);
        this.setLayout(null);

        UserName = new JTextField();
        UserName.setBounds(10, 25, 200, 50);
        this.add(UserName);

        btnLogin = new JButton("Load");
        btnLogin.setBounds(301,34, 95, 44);
        this.add(btnLogin);

        txtContent = new JTextArea(10, 99);
        txtContent.setLineWrap(true);
        txtContent.setBounds(23,110, 208, 301);
        this.add(txtContent);

        btnSave = new JButton("Save");
        btnSave.setBounds(301,244, 95, 44);
        this.add(btnSave);

        btnLogin.addActionListener((ActionEvent e) -> {
            btnLogin.setText("Loaded");
            String name = UserName.getText();
            if (!name.isEmpty()) {
                loadContent(name);
            } else {
                JOptionPane.showMessageDialog(null, "username not given");
            }
        });

        btnSave.addActionListener((ActionEvent e) -> {
            saveContent();
        });

        setVisible(true);

        saveThread = new SaveThread();

    }

    public void saveContent() {
        String content = txtContent.getText();
        String name = UserName.getText();
        String filename = name + ".txt";
        try (BufferedWriter w = new BufferedWriter(new FileWriter(filename, true))) {
            w.write(content);
            w.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void loadContent(String name) {
        String filename = name + ".txt";
        try (BufferedReader r = new BufferedReader(new FileReader(filename))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            txtContent.setText(content.toString());
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

}
