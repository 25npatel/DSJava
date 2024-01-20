//Nabh Patel
//January 19, 2024

public class P1 {
    public static void main(String[] args) {

        //Created a random array.
        int[] randomArray = new int[(int) ((Math.random() * 10))];

        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = (int) (Math.random() * 100);
        }

        System.out.println();

        int i = 0;

        //Printing all the elements that are on even indexes.
        if (randomArray.length > 0) {

            System.out.print("Here are (or is) the element(s) that are (or is) on even index(es):");

            for (i = 0; i < randomArray.length; i++) {

                if ((double) i % 2 == 0) {

                    System.out.print(" ");

                    System.out.print(randomArray[i]);
                } 
            }

            System.out.println(".");
        } else {

            System.out.println("Sorry, there is no element that is on an even index...");
        }

        System.out.println();
        
        //Printing all the even elements. 
        if (randomArray.length > 0) {

            System.out.print("Here are (or is) the even element(s):");

            for (i = 0; i < randomArray.length; i++) {

                if ((double) randomArray[i] % 2.0 == 0) {

                    System.out.print(" ");

                    System.out.print(randomArray[i]);
                } 
            } 
        }
        else {

            System.out.println("Sorry, there is no even element..");
        }

        System.out.println(".");

        System.out.println();

        //Printing elements in reverse order.
        if (randomArray.length > 0) {

            System.out.print("Here are (or is) the element(s) in reverse order:");

            for (i = (randomArray.length - 1); i >= 0; i--) {

                System.out.print(" " + randomArray[i]);
            }

            System.out.print(".");
            System.out.println();
        } else {

            System.out.println("Sorry, there is no element to be printed in reverse...");
        }

        System.out.println();

        //Printing the first and last element.
        if (randomArray.length > 0) {

            System.out.println("The first element is " + randomArray[0] + " and the last element is " + randomArray[randomArray.length - 1] + ".");
        } else {

            System.out.println("Sorry, there is no first element or last...");
        }

        System.out.println();
    }
}
