package programers;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class HashLv3 {
    public static void main(String[] args) throws IOException{
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "pop"};
        int[] plays = {500, 600, 150, 800, 2500, 600};
        solution(genres, plays);
    }

    static int[] solution(String[] genres, int[] plays) {
        int[] answer;

        HashMap<String, Integer> Gmap = new HashMap<>();
        HashMap<Integer, Integer> Pmap = new HashMap<>();

        for (int i = 0; i < plays.length; i++){
            Pmap.put(i, plays[i]);
            Gmap.put(genres[i], Gmap.getOrDefault(genres[i], 0) + plays[i]);
        }

        answer = new int[Gmap.size() * 2];
        List<Entry<String, Integer>> Glist = new ArrayList<>(Gmap.entrySet());
        List<Entry<Integer, Integer>> Plist = new ArrayList<>(Pmap.entrySet());

        Collections.sort(Glist, (o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        });

        Collections.sort(Plist, (o1, o2) -> {
            if(o1.getValue() == o2.getValue()){
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue().compareTo(o1.getValue());
        });

        int i = 0;
        for (Entry<String, Integer> g:Glist){
            int flag = 0;
            for (Entry<Integer,Integer> p:Plist){
                if(flag == 2) break;
                if(genres[p.getKey()].equals(g.getKey())){
                    answer[i] = p.getKey();
                    flag++;
                    i++;
                }
            }
        }
        return answer;
    }
}
