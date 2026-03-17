package Vector;

//Vector is  same like Arraylist only but the methods of Vector are Synchronized
//ArrayList methods are Non-Synchronized
public class Custom_Vector {
    Custom_Vector(int size){
        arr = new Object[size];
    }

    Object[] arr = null;
    int index = 0;

    public synchronized void  add(Object obj){

        if(index >= arr.length){
            int new_size = arr.length + arr.length ;
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

    public synchronized Object get(int index) throws Exception {

        if(index >= this.index || index < 0){
            throw new Exception("Index not found");
        }

        return arr[index];
    }

    public synchronized int size(){
        return index;
    }

    public synchronized void remove(int indexToBeDeleted) throws Exception {

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
//        index--;


        if(indexToBeDeleted >= index || indexToBeDeleted < 0){
            throw new Exception("Index not found");
        }

        for(int i = indexToBeDeleted; i < index - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[index - 1] = null;
        index--;
    }
}
