package programers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashLv1 {
    public static void main(String[] args)throws IOException{

    }

    public String solution(String[] participant, String[] completion){
        String ans = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String p:participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c:completion) {
            map.put(c, map.get(c) - 1);
        }

        for (Entry<String, Integer> e : map.entrySet()) {
            if(e.getValue() > 0){
                ans = e.getKey();
            }
        }
        return ans;
    }
}
