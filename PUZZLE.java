 import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JOptionPane; 
import javax.swing.*;
import java.util.*;

public class PUZZLE extends JFrame implements ActionListener{
	JButton jb[]=new JButton[16];
	 LinkedList l=new LinkedList();
	public PUZZLE(String s){
		super(s);
		setLayout(new GridLayout(4,4));
		for (int i=1;i<16;i++){
			 l.add(i);
		}
		 Collections.shuffle(l);
		 for(int i=0 ;i<=14;i++){
			jb[i]=new JButton(l.get(i)+"");
			add(jb[i]);
			jb[i].addActionListener(this);
		 }
			jb[15]=new JButton("");
			add(jb[15]);
			jb[15].addActionListener(this);
	}
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jb[11]){
				String label=jb[11].getLabel();
				if(jb[7].getLabel().equals("")){
					jb[7].setLabel(label);
					jb[11].setLabel("");
				}
				if(jb[10].getLabel().equals("")){
					jb[10].setLabel(label);
					jb[11].setLabel("");
				}
				if(jb[15].getLabel().equals("")){
					jb[15].setLabel(label);
					jb[11].setLabel("");
				}
			}
			if(e.getSource()==jb[0]){
				String label=jb[0].getLabel();
				if(jb[1].getLabel().equals("")){
					jb[1].setLabel(label);
					jb[0].setLabel("");
				}
				if(jb[4].getLabel().equals("")){
					jb[4].setLabel(label);
					jb[0].setLabel("");
				}
			}
			if(e.getSource()==jb[1]){
				String label=jb[1].getLabel();
				if(jb[0].getLabel().equals("")){
					jb[0].setLabel(label);
					jb[1].setLabel("");
				}
				if(jb[2].getLabel().equals("")){
					jb[2].setLabel(label);
					jb[1].setLabel("");
				}
				if(jb[5].getLabel().equals("")){
					jb[5].setLabel(label);
					jb[1].setLabel("");
				}
			}
			if(e.getSource()==jb[2]){
				String label=jb[2].getLabel();
				if(jb[1].getLabel().equals("")){
					jb[1].setLabel(label);
					jb[2].setLabel("");
				}
				if(jb[3].getLabel().equals("")){
					jb[3].setLabel(label);
					jb[2].setLabel("");
				}
				if(jb[6].getLabel().equals("")){
					jb[6].setLabel(label);
					jb[2].setLabel("");
				}
			}
			if(e.getSource()==jb[3]){
				String label=jb[3].getLabel();
				if(jb[2].getLabel().equals("")){
					jb[2].setLabel(label);
					jb[3].setLabel("");
				}
				if(jb[7].getLabel().equals("")){
					jb[7].setLabel(label);
					jb[3].setLabel("");
				}
			}
			if(e.getSource()==jb[4]){
				String label=jb[4].getLabel();
				if(jb[0].getLabel().equals("")){
					jb[0].setLabel(label);
					jb[4].setLabel("");
				}
				if(jb[5].getLabel().equals("")){
					jb[5].setLabel(label);
					jb[4].setLabel("");
				}
				if(jb[8].getLabel().equals("")){
					jb[8].setLabel(label);
					jb[4].setLabel("");
				}
			}
			if(e.getSource()==jb[5]){
				String label=jb[5].getLabel();
				if(jb[1].getLabel().equals("")){
					jb[1].setLabel(label);
					jb[5].setLabel("");
				}
				if(jb[4].getLabel().equals("")){
					jb[4].setLabel(label);
					jb[5].setLabel("");
				}
				if(jb[6].getLabel().equals("")){
					jb[6].setLabel(label);
					jb[5].setLabel("");
				}
				if(jb[9].getLabel().equals("")){
					jb[9].setLabel(label);
					jb[5].setLabel("");
				}
			}
			if(e.getSource()==jb[6]){
				String label=jb[6].getLabel();
				if(jb[2].getLabel().equals("")){
					jb[2].setLabel(label);
					jb[6].setLabel("");
				}
				if(jb[5].getLabel().equals("")){
					jb[5].setLabel(label);
					jb[6].setLabel("");
				}
				if(jb[7].getLabel().equals("")){
					jb[7].setLabel(label);
					jb[6].setLabel("");
				}
				if(jb[10].getLabel().equals("")){
					jb[10].setLabel(label);
					jb[6].setLabel("");
				}
			}
			if(e.getSource()==jb[7]){
				String label=jb[7].getLabel();
				if(jb[3].getLabel().equals("")){
					jb[3].setLabel(label);
					jb[7].setLabel("");
				}
				if(jb[6].getLabel().equals("")){
					jb[6].setLabel(label);
					jb[7].setLabel("");
				}
				if(jb[11].getLabel().equals("")){
					jb[11].setLabel(label);
					jb[7].setLabel("");
				}
			}
			if(e.getSource()==jb[8]){
				String label=jb[8].getLabel();
				if(jb[4].getLabel().equals("")){
					jb[4].setLabel(label);
					jb[8].setLabel("");
				}
				if(jb[9].getLabel().equals("")){
					jb[9].setLabel(label);
					jb[8].setLabel("");
				}
				if(jb[12].getLabel().equals("")){
					jb[12].setLabel(label);
					jb[8].setLabel("");
				}
			}
			if(e.getSource()==jb[9]){
				String label=jb[9].getLabel();
				if(jb[5].getLabel().equals("")){
					jb[5].setLabel(label);
					jb[9].setLabel("");
				}
				if(jb[8].getLabel().equals("")){
					jb[8].setLabel(label);
					jb[9].setLabel("");
				}
				if(jb[10].getLabel().equals("")){
					jb[10].setLabel(label);
					jb[9].setLabel("");
				}
				if(jb[13].getLabel().equals("")){
					jb[13].setLabel(label);
					jb[9].setLabel("");
				}
			}
			if(e.getSource()==jb[10]){
				String label=jb[10].getLabel();
				if(jb[6].getLabel().equals("")){
					jb[6].setLabel(label);
					jb[10].setLabel("");
				}
				if(jb[9].getLabel().equals("")){
					jb[9].setLabel(label);
					jb[10].setLabel("");
				}
				if(jb[11].getLabel().equals("")){
					jb[11].setLabel(label);
					jb[10].setLabel("");
				}
				if(jb[14].getLabel().equals("")){
					jb[14].setLabel(label);
					jb[10].setLabel("");
				}
			}
			if(e.getSource()==jb[12]){
				String label=jb[12].getLabel();
				if(jb[8].getLabel().equals("")){
					jb[8].setLabel(label);
					jb[12].setLabel("");
				}
				if(jb[13].getLabel().equals("")){
					jb[13].setLabel(label);
					jb[12].setLabel("");
				}
			}
			if(e.getSource()==jb[13]){
				String label=jb[13].getLabel();
				if(jb[9].getLabel().equals("")){
					jb[9].setLabel(label);
					jb[13].setLabel("");
				}
				if(jb[12].getLabel().equals("")){
					jb[12].setLabel(label);
					jb[13].setLabel("");
				}
				if(jb[14].getLabel().equals("")){
					jb[14].setLabel(label);
					jb[13].setLabel("");
				}
			}
			if(e.getSource()==jb[14]){
				String label=jb[14].getLabel();
				if(jb[10].getLabel().equals("")){
					jb[10].setLabel(label);
					jb[14].setLabel("");
				}
				if(jb[13].getLabel().equals("")){
					jb[13].setLabel(label);
					jb[14].setLabel("");
				}
				if(jb[15].getLabel().equals("")){
					jb[15].setLabel(label);
					jb[14].setLabel("");
				}
			}
				if(e.getSource()==jb[15]){
				String label=jb[15].getLabel();
				if(jb[11].getLabel().equals("")){
					jb[11].setLabel(label);
					jb[15].setLabel("");
				}
				if(jb[14].getLabel().equals("")){
					jb[14].setLabel(label);
					jb[15].setLabel("");
				}
			}
			if(jb[0].getLabel().equals("1")&&jb[1].getLabel().equals("2")&&jb[2].getLabel().equals("3")&&jb[3].getLabel().equals("4")&&jb[4].getLabel().equals("5")&&jb[5].getLabel().equals("6")&&jb[6].getLabel().equals("7")&&jb[7].getLabel().equals("8")&&jb[8].getLabel().equals("9")&&jb[9].getLabel().equals("10")&&jb[10].getLabel().equals("11")&&jb[11].getLabel().equals("12")&&jb[12].getLabel().equals("13")&&jb[13].getLabel().equals("14")&&jb[14].getLabel().equals("15")&&jb[15].getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
			} 
		}
		public static void main(String[]args){
		   PUZZLE g=new PUZZLE("Puzzle");
		   g.setVisible(true);
		   g.setSize(400,400);
		}
}
   
