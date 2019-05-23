package numberrangesummarizer.Main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
//import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import numberrangesummarizer.Implementation.NumberRangeSummarizerImplementation;
import numberrangesummarizer.Tools.NumberRangeSummarizerCheckDuplicates;

public class numberRangeSummarizerMain extends Applet implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pattern = "\\d+([,]\\d)*";
	private String patternAlpha = "[a-zA-Z]";
	private Collection<Integer> set;
	private boolean res;
	private NumberRangeSummarizerCheckDuplicates DUP = new NumberRangeSummarizerCheckDuplicates();
	private NumberRangeSummarizerImplementation NRS = new NumberRangeSummarizerImplementation();

	Label lInstruct = new Label("please enter number sequence seperated by a comma(,)");

	Label lInstruct2 = new Label("Example \" 1, 4, 28, 10, 11, 3, 7 \"");
	TextField t1 = new TextField(50);
	Label l1 = new Label("Input list");
	TextField t2 = new TextField(50);
	Label l2 = new Label("Result");
	Font f1, f2;
	// Image img;
	// JPanel panel1 = new JPanel();

	public void init() {
		Frame title = (Frame)this.getParent().getParent();
	    title.setTitle("IMPACT Number Range Summerizer");
	    setBackground(Color.BLUE);
		setSize(600, 300);
		f1 = new Font("Arial", Font.BOLD | Font.ITALIC, 12);
		f2 = new Font("Arial", Font.BOLD | Font.ITALIC, 10);
		// img= getImage(getDocumentBase(), "images.jpg");
		// panel1.add(new JLabel(new ImageIcon(img)));
	}

	public void paint(Graphics g) {
		// g.drawImage(img, 10,10, this);
		setLayout(new FlowLayout());
		// panel1.setBounds(100, 70, 300, 300);
		lInstruct.setFont(f1);
		lInstruct.setBounds(10, 10, 450, 30);
		lInstruct2.setFont(f1);
		lInstruct2.setBounds(10, 30, 450, 30);
		l1.setBounds(10, 70, 70, 40);
		l1.setFont(f1);
		t1.setBounds(150, 70, 400, 40);
		l2.setBounds(10, 50, 70, 200);
		l2.setFont(f1);
		t2.setBounds(150, 130, 400, 40);
	}

	public numberRangeSummarizerMain() {
		// add(panel1);
		add(lInstruct);
		add(lInstruct2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		t1.setText("");
		t2.setText("");
		t1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		set = new ArrayList<Integer>();
		String text = t1.getText();
		text = text.replaceAll(",{2,}", ",");
		System.out.println("input text: " + text);
		Pattern r = Pattern.compile(patternAlpha);
		Matcher m = r.matcher(text);
		if (m.find() || text.contains(".") | text.contains("[") | text.contains("\\")| text.contains("]")) {
			t1.setText("");
			t2.setText("Incorrect format please enter Integer Values or Comma");
			t2.setBackground(Color.RED);
		} else {
			r = Pattern.compile(pattern);
			m = r.matcher(text);
			if (m.find()) {
				set = NRS.collect(text);
				if (DUP.uniqueCharacters(set)) {
					text = NRS.summarizeCollection(set);
					t2.setText(text);
					t2.setBackground(Color.WHITE);
				} else {
					t2.setText("Duplicate values please double check");
					t2.setBackground(Color.RED);
				}
			}else {
				t1.setText("");
				t2.setText("Incorrect format please enter correct format");
				t2.setBackground(Color.RED);
			}

		}
	}

}
