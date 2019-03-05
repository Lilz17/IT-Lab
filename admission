import java.util.*;
class Application
{
        Scanner sc1 = new Scanner(System.in);
        String StudentName, Parent, Guardian, BoardName;
        String School, SchAddrL1, SchAddrL2, SchAddrL3;
        String Ref1, R1AL1, R1AL2, R1AL3, Ref2, R2AL1, R2AL2, R2AL3;
        int age; static int selected = 0;
        double BoardPerc;
        void read()
        {
                System.out.print("Name of Student: ");
                StudentName = sc1.nextLine();
                System.out.print("Age: ");
                age = sc1.nextInt();
                System.out.print("Name of Parent: ");
                Parent = sc1.nextLine();
                System.out.print("Name of local Guardian, if any: ");
                Guardian = sc1.nextLine();
                System.out.print("% of marks in Class 10 Board Examination: ");
                BoardPerc = sc1.nextDouble();
                if(BoardPerc >= 90.00) selected++;
                System.out.print("Name of Board: ");
                BoardName = sc1.nextLine();
                System.out.println("School Name and Address: ");
                School = sc1.nextLine();
                SchAddrL1 = sc1.nextLine();
                SchAddrL2 = sc1.nextLine();
                SchAddrL3 = sc1.nextLine();
                System.out.println("Name and Addresses of References:");
                System.out.print("Reference 1\nName: ");
                Ref1 = sc1.nextLine();
                System.out.println("Address:");
                R1AL1 = sc1.nextLine();
                R1AL2 = sc1.nextLine();
                R1AL3 = sc1.nextLine();
                System.out.print("Reference 2\nName: ");
                Ref2 = sc1.nextLine();
                System.out.println("Address:");
                R2AL1 = sc1.nextLine();
                R2AL2 = sc1.nextLine();
                R2AL3 = sc1.nextLine();

        }
}
class q10                                               //HOW TO DYNAMICALLY CREATE ARRAY OF OBJECTS????
{                                                       //Oh, try this: ArrayList<Object> arrL3 = new ArrayList<>();
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                int i = 1, s; char ch;
                do
                {
                        System.out.println("\n\n\t\tADMISSION FORM\n\nCandidate "+i);
                        System.out.println("\nPlease enter the details accurately\n\n");
                        Application ap = new Application();
                        ap.read();
                        System.out.print("\nPress 1 to continue, any other key to exit: ");
                        ch = sc.next().charAt(0);
                        i++;
                }while(ch=='1');
                s = Application.selected;
                System.out.println(s+" students have been selected\n");
        }
}
