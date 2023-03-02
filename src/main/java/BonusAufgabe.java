
public class BonusAufgabe {
    public static void main(String[] args) {}

        int zahl1 = 2;
        int zahl2 = 5;
        public static int sumSquareOrSubstract ( int zahl1, int zahl2){

            if (zahl1 > zahl2) {
                return (zahl1 + zahl2);
            } else {
                return (zahl1 * zahl2);
            }

        }

    public static int sumSquareOrSubstract ( int zahl1, int zahl2, boolean subNumAfromNumB){
        if (subNumAfromNumB == true) {
            return (zahl2 - zahl1);
        }
        if (zahl1 > zahl2) {
            return (zahl1 + zahl2);
        } else {
            return (zahl1 * zahl2);
        }

    }
    }
