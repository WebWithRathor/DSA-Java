package ArrayList;

class My_list{
    int [] data;
    int end = -1;

    public My_list(){
        data = new int[10];
    }

    public My_list(int initialCapacity){
        data = new int[initialCapacity];
    }

    private void reallocate(){
        int [] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
    }

    public void add(int value){

    }
    public void add(int value,int index){}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i <= end; i++) {
            sb.append(data[i]);
            if(i!=end)sb.append(", ");
        }
        sb.append(" ]");
        return sb.toString();
    }
}

public class IntroAndQuestions {
    public static void main(String[] args) {
        My_list list = new My_list();
        System.out.println(list);
    }
}
