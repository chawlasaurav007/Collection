package Queue;

import java.util.Arrays;

public class QueueImplementationUsingArray {
    Object arr[] = null;
    int index = 0 ;

    QueueImplementationUsingArray(){
        arr=new Object[10];
    }

    QueueImplementationUsingArray(int size){
        arr=new Object[size];
    }

    public Object push(Object obj){
        if(index>=arr.length){
            int newSize = arr.length*2;
            arr = Arrays.copyOf(arr,newSize);
        }
        arr[index] = obj;
        index++;
        return obj;
    }

    public Object peek()  {
        if(index==0){
            return null;
        }else {
            return arr[0];
        }
    }


    public Object poll()  {

        Object obj =peek();

        // If the queue is empty, return null to avoid ArrayIndexOutOfBoundsException.
        if (obj == null) {
            return null;
        }
        int indexToBeDeleted = 0 ;
        int noOfShiftOperations = index-indexToBeDeleted-1;
        if(noOfShiftOperations>0){
            System.arraycopy(arr,indexToBeDeleted+1,arr,indexToBeDeleted,noOfShiftOperations);
        }
        arr[--index] = null;//ex : arr[--5] = null means arr[4] = null;
        return obj;
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
}
