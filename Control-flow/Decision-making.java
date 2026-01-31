// if statement

int score = 85;   

if (score > 65) {
    System.out.println("You passed the test! 🎉");
}

// if-else statement

public class Sample {
   public static void main(String[] args) {
       int a = 30;
       int b = 30;
       if (b > a) {
           System.out.println("b is greater");
       } else if (a > b) {
           System.out.println("a is greater");
       } else {
           System.out.println("Both are equal");
       }
   }
}

// else-if statement

int temp = 90;

if (temp < 40) {
    System.out.println("It may be snowing! ❄️"); 
} else if (temp < 80) {
    System.out.println("Enjoy the weather! 👌");
} else {
    System.out.println("Okay... It is getting a little hot in here. 🔥"); 
}
