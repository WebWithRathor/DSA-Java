import java.util.Arrays;

public class MyHashMap {

    private Pair[] arr;
    private int index;

    public MyHashMap() {
        arr = new Pair[50];
        index = 0;
    }

    public void put(int key, int value) {
        int j = -1;
        Pair newPair = new Pair(key, value);
        for (int i = 0; i < index; i++) {
            if (arr[i].key == key) {
                j = i;
                break;
            }
        }
        if (j != -1) {
            System.out.println(newPair.key);
            arr[j] = newPair;
        } else {
            arr[index] = newPair;
            index++;
        }
    }

    public int get(int key) {
        for (int i = 0; i < index; i++) {
            if(arr[i].key == key) return arr[i].value;
        }
        return -1;
    }

    public void remove(int key) {
        if(index ==0)return;
        int j = -1;
        for (int i = 0; i < index; i++) {
            if (arr[i].key == key) {
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for (int k = j; k < arr.length - 1; k++) {
            arr[k] = arr[k + 1];
        }
        index--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for(int  i = 0 ; i < index ; i++){
            sb.append(arr[i]+" ,");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append(" ]");
        return sb.toString();
    }

    class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return  "{" +this.key + " = " + this.value + "}";
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.remove(77);
        map.put(44, 57);
        map.remove(60);
        map.remove(36);
        System.out.println(map.get(18));
        map.remove(7);
        map.put(65, 15);
        System.out.println(map.get(65));
        map.remove(80);
        map.put(11, 34);
        map.put(41, 4);
        map.put(36, 10);
        map.put(94, 69);
        map.put(28, 37);
        map.put(99, 91);
        map.put(78, 2);
        map.put(35, 17);
        map.put(11, 51);
        map.put(89, 35);
        map.put(31, 65);
//        map.remove(2);
//        map.put(71, 82);
//        map.put(92, 17);
//        System.out.println(map.get(89));
//        map.put(1, 50);
//        System.out.println(map.get(99));
//        map.put(4, 36);
//        map.put(93, 37);
//        System.out.println(map.get(11));
//        map.put(39, 42);
//        map.remove(90);
//        map.remove(77);
//        map.put(75, 92);
//        map.put(49, 29);
//        System.out.println(map.get(49));
//        map.remove(99);
//        map.put(86, 85);
//        map.put(64, 53);
//        map.put(48, 92);
//        System.out.println(map.get(78));
//        map.put(15, 41);
//        map.put(31, 84);
//        map.remove(94);
//        map.put(42, 38);
//        map.remove(65);
//        map.remove(75);
//        map.remove(36);
//        map.put(6, 46);
//        map.remove(15);
//        System.out.println(map.get(31));
//        map.put(36, 45);
//        map.put(68, 57);
//        map.put(61, 3);
//        map.put(47, 69);
//        map.remove(71);
//        map.put(41, 60);
//        System.out.println(map.get(6));
//        map.put(92, 53);
//        map.put(82, 8);
//        System.out.println(map.get(82));
//        map.put(83, 62);
//        map.remove(42);
//        System.out.println(map.get(41));
//        System.out.println(map.get(93));
//        map.remove(35);
//        map.put(64, 69);
//        map.put(48, 43);
//        map.put(21, 61);
//        map.put(27, 67);
//        map.put(5, 71);
//        map.put(55, 30);
//        System.out.println(map.get(48));
//        System.out.println(map.get(27));
//        map.remove(64);
//        map.put(45, 6);
//        map.put(30, 64);
//        map.put(76, 89);
//        map.put(81, 94);
//        System.out.println(map.get(45));
//        map.remove(21);
//        map.put(57, 45);
//        map.put(43, 83);
//        map.put(27, 20);
//        map.put(56, 69);
//        map.put(97, 2);
//        map.put(74, 6);
//        map.put(99, 32);
//        map.put(88, 27);
//        map.put(22, 29);
//        map.put(91, 30);
//        map.remove(92);
//        map.remove(61);
//        System.out.println(map.get(47));
//        map.remove(57);
//        map.put(80, 74);
//        map.put(52, 13);
//        map.remove(55);
//        System.out.println(map.get(52));
//        map.put(39, 43);
//        map.put(14, 12);
        System.out.println(map);

//        [],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]
    }


}
