package coc;

/**
 * Faire une boucle de 1 a 100
 * quand on rencontre un multiple de 3 imprimer "Chaussettes"
 * quand on rencontre un multiple de 5 imprimer "Sales"
 * quand on recontre un multiple de 3 et de 5 imprimer "ChaussettesSales"
 * sinon imprimer le nombre
 */

public class ChaussettesSalesChallenge {

    public static final String CHAUSSETTES_SALES = "ChaussettesSales";
    public static final String CHAUSSETTES = "Chaussettes";
    public static final String SALES = "Sales";

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println( chaussettessalles(i) );
        }
    }

    /**
     *
     * @param n
     * @return "ChaussettesSales" si n est multiple de 3 et de 5,
     * "Chaussettes" si n est multiple de 3, "Sales" si multiple de 5
     * autrement retourner 'n'
     */
    public static String chaussettessalles(int n) {
        if ((n % 3 == 0) && (n % 5 == 0))  {
            return CHAUSSETTES_SALES;
        }
        else if (n % 3 == 0)  {
            return CHAUSSETTES;
        } else if (n % 5 == 0)  {
            return SALES;
        }
        return String.valueOf(n);
    }

    public static String chaussettessalles2(int n) {
        /* equivalent à n%3 == 0 && n%5 ==0 (car 3 et 5 sont premiers => equivalence logique)*/
        if ((n % 15 == 0))  {
            return CHAUSSETTES_SALES;
        }
        else if (n % 3 == 0)  {
            return CHAUSSETTES;
        } else if (n % 5 == 0)  {
            return SALES;
        }
        return String.valueOf(n);
    }

}
























