public class Math_Class {
    public static void main(String[] args) {
        double a=3.0;
        double b=7.0;
        System.out.println("Min: "+ Math.min(a,b));
        System.out.println("Max: "+ Math.max(a,b));
        System.out.println("Sqrt(16): "+ Math.sqrt(16));
        System.out.println("Pow(2,5): "+ Math.pow(2,5));
        System.out.println("abs(-12): "+ Math.abs(-12));
        // Calculating average manually
        double avg = (a+b)/2;
        System.out.println("Average : " + avg);
    }
}
