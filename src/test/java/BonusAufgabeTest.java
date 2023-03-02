import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusAufgabeTest {

    @Test
    void ifTheFirstNumberisBiggerThanTheSecond() {
        //Given
        int zahl1 = 5;
        int zahl2 = 4;
        boolean subNumAfromNumB = true;

        //When - wichtige Info: das erste unterhalb steht für die Klasse / Datei auf die sich das Ganze bezieht und das zweite Wort auf die Methode darin
        int actual = BonusAufgabe.sumSquareOrSubstract(zahl1, zahl2, subNumAfromNumB);

        //Then
        assertEquals(-1 , actual);
    }

    @Test
    void ifTheFirstNumberIsSmallerThanTheSecond() {

        //Given
        int zahl1 = 5;
        int zahl2 = 6;

        //When
        int actual = BonusAufgabe.sumSquareOrSubstract(zahl1, zahl2);

        //Then
        assertEquals (31, actual);

    }

    @Test
    void ifTheNumbersAreTheSame() {

        //Given
        int zahl1 = 6;
        int zahl2 = 6;

        //When
        int actual = BonusAufgabe.sumSquareOrSubstract(zahl1, zahl2);

        //Then
        assertEquals (36, actual);
    }

}