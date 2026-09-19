package HashMap;

class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] buckets;
    int size;

    MyHashMap() {
        size = 10;
        buckets = new Node[size];
    }

    int hash(int key) {
        return key % size;
    }

    void put(int key, int value) {

        int index = hash(key);

        Node temp = buckets[index];

        // Key already exists
        while (temp != null) {

            if (temp.key == key) {
                temp.value = value;
                return;
            }

            temp = temp.next;
        }

        // Create new node
        Node newNode = new Node(key, value);

        // Insert at beginning
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    int get(int key) {

        int index = hash(key);

        Node temp = buckets[index];

        while (temp != null) {

            if (temp.key == key) {
                return temp.value;
            }

            temp = temp.next;
        }

        return -1;
    }

    void remove(int key) {

        int index = hash(key);

        Node temp = buckets[index];
        Node prev = null;

        while (temp != null) {

            if (temp.key == key) {

                // First node
                if (prev == null) {
                    buckets[index] = temp.next;
                }

                // Middle/last node
                else {
                    prev.next = temp.next;
                }

                return;
            }

            prev = temp;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        // put()
        map.put(10, 100);
        map.put(20, 200);
        map.put(15, 150);
        map.put(25, 250);

        System.out.println(map.get(10)); // 100
        System.out.println(map.get(20)); // 200
        System.out.println(map.get(15)); // 150
        System.out.println(map.get(25)); // 250

        map.put(10, 500);

        System.out.println(map.get(10)); // 500


        map.remove(20);

        System.out.println(map.get(20)); // -1
    }
}