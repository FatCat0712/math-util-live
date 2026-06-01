public class MathUtilLive {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected 5! = 120; actual: " + result);
        System.out.println("expected 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected 0! = 1; actual: " + MathUtil.getFactorial(0));
//        MathUtil.getFactorial(-5);
    }
}
