package answers.assignment04_2;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SpeedometerDisplay extends DisplayDecorator {
	public SpeedometerDisplay(Display display, int width, int height) {
		super(display, width, height);
	}

	@Override
	public String getDisplayText() {
		return "Speed: 50";
	}
}
