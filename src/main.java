import java.util.ArrayList;
import java.util.Scanner;

class MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<>();
        int i = 0;
        int number;
        int numOfItems = 0;

        while(numOfItems < 10) {
            System.out.println("Please entre the No. " + (i + 1) + " of 10 numbers");
            number = validateNumber();
            numsList.add(number);
            numOfItems = numsList.size();
            if (number != 0){
                i++;
            }else{
                numsList.remove(i);
                i = numOfItems-1;
            }

      }
        int maxNum = checkMaxNum(numsList);
        System.out.println("The Maxmum number is :" + maxNum + ". the position is Index of: " + numsList.indexOf(maxNum));

    }

    //Check Maxmum number and outpit the value
    public static int checkMaxNum(ArrayList<Integer> numsList) {
        int maxNum = 0;
        for (Integer integer : numsList) {
            if (integer >= maxNum)
                maxNum = integer;
        }
        return maxNum;
    }


   // Validate user input
    public static int validateNumber() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        if (!sc.hasNextInt()) {
            String input = sc.next();
            System.out.printf("\"%s\" is not a valid number.%n", input);
        } else {
            number = sc.nextInt();
        }
        return number;
    }
}