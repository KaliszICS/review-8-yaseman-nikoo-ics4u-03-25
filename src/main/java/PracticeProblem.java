public class PracticeProblem {

	public static void main(String args[]) {
		

	}
	public static String pluralize(String word){
		if (word.endsWith("ife")){
			String suffix= "ives";
			return suffix;
		}
		else if(word.endsWith("ey")){
			String suffix= "eys";
			return suffix;
		}
		else if (word.endsWith("y") || word.endsWith("Y")){
			String suffix= "ies";
			return suffix;
		}
		else{
			String suffix= "s";
			return suffix;
		}
	}
	public static int min(int num1, int num2, int num3){
		if (num1<=num2 && num1<=num3){
			return num1;
			}
		else if(num2<=num3){
			return num2;
		}
		else{
			return num3;
		}
		}
	public static boolean isLeapYear(int num){
		boolean answer;
		if (num%4==0){
			if (num%100==0){
				if (num%400==0){
					answer= true;}
				else{
					answer=false;
				}
			}
			else{
				answer= true;
			}
		}
		else{
			answer=false;
		}
		return answer;
	}
	}
