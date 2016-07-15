package separate_GUI_test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyChar()=='q')
			System.exit(0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println("keyevent:keytype:"+ke.getKeyChar());
		
		// TODO Auto-generated method stub
		
	}

}
