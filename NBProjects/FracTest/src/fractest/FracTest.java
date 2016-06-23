package fractest;

/**
 *
 * @author YasH
 */
public class FracTest {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(5, 6);

        Fraction newFrac;
        newFrac = f1.subtract(f2);

        System.out.println("The Subtraction of " + f1.getNumerator() + "/" + f1.getDeominator() + " and "
                + f2.getNumerator() + "/" + f2.getDeominator() + " is : " + newFrac.getNumerator() + "/" + newFrac.getDeominator());
        newFrac = f1.multiply(f2);

        System.out.println("The Multiplication of " + f1.getNumerator() + "/" + f1.getDeominator() + " and "
                + f2.getNumerator() + "/" + f2.getDeominator() + " is : " + newFrac.getNumerator() + "/" + newFrac.getDeominator());
    }

}
