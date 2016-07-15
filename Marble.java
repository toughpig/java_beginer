package multi_thread;
import java.awt.*;

public class Marble extends Thread{
	private int xdir=2*(1-2*(int)Math.round(Math.random()));
	private int ydir=2*(1-2*(int)Math.round(Math.random()));
	private boolean running=false;
	private Table table=null;
	int x,y;
	public Marble(Table table,int x,int y){
		this.table=table;
		this.x=x;
		this.y=y;
		start();
	}
	public void start(){
		running=true;
		super.start();
	}
	public void run(){
		while(running){
			move();
			try {
				sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			table.repaint();
		}
	}
	public void draw(Graphics g){
		g.setColor(Color.orange);
		g.fillOval(x, y, 30, 30);
	}
    public void halt(){
		running=false;
	}
	public void move(){
		x=x+xdir;
		y+=ydir;
		if(x<0||x>table.getSize().width)
			xdir*=(-1);
		if(y<0||(y>table.getSize().height))
			ydir*=(-1);
	}

}
