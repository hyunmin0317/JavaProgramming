package assignments.assignment03;

import java.util.ArrayList;

public class PrimeObservableThread implements Runnable, Observable {
    private static final int SLEEPTIME = 500;
    private ArrayList<Observer> observers;

    private int primeNumber;
    private int numCount;
    private boolean first = true;
    private boolean stopRunning = false;

    public PrimeObservableThread() {
    	observers = new ArrayList<Observer>();	// 옵저버를 담을 배열 생성
    }
    
    @Override
    public void registerObserver(Observer o) {
		observers.add(o);	// 해당하는 옵저버 추가
	}
	
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);	// 해당하는 옵저버 삭제
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {	
		for (Observer observer : observers) {
			observer.update(primeNumber);	// 옵저버가 담고있는 값 수정
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(int primeNumber) {	
		this.primeNumber = primeNumber;
		measurementsChanged();				// 옵저버가 담고있는 값 변경
	}

    public int getPrimeNumber() {
        return primeNumber;
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
            if (first) {
                first = false;
                primeNumber = 2;   // 첫 번째 소수는 2
                setMeasurements(primeNumber);		// primeNumber 값 변경시 옵저버가 담고있는 값 수정
                numCount = 1; // 다음 단계부터는 2를 더해서 홀수만 확인하므로 1로 바꿔서 다음 숫자를 3으로 만들어야 함
            } else {
                numCount += 2; // 2를 제외한 짝수는 소수가 될 수 없음. 따라서 홀수만 검사
                if (isPrimeNumber(numCount)) {
                    primeNumber = numCount;
                    setMeasurements(primeNumber);	// primeNumber 값 변경시 옵저버가 담고있는 값 수정
                }
            }
            try {
                Thread.sleep(SLEEPTIME); // 1초 쉼
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        generatePrimeNumber();
    }
}
