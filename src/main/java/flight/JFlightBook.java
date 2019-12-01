package flight;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class JFlightBook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFlightBook frame = new JFlightBook();
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
	public JFlightBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingPage = new JLabel("Booking Page");
		lblBookingPage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblBookingPage.setBounds(225, 6, 139, 31);
		contentPane.add(lblBookingPage);
		
		JLabel lblFlightname = new JLabel("FlightName :");
		lblFlightname.setBounds(20, 49, 88, 16);
		contentPane.add(lblFlightname);
		
		JLabel lblNewLabel = new JLabel("SetFlightName");
		lblNewLabel.setBounds(136, 49, 119, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblFlightid = new JLabel("FlightId :");
		lblFlightid.setBounds(20, 82, 88, 16);
		contentPane.add(lblFlightid);
		
		JLabel lblSetflightid = new JLabel("SetFlightId");
		lblSetflightid.setBounds(136, 82, 119, 16);
		contentPane.add(lblSetflightid);
		
		JLabel lblSource = new JLabel("Source :");
		lblSource.setBounds(292, 49, 88, 16);
		contentPane.add(lblSource);
		
		JLabel lblSetsource = new JLabel("SetSource");
		lblSetsource.setBounds(408, 49, 119, 16);
		contentPane.add(lblSetsource);
		
		JLabel lblDestination = new JLabel("Destination :");
		lblDestination.setBounds(292, 77, 88, 16);
		contentPane.add(lblDestination);
		
		JLabel lblSetdestination = new JLabel("SetDestination");
		lblSetdestination.setBounds(408, 77, 119, 16);
		contentPane.add(lblSetdestination);
		
		JLabel lblSelectSeatType = new JLabel("Select Seat Type");
		lblSelectSeatType.setBounds(20, 133, 145, 27);
		contentPane.add(lblSelectSeatType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Select Seat-", "United First", "Economy Plus", "Economy"}));
		comboBox.setBounds(20, 170, 145, 21);
		contentPane.add(comboBox);
		
		JLabel lblSelectSeatNumber = new JLabel("Select Seat Number");
		lblSelectSeatNumber.setBounds(20, 214, 145, 27);
		contentPane.add(lblSelectSeatNumber);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Seat Number-"}));
		comboBox_1.setBounds(20, 251, 152, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblSelectMealType = new JLabel("Select Meal Type");
		lblSelectMealType.setBounds(20, 284, 145, 27);
		contentPane.add(lblSelectMealType);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-Select Meal-", "Standard", "Vegetarian", "Vegan"}));
		comboBox_2.setBounds(20, 321, 145, 21);
		contentPane.add(comboBox_2);
		
		JLabel lblTotalCost = new JLabel("Total Cost : ");
		lblTotalCost.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblTotalCost.setBounds(301, 355, 77, 31);
		contentPane.add(lblTotalCost);
		
		JLabel lblNewLabel_1 = new JLabel("SetCost");
		lblNewLabel_1.setBounds(408, 359, 101, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(311, 408, 117, 29);
		contentPane.add(btnCheckout);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(440, 408, 117, 29);
		contentPane.add(btnCancel);
	}
}
