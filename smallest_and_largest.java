//2. Write a java program to find the largest and smallest elements in an unsorted array
import java.util.Scanner;
class Fun{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of the array: ");
	int x= sc.nextInt();
	int [] array= new int [x];
	for (int i=0;i<x;i++){
			System.out.println("enter the "+(i+1)+"th element: ");
			array[i]= sc.nextInt();
		}
		int smallest=array[0];
		int largest=array[0];
		for (int i=1;i<x;i++){
			if(smallest > array[i]){
				smallest=array[i];
			}
			else if (largest < array[i]){
				largest = array[i];
			}
		}
		System.out.println("the largest number is "+largest+" and the smallest number is "+smallest);
}}
				