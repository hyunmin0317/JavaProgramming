package answers.assignment04_2;

import java.awt.Dimension;
import java.time.LocalDateTime;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class TimeDisplay extends DisplayDecorator {
	public TimeDisplay(Display display, int width, int height) {
		super(display, width, height);
	}

	@Override
	public String getDisplayText() {
		return "Date: "+LocalDateTime.now().toString();
	}
}
