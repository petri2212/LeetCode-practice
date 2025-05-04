class Solution {
    public boolean isAnagram(String s, String t) {
        //contains()
        String rerwite_s = "";

        for (int i = 0; i < s.length(); i++) {

            if(s.length() != t.length()){
                return false;
            }


            String prova = "";
            int count_s = 0;
            int count_t = 0;
            char temp = s.charAt(i);

            prova += temp;

            if (!(i == 0)) {

                if (rerwite_s.contains(prova)) {
                    continue;
                }

            }

            for (int j = 0; j < s.length(); j++) {
                if (temp == s.charAt(j)) {
                    count_s++;
                }
                if (temp == t.charAt(j)) {
                    count_t++;
                }
            }
            if (count_s != count_t) {
                return false;
            }
            rerwite_s += temp;
        }
        return true;

    }
}
