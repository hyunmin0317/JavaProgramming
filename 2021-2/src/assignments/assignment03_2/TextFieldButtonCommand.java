package assignments.assignment03_2;

import javax.swing.JButton;

public class TextFieldButtonCommand implements Command {
    private static final String ADD_TEXTFIELD_OBSERVER_BUTTON_TITLE = "Add TextField Window Observer";
	private static final String REMOVE_TEXTFIELD_OBSERVER_BUTTON_TITLE = "Remove TextField Window Observer";
	private PrimeObservableThread primeThread;
    private boolean textFieldObserverAdded = true;    
    private TextFieldWindow textFieldWindow; 
    private JButton updateTextFieldObserverButton;
    
	public TextFieldButtonCommand(JButton updateTextFieldObserverButton, TextFieldWindow textFieldWindow, PrimeObservableThread primeThread) {
		this.updateTextFieldObserverButton = updateTextFieldObserverButton;
		this.textFieldWindow = textFieldWindow;
		this.primeThread = primeThread;
	}
	@Override
	public void execute() {
    	if (textFieldObserverAdded) {
    		primeThread.removeObserver(textFieldWindow);
    		updateTextFieldObserverButton.setText(ADD_TEXTFIELD_OBSERVER_BUTTON_TITLE);
    		textFieldObserverAdded = false;
    	} else {
    		primeThread.addObserver(textFieldWindow);
    		updateTextFieldObserverButton.setText(REMOVE_TEXTFIELD_OBSERVER_BUTTON_TITLE);
    		textFieldObserverAdded = true;
    	}	
	}

}
