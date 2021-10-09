import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] students = new int[7];

		int sum = 0, average = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int indexOfmax = 0;
		int even = 0, odd = 0;

		System.out.println("Please enter marks of 7 students.");
		for (int i = 0; i < students.length; i++) {
			students[i] = sc.nextInt();

		}

		for (int i = 0; i < students.length; i++) {

			sum = sum + students[i];

		}

		for (int i = 0; i < students.length; i++) {
			if (students[i] > max) {
				max = students[i];
				indexOfmax = i;
			}
			if (students[i] < min) {
				min = students[i];
			}
			if (students[i] % 2 == 0) {
				even = even + 1;
				System.out.println(students[i] + " is even mark.");

			}

			if (students[i] % 2 != 0) {
				odd = odd + 1;
				System.out.println(students[i] + " is odd mark.");

			}

		}

		average = sum / students.length;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		System.out.println("The max mark is " + max);
		System.out.println("The min mark is " + min);
		System.out.println("The smallest index of max mark is " + indexOfmax);
		System.out.println("Total size of even mark is " + even);
		System.out.println("Total size of odd mark is " + odd);
		System.out.println("That's all");

	}

}
