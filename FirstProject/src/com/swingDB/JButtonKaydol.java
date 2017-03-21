package com.swingDB;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JButtonKaydol extends JButton{

	public JButtonKaydol(JTextField jTextField1, JTextField jTextField2, JPanel jPanel, CardLayout cardLayout) {
		this.setText("Kaydol");
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("kaydol");
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					Connection connection = DriverManager.getConnection(ConDB.dbConnection(),ConDB.USERNAME.getValue(), 
							ConDB.PASSWORD.getValue());
					Statement statement = connection.createStatement();
					String sql = "insert into ev.kisi (username,password) values ('"+jTextField1.getText() +"','"+jTextField2.getText()+"')";

					if(!statement.execute(sql));
					System.out.println("eklendi");
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				
				
				cardLayout.show(jPanel, "gir");
			}
		});
	
	}
}
