public class basics {
    public static void main(String[] args) {

        // int data type
        int valueOne = 10;
        int valueTwo = Integer.MIN_VALUE;
        int valueThree = Integer.MAX_VALUE;

        System.out.println("Value of valueOne variable = " + valueOne);
        System.out.println("int value range in Java is: " + valueTwo + " to " + valueThree + "\n");

        // float data type
        float floatOne = 10.6F;
        float floatTwo = Float.MIN_VALUE;
        float floatThree = Float.MAX_VALUE;

        System.out.println("Value of floatOne variable = " + floatOne);
        System.out.println("float value range in Java is: " + floatTwo + " to " + floatThree + "\n");

        // boolean data type
        boolean boolOne = true;
        boolean boolTwo = false;

        System.out.println("Value of boolOne = " + boolOne);
        System.out.println("Value of boolTwo = " + boolTwo + "\n");

        // char data type
        char charOne = 'a';
        char charTwo = 'b';
        char charThree = 'c';

        System.out.println("Here are our letters:\n" +
                "charOne = " + charOne + "\n" +
                "charTwo = " + charTwo + "\n" +
                "charThree = " + charThree + "\n");


        // casting
        int v1 = 111;

        // will give error
        // byte v2 = (v1 / 2);

        // will not give error
        byte v2 = (byte) (v1 / 2);

        // exercise
        byte a = -100;
        short b = -467;
        int c = 100000;
        long d = (50000L + 10L * (a + b + c));
        System.out.println(d);

        short pounds = 662;
        float kilograms = pounds * 0.45359237F;
        System.out.println(kilograms);
    }
}
