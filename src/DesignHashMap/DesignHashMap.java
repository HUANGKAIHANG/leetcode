package DesignHashMap;

public class DesignHashMap {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));            // returns 1
        System.out.println(hashMap.get(3));            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        System.out.println(hashMap.get(2));            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        System.out.println(hashMap.get(2));            // returns -1 (not found)
    }
}

class MyHashMap {

    private int index;
    private int[] key;
    private int[] value;

    MyHashMap() {
        index = 0;
        key = new int[10000];
        value = new int[10000];
    }

    void put(int key, int value) {
        int i;
        for (i = 0; i < index; i++) {
            if (this.key[i] == key) {
                this.value[i] = value;
                break;
            }
        }
        if (i == index) {
            this.key[index] = key;
            this.value[index] = value;
            index++;
        }
    }

    public int get(int key) {
        for (int i = 0; i < index; i++) {
            if (this.key[i] == key)
                return this.value[i];
        }
        return -1;
    }

    void remove(int key) {
        int target = 0;
        boolean find = false;
        for (int i = 0; i < index; i++) {
            if (this.key[i] == key) {
                target = i;
                find = true;
                break;
            }
        }
        if (find) {
            for (int i = target; i < index; i++) {
                this.key[i] = this.key[i + 1];
                this.value[i] = this.value[i + 1];
            }
            index--;
        }
    }
}
