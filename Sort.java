package labAlgo;

import java.util.Scanner;
import java.io.*;

public class Sort  {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int time = 0;
		int time2 = 0;
		System.out.println("Which type of data you want (1 for integers and 2 for words)");
		String s = scan.next();
		Scanner scan3 = scan;
		if (s.equals("1")) {
			System.out.println("Enter the number of elements you want from the file");
			int N = Integer.parseInt(scan.next());
			
			try {
				 scan3 = new Scanner(new FileReader("C:\\javae\\codechef\\labAlgo\\src\\labAlgo\\numbers.dat"));
			} catch (FileNotFoundException e) {
				System.out.println("Exception file not found");
			}
			int[] arr = new int[N];
			for (int count = 0; count < N; count++) {
				arr[count] = Integer.parseInt(scan3.next());
			}
			System.out.println("Which sorting algorithm do you want");
			System.out.println("1. Insertion Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Bubble Sort");
			System.out.println("4. Merge Sort");

			Scanner scan2 = new Scanner(System.in);
			int num = scan2.nextInt();
			switch (num) {
			case 1: {
				 time =(int) System.nanoTime();
				InserionSort.InsertionSortInt(arr);
				 time2 = (int)System.nanoTime();
	
			}
			case 2: {
				 time =(int) System.nanoTime();
				SelectionSort.SelectionSortInt(arr);
				 time2 =(int) System.nanoTime();


			}
			case 3: {
				 time =(int) System.nanoTime();
				BubbleSort.BubbleSortInt(arr);
				 time2 =(int) System.nanoTime();
				
			}
			case 4: {
				 time =(int) System.nanoTime();
					MergeSort.mergeSortInt(arr);
					 time2 =(int) System.nanoTime();
			}
			}
		}
		if (s.equals("2")) {
			System.out.println("Enter the number of elements you want from the file");
			Scanner scan4 = scan;
			int N = Integer.parseInt(scan.next());
			try {
				 scan4 = new Scanner(new FileReader("C:\\javae\\codechef\\labAlgo\\src\\labAlgo\\words.dat"));
			} catch (FileNotFoundException e) {
				System.out.println("Exception file not found");
			}
			String[] arr = new String[N];
			for (int count = 0; count < N; count++) {
				arr[count] = scan4.next();

			}
			System.out.println("Which sorting algorithm do you want");
			System.out.println("1. Insertion Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Bubble Sort");
			System.out.println("4. Merge Sort");

			Scanner scan2 = new Scanner(System.in);
			int num = scan2.nextInt();
			switch (num) {
			case 1: {
				 time =(int) System.nanoTime();
				InserionSort.InsertionSortWord(arr);
				 time2 =(int) System.nanoTime();
			
			}
			case 2: {
				 time =(int) System.nanoTime();
				SelectionSort.SelectionSortWord(arr);
				 time2 =(int) System.nanoTime();
		

			}
			case 3: {
				 time =(int) System.nanoTime();
				BubbleSort.BubbleSortWord(arr);
				 time2 =(int) System.nanoTime();
				
			}
			case 4:{
				 time =(int) System.nanoTime();
					MergeSort.mergeSortWord(arr);
					 time2 =(int) System.nanoTime();
			}
			}

		
		}
		System.out.println(time2-time);
	}

}
