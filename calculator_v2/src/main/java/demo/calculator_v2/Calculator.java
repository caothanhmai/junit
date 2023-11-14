package demo.calculator_v2;



public class Calculator {

	 public double sum(double [] arr){
	        //Creation of Array
	    	
	        double sum_ = 0;
	        for(int i =0; i < arr.length; i++){
	        	

	            sum_ += arr[i];
	        }
	        //adding all elements in an array
	        return sum_;
	    }

	 public double subtract(double[] arr) {
		 
		 	//Creation of Array
		    double diff_ = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		        diff_ -= arr[i];
		    }
	        //Subtracting all elements in an array

		    return diff_;
		}
	   

	    public  double Multiplication(double [] arr){
	        //Creation of Array
	        double pro_ = 1;
	        for(int i = 0; i < arr.length; i++){
	            pro_ = pro_ * arr[i];
	        }
	        //Multiplying all elements in an array
	        return pro_;
	    }

	    public double divide(double a, double b){
	    	if (b == 0) {
	            // if denominator is zero return some minimum value

	            return Double.MIN_VALUE; 
	        }
	        double div_=a/b;
	        return  div_;
	    }

	    public double squareRoot(double radical){
	        if(radical < 0){
	        	

	        	return Double.MIN_VALUE; 
	        }
	        double res = Math.sqrt(radical);
	        return res;
	        
	    }
	    
	    public double moduloOfTwoNum(double a, double b) {
	        if (b == 0) {
	            return Double.NaN;
	        }

	        double result = a % b;

	        //if (result < 0 && b > 0 || result > 0 && b < 0) {
	        //   result += b;
	        //}

	        return result;
	    }



	    public double Average(double [] arr){
	    	
	    	if (arr.length == 0) {
	            throw new IllegalArgumentException("Input array cannot be empty");
	        }
	    	
	        double sum_ = 0;
	        
	        for(int i =0; i < arr.length; i++){
	            sum_ += arr[i];
	        }
	        //calculating Average of all elements in an array
	        double average = sum_ / (arr.length);
	        return average;
	    }
	   
	    public int factorial(int n) {
	        if (n < 0) {
	            return 0;
	        } else if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }



}


