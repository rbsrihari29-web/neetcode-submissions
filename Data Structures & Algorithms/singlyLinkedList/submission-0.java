class LinkedList {
    ArrayList<Integer> list;
    public LinkedList() {
list=new ArrayList<>();
    }

    public int get(int index) {
        if(index<list.size()){
        return list.get(index);
        }
        else{
            return -1;
        }
    }

    public void insertHead(int val) {
        int n=list.size();
        list.add(0,val);
    }

    public void insertTail(int val) {
        list.add(val);
    }

    public boolean remove(int index) {
        if(index<list.size()){
        list.remove(index);
        return true;
        }
        else{
            return false;
        }
    }

    public ArrayList<Integer> getValues() {
        return list;
    }
}
