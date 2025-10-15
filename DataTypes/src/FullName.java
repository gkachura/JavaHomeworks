import java.util.Scanner;

//Task 11
public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name:");
        String name = input.nextLine();
//        name.st.replace
//        name.replaceAll("\\s","");
        System.out.println("The name length is:" + name.length()); // why it doesn't trim??; май си отговорих сама
        System.out.println("First character:" + name.charAt(0));
        System.out.println("Last character:" + name.charAt(name.length()-1));
        System.out.println("The name in uppercase:" + name.toUpperCase());
    }
}
