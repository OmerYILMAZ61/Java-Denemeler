package com.swingDB;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JButtonGiris extends JButton {

	JTextField jTextField1;
	JTextField jTextField2;
	CardLayout cardLayout;
	JPanel jPanel;
	
	public JButtonGiris(CardLayout cardLayout, JPanel jPanel, JTextField jTextField1, JTextField jTextField2) {
		this.cardLayout=cardLayout;
		this.jPanel=jPanel;
		this.jTextField1 = jTextField1;
		this.jTextField2 = jTextField2;
		jButtonGirisAksiyon();

	}

	public void jButtonGirisAksiyon() {
		this.setText("Giriþ");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("giris");
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					Connection connection = DriverManager.getConnection(ConDB.dbConnection(), ConDB.USERNAME.getValue(),
							ConDB.PASSWORD.getValue());
					Statement statement = connection.createStatement();
					
					String sql = "select * from ev.kisi";
					
					ResultSet rs = statement.executeQuery(sql);
					
					while(rs.next()){
						System.out.println("asdas");
						if(jTextField1.getText().equals(rs.getString("username"))&&jTextField2.getText().equals(rs.getString("password"))){
							cardLayout.show(jPanel, "sayfa");
							System.out.println("giriþ basarýlý");
						}
					}
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});
	}

}
