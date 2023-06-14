/* * *
 CODED BY   : 丂ʜᴀᴅᴏᴡ尺ᴇᴀᴘᴇ尺
 FROM       : 𝐂𝐓 𝐈𝐍𝐂𝐎𝐑𝐏𝐎𝐑𝐀𝐓𝐄𝐃
 PATCH DATE : ４/８/２３
 * * */
import java.io.*;
import java.util.Objects;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int x,y,rslt,gt,choice;
        String rspn;
        do{
            gt=0;
            System.out.println("\n\t**ARITHMETIC OPERATORS**\n");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Division");
            System.out.println("[4] Multiplication");
            System.out.print("\nChoice operator: ");
            choice = Integer.parseInt(input.readLine());
            //CODITION FOR DIFFERENT OPERATOR
            switch (choice) {
                case 1 -> {
                    //ASKING FOR THE INPUT
                    System.out.print("Enter a number: ");
                    x = Integer.parseInt(input.readLine());
                    for (y = 1; y <= 10; y++) {
                        rslt = x + y;
                        System.out.printf("%d + %d = %d\n", x, y, rslt);
                        gt += rslt;
                    }
                }
                case 2 -> {
                    //ASKING FOR THE INPUT
                    System.out.print("Enter a number: ");
                    x = Integer.parseInt(input.readLine());
                    for (y = 1; y <= 10; y++) {
                        rslt = x - y;
                        System.out.printf("%d - %d = %d\n", x, y, rslt);
                        gt += rslt;
                    }
                }
                case 3 -> {
                    //ASKING FOR THE INPUT
                    System.out.print("Enter a number: ");
                    x = Integer.parseInt(input.readLine());
                    for (y = 1; y <= 10; y++) {
                        rslt = x / y;
                        System.out.printf("%d / %d = %d\n", x, y, rslt);
                        gt += rslt;
                    }
                }
                case 4 -> {
                    //ASKING FOR THE INPUT
                    System.out.print("Enter a number: ");
                    x = Integer.parseInt(input.readLine());
                    for (y = 1; y <= 10; y++) {
                        rslt = x * y;
                        System.out.printf("%d * %d = %d\n", x, y, rslt);
                        gt += rslt;
                    }
                }
                default -> {
                    System.out.println("Error: Invalid input\n");
                    System.exit(1);
                }
            }
            System.out.print("GRAND TOTAL: " + gt);
            System.out.print("\nT22ry again?: ");
            rspn = input.readLine();
        }while(Objects.equals(rspn, "y")||Objects.equals(rspn, "yes"));
    }
}
