import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random; 

public class Binary {
	/*BIG O NOTATION WE HAVE TO DEFINE WHAT IS n: n is the process of an operation*/
	static int arrsize, num;//defined global to be known to all
	public static void main(String[] args) {
		int first, last, midd, search, mx;
		//this program will find sorted number in binary search
		//step 1:
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array Size ");//information to enter array size
		arrsize = s.nextInt();//save array size
		int arr[] = new int[arrsize];//array size implemented
		
		//step 2:
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter maximun range of numbers to implement");
		mx = s1.nextInt();//take the max number of array size
		System.out.println("array elements will be saved randomly");//how numbers will be saved 
		
		//step 3:
		for (int i = 0; i < arrsize; i++) {//to produce random numbers inside the array
			RandomNums(mx);//function to implement random nums
			arr[i] = num;//insert random nums in the array
		}
		
		//step 4:
		Arrays.sort(arr);//sorting function O(n log n)
		for (int i = 0; i < arrsize; i++) {
			System.out.print(arr[i]+"\t");
		}/*ENDED WITH O(n)*/
		//Ask user what num to search for
		//step 5:
		Scanner sx = new Scanner(System.in);
		System.out.print("\nwhat number do you want to search for: ");
		search = sx.nextInt();//value of wanted number
		first = 0;//equal first number in array
		last = arrsize - 1;//equal last number in array
		midd = (last+1 - first)/2;//middle number in array
		while(arr[midd] != search && (arr[first]!=arr[last]))//loop to search for Wanted number
		{
			while(arr[midd]<search && (arr[first]!=arr[last]))//when middle number is less than search
			{
			first = midd+1;
			midd = (last+1 - first)/2 + first;
			}
			
			while(arr[midd]>search && (arr[first]!=arr[last]))//entered when the number is bigger thand number
			{
			last=midd;
			midd = ((last+1 - first)/2) + first;
			}
			
		}/*ENDED WITH O(n^2)*/
		if (arr[midd]==search) {//after getting out of the array if the wanted number = middle value this shoud appear to user
			System.out.println("your number is in array: "+midd+"\n\t\t Thank you");
		}/*O(N)*/
		else if (arr[midd] != search || (arr[first]!=arr[last])) {//after getting out of the array if the wanted number != middle value this shoud appear to user
			System.out.println("the "+search+ " is not in array\n\t Thank you");
		}/*O(n)*/

	}
	
	//function 1
	public static void RandomNums(int max) {//this will implement random numbers 
	Random random = new Random();
	num = random.nextInt(max--);
	}
}