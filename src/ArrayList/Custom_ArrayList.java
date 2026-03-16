package ArrayList;

public class Custom_ArrayList {

    Custom_ArrayList(int size){
        arr = new Object[size];
    }

    Object[] arr = null;
    int index = 0;

    public void add(Object obj){

        if(index >= arr.length){
            int new_size = arr.length + (arr.length / 2);
            Object[] arr2 = new Object[new_size];

            for(int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }

            arr = arr2;
        }

        arr[index] = obj;
        index++;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append('[');

        for(int i = 0; i < index; i++){
            s.append(arr[i]);

            if(i < index - 1){
                s.append(", ");
            }
        }

        s.append(']');
        return s.toString();
    }

    public Object get(int index) throws Exception {

        if(index >= this.index || index < 0){
            throw new Exception("Index not found");
        }

        return arr[index];
    }

    public int size(){
        return index;//We return index in the size() method because index keeps track of how many elements are currently
                     // present in the array. Every time we add an element, index increases, and when we remove an
                     // element, index decreases. So the value stored in index always represents the current size of
                     // the list.
    }

    public void remove(int indexToBeDeleted) throws Exception {

//        if(indexToBeDeleted >= index || indexToBeDeleted < 0){
//            throw new Exception("Index not found");
//        }
//
//        Object[] o = new Object[arr.length - 1];
//
//        for(int i = 0; i < o.length; i++){
//            if(i < indexToBeDeleted){
//                o[i] = arr[i];
//            }else{
//                o[i] = arr[i + 1];
//            }
//        }
//
//        arr = o;
//        index--; // index tracks number of elements, and after removing one element we reduce it by 1


        // We do not need to create a new object array. We will perform the changes in the same array.
        // This approach will not decrease our array capacity. by doing above code
        // it shrinks the capacity but this code does not shrink the array capacity
        // Capacity remains same
        //Size decreases by 1
        if(indexToBeDeleted >= index || indexToBeDeleted < 0){
            throw new Exception("Index not found");
        }

        for(int i = indexToBeDeleted; i < index - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[index - 1] = null; // remove reference of the last element
        index--; // decrease the size because one element has been removed
    }
}