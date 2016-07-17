package List;


import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class List_test extends Frame implements ActionListener{
	private TextField input=new TextField();
	private Button add=new Button("add");
	private Button del=new Button("delete");
	private Button inc=new Button("+");
	private Button dec=new Button("-");
	private List list=new List();
	private class Windowcloser extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	
	public List_test(){
		Panel task=new Panel();
		task.setLayout(new FlowLayout());
		task.add(add);
		task.add(del);
		Panel prio=new Panel();
		prio.setLayout(new FlowLayout());
		prio.add(inc);
		prio.add(new Label("set priority"));
		prio.add(dec);
		Panel text=new Panel();
		text.setLayout(new BorderLayout());
		text.add("West",new Label("Task:"));
		text.add("Center",input);
		Panel dealer=new Panel();
		dealer.setLayout(new BorderLayout());
		dealer.add("North", text);
		dealer.add("Center", prio);
		this.setLayout(new BorderLayout());
		this.add("North",dealer);
		this.add("Center",list);
		this.add("South",task);
		add.addActionListener(this);
		del.addActionListener(this);
		inc.addActionListener(this);
		dec.addActionListener(this);
		addWindowListener(new Windowcloser());
		pack();
		setVisible(true);
		list.addActionListener(this);
		
	}
	
@Override
	public void actionPerformed(ActionEvent ae) {
		if((ae.getSource()==add)&&(!input.getText().equals("")))
			addhandler(input.getText().trim());
		else if((list.getSelectedIndex()>=0)&&(ae.getSource()==del))
			deletehandler(list.getSelectedIndex());
		else if((ae.getSource()==inc)&&(list.getSelectedIndex()>0))
			increaseprio(list.getSelectedIndex());
		else if((ae.getSource()==dec)&&(list.getSelectedIndex()>=0))
			decreaseprio(list.getSelectedIndex());
		else if(ae.getSource()==list)
            input.setText(list.getSelectedItem().trim());
}
public void addhandler(String str){
	list.add(str,list.getSelectedIndex()+1);
	input.setText("");
	list.select(list.getItemCount()-1);
}
public void deletehandler(int integer){
	list.remove(integer);
	list.select(integer-1);
}
public void increaseprio(int integer){
	String str=list.getItem(integer);
	list.remove(integer);
	list.add(str, integer-1);
	list.select(integer-1);
}
public void decreaseprio(int integer){
	String str=list.getItem(integer);
	list.remove(integer);
	list.add(str,integer+1);
	list.select(integer+1);
	
}






	public static void main(String[] args) {
		new List_test();
		// TODO Auto-generated method stub

	}

	

}
