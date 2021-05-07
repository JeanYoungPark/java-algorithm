package programers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashLv2_1 {
    public static void main(String[] args)throws IOException{
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        solution(clothes);
    }

    static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for(String s[]:clothes){
            map.put(s[1], map.getOrDefault(s[1],0)+1);
        }

        for(Entry<String, Integer> e:map.entrySet()){
            answer *= e.getValue()+1;
        }

        return answer-1;
    }
}
