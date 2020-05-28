package MinimumCosttoConnectSticks1167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static int cost;
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for ( int stick : sticks ){
            priorityQueue.add(stick);
        }

        while (priorityQueue.size()!=1){
            int stick1 = priorityQueue.remove();
            int stick2 = priorityQueue.remove();
            cost+=stick1+stick2;
            priorityQueue.add(stick1+stick2);
        }
        return cost;
    }
}