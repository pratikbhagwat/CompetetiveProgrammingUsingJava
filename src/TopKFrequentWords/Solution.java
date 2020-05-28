package TopKFrequentWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();
        ArrayList<String> finalAAnswer = new ArrayList<>();
        for ( String s : words){
            if (map.containsKey(s)){
                map.replace(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }

        ArrayList<ArrayList<Object>> list =  new ArrayList<>();

        for (String key : map.keySet()){
            ArrayList<Object> arrayListToBeAdded = new ArrayList<>();
            arrayListToBeAdded.add(key);
            arrayListToBeAdded.add(map.get(key));
            list.add(arrayListToBeAdded);
        }
        PriorityQueue<ArrayList<Object>> priorityQueue = new PriorityQueue<ArrayList<Object>>((a,b)->{
            if ((int)b.get(b.size()-1) != (int)a.get(a.size()-1)){
                return (int)b.get(b.size()-1) - (int)a.get(a.size()-1);
            }else{
                return ((String)a.get(0)).compareTo((String)b.get(0));
            }

        });

        priorityQueue.addAll(list);

        for ( int i = 0 ; i < k;i++){
            answer.add( (String)priorityQueue.remove().get(0) );
        }
        return answer;





    }
}