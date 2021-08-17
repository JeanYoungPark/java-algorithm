package programers;

import java.io.IOException;
import java.util.Arrays;

public class SortLv1 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int i = 0;
        for (int[] arr : commands) {
            int[] tmp = new int[arr.length];
            tmp = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
            Arrays.sort(tmp);
            answer[i] = tmp[arr[2]-1];
            i++;
        }

        return answer;
    }
}
