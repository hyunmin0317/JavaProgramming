package midterm2019;

import java.time.LocalTime;
import java.util.ArrayList;

public class TimeObservableThread implements Runnable, Observable {
    private static final int SLEEPTIME = 1000;
    private boolean stopRunning = false;
    String time;
    
    ArrayList<Observer> observers;
    
    @Override
	public void addObserver(Observer o) {
    	if (!observers.contains(o)) {
    		observers.add(o);
    	}
	}

	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.updateText(time);
		}
	}

    public TimeObservableThread() {
    	observers = new ArrayList<Observer>();
    }

    public String getTime() {
        return time;
    }

    public void stopRunning() {
        stopRunning = true;
    }

    public void startRunning() {
        stopRunning = false;
        run();
    }

    private void generatePrimeNumber() {
        while (stopRunning == false) {
        	time = nowTime();
        	notifyObservers();
        	System.out.println(time);
        	
        	try {
        		Thread.sleep(SLEEPTIME); // 1초 쉼
        	} catch (InterruptedException e) {
        		e.printStackTrace();
            }  
        }     
    }

    private String nowTime() {
    	LocalTime t = LocalTime.now();
    	String time = t.getHour() + ":" + t.getMinute() + ":" + t.getSecond();
    	return time;
    }

    @Override
    public void run() {
        generatePrimeNumber();
    }
}
