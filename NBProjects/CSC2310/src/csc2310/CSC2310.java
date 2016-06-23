//Name: Pallav Shah
package csc2310;

public class CSC2310 {

    public static void main(String[] args) {
        Student s1 = new Student("Pallav Shah");
        Student s2 = new Student();
        double[] t1 = new double[3];
        double[] t2 = new double[3];

        for (int i = 0; i < t1.length; i++) {
            t1[i] = Math.random() * 100;
        }

        s1.setTest(t1);

        s2.setName("Yash Shah");
        for (int i = 0; i < t2.length; i++) {
            t2[i] = Math.random() * 100;
        }
        s2.setTest(t2);

        System.out.println(s1.getName() + "'s score is \"" + s1.getLetterGrade() + "\"   "
                + "best score = " + s1.getBestScore());
        System.out.println(s2.getName() + "'s score is \"" + s2.getLetterGrade() + "\"   "
                + "best score = " + s2.getBestScore());

    }

}
