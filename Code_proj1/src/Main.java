/* * *
 CODED BY   : MR.GHOSTSCR1PT
 FROM       : CRUTECH INCORPORATED
 PATCH DATE : 4/8/23
 * * */
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      /* * * NEW OBJECT FOR THE CLASS SCANNER * * */
        Scanner get_input = new Scanner(System.in);
        /* * * VARIABLE & DATA TYPES DECLARATION * * */
        int num_items;
        double ttl_amt_pyble=0.0;
        double dsc;
        double dsc_amt_pyble;
        double chng;
        double amt_pd;
        /* * * OPTIONS * * */
        System.out.println("BSCS Appliance Center\n");
        System.out.println("A. Epson L3110 Printer   -   P 7,682.13");
        System.out.println("B. Condura 6X Aircon     -   P 26,731.92");
        System.out.println("C. Sony MHC              -   P 13,499.00");
        System.out.print("\nEnter your choice[A-C]: ");
        char choice = get_input.next().charAt(0);
        System.out.print("\nName of Customer:        ");
        String cstmr_nm = get_input.next();
        System.out.print("Number of items:         ");
        num_items = get_input.nextInt();
        /* * * CONDITION FOR OPTION * * */
        switch (choice) {
            case 'A', 'a' -> ttl_amt_pyble = 7682.13 * num_items;
            case 'B', 'b' -> ttl_amt_pyble = 26731.92 * num_items;
            case 'C', 'c' -> ttl_amt_pyble = 13499.00 * num_items;
            default -> {
                System.out.println("Invalid option...");
                System.exit(0);
            }
        }
        System.out.printf("Total Amount Payable:    P %,.2f\n",ttl_amt_pyble);
        /* * * DISCOUNT CONDITION * * */
        dsc = ttl_amt_pyble>80000.00 ? 0.10*ttl_amt_pyble : ((ttl_amt_pyble>=25000.00) ? 0.04 * ttl_amt_pyble : 0);
        /* * * OUTPUT CONDITION * * */
        if(dsc>0){
            System.out.printf("Discount:                P %,.2f\n",dsc);
            dsc_amt_pyble=ttl_amt_pyble-dsc;
            System.out.printf("Discounted Amount Payable: P %,.2f\n",dsc_amt_pyble);
            System.out.print("Amount paid:             P ");
            amt_pd = get_input.nextDouble();
            chng=amt_pd-dsc_amt_pyble;
        }else{
            System.out.print("Amount paid:             P ");
            amt_pd = get_input.nextDouble();
            chng=amt_pd-ttl_amt_pyble;
        }
        System.out.printf("Change:                  P %,.2f\n\n",chng);
    }
}