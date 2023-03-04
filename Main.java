import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please chose a day");
        int n=in.nextInt();
        int n2=n-1;
        switch (n2){
            case 0:
                System.out.println("Saturday");
                saturday();
                break;
            case 1:
                System.out.println("Sunday and monday");
                sunday_monday();
                break;
            case 2:
                break;
            case 3:
                System.out.println("Tuesday");
                System.out.println("Take a break");
                break;
            case 4:
                System.out.println("Wednesday");
                wednesday();
                break;
            case 5:
                System.out.println("Thursday");
                int[] x = new int[] {1,2,3,4};;
                Thursday(x);{
            }
                break;
            case 6:
                System.out.println("friday");
                friday1();
                friday2();
                friday3();
                break;

        }
        }



    static void saturday(){
            for (int r = 1; r <= 6; r++) //number of rows
            {
                if (r == 4)
                    System.out.println();
                for (int c = 6-r; c > 0; c--) //number of columns that I avoid it
                {
                    System.out.print(" ");
                }
                for (int n = 1; n <= r + (r - 1); n++)//print the pattern
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        static void sunday_monday(){
            Scanner in =new Scanner(System.in);
            int a;
            int sum=0;
            System.out.println("enter the size of the array"); //first take the size of the arry
            int n =in.nextInt();
            int[] arr =new int[n];
            for (int j=0;j<n;j++){
                System.out.println("enter element number"+""+(j+1)); //second fill the array with element without calc the average
                a=in.nextInt();
                arr[j]=a;
            }
            System.out.println("The average of the array is:"+"");//calc the average of the array
            for ( int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println(sum/arr.length);

        }

        static void wednesday(){
            System.out.println("Enter the size of the array");
        Scanner in =new Scanner(System.in);
        int rows=in.nextInt();
        int columns=in.nextInt();
            System.out.println("Enter array elements : ");

            int twoD[][]=new int[rows][columns];


            for(int i=0; i<rows;i++)
            {
                for(int j=0; j<columns;j++)
                {
                    twoD[i][j]=in.nextInt();
                }
            }
            System.out.println("your array is :");
            for(int i=0; i<rows;i++)
            {
                if (rows==2)
                    System.out.println();
                for(int j=0; j<columns;j++)
                {
                    System.out.print(twoD[i][j]);
                    System.out.print("         ");
                }
            }

        }
         static void Thursday(int arr[]){
             System.out.print("the array is:"+" ");
             for (int n=0;n<arr.length;n++){//print the array first
                 System.out.print(arr[n]);
             }
             System.out.println();
            for (int i=0;i< arr.length;i++){//the array after adding 5
                arr[i]=arr[i]+5;
            }
            System.out.print("after adding 5 to all element of the array the new array is:"+" ");
                for (int j=0;j<arr.length;j++){
                    System.out.print(arr[j]);
                }
        }

        static int friday1(){//print the word oop n times
            System.out.println("please enter the number of time that you want to print oop");
            Scanner in = new Scanner(System.in);
            int a= in.nextInt();
            for (int i=1;i<=a;i++){
                System.out.println("OOP");
            }
            return a;

        }
    static float friday2(){//takes a floating value and multiply it by 3
        System.out.println("enter your float num");
        Scanner in = new Scanner(System.in);
        float a= in.nextFloat();
        System.out.println(a+ "*" +"3"+":"+(a*3));
        return a;

    }
    static String friday3(){// takes a string and print ("hello"+string)
        System.out.println("Enter your name");
        Scanner in=new Scanner(System.in);
        String a=in.next();
        System.out.println("Hello"+" "+a);

    return a;
    }

    }
