import javax.swing.JFrame;

public class Simon {
	JFrame window;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final int arc = 91;
	
	GamePanel panel;
	public Simon() {
		window = new JFrame();
		panel = new GamePanel();
	}

	public static void main(String[] args) {
		Simon instance = new Simon();
		instance.setup();

	}
	
	public void setup() {
		window.add(panel);
		window.setSize(WIDTH, HEIGHT);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.addMouseListener(panel);
	}

}
