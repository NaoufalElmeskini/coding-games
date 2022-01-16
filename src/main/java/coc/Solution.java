package coc;


class Solution {

    /**
     * Method returning closest number to zero.
     * If 2 candidats exists, one positif and the other negatif ; return the positif.
     *
     * @param array
     * @return
     */
    public static int computeClosestToZero(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(min)) {
                min = array[i];
            }
            else if (array[i] + min == 0) {
                min = Math.abs(min);
            }

        }

        return min;
    }

    /**
     * Votre programme doit trier un tableau d'entiers dans l'ordre croissant.
     * Les entiers sont contenus dans [-1000000,1000000].
     *
     * Ligne 1 : 1 entier N
     * Ligne 2 : N entiers séparés par des espaces.
     *
     * SORTIE :
     * Ligne 1 : les N entiers dans l'ordre croissant, séparés par des espaces.
     *
     * CONTRAINTES :
     * 0 < N < 1000
     *
     * Entrée
     * 5
     * 5 4 9 2 7
     * Sortie
     * 2 4 5 7 9
     *
     */
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int value = array[i];
        array[i] = array[j];
        array[j] = value;
    }
}
