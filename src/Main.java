
public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Section 5: Switch Statements Challenge+");

        char swChar = 'C';
        switch(swChar) {
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
                System.out.println("Character is D");
                break;
            case 'E':
                System.out.println("Character is E");
                break;
            default:
                System.out.println("Was Not found!");
                break;
        }

        String month="January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}