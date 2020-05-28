
package LeetcodeQuestions.LruCache;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRUCache {


     int capacity;
     LinkedHashMap<Integer, Integer> hashMap ;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.hashMap = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (this.hashMap.containsKey(key)){
            int val = this.hashMap.get(key);
            this.hashMap.remove(key);
            this.hashMap.put(key,val);
            return val;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (this.hashMap.containsKey(key)){
            this.hashMap.remove(key);
            this.hashMap.put(key,value);
        }else {
            if (this.capacity == this.hashMap.keySet().size()){
                for (int keyy : this.hashMap.keySet()){
                    this.hashMap.remove(keyy);
                    break;
                }
//                this.hashMap.remove( (int)this.hashMap.keySet().toArray()[0]);
                this.hashMap.put(key,value);
            }else {
                this.hashMap.put(key,value);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */