package programers;

import java.io.IOException;
import java.util.HashMap;

public class HashLv2 {
    public static void main(String[] args)throws IOException{
        String[] phone_book = {"119", "97674223", "1195524421"};
        solution(phone_book);
    }

    static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> map = new HashMap<>();

        for(String p:phone_book){
            map.put(p,p);
        }

        //substring 2번째 인자는 -1위치의 인덱스로 계산된다.
        for(String p:phone_book){
            for(int i = 0; i<p.length();i++){
                if(map.containsKey(p.substring(0,i))){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
