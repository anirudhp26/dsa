import java.util.Arrays;

class customStacks{
    private int[] data;
    int ptr = -1;

    public customStacks(){
        this.data = new int[10];
    }

    public customStacks(int size){
        this.data = new int[size];
    }

    public void push(int item){
        if (ptr == data.length - 1) {
            data = Arrays.copyOf(data, ptr*2);
        }
        ptr++;
        data[ptr] = item;
    }
    public boolean pop(){
        if (isEmpty()) {
            System.out.println("Cannot Remove an element from an Empty Stack");
            return false;
        }
        ptr--;
        return true;
    }

    public void display(){
        // System.out.println(Arrays.toString(data));
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i]);
            System.out.print("-->");
        }
        System.out.println("Top of Stack");
    }

    public boolean search(int item) {
        if (isEmpty()) {
            System.out.println("Cannot Search elements from an Empty Stack");
            return false;
        }
        else {
            for (int i = 0; i <= ptr; i++) {
                if (data[i] == item) {
                    System.out.print("DATA FOUND AT INDEX: ");
                    System.out.print(i);
                    return true;
                }
            }
            System.out.println("ELEMENT NOT FOUND");
            return false;
        }
    }

    public boolean isEmpty(){
        if (ptr == -1) {
            return true;
        }
        return false;
    }
}