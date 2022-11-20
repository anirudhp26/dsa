package dsa.dsa;

class customStacks{
    private int[] data;
    int ptr = -1;

    public customStacks(){
        this.data = new int[10];
    }

    public customStacks(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop(){
        int removedEle = data[ptr];
        data[ptr] = null;
        ptr--;
        return removedEle;
    }
}