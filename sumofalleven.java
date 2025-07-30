//1. Write a java program to find the sum of all even elements in an array.
import java.util.Scanner;
class Sumeven{
	public static void main (String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int x= sc.nextInt();
		int [] array= new int [x];
		int sum =0;
		for (int i=0;i<x;i++){
			System.out.println("enter the "+(i+1)+"th element: ");
			array[i]= sc.nextInt();
		}
		for (int j=0;j<x;j++){
			if (array[j]%2==0){
				sum+=array[j];
			}
			else
				continue;
		}
		System.out.println("the sum of all even elements is :"+sum);
	}
}
