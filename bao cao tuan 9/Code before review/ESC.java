
package esc;

import java.io.IOException;
import java.util.*;


 public class ESC {

    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        int N = br.nextInt();
        String line=br.nextLine();
        int maxInDay=0;
        int maxNDay=0;
        int count1=0;
        int count2=0;
        for (int i = 0; i < N; i++) {
            line=br.nextLine();
            for(int j=0; j<line.length();j++){
                if(line.charAt(j)=='C'){
                    count1++;
                    count2++;
                }else{
                    if(count2>maxInDay){
                        maxInDay=count2;
                        count2=0;
                    }
                    if(count1>maxNDay){
                        maxNDay =count1;
                        count1=0;
                    }
                    count1=0;
                    count2=0;
                }
            }
            if(count2>maxInDay){
            	maxInDay=count2;
            }
            count2=0;
        }
        if(count1>maxNDay){
            maxNDay =count1;
        }
        System.out.println(maxInDay +" " + maxNDay);
    }
}