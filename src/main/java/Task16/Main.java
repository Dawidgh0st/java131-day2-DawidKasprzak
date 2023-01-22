package Task16;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        System.out.println(Runner.getFitnessLevel(130));
        System.out.println(Runner.getFitnessLevel(190));
        System.out.println(Runner.getFitnessLevel(250));
        System.out.println();
        System.out.println(Runner.getFitnessLevel2(150));
        System.out.println();
        System.out.println(Runner.getFitnessLevel3(130));
        System.out.println(Runner.getFitnessLevel3(190));
        System.out.println(Runner.getFitnessLevel3(250));
        System.out.println(Runner.getFitnessLevel3(70));

    }
}
