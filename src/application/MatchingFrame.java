package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.*;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;

public class MatchingFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingFrame frame = new MatchingFrame();
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
	public MatchingFrame() {
		
		ArrayList<ImageIcon> cardset = new ArrayList<ImageIcon>(20);	//The prepared set of cards.
		ArrayList<ImageIcon> cards = new ArrayList<ImageIcon>(20);	//The randomized set of cards for each play.
/*
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Tart.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Cake.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Donut.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Croissant.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Pretzel.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Toaster Pastry.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Stroopwafel.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Cinnamon Roll.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Turnover.png")));
		cardset.add(new ImageIcon(MatchingFrame.class.getResource("/application/Eclair.png")));
	*/
		if(1<2){
			ArrayList <ImageIcon> temp = new ArrayList<ImageIcon>();
			for(int i=20;i>0;i--){
				temp.add(cardset.get((int)Math.ceil((i-1)/2)));
			}
				System.out.println(temp);
			for(int i=20;i>0;i--){
				int n = (int)(Math.floor(Math.random()*i));
				cards.add(temp.get(n));
				temp.remove(n);
			}
				System.out.println(cards);
		}
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MatchingFrame.class.getResource("/application/Pie.png")));
		setTitle("Pastry Matching");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Pastry Matching!");
		title.setForeground(Color.MAGENTA);
		title.setFont(new Font("Tahoma", Font.BOLD, 22));
		title.setBounds(155, 11, 192, 27);
		contentPane.add(title);
		
		JButton card1 = new JButton("");
		card1.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card1.setIcon(cards.get(0));
			}
		});
		card1.setBounds(10, 55, 110, 110);
		contentPane.add(card1);
		
		JButton card2 = new JButton("");
		card2.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card2.setIcon(cards.get(1));
			}
		});
		card2.setBounds(130, 55, 110, 110);
		contentPane.add(card2);
		
		JButton card3 = new JButton("");
		card3.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card3.setIcon(cards.get(2));
			}
		});
		card3.setBounds(250, 55, 110, 110);
		contentPane.add(card3);
		
		JButton card4 = new JButton("");
		card4.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card4.setIcon(cards.get(3));
			}
		});
		card4.setBounds(370, 55, 110, 110);
		contentPane.add(card4);
		
		JButton card5 = new JButton("");
		card5.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card5.setIcon(cards.get(4));
			}
		});		
		card5.setBounds(10, 176, 110, 110);
		contentPane.add(card5);
		
		JButton card6 = new JButton("");
		card6.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card6.setIcon(cards.get(5));
			}
		});
		card6.setBounds(130, 176, 110, 110);
		contentPane.add(card6);
		
		JButton card7 = new JButton("");
		card7.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card7.setIcon(cards.get(6));
			}
		});
		card7.setBounds(250, 176, 110, 110);
		contentPane.add(card7);
		
		JButton card8 = new JButton("");
		card8.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card8.setIcon(cards.get(7));
			}
		});
		card8.setBounds(370, 176, 110, 110);
		contentPane.add(card8);
		
		JButton card9 = new JButton("");
		card9.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card9.setIcon(cards.get(8));
			}
		});
		card9.setBounds(10, 297, 110, 110);
		contentPane.add(card9);
		
		JButton card10 = new JButton("");
		card10.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card10.setIcon(cards.get(9));
			}
		});
		card10.setBounds(130, 297, 110, 110);
		contentPane.add(card10);
		
		JButton card11 = new JButton("");
		card11.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card11.setIcon(cards.get(10));
			}
		});
		card11.setBounds(250, 297, 110, 110);
		contentPane.add(card11);
		
		JButton card12 = new JButton("");
		card12.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card12.setIcon(cards.get(11));
			}
		});
		card12.setBounds(370, 297, 110, 110);
		contentPane.add(card12);
		
		JButton card13 = new JButton("");
		card13.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card13.setIcon(cards.get(12));
			}
		});
		card13.setBounds(10, 418, 110, 110);
		contentPane.add(card13);
		
		JButton card14 = new JButton("");
		card14.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card14.setIcon(cards.get(13));
			}
		});
		card14.setBounds(130, 418, 110, 110);
		contentPane.add(card14);
		
		JButton card15 = new JButton("");
		card15.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card15.setIcon(cards.get(14));
			}
		});
		card15.setBounds(250, 418, 110, 110);
		contentPane.add(card15);
		
		JButton card16 = new JButton("");
		card16.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card16.setIcon(cards.get(15));
			}
		});
		card16.setBounds(370, 418, 110, 110);
		contentPane.add(card16);
		
		JButton card17 = new JButton("");
		card17.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card17.setIcon(cards.get(16));
			}
		});
		card17.setBounds(10, 539, 110, 110);
		contentPane.add(card17);
		
		JButton card18 = new JButton("");
		card18.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card18.setIcon(cards.get(17));
			}
		});
		card18.setBounds(130, 539, 110, 110);
		contentPane.add(card18);
		
		JButton card19 = new JButton("");
		card19.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card19.setIcon(cards.get(18));
			}
		});
		card19.setBounds(250, 539, 110, 110);
		contentPane.add(card19);
		
		JButton card20 = new JButton("");
		card20.setIcon(new ImageIcon(MatchingFrame.class.getResource("/application/Cardback.png")));
		card20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card20.setIcon(cards.get(19));
			}
		});
		card20.setBounds(370, 539, 110, 110);
		contentPane.add(card20);
		
		JButton btnRestart = new JButton("Restart"); /*
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList <Integer> temp = new ArrayList();
				for(int i=16;i>0;i--){
					temp.add();
				}
				for(int i=16;i>0;i--){
					int n = (int)(Math.floor(Math.random()*i));
					cards.add();
					temp.remove(n);
				}
			}
		});
		*/
		btnRestart.setBounds(99, 660, 89, 23);
		contentPane.add(btnRestart);
		
		JButton btnGuessAgain = new JButton("Guess Again");
		btnGuessAgain.setMargin(new Insets(2, 2, 2, 2));
		btnGuessAgain.setBounds(198, 660, 89, 23);
		contentPane.add(btnGuessAgain);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);	//Closes the window with Exit button.
			}
		});
		btnExit.setBounds(297, 660, 89, 23);
		contentPane.add(btnExit); 
	}
}
