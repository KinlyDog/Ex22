public class Level1 {
    public static String Keymaker(int k) {
        int[] ma = new int[k];

        for (int i = 0; i < k; i++) {
            ma[i] = 1;
        }

        int t = 1;
        while (t < k) {
            for (int i = t; i < ma.length; i += t + 1) {
                if (ma[i] == 0) {
                    ma[i] = 1;
                } else {
                    ma[i] = 0;
                }
            }

            t++;
        }

        StringBuilder strBld = new StringBuilder();
        for (int i = 0; i < ma.length; i++) {
            strBld.append(ma[i]);
        }

        return strBld.toString();
    }
}
