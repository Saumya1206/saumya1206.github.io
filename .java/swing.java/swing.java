// //Saumya Kumari
// //E23CSEU0375
// // Java program to create a simple calculator 
// // with basic +, -, /, * using java swing elements 
 
// import java.awt.event.*; 
// import javax.swing.*; 
// import java.awt.*; 
// class calculator extends JFrame implements ActionListener { 
//     // create a frame 
//     static JFrame f; 
 
//     // create a textfield 
//     static JTextField l; 
 
//     // store operator and operands 
//     String s0, s1, s2; 
 
//     // default constructor 
//     calculator() 
//     { 
//         s0 = s1 = s2 = ""; 
//     } 
 
//     // main function 
//     public static void main(String args[]) 
//     { 
//         // create a frame 
//         f = new JFrame("calculator"); 
 
//         try { 
//             // set look and feel 
//             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
//         } 
//         catch (Exception e) { 
//             System.err.println(e.getMessage()); 
//         } 
 
//         // create a object of class 
//         calculator c = new calculator(); 
 
//         // create a textfield 
//         l = new JTextField(16); 
 
//         // set the textfield to non editable 
//         l.setEditable(false); 
 
//         // create number buttons and some operators 
//         JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 
 
//         // create number buttons 
//         b0 = new JButton("0"); 
//         b1 = new JButton("1"); 
//         b2 = new JButton("2"); 
//         b3 = new JButton("3"); 
//         b4 = new JButton("4"); 
//         b5 = new JButton("5"); 
//         b6 = new JButton("6"); 
//         b7 = new JButton("7"); 
//         b8 = new JButton("8"); 
//         b9 = new JButton("9"); 
 
//         // equals button 
//         beq1 = new JButton("="); 
 
//         // create operator buttons 
//         ba = new JButton("+"); 
//         bs = new JButton("-"); 
//         bd = new JButton("/"); 
//         bm = new JButton("*"); 
//         beq = new JButton("C"); 
 
//         // create . button 
//         be = new JButton("."); 
 
//         // create a panel 
//         JPanel p = new JPanel(); 
 
//         // add action listeners 
//         bm.addActionListener(c); 
//         bd.addActionListener(c); 
//         bs.addActionListener(c); 
//         ba.addActionListener(c); 
//         b9.addActionListener(c); 
//         b8.addActionListener(c); 
//         b7.addActionListener(c); 
//         b6.addActionListener(c); 
//         b5.addActionListener(c); 
//         b4.addActionListener(c); 
//         b3.addActionListener(c); 
//         b2.addActionListener(c); 
//         b1.addActionListener(c); 
//         b0.addActionListener(c); 
//         be.addActionListener(c); 
//         beq.addActionListener(c); 
//         beq1.addActionListener(c); 
 
//         // add elements to panel 
//         p.add(l); 
//         p.add(ba); 
//         p.add(b1); 
//         p.add(b2); 
//         p.add(b3); 
//         p.add(bs); 
//         p.add(b4); 
//         p.add(b5); 
//         p.add(b6); 
//         p.add(bm); 
//         p.add(b7); 
//         p.add(b8); 
//         p.add(b9); 
//         p.add(bd); 
//         p.add(be); 
//         p.add(b0); 
//         p.add(beq); 
//         p.add(beq1); 
 
//         // set Background of panel 
//         p.setBackground(Color.black); 
 
//         // add panel to frame 
//         f.add(p); 
 
//         f.setSize(200, 220); 
//         f.show(); 
//     } 
//     public void actionPerformed(ActionEvent e) 
//     { 
//         String s = e.getActionCommand(); 
 
//         // if the value is a number 
//         if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
//             // if operand is present then add to second no 
//             if (!s1.equals("")) 
//                 s2 = s2 + s; 
//             else 
//                 s0 = s0 + s; 
 
//             // set the value of text 
//             l.setText(s0 + s1 + s2); 
//         } 
//         else if (s.charAt(0) == 'C') { 
//             // clear the one letter 
//             s0 = s1 = s2 = ""; 
 
//             // set the value of text 
//             l.setText(s0 + s1 + s2); 
//         } 
//         else if (s.charAt(0) == '=') { 
 
//             double te; 
 
//             // store the value in 1st 
//             if (s1.equals("+")) 
//                 te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
//             else if (s1.equals("-")) 
//                 te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
//             else if (s1.equals("/")) 
//                 te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
//             else 
//                 te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
 
//             // set the value of text 
//             l.setText(s0 + s1 + s2 + "=" + te); 
 
//             // convert it to string 
//             s0 = Double.toString(te); 
 
//             s1 = s2 = ""; 
//         } 
//         else { 
//             // if there was no operand 
//             if (s1.equals("") || s2.equals("")) 
//                 s1 = s; 
//                 // else evaluate 
//             else { 
//                 double te; 
 
//                 // store the value in 1st 
//                 if (s1.equals("+")) 
//                     te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
//                 else if (s1.equals("-")) 
//                     te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
//                 else if (s1.equals("/")) 
//                     te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
//                 else 
//                     te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
 
//                 // convert it to string 
//                 s0 = Double.toString(te); 
 
//                 // place the operator 
//                 s1 = s; 
 
//                 // make the operand blank 
//                 s2 = ""; 
//             } 
 
//             // set the value of text 
//             l.setText(s0 + s1 + s2); 
//         } 
//     } 
// } 

// SAUMYA PATHAK E23CSEU0375
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;

// public class AddressBookManager extends JFrame {
//     private JTextField nameField;
//     private JTextField phoneNumberField;
//     private JTextField emailField;
//     private DefaultListModel<String> contactListModel;
//     private JList<String> contactList;

//     private ArrayList<Contact> contacts;

//     public AddressBookManager() {
//         setTitle("Address Book Manager");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(400, 300);
//         setLocationRelativeTo(null);

//         contacts = new ArrayList<>();
//         initComponents();
//     }

//     private void initComponents() {
//         JPanel mainPanel = new JPanel(new BorderLayout());

//         JPanel formPanel = new JPanel(new GridLayout(3, 2));
//         formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

//         JLabel nameLabel = new JLabel("Name:");
//         nameField = new JTextField();
//         JLabel phoneNumberLabel = new JLabel("Phone Number:");
//         phoneNumberField = new JTextField();
//         JLabel emailLabel = new JLabel("Email:");
//         emailField = new JTextField();

//         formPanel.add(nameLabel);
//         formPanel.add(nameField);
//         formPanel.add(phoneNumberLabel);
//         formPanel.add(phoneNumberField);
//         formPanel.add(emailLabel);
//         formPanel.add(emailField);

//         mainPanel.add(formPanel, BorderLayout.NORTH);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         JButton addButton = new JButton("Add Contact");
//         JButton deleteButton = new JButton("Delete Contact");

//         addButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 addContact();
//             }
//         });

//         deleteButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 deleteContact();
//             }
//         });

//         buttonPanel.add(addButton);
//         buttonPanel.add(deleteButton);

//         mainPanel.add(buttonPanel, BorderLayout.CENTER);

//         contactListModel = new DefaultListModel<>();
//         contactList = new JList<>(contactListModel);
//         JScrollPane scrollPane = new JScrollPane(contactList);
//         mainPanel.add(scrollPane, BorderLayout.SOUTH);

//         add(mainPanel);
//     }

//     private void addContact() {
//         String name = nameField.getText();
//         String phoneNumber = phoneNumberField.getText();
//         String email = emailField.getText();

//         Contact newContact = new Contact(name, phoneNumber, email);
//         contacts.add(newContact);
//         contactListModel.addElement(newContact.toString());

//         clearFields();
//     }

//     private void deleteContact() {
//         int selectedIndex = contactList.getSelectedIndex();
//         if (selectedIndex != -1) {
//             contacts.remove(selectedIndex);
//             contactListModel.remove(selectedIndex);
//         }
//     }

//     private void clearFields() {
//         nameField.setText("");
//         phoneNumberField.setText("");
//         emailField.setText("");
//     }

//     private static class Contact {
//         private String name;
//         private String phoneNumber;
//         private String email;

//         public Contact(String name, String phoneNumber, String email) {
//             this.name = name;
//             this.phoneNumber = phoneNumber;
//             this.email = email;
//         }

//         @Override
//         public String toString() {
//             return name + " | " + phoneNumber + " | " + email;
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new AddressBookManager().setVisible(true);
//             }
//         });
//     }
// }
 
// // SAUMYA PATHAK E23CSEU0375
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class tic_tac_toe implements ActionListener {
//     private JFrame frame;
//     private JPanel panel;
//     private JButton[] buttons = new JButton[9];
//     private boolean xTurn = true;

//     public tic_tac_toe() {
//         frame = new JFrame("Tic-Tac-Toe");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         panel = new JPanel();
//         panel.setLayout(new GridLayout(3, 3));
//         panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

//         for (int i = 0; i < 9; i++) {
//             buttons[i] = new JButton();
//             buttons[i].setFont(new Font("Arial", Font.PLAIN, 40));
//             buttons[i].addActionListener(this);
//             panel.add(buttons[i]);
//         }

//         frame.add(panel, BorderLayout.CENTER);
//         frame.setSize(400, 400);
//         frame.setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         JButton button = (JButton) e.getSource();
//         if (xTurn) {
//             button.setText("X");
//         } else {
//             button.setText("O");
//         }
//         button.setEnabled(false);
//         xTurn = !xTurn;

//         checkForWinner();
//     }

//     public void checkForWinner() {
//         // Check rows
//         for (int i = 0; i < 9; i += 3) {
//             if (buttons[i].getText().equals(buttons[i+1].getText()) && buttons[i].getText().equals(buttons[i+2].getText()) && !buttons[i].isEnabled()) {
//                 JOptionPane.showMessageDialog(frame, buttons[i].getText() + " wins!");
//                 resetGame();
//                 return;
//             }
//         }

//         // Check columns
//         for (int i = 0; i < 3; i++) {
//             if (buttons[i].getText().equals(buttons[i+3].getText()) && buttons[i].getText().equals(buttons[i+6].getText()) && !buttons[i].isEnabled()) {
//                 JOptionPane.showMessageDialog(frame, buttons[i].getText() + " wins!");
//                 resetGame();
//                 return;
//             }
//         }

//         // Check diagonals
//         if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText()) && !buttons[0].isEnabled()) {
//             JOptionPane.showMessageDialog(frame, buttons[0].getText() + " wins!");
//             resetGame();
//             return;
//         }
//         if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText()) && !buttons[2].isEnabled()) {
//             JOptionPane.showMessageDialog(frame, buttons[2].getText() + " wins!");
//             resetGame();
//             return;
//         }

//         // Check for tie
//         boolean tie = true;
//         for (int i = 0; i < 9; i++) {
//             if (buttons[i].isEnabled()) {
//                 tie = false;
//                 break;
//             }
//         }
//         if (tie) {
//             JOptionPane.showMessageDialog(frame, "Tie game!");
//             resetGame();
//         }
//     }

//     public void resetGame() {
//         for (int i = 0; i < 9; i++) {
//             buttons[i].setText("");
//             buttons[i].setEnabled(true);
//         }
//         xTurn = true;
//     }

//     public static void main(String[] args) {
//         new tic_tac_toe();
//     }
// }

 
// SAUMYA PATHAK E23CSEU0375
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;

// public class TodoListApp extends JFrame {
//     private JTextField taskField;
//     private DefaultListModel<String> todoListModel;
//     private JList<String> todoList;

//     public TodoListApp() {
//         setTitle("To-Do List");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(400, 300);
//         setLocationRelativeTo(null);

//         initComponents();
//     }

//     private void initComponents() {
//         JPanel mainPanel = new JPanel(new BorderLayout());

//         JPanel inputPanel = new JPanel(new BorderLayout());
//         taskField = new JTextField();
//         JButton addButton = new JButton("Add Task");

//         addButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 addTask();
//             }
//         });

//         inputPanel.add(taskField, BorderLayout.CENTER);
//         inputPanel.add(addButton, BorderLayout.EAST);

//         mainPanel.add(inputPanel, BorderLayout.NORTH);

//         todoListModel = new DefaultListModel<>();
//         todoList = new JList<>(todoListModel);
//         todoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//         JScrollPane scrollPane = new JScrollPane(todoList);

//         todoList.addMouseListener(new java.awt.event.MouseAdapter() {
//             public void mouseClicked(java.awt.event.MouseEvent evt) {
//                 JList<?> list = (JList<?>) evt.getSource();
//                 if (evt.getClickCount() == 2) {
//                     int index = list.locationToIndex(evt.getPoint());
//                     markTaskAsCompleted(index);
//                 }
//             }
//         });

//         mainPanel.add(scrollPane, BorderLayout.CENTER);

//         JButton removeButton = new JButton("Remove Selected Task");
//         removeButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 removeSelectedTask();
//             }
//         });
//         mainPanel.add(removeButton, BorderLayout.SOUTH);

//         add(mainPanel);
//     }

//     private void addTask() {
//         String task = taskField.getText().trim();
//         if (!task.isEmpty()) {
//             todoListModel.addElement(task);
//             taskField.setText("");
//         }
//     }

//     private void markTaskAsCompleted(int index) {
//         if (index >= 0 && index < todoListModel.size()) {
//             String task = todoListModel.getElementAt(index);
//             todoListModel.removeElementAt(index);
//             todoListModel.addElement("[Completed] " + task);
//         }
//     }

//     private void removeSelectedTask() {
//         int selectedIndex = todoList.getSelectedIndex();
//         if (selectedIndex != -1) {
//             todoListModel.remove(selectedIndex);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new TodoListApp().setVisible(true);
//             }
//         });
//     }
// }
 

 

 

 

