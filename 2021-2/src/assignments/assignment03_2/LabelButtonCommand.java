package assignments.assignment03_2;

import javax.swing.JButton;

public class LabelButtonCommand implements Command {
    private static final String ADD_LABEL_OBSERVER_BUTTON_TITLE = "Add Label Window Observer";
	private static final String REMOVE_LABEL_OBSERVER_BUTTON_TITLE = "Remove Label Window Observer";
	private PrimeObservableThread primeThread;
    private boolean labelObserverAdded = true;    
    private LabelWindow labelWindow; 
    private JButton updateLabelObserverButton;
    
	public LabelButtonCommand(JButton updateLabelObserverButton, LabelWindow labelWindow, PrimeObservableThread primeThread) {
		this.updateLabelObserverButton = updateLabelObserverButton;
		this.labelWindow = labelWindow;
		this.primeThread = primeThread;
	}
	
	@Override
	public void execute() {
		if (labelObserverAdded) {
    		primeThread.removeObserver(labelWindow);
    		updateLabelObserverButton.setText(ADD_LABEL_OBSERVER_BUTTON_TITLE);
    		labelObserverAdded = false;
    	} else {
    		primeThread.addObserver(labelWindow);
    		updateLabelObserverButton.setText(REMOVE_LABEL_OBSERVER_BUTTON_TITLE);
    		labelObserverAdded = true;
    	}	
	}
}
