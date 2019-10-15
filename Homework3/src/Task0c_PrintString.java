import java.util.Scanner;

public class Task0c_PrintString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		for (int i = 0, j = 1; i < word.length(); i++, j++) {
			System.out.println(word.substring(i, j));
		}
	}
}
