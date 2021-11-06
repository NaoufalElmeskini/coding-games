package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CG_Carrefour {

    public static int computeCheckDigit(String identificationNumber) {
        int result = 0;

        int sommePaire = sommePaire(identificationNumber);
        result = sommePaire * 3;

        int sommeImpaire = sommeImpaire(identificationNumber);
        result += sommeImpaire;

        int lastDig = getLastDigit(result);

        if (lastDig == 0) {
            return lastDig;
        }
        result = 10 - lastDig;


        return result;
    }

    public static int getLastDigit(int result) {
        return result % 10;
    }

    public static int sommePaire(String identificationNumber) {
        char[] chars = identificationNumber.toCharArray();
        int somme = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                somme += Character.getNumericValue(chars[i]);
            }
        }

        return somme;
    }
    public static int sommeImpaire(String identificationNumber) {
        char[] chars = identificationNumber.toCharArray();
        int somme = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 != 0) {
                somme += Character.getNumericValue(chars[i]);
            }
        }

        return somme;
    }



    @Test
    public void mySuperMethodTest1() {
        assertEquals(4, sommePaire("123"));
        assertEquals(7, sommeImpaire("1235"));
        assertEquals(4, getLastDigit(5894));


    }
}
