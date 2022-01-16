package codewars;



public class ReplaceNthCharacter {

    /**
     * write a methode that replaces every N-th character in a text, by another character
     * @param text the text to change
     * @param n
     * @param oldValue character old value to change
     * @param newValue character new value
     * @return
     */
    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        char[] textChars = text.toCharArray();
        int count = n+1;

        for (int i = 0; i < textChars.length; i++) {
            if ((textChars[i] == oldValue)
                    && (count % n == 0)) {
                textChars[i] = newValue;
                count = 1;
            } else {
                count++;
            }
        }

        return new String(textChars);
    }

    public static void testModulo(){
        for (int i = 1; i < 11; i++) {
            int result = (10 + i) % 10;
            System.out.println(result);
        }
    }

    public int computeClosestToZero(int[] tab) {
        int min = tab[0];

        for (int i : tab) {
            if (Math.abs(tab[i]) < Math.abs(min)) {
                min = tab[i];
            } else if (tab[i] + min == 0) {
                if (min < 0) {
                    min = tab[i];
                }
            }
        }

        return min;
    }
}
