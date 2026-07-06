package Stack;

import java.util.Arrays;

public class CustomStackUsingArray {
    //The internal data structure of both Stack and Vector in Java is an Object[] (Object Array).
    Object arr[] = null ;
    int index  = 0;
    CustomStackUsingArray(){
        //initializing the object array a
        arr = new Object[10];//this is default size
    }

    CustomStackUsingArray(int size){
        arr = new Object[size];//u can give your custom size
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

    public Object peek() throws Exception {
        if(index==0){
            throw new Exception("Stack is empty");
        }
        return arr[index-1];
    }

    public Object pop() throws Exception {
        if(index==0){
            throw new Exception("Stack is empty");
        }
        Object obj = arr[index-1];
        arr[index-1] = null;
        index--;
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
