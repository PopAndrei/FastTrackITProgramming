package lab7.Calculator;

public class Program {

    public void printMenuItems () {
        System.out.println(
                "\nHello HUMAN!\n\n" +
                        "Choose an option from the following menu: \n\n" +
                        "\t1. Sum\n" +
                        "\t2. Subtraction\n" +
                        "\t3. Multiply\n" +
                        "\t4. Divide\n" +
                        "\t5. Infinite Star\n" +
                        "\t6. While Small to BIG\n" +
                        "\t7. The Average of all the SEVEN\n" +
                        "\t8. How Many Fibonacci Numbers?\n" +
                        "\t9. Order Array\n" +
                        "\t10. Index And Position\n"
        );
    }

        public void menuSelecter() {
            printMenuItems();
            Read read = new Read();
            int menuNumber = read.getInt();
            Calculator calc = new Calculator();
do{
            switch (menuNumber) {
                case 1:
                    System.out.println("Enter two numbers to calculate their sum:");
                    int result = (int) calc.sum(read.getInt(), read.getInt());
                    System.out.println("The sum is: " + result);
                    break;
                case 2:
                    System.out.println("Enter two number to calculate their subtraction:");
                    result = (int) calc.subtraction(read.getInt(), read.getInt());
                    System.out.println("The subtraction is: " + result);
                    break;
            }while(menuNumber != 0)


            }


    }

}
