import java.util.*;
import java.io.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String[] delete = { "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "]", "{", "}", ":",
                "?", ",", "<", ">", "/" };

        // v 1
        new_id = new_id.toLowerCase();

        // v 2
        for (String item : delete) {
            if (new_id.contains(item)) {
                new_id = new_id.replaceAll("\\" + item, "");
            }
        }
        // v 3
        while (new_id.contains(".."))
            new_id = new_id.replace("..", ".");

        // v 4
        if (new_id.length() >= 1) {
            if (new_id.charAt(0) == '.') {
                if (new_id.length() >= 2)
                    new_id = new_id.substring(1, new_id.length() - 1);
                else
                    new_id = "";
            }
        }
        if (new_id.length() >= 1) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                if (new_id.length() >= 2)
                    new_id = new_id.substring(0, new_id.length() - 1);
                else
                    new_id = "";
            }
        }

        // v 5
        if (new_id.equals(""))
            new_id = "a";

        // v 6
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15); // 여기 처음에 인덱스 실수함
            if (new_id.charAt(14) == '.')
                new_id = new_id.substring(0, 14);
        }

        // v 7
        if (new_id.length() <= 2) {
            for (int i = new_id.length(); i <= 2; i++) {
                new_id = new_id + new_id.charAt(new_id.length() - 1);
            }
        }

        answer = new_id;
        return answer;
    }
}