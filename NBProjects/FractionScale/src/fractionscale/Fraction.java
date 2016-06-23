package fractionscale;

public class Fraction {
private int numerator;
private int denominator;

public Fraction(int num, int denom) {
    numerator = num;
    denominator = denom;
}

public int getNumerator() {
    return numerator;
}

public int getDeominator(){
    return denominator;
}

public Fraction add(Fraction f) {
    int num = numerator * f.denominator + f.numerator * denominator;
    int denom = denominator * f.denominator;
    return new Fraction(num,denom);
}

public Fraction divide(Fraction f) {
    int num = numerator * f.denominator;
    int denom = denominator * f.numerator;
    return new Fraction(num, denom);
}
public Fraction(){
    numerator = 0;
    denominator = 1;
}

public Fraction (int num) {
    numerator = num;
    denominator = 1;
}

public void scaleup(int factor) {
    numerator *= factor;
    
}

public void scaledown(int factor) {
    checkFactor(factor);
    denominator *= factor;
}
public void checkFactor(int factor) {
    if(factor == 0) {
        System.out.println("Warning! Scale factor can't be 0 for scale down.");
    System.exit(0);
    }
    
}

public void scale(int factor,boolean flag) {
    //checkFactor(factor);
   if(flag) scaleup(factor);
   else scaledown(factor);
}
}
