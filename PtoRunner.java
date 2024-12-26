import java.util.Scanner;

public class PtoRunner {
    
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int ih;
        double ac;
        int w;
        double t;
        System.out.println("Hi! What are your initial hours for PTO?");
        ih = scan.nextInt();
        System.out.println("Initial Hours = " + ih);
        System.out.println("What is your accural rate every week?");
        ac = scan.nextDouble();
        System.out.println("Accrual Rate = " + ac);
        System.out.println("How many weeks have you been working?");
        w = scan.nextInt();
        System.out.println("Weeks Working = " + w);
        
        Pto pto = new Pto(ih, ac, w);

        System.out.println("Total PTO = " + pto.getTotal());
    }
}
