//public class Welcome {
//
//    public static void main(String[] args) {
//
//        Integer a = 10, b = 12, t;
//        System.out.println("before swapping numbers: "+a +"  "+ b);
//        t = a;
//        a = b;
//        b = t;
//        System.out.println("After swapping: "+a +"   " + b);
//
//    }
//}


//public class Welcome {
//
//    public static void main(String[] args) {
//        Integer a = 10, b = 12;
//
//        if(a < b)
//            System.out.println("The smallest no. is a: "+a);
//        else if(a > b)
//            System.out.println("The smallest no. is b: "+b);
//        else
//            System.out.println("The numbers are equal");
//
//
//    }
//}




//public class Welcome {
//
//    public static void main(String[] args) {
//        int a=40, b=78, c=19;
//
//        if(a>=b && a>=c)
//            System.out.println(a+" is the largest Number");
//        else if (b>=a && b>=c)
//            System.out.println(b+" is the largest Number");
//        else
//            System.out.println(c+" is the largest number");
//
//    }
//}



//public class Welcome {
//
//    public static void main(String[] args) {
//        int n = 40;
//        if(n % 2 == 0)
//        {
//            System.out.println("The given number "+n+" is Even ");
//        }
//        else
//        {
//            System.out.println("The given number "+n+" is Odd ");
//        }
//    }
//}




//public class Welcome {
//
//    public static void main(String[] args) {
//        int n = 20;
//        if(n % 8 == 0)
//        {
//            System.out.println("The given number "+n+" is divisible by 8 ");
//        }
//        else
//        {
//            System.out.println("The given number "+n+" is not divisible by 8 ");
//        }
//    }
//}




//public class Welcome {
//
//    public static void main(String[] args) {
//        int number = 987654, reverse = 0;
//        while(number != 0)
//        {
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number = number/10;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);
//    }
//}


public class Welcome {

    public static void main(String[] args) {
        int year = 1996;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

