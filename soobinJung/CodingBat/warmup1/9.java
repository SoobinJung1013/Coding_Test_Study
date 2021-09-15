class Solution {
    public String notString(String str) {
        // not + str
        String[] ext = str.split(" ");

        if (ext[0].equals("not")) {
            return str;
        }

        return "not " + str;
    }

}

/*
 * public String notString(String str) { if (str.length() >= 3 &&
 * str.substring(0, 3).equals("not")) { return str; }
 * 
 * return "not " + str; }
 */

// str.substring(0, 3).equals("not")
