package facebookUIone;

import java.awt.Color;
import facebook.Action.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class facebookApplication {

	private JFrame frmFacebookApplication;
	private JTextField urlHttps;
	private JComboBox selectOperation;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextField userName;
	private JPasswordField userPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facebookApplication window = new facebookApplication();
					window.frmFacebookApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public facebookApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFacebookApplication = new JFrame();
		frmFacebookApplication.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmFacebookApplication.setResizable(false);
		frmFacebookApplication.getContentPane().setBackground(new Color(0, 102, 255));
		frmFacebookApplication.setIconImage(Toolkit.getDefaultToolkit().getImage(facebookApplication.class.getResource("/photo/Facebook_Logo.png")));
		frmFacebookApplication.getContentPane().setForeground(Color.WHITE);
		frmFacebookApplication.setTitle("Facebook Application");
		frmFacebookApplication.setBounds(100, 100, 741, 384);
		frmFacebookApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFacebookApplication.getContentPane().setLayout(null);
		
		urlHttps = new JTextField();
		urlHttps.setBackground(Color.WHITE);
		urlHttps.setFont(new Font("Tahoma", Font.PLAIN, 20));
		urlHttps.setText("https://");
		urlHttps.setBounds(359, 42, 291, 41);
		frmFacebookApplication.getContentPane().add(urlHttps);
		urlHttps.setColumns(10);
		
		selectOperation = new JComboBox();
		selectOperation.setBackground(Color.WHITE);
		selectOperation.setModel(new DefaultComboBoxModel(new String[] {"Select", "Photo Like", "Photo Love", "Photo Care", "Photo Haha", "Photo Wow", "Photo Sad", "Photo Angry", "Photo Comment", "Photo Share", "Photo Report", "Profile Report"}));
		selectOperation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		selectOperation.setBounds(359, 123, 291, 41);
		frmFacebookApplication.getContentPane().add(selectOperation);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
				if(selectOperation.getSelectedItem().equals("Photo Like")) {
					like.likeMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Liked Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Love")) {
					love.loveMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Loved Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Care")) {
					care.careMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Cared Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Haha")) {
					haha.hahaMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Haha Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Wow")) {
					wow.wowMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Wow Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Sad")) {
					sad.sadMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Sad Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Angry")) {
					angry.angryMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Angry Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Comment")) {
					comment.commentMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Commented Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Share")) {
					share.shareMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Shared Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Photo Report")) {
					photoReport.photoReportMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Item has been Reported Successfully");		
				}
				
				else if(selectOperation.getSelectedItem().equals("Block Profile")) {
					blockProfile.blockProfileMain(urlHttps.getText(),userName.getText(),userPassword.getText());
					textPane.setText("Profile has been blocked Successfully");		
				}
				
				else
					textPane_1.setText("Please select an operation");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(256, 207, 171, 41);
		frmFacebookApplication.getContentPane().add(btnNewButton);
		
		textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setBackground(new Color(0, 102, 255));
		textPane.setForeground(Color.GREEN);
		textPane.setBounds(134, 282, 457, 39);
		frmFacebookApplication.getContentPane().add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane_1.setForeground(Color.RED);
		textPane_1.setBackground(new Color(0, 102, 255));
		textPane_1.setBounds(161, 282, 373, 39);
		frmFacebookApplication.getContentPane().add(textPane_1);
		
		JTextPane txtpnPleaseEnterA = new JTextPane();
		txtpnPleaseEnterA.setForeground(Color.WHITE);
		txtpnPleaseEnterA.setBackground(new Color(0, 102, 255));
		txtpnPleaseEnterA.setEditable(false);
		txtpnPleaseEnterA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnPleaseEnterA.setText("Please Enter a valid Url");
		txtpnPleaseEnterA.setBounds(359, 11, 317, 20);
		frmFacebookApplication.getContentPane().add(txtpnPleaseEnterA);
		
		JTextPane txtpnPleaseSelectAn = new JTextPane();
		txtpnPleaseSelectAn.setForeground(Color.WHITE);
		txtpnPleaseSelectAn.setBackground(new Color(0, 102, 255));
		txtpnPleaseSelectAn.setEditable(false);
		txtpnPleaseSelectAn.setText("Please select an operation");
		txtpnPleaseSelectAn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnPleaseSelectAn.setBounds(359, 99, 317, 26);
		frmFacebookApplication.getContentPane().add(txtpnPleaseSelectAn);
		
		JTextPane txtpnFacebookUserName = new JTextPane();
		txtpnFacebookUserName.setForeground(Color.WHITE);
		txtpnFacebookUserName.setText("Facebook User Name");
		txtpnFacebookUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnFacebookUserName.setEditable(false);
		txtpnFacebookUserName.setBackground(new Color(0, 102, 255));
		txtpnFacebookUserName.setBounds(21, 11, 317, 20);
		frmFacebookApplication.getContentPane().add(txtpnFacebookUserName);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setForeground(Color.WHITE);
		txtpnPassword.setText("Password");
		txtpnPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnPassword.setEditable(false);
		txtpnPassword.setBackground(new Color(0, 102, 255));
		txtpnPassword.setBounds(21, 99, 317, 20);
		frmFacebookApplication.getContentPane().add(txtpnPassword);
		
		userName = new JTextField();
		userName.setBackground(Color.WHITE);
		userName.setForeground(Color.BLACK);
		userName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userName.setBounds(21, 42, 291, 41);
		frmFacebookApplication.getContentPane().add(userName);
		userName.setColumns(10);
		
		userPassword = new JPasswordField();
		userPassword.setBackground(Color.WHITE);
		userPassword.setForeground(Color.BLACK);
		userPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userPassword.setBounds(21, 123, 291, 41);
		frmFacebookApplication.getContentPane().add(userPassword);
	}
}
