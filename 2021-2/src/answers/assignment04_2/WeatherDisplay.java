package answers.assignment04_2;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class WeatherDisplay extends DisplayDecorator {
	public WeatherDisplay(Display display, int width, int height) {
		super(display, width, height);
	}

	@Override
	public String getDisplayText() {
		return "Weather: 온도: 20도, 습도: 60";
	}
}
