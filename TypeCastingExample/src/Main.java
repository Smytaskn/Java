public class Main {
    public static void main(String[] args) {
        //veri dönüşüm örneği explict, implict

        // Implicit Dönüşüm
        int intValue = 42;
        double doubleValue = intValue;

        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);

        // Explicit Dönüşüm
        double anotherDoubleValue = 3.14;
        int anotherIntValue = (int) anotherDoubleValue;

        System.out.println("anotherDoubleValue: " + anotherDoubleValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

    }
}