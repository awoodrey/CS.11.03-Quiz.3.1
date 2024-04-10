public class Main {


    // Question 1 - calculateGrade {
    static String calculateGrade(int yay) {
        if ( yay >= 90){
            return "A";
        } else if ( yay >= 80){
            return "B";
        } else if (yay >= 70){
            return "C";
        } else if (yay >= 60){
            return "D";
        } else if (yay >= 50){
            return "E";
        } else{
            return "F";
        }
    }
    // }
    // Question 2 - fizzBuzz
   static String fizzBuzz(String str) {
       if (str.length() % 3 == 0) {
           if (str.length() % 5 == 0) {
               return "fizzbuzz";
           }
           return "fizz";
       } else if (str.length() % 5 == 0) {
           return "buzz";
       } else {
           return "unlucky";
       }
   }
    // Question 3 - frontBack
   static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        String yay = str.substring(0, 2);
        return yay + str + yay;
    }

    // Question 4 - twoAsOne
    //
    //
    static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b) {
            return true;
        }
        return false;
    }
    // Question 5 - endUp

static String endUp(String str) {
    if (str.length() < 3) {
        //capitalise all
        // return
        // sorry mr ewing I forgot how to do this
    }
    return str.substring(0, str.length() - 2) + str.substring(str.length() - 2);
}

}
