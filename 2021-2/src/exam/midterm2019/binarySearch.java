package exam.midterm2019;

public class binarySearch implements Search {
	@Override
	public boolean search(int num, int[] list) {
		int first = 0;
	    int last = list.length - 1;
	    int mid;
	    
		while(first <= last)
	    {
	        mid = (first + last) / 2;
	        if(num == list[mid])
	            return true;
	        else if(num < list[mid])
	            last = mid-1;
	        else 
	            first = mid + 1;
	    }	    
	    return false;
	}
}
