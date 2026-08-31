class DynamicArray {
private int[] arr;
private int size;
private int capacity;
    public DynamicArray(int capacity) {
this.size=0;
this.capacity=capacity;
this.arr=new int[capacity];
    }

    public int get(int i) {
return arr[i];
    }

    public void set(int i, int n) {
arr[i]=n;
    }

    public void pushback(int n) {
if(size==capacity){
    resize();
}
arr[size]=n;
size++;
    }

    public int popback() {
size--;
return arr[size];
    }

    private void resize() {
int[] arr1=new int[2*capacity];
for(int i=0;i<size;i++){
    arr1[i]=arr[i];
}
arr=arr1;
capacity *=2; 
    }

    public int getSize() {
return size;
    }

    public int getCapacity() {
return capacity;
    }
}
