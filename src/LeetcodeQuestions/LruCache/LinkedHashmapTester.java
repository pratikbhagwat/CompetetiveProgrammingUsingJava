package LeetcodeQuestions.LruCache;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmapTester {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.get(2);
        lruCache.put(2, 6);
        lruCache.get(1);       // returns 1
        lruCache.put(1, 5);    // evicts key 2
        System.out.println( lruCache.get(2) );       // returns -1 (not found)
        lruCache.put(4, 4);    // evicts key 1
        lruCache.get(1);       // returns -1 (not found)
        lruCache.get(3);       // returns 3
        lruCache.get(4);       // returns 4
    }
}
