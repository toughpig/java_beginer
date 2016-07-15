package multi_thread;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button start=new Button("start");
	private Button quit=new Button("quit");
	private Button stop=new Button("stop");
	private Marble marble[]=new Marble[20];
	public Table(){
		super("marble move");
		setLayout(new FlowLayout());
		add(start);
		start.addActionListener(this);
		add(stop);
		stop.addActionListener(this);
		add(quit);
		quit.addActionListener(this);
		validate();
		setSize(600,600);
		setVisible(true);
		for(int i=0;i<marble.length;i++){
			int x=(int)(Math.random()*getSize().width);
			int y=(int)(Math.random()*getSize().height);
			marble[i]=new Marble(this,x,y);
		}
	}
	public void paint(Graphics g){
		for(int i=0;i<marble.length;i++)
			if(marble[i]!=null)
				marble[i].draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==quit)
			System.exit(0);
		else if(e.getSource()==stop){
			for(int i=0;i<marble.length;i++)
				marble[i].halt();
		}
		else if(e.getSource()==start){
			for(int i=0;i<marble.length;i++){
				marble[i].halt();
				marble[i]=new Marble(this,marble[i].x,marble[i].y);
			}
		}
		
	}


	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Table table=new Table();
		// TODO Auto-generated method stub

	}

	
}
