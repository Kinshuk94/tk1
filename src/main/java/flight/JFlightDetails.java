package flight;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class JFlightDetails extends javax.swing.JFrame {

	private JPanel contentPane;
	private static JTable table;
	   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFlightDetails frame = new JFlightDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFlightDetails() {
		setDefaultCloseOperation(JFlightDetails.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Select Date for Flight");
		label.setBounds(5, 5, 440, 16);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Select Date-", "02-12-2019", "03-12-2019", "04-12-2019", "05-12-2019", "06-12-2019", "07-12-2019", "08-12-2019"}));
		comboBox.setBounds(154, 33, 147, 27);
		contentPane.add(comboBox);
		
		 
        String[] columnNames = { "FlightName","FlightID","Source","Destination", "Time"};
        

        DefaultTableModel tableModel = new DefaultTableModel(null, columnNames) {

            @Override
            public boolean isCellEditable(int row, int column) {
                // all cells false
                return false;
            }
        };
        contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 80, 450, 300);
        contentPane.add(scrollPane);
      
        table = new JTable();
        table.setModel(tableModel);
        table.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 12));
        table.getTableHeader().setPreferredSize(new Dimension(100, 40));
        table.setFont(new Font("Consolas", Font.PLAIN, 16));
        table.setRowHeight(30);

        scrollPane.setColumnHeaderView(table);
       
        scrollPane.setViewportView(table);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(328, 392, 117, 29);
        contentPane.add(btnSubmit);

	}
}
