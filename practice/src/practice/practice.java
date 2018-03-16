package practice;
import java.util.Scanner;
public class practice {
	public static int toInt(char c)
	{
	int value=-1;
	if('0'<=c&c<='9'){
		value=c-'0';	
	}
	if('A'<=c&c<='F'){
		value=c-'A'+10;
	}
	return value;
	}
	public static int pow(int base,int numofT){
	int value;
	if(numofT==0) value=1;
	else value=base*pow(base,numofT-1);
	return value;
	}
	public static int toInt(String s, int base){
	int output=0;
	if(s.length()>0) output=toInt(s.substring(1,s.length()),base)+toInt(s.charAt(0))*pow(base,s.length()-1);
	return output;
	}
	public static int mary(int n,int k) {
		int output;
		if(n>k|k%2!=n%2) output=0;
		else if(k==0) output=1;
		else output=mary( n+1,k-1)+mary(n-1,k-1);
		return output;
	}
	public static void printArray(int[] array){
		if(array == null)
			System.out.println(array);
		else{
			System.out.print("{ ");
			for(int element : array)
				System.out.print(element);
			System.out.println("} ");
		}	
	}
	public static int minIndex(int[] array, int from)
	{
		int minIndex = from;
		for (int i = from+1; i < array.length; i++) {
			if (array[i] < array[from]) {
				minIndex = i;				
			}
		}
		return minIndex;
	}
	public static int o(int n) {
		int number=n+1;
		if(number<=2) number=2;
		for(int divisor=2;divisor*divisor<=number;divisor=divisor+1) {
			if(number%divisor==0) number=number+1;
			else divisor=divisor+1;
		}
		return number;
	}
public static void main(String[] args) {
	System.out.println(2);
}
}