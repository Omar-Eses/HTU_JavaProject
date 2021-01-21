import java.util.Arrays;
import java.util.Scanner;

public class LinearP {

	public static void main(String[] args) {
		//this program will find the wanted num in an array by linear search
		//step1: take array size from user
		int arraySize, WantNum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array Size");
		arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		
		//step2: take nums from user
		System.out.println("Enter array elements");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
		/*for (int i = 0; i < arraySize; i++) {//this is for you if you want to check if user input are correct
			System.out.print(arr[i]+"\t");
		}*/
		//step3: what num the user want++start searching
		Scanner s1 = new Scanner(System.in);
		System.out.println("\nChoose number from the ones you entered");
		WantNum = s1.nextInt();
		int result = FNumSearch(arr, WantNum);
		if (result == -1) {
			System.out.println("Element is not in array.");
		}
		else
			System.out.println("element is in order of: "+result);
		/*for (int i = 0; i < arraySize; i++) {
			if (WantNum==arr[i]) {
				int arrnum;
				arrnum = i+1;
				System.out.println("the number you want is in the order of " +arrnum);
				break;
			}
			else {System.out.println("loading...");
			}
			}*/
	}
	public static int FNumSearch(int array[], int wantNumF) {
		for (int i = 0; i < array.length; i++) {
			if (wantNumF==array[i]) {
				int arrNum;
				arrNum = i+1;
				return arrNum;
			}
			else
				System.out.println("Loading...");
		}
		return -1;
	}
}
