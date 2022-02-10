package Automatic_Door;

//public class chatbox {
	
	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	class Chatbox extends JFrame {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JTextArea ca= new JTextArea();
		private JTextField cf=new JTextField();                                  
		private JButton b=new JButton();
		private JLabel l=new JLabel();
		
		Chatbox(){                                                // Layout and Properties defined in Constructer                                         
			
			JFrame f=new JFrame();                                     
			f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
			f.setVisible(true);
			f.setResizable(false);
			f.setLayout(null);
			f.setSize(400,400);
			f.getContentPane().setBackground(Color.blue);
			f.setTitle("ChatBox");
			f.add(ca);
			f.add(cf);
			ca.setSize(300,310);
			ca.setLocation(1, 1);
			ca.setBackground(Color.white);
			cf.setSize(300,20);
			cf.setLocation(1,320);
			f.add(b);
			l.setText("SEND");
			b.add(l);
			b.setSize(400,20);
			b.setLocation(300,320);
			
			b.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					    
					if(e.getSource()==b) {                           
						
						String text=cf.getText().toLowerCase();
						ca.setForeground(Color.black);
						ca.append("You-->"+text+"\n");
						cf.setText("");
						
						if(text.contains("hi")) {                         
							replyMeth("Hi sir, how can i help you??");
						}
						else if(text.contains("Plz told me about your product..")) {
							replyMeth("Yes of course sir ");
						}
						else if(text.contains("Tell about price too")) {
							replyMeth("Visit our site please");
						}
						else if(text.contains("ok")) {
							replyMeth("Thank you sir, for knocking us.");
						}
						
						
						else 
							replyMeth("I Can't Understand");
						
					}
					
				}
				
			});
			
		}
		public void replyMeth(String s) {                          
			ca.append("ChatBox-->"+s+"\n");         
		}
				

	}



	public class ChatBoxDemo {                                     

		public static void main(String[] args) {             
			
	          new Chatbox();                                   
		}

	}




