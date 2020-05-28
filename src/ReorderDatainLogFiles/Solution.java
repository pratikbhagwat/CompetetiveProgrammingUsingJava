package ReorderDatainLogFiles;

import java.math.BigInteger;
import java.util.ArrayList;
//import
public class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> letterLogs = new ArrayList<>();
        ArrayList<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            try {
                new  BigInteger(log.split(" ")[1]);
                digitLogs.add(log);
            } catch (Exception e) {
                letterLogs.add(log);
            }

        }
        letterLogs.sort((a,b)->{
            String[] splittedA =  a.split(" ");
            String[] splittedB =  b.split(" ");

            for (int i = 1;i<Math.min(splittedA.length,splittedB.length);i++){
                if (splittedA[i].compareTo(splittedB[i]) == 0){
                    continue;
                }else {
                    return splittedA[i].compareTo(splittedB[i]);
                }
            }
            if (splittedA.length > splittedB.length){
                return +1;
            }else if (splittedA.length < splittedB.length){
                return -1;
            }else {
                return splittedA[0].compareTo(splittedB[0]);
            }
        });
        letterLogs.addAll(digitLogs);

        String[] answer = new String[letterLogs.size()];

        for (int i = 0;i<letterLogs.size();i++){
            answer[i] = letterLogs.get(i);
        }
        return answer;
    }

}
