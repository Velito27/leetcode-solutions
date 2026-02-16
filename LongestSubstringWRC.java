package leetcodeSolutions;

//Change this to a solution to prevent the error; this is simply for testing purposes.
class LongestSubstringWRC {
    public int lengthOfLongestSubstring(String s) {

        int inicio = 0;
        int max = 0;

        boolean[] visto = new boolean[256];

        for (int fin = 0; fin < s.length(); fin++) {

            while (visto[s.charAt(fin)]) {
                visto[s.charAt(inicio)] = false;
                inicio++;
            }

            visto[s.charAt(fin)] = true;

            int largo = fin - inicio + 1;
            if (largo > max) {
                max = largo;
            }
        }

        return max;
    }
}