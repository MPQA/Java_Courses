public class MyProject1 {
    public static void main(String[] args) {

        int i = 3;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
            System.out.println();
        System.out.println(i + 2); i = i + 2;
        System.out.println(i);
        int u = 0;
        u=i+1;
        System.out.println(i);
        System.out.println(u);
            System.out.println();
        int a = 3;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
            System.out.println();
        System.out.println(i + 2); i = i + 2;  //11
        u=i++;
        System.out.println(i); //здесь 12 потому что отработало i++ в пред. стороке ?
        System.out.println(u);
            System.out.println();
        System.out.println("Hello world!!!");

        long z = 2147483647; // 2147483647 1488666777
        double db = 36.6;

        System.out.println(db);
        System.out.println(z);
            System.out.println();
        System.out.println(db++);
        System.out.println(z++);
            System.out.println();
        System.out.println(db);
        System.out.println(z);


        //И так как все целочисленные значения по умолчанию расцениваются как значения типа int, то компилятор укажет нам на ошибку. Чтобы решить проблему, надо добавить к числу суффикс l или L, который указывает, что число представляет тип long:
        //long num = 2147483649L;

        // float fl = 30.6f; ?? что делает и зачем? зачем f https://metanit.com/java/tutorial/2.12.php

            System.out.println();
        char ch=102; // символ 'f'
      //  Character  cg='\0024';   // почему не хочет выводить знак доллар https://unicode-table.com/ru/0024/
        System.out.println(ch);
       // System.out.println(cg);

        String text = "Hello \nworld";
        System.out.println(text);

        String line = "_________________________________";
        System.out.println(line);


        boolean check;
        check = true;

       // if (check == true) ... // необязательный вариант
       // if (check) 1 // укороченная запись


        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        if (36.6 > 35.6) {
            System.out.println("Death");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        System.out.println(line);

        int q = 20;
        int w = 18;
        if (q > w) {System.out.println("Better");}



        int time = 20;
        if (time < 2) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
            // Outputs "Good evening."


        System.out.println(line);

                System.out.println();

                int testscore = 76;
                char grade;

                if (testscore >= 90) {
                    grade = 'A';
                } else if (testscore >= 80) {
                    grade = 'B';
                } else if (testscore >= 70) {
                    grade = 'C';
                } else if (testscore >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("Grade = " + grade);

                {

                    System.out.println(line);

                int month = 8;
                String monthString;
                switch (month) {
                    case 1:  monthString = "January";
                        break;
                    case 2:  monthString = "February";
                        break;
                    case 3:  monthString = "March";
                        break;
                    case 4:  monthString = "April";
                        break;
                    case 5:  monthString = "May";
                        break;
                    case 6:  monthString = "June";
                        break;
                    case 7:  monthString = "July";
                        break;
                    case 8:  monthString = "August";
                        break;
                    case 9:  monthString = "September";
                        break;
                    case 10: monthString = "October";
                        break;
                    case 11: monthString = "November";
                        break;
                    case 12: monthString = "December";
                        break;
                    default: monthString = "Invalid month";
                        break;
                }
                System.out.println(monthString);
            }


        System.out.println(line);

        {
            {

                int month = 8;

                switch (month) {
                    case 1:  System.out.println("January");
                    case 2:  System.out.println("February");
                    case 3:  System.out.println("March");
                    case 4:  System.out.println("April");
                    case 5:  System.out.println("May");
                    case 6:  System.out.println("June");
                    case 7:  System.out.println("July");
                    case 8:  System.out.println("August");
                    case 9:  System.out.println("September");
                    case 10: System.out.println("October");
                    case 11: System.out.println("November");
                    case 12: System.out.println("December");
                        break;
                    default: break;
                }
            }
        }
















    }
}


/*C:\Users\pastoven\Desktop>javac myjavaprog.java

        C:\Users\pastoven\Desktop>java myjavaprog.java
        Error: Could not find or load main class myjavaprog.java

        C:\Users\pastoven\Desktop>java myjavaprog
        Error: Could not find or load main class myjavaprog

C:\Users\pastoven\Desktop>java MyJavaProg
        Error: Could not find or load main class MyJavaProg

C:\Users\pastoven\Desktop>javac myjavaprog.java

        C:\Users\pastoven\Desktop>java myjavaprog
        Error: Could not find or load main class myjavaprog

C:\Users\pastoven\Desktop>javac MyFirstJavaProgram.java

        C:\Users\pastoven\Desktop>java MyFirstJavaProgram
        Error: Could not find or load main class MyFirstJavaProgram

C:\Users\pastoven\Desktop>*/






//if
//  for

