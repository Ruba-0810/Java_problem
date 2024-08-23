import java.util.Scanner;

class FirstLetterEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // Trim the string to remove leading and trailing spaces
        str = str.trim();

        // Traverse the+++                     string to find the first letter of each word
        for (int i = 0; i < str.length(); i++) {
            // Print the first character of the string
            if (i == 0) {
                System.out.print(str.charAt(i) +" ");
            }
            // Print the character that comes after a space
            else if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                System.out.print(str.charAt(i + 1)+ " ");
            }
        }
    }
}
