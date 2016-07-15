package separate_GUI_test;

import java.awt.Frame;

@SuppressWarnings("serial")
public class Separate_GUI_Test extends Frame{
	private KeyHandler keylistener=new KeyHandler();
	private WindowHandler windowlistener=new WindowHandler();
	public Separate_GUI_Test(){
		addKeyListener(keylistener);
		addWindowListener(windowlistener);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Separate_GUI_Test p=new Separate_GUI_Test();
		// TODO Auto-generated method stub

	}

}
