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
                Parent = sc1.nextLine();                                //printing next line w/o accepting input, sigh
                System.out.print("Name of local Guardian, if any: ");
                Guardian = sc1.nextLine();
                System.out.print("% of marks in Class 10 Board Examination: ");
                BoardPerc = sc1.nextDouble();
                if(BoardPerc >= 90.00) selected++;
                System.out.print("Name of Board: ");
                BoardName = sc1.nextLine();                             //another skipped input, tf is this
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
class Examination extends Application
{
        double ExamPerc;
        String result;
        static int passed = 0;
        void ExSheet(Application ob)
        {
                this.StudentName = ob.StudentName;
                this.Parent = ob.Parent;
                this.BoardPerc = ob.BoardPerc;
        }
        void getExPerc(double per)
        {
                if(per == 0.000)
                        result = "ABSENT";
                else
                        ExamPerc = per;
                if(ExamPerc >= 80.00) passed++;
        }
        void ExResults()
        {
                System.out.println("Student Name: "+StudentName);
                System.out.println("Parent's Name: "+Parent);
                System.out.println("% of marks in Class 10 Board Examination: "+BoardPerc);
                if(result.equals("ABSENT")==true)
                        System.out.println("Result: ABSENT");
                else System.out.println("% of marks scored in Entrance Exam: "+ExamPerc);
        }
}
class q10
{
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                Application[] ap = new Application[500];
                int i=0, j=0, s, total; char ch;
                int arr[] = new int[50];
                do
                {
                        System.out.println("\n\n\t\tADMISSION FORM\n\nCandidate "+(i+1));
                        System.out.println("\nPlease enter the details accurately\n\n");
                        ap[i] = new Application();
                        ap[i].read();
                        if(ap[i].BoardPerc >= 90.00)
                        {
                                arr[j] = i; j++;
                        }
                        System.out.print("\nPress 1 to continue, any other key to exit: ");
                        ch = sc.next().charAt(0);
                        i++;
                }while(ch=='1');
                s = Application.selected; total = i;
                System.out.println("\n"+s+" out of "+total+" students have been selected\n");
                if(s>12)
                {
                        System.out.println("An examination will be conducted\n");
                        System.out.println("\nEnter exam percentage for following candidates:\n");
                        Examination[] ex = new Examination[50];
                        int x;
                        for(int k=0; k<total; k++)
                        {
                                x = arr[k];
                                ex[k] = new Examination();
                                ex[k].ExSheet(ap[x]);
                                System.out.println(ex[k].StudentName+": ");
                                double per = sc.nextDouble();
                                ex[k].getExPerc(per);
                        }
                        System.out.println("\n\nRESULT SHEETS:\n");
                        for(int k=0;k<total;k++)
                        {
                                System.out.println("CANDIDATE "+ (k+1)+"\n");
                                ex[k].ExResults();
                        }
                        int p = Examination.passed;
                        System.out.println("\n"+p+"out of "+total+" students have cleared the entrance examination\n");
                }
        }
}
