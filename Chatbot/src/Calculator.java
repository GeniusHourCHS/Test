class Calculator {

		double answer = 0.0;
		double fail = 0.0;
		
		public <string> double calc(double one, double two, string operator){
			
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
