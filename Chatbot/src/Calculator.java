class Calculator {

		
		
		public static double calc(double one, double two, String operator){
			double answer = 0.0;
			double fail = 0.0;
			if(operator == "+") {
			answer = one + two;
			}
			else if(operator == "-"){
			answer = one - two;
			}
			else if(operator == "/"){
			answer = one/two;		
			}
			else if(operator == "*"){
			answer = one * two;
			}
			else if(operator == "s"){
				
			}
			else{
			fail = 1;
	
			}
			if(fail == 1) {
				return fail;
			}
			else{
				return answer;		
			}
		}


		
}
