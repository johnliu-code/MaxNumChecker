import java.util.ArrayList;
import java.util.Scanner;

class MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<>();

        InputValue(numsList);
        int maxNum = checkMaxNum(numsList);
        System.out.println("The Maximum number is :" + maxNum + ". the position is Index of: " + numsList.indexOf(maxNum));

    }
    //Input value method
    public static void InputValue(ArrayList<Integer> numsList){
        int i = 0;
        int number;
        int numOfItems = 0;

        System.out.println("How manny numbers you want to input? ");
        int numToCheck = validateNumber();
        while(numOfItems < numToCheck) {
            System.out.println("Please entre the No. " + (i + 1) + " of "+ numToCheck + " numbers");
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
    }

    //Check Maximum number and output the value
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