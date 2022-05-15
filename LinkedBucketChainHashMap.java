/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments.Assignment_4;

/**
 *
 * @author Bhargav Patel
 * 3098320.
 */
import java.util.*;

public class LinkedBucketChainHashMap<K, V> extends AbstractHashMap<K, V> {

    private LinkedList<MapEntry<K, V>>[] table;

    public LinkedBucketChainHashMap() {
        super();
    }

    public LinkedBucketChainHashMap(int cap) {
        super(cap);
    }

    public LinkedBucketChainHashMap(int cap, int p) {
        super(cap, p);
    }

    @Override
    protected void createTable() {
        table = (LinkedList<MapEntry<K, V>>[]) new LinkedList[capacity];
    }

    @Override
    protected V bucketGet(int h, K k) {
        LinkedList<MapEntry<K, V>> bucket = table[h];
        if (bucket == null) {
            return null;
        }
        return bucket.get(h).getValue();
    }

    @Override
    protected V bucketPut(int h, K k, V v) {
        LinkedList<MapEntry<K, V>> bucket = table[h];
        if (bucket == null) {
            bucket = table[h] = new LinkedList<>();
        }
        int oldSize = bucket.size();
        V value = null;
        boolean check = true;
        for (MapEntry<K, V> mE : bucket) {
            if (mE.getKey().equals(k)) {
                value = mE.setValue(v);
                check = false;
            }
        }
        if (check) {
            bucket.addLast(new MapEntry<>(k, v));
        }
        n += (bucket.size() - oldSize);
        return value;
    }

    @Override
    protected V bucketRemove(int h, K k) {
        LinkedList<MapEntry<K, V>> bucket = table[h];
        if (bucket == null) {
            return null;
        }
        int oldSize = bucket.size();
        V value = null;
        for (MapEntry<K, V> mE : bucket) {
            if (mE.getKey().equals(k)) {
                value = mE.getValue();
                bucket.remove(new MapEntry<>(k, value));
            }
        }
        return value;
    }
    
    public int numCollisions(){
        int collisions = 0;
        for(int h = 0; h < capacity; h++){
            if(table[h] != null)
                collisions += (table[h].size() - 1);
        }
        return collisions;
    }

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        for (int h = 0; h < capacity; h++) {
            if (table[h] != null) {
                for (Entry<K, V> entry : table[h]) {
                    buffer.add(entry);
                }
            }
        }
        return buffer;
    }
    
    @Override
    public String toString(){
        return values().toString();
    }
}
