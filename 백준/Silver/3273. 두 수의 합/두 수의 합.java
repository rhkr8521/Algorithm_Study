
import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = N-1;
        int answer = 0;

        while (start < end){

            if(arr[start] + arr[end] < x){
                start++;
            }else if(arr[start] + arr[end] > x){
                end--;
            }else{
                answer++;
                start++;
                end--;
            }
        }

        bw.write(answer+"");
        bw.flush();
    }
}