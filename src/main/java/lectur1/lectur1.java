package lectur1;

public class lectur1 {
    public static void main(String[] args) {
// // // // данность - минимальная еденица
// // // public class program {  /* точка входа */

// // // }

// // /**
// //  * program
// //  */

// // /* class */
// // public class program { /* имя совпадает с файлом */
// // /* main точка входа */
// //     public static void main(String[] args) {
// //         System.out.println("{tkkje}");
// //     }

// //                /* System.out.println(); */
// // }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//     //   short age = 10;
//     //   int sum = 100000;
//     //   float car = 2.7f;
//     //   double pi =3.1314;
//     //   char ch = '1';
//     //   System.out.println(age);
//     //   System.out.println(sum);
//     //   System.out.println(car);
//     //   System.out.println(pi);
//     //   System.out.println(ch);

//     // boolean flag1 = 123<=234;
//     // boolean flag2 = 123>=234;
//     // boolean flag3 = flag1 ^ flag2;
//     // System.out.println(flag1);
//     // System.out.println(flag2);
//     // System.out.println(flag3);

//     // String mag = "Hello world!";
//     // System.out.println(mag);

//     // var i = 123;
//     // System.out.println(i);
//     // System.out.println(getType(i)); /* не работает  */

//   /*   System.out.println(Integer.MAX_VALUE);

//     String s = "qwer";
//     System.out.println(s.charAt(1)); */

//         // int a = 123;
//         // a =  a-- - --a;
//         // System.out.println(a);
//         // String s = "qwer";
//         // boolean b = s.length() >= 4 && s.charAt(4) == '1';
//         // System.out.println(b);

//         // int[] arr= new int [10];
//         // System.out.println(arr.length);

//         // int [] arr= new int[] {1, 2, 3, 4, 5};
//         // System.out.println(arr[3]);
//         // arr[3]=13;

//         // int[] arr;
//         // int brr[];
//         // int [] arr[] = new int[3][5];
//         // for(int[] line : arr){
//         //     for(int item : line){
//         //         System.out.printf("id", item);
//         //     }
//         // System.out.println();
//         // }

//         // int[][] arr = new int[3][5];

//         // for (int i = 0; i < arr.length; i++) {
//         //     for (int j = 0; j < arr[i].length; j++) {
//         //         System.out.printf("%d ", arr[i][j]);
//         //     }
//         //     System.out.println();
//         // }

//         // int i = 123; double d = i;
//         // System.out.println(i); // 123
//         // System.out.println(d); // 123.0
//         // d = 3.1415; i = (int)d;
//         // System.out.println(d); // 3.1415
//         // System.out.println(i); // 3
//         // d = 3.9415; i = (int)d;
//         // System.out.println(d); // 3.9415
//         // System.out.println(i); // 3
//         // byte b = Byte.parseByte("123");
//         // System.out.println(b); // 123
//         // b = Byte.parseByte("1234");
//         // System.out.println(b); // NumberFormatException: Value out of range



//     }
// }
// import java.util.Scanner;
// public class program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("name: ");
//  String name = iScanner.nextLine();
//  System.out.printf("Привет, %s!", name);
//  iScanner.close();
//  }
// }

// import java.util.Scanner;
// public class program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  int x = iScanner.nextInt();
//  System.out.printf("double a: ");
//  double y = iScanner.nextDouble();
//  System.out.printf("%d + %f = %f", x, y, x + y);
//  iScanner.close();
// }}

// import java.util.Scanner;
// public class program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  boolean flag = iScanner.hasNextInt();
//  System.out.println(flag);
//  int i = iScanner.nextInt();
//  System.out.println(i);
//  iScanner.close();
//  } }


// public class program {
//   public static void main(String[] args) {
//   int a = 1, b = 2;
//   int c = a + b;
//   String res = a + " + " + b + " = " + c;
//   System.out.println(res);
//   }
//  }

// public class program {
//   public static void main(String[] args) {
//   int a = 1, b = 2;
//   int c = a + b;
//   String res = String.format("%d + %d = %d \n", a, b, c);
//   System.out.printf("%d + %d = %d \n", a, b, c);
//   System.out.println(res);
//   }
//  }


// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений


// public class program {
//   public static void main(String[] args) {

//   float pi = 3.1415f;
//   System.out.printf("%f\n", pi); // 3,141500
//   System.out.printf("%.2f\n", pi); // 3,14
//   System.out.printf("%.3f\n", pi); // 3,141
//   System.out.printf("%e\n", pi); // 3,141500e+00
//   System.out.printf("%.2e\n", pi); // 3,14e+00
//   System.out.printf("%.3e\n", pi); // 3,141e+00
//   }
//  }


// public class program {
//   static void sayHi() {
//   System.out.println("hi!");
//   }
//   static int sum(int a, int b) {
//   return a+b;
//   }
//   static double factor(int n) {
//   if(n==1)return 1;
//   return n * factor(n-1);
//   }
//   public static void main(String[] args) {
//   sayHi(); // hi!
//   System.out.println(sum(1, 3)); // 4
//   System.out.println(factor(5)); // 120.0
//   }}

// public class program {
//   public static void main(String[] args) {
//   int a = 1;
//   int b = 2;
//   int c;
//   if (a > b) {
//   c = a;
//   } else {
//   c = b;
//   }
//   System.out.println(c);
//   }
//  }


// public class program {
//   public static void main(String[] args) {
//   int a = 1;
//   int b = 2;
//   int c = 0;
//   if (a > b) c = a;
//   if (b > a) c = b;
//   System.out.println(c);
//   }
//  }


// public class program {
//   public static void main(String[] args) {
//   int a = 1;
//   int b = 2;
//   int min = a < b ? a : b;
//   System.out.println(min);
//   }
//  }


// import java.util.Scanner;
// public class program {
//  public static void main(String[] args) {
//  int mounth = value;
//  String text = "";
//  switch (mounth) {
//  case 1:
//  text = "Autumn";
//  break;
// ...
//  default:
//  text = "mistake";
//  break;
//  }
//  System.out.println(text);
//  iScanner.close();
//  }
// }

// public class program {
//   public static void main(String[] args) {
//   int value = 321;
//   int count = 0;
//   while (value != 0) {
//   value /= 10;
//   count++;
//   }
//   System.out.println(count);
//   }
//  }


// public class program {
//   public static void main(String[] args) {
//   int value = 321;
//   int count = 0;
//   do {
//   value /= 10;
//   count++;
//   } while (value != 0);
//   System.out.println(count);
//   }
//  }


// public class program {
//   public static void main(String[] args) {
//   int s = 0;
//   for (int i = 1; i <= 10; i++) {
//   s += i;
//   }
//   System.out.println(s);
//   }
//  }

// public class program {
//   public static void main(String[] args) {
//   for (int i = 0; i < 5; i++) {
//   for (int j = 0; j < 5; j++) {
//   System.out.print("* ");
//   }
//   System.out.println();
//   }
//   // * * * * *
//   // * * * * *
//   // * * * * *
//   // * * * * *
//   // * * * * *
//   }
//  }

// public class program {
//   public static void main(String[] args) {
//   int arr[] = new int[10];
//   for (int item : arr) {
//   System.out.printf("%d ", item);
//   }
//   System.out.println();
//   }
//  }

// Работа с файлами
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//  public static void main(String[] args) {
//  try (FileWriter fw = new FileWriter("file.txt", false)) {
//  fw.write("line 1");
//  fw.append('\n');
//  fw.append('2');
//  fw.append('\n');
//  fw.write("line 3");
//  fw.flush();
//  } catch (IOException ex) {
//  System.out.println(ex.getMessage());
//  }
//  } }


// Работа с файлами
// Чтение, Вариант посимвольно
// import java.io.*;
// public class Program {
//  public static void main(String[] args) throws Exception {
//  FileReader fr = new FileReader("file.txt");
//  int c;
//  while ((c = fr.read()) != -1) {
//  char ch = (char) c;
//  if (ch == '\n') {
//  System.out.print(ch);
//  } else {
//  System.out.print(ch);
//  }
//  }
//  } }

// Работа с файлами
// Вариант построчно
// import java.io.*;
// public class Program {
//  public static void main(String[] args) throws Exception {
//  BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//  String str;
//  while ((str = br.readLine()) != null) {
//  System.out.printf("== %s ==\n", str);
//  }
//  br.close();
//  }
// }


    }
}
