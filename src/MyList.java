import java.util.Arrays;

public class MyList<T> {

    private T[] array;// Öğeleri depolar
    public int size;// eleman sayısını taki eder


    public MyList() {
        //Belirtilen uzunlukta yeni bir nesne dizisi oluşturduk
        this.array =(T[]) new Object[10];
        size =0;
    }


    public MyList(int size){
        this.array =(T[]) new Object[size];


    }
    public T[] getArray(){
        return this.array;
    }
    public void setArray(T[] array){
        this.array = array;
    }

    public int getSize(){
        //Dahili dizi uzunluğu,
        return array.length;

    }

      //Bu listede belirtilen konumdaki öğeyi döndürür.
    public T get(int index){
        if(index<=0 || index>= size){
            System.out.println();
        }
        return  array[index];
    }
    public int size(){
        int count=0;
        for (T e:array){
            if (e!=null){
                count++;
            }
        }
        return count;
    }


   /* public boolean add(T element){
     if (size >=array.length){
      // Daha büyük bir dizi yapıp ve öğelerin üzerine kopyalayalım
         T[] bigger= (T[]) new Object[array.length*2];
         array=Arrays.copyOf(array,array.length*2);
         array[array.length/2]=  element;
         array=bigger;
      }
         array[size]=  element;
         size++;
         return true;
        }
         */

        public T set(int index, T element){
            // dizini kontrol etmeye gerek yok , bizim için yapacak
        T old=get(index);
        array[index]=element;
        return old;

        }

        // döngü indexOf içindeki her şey sabit zamandır ve bulunduğu ilk indexi verir
        //Bu listede belirtilen öğenin ilk geçtiği dizinin dizinini veya bu liste öğeyi içermiyorsa -1'i döndürür.
        public int indexOf(Object target){
        for (int i = 0; i< size; i++){
            if (equals(target,array[i])){
                return i;
            }
        }
        return -1;
        }
        // döngü boyunca her seferinde indexOf çağırır.bunun için  equals sınıflandırdık
    //Eşitlik için belirtilen nesneyi bu listeyle karşılaştırır.
    private boolean equals(Object target, Object element) {
        if (target==null){
            return  element==null;
        }else {
            return target.equals(element);
        }
    }

    //İlk elemanı kaldırırsak geri kalan tüm elemanlar arasında doğrusal bir döngü oluşturmuş oluruz
    //Varsa, belirtilen öğenin ilk geçtiği yeri bu listeden kaldırır (isteğe bağlı işlem).
    public T remove(int index){
        T element=get(index);
        for (int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
        return element;
    }

    public int getCapacity(){
            return array.length;
    }

    //Belirtilen öğeyi bu listenin sonuna ekler (isteğe bağlı işlem).
    public void add(T element){
       for (int i=0;i<array.length;i++){
           if (array[i]==null){
               array[i]=element;
               break;
           }else if (array[i]!=null && i==array.length-1){
               array=Arrays.copyOf(array,array.length*2);
               array[array.length/2]=element;
               break;
           }
       }
    }

    //Bu listedeki tüm öğeleri kaldırır (isteğe bağlı işlem).
    public void clear(){
           T[] array=null;
            //dizide, böylece değersiz verilerin toplanmasını geciktirebilir.
            size=0;
    }

    public String toString(){
            if (size>0){
                StringBuilder str=new StringBuilder("[");
                for (int i=0;i<size();i++){
                    if (i==(size()-1)){
                        str.append(array[i]).append("]");

                    }else {
                        str.append(array[i]).append(",");
                    }
                }
                return str.toString();
            }
            return "[]";
    }

    //Bulunduğu son indexi vereceğiz
    public int lastIndexOf(T element){
            int index = -1;
            for (int i=size()-1;i>=0;i--){
                if (array[i]==element){
                    index=i;
                }
            }
            return index;
     }

     //Bu liste hiçbir öğe içermiyorsa true değerini döndürür .
     public boolean isEmpty(){
            return size()==0;
    }

    //Bu listedeki tüm öğeleri uygun sırada (ilk öğeden son öğeye kadar) içeren bir dizi döndürür.
    public T[] toArray(Object[] objects){
            return  Arrays.copyOfRange(array,0,size());
    }

    //Bu listenin belirtilen fromIndex , dahil ve toIndex , özel arasındaki bölümünün bir görünümünü döndürür .
    public MyList<T> sublist(int fromIndex,int toIndex){
            MyList<T> newList=new MyList<>(toIndex-fromIndex+1);
            for (int i= fromIndex;i<=toIndex;i++){
               newList.add(array[i]);
            }
            return newList;
    }

    //Bu liste belirtilen öğeyi içeriyorsa true değerini döndürür .
    public boolean contains(T element) {
        boolean isIt = false;
        for (int i = 0; i < size(); i++) {
            if (array[i] == element) {
                isIt = true;
                break;
            }
        }
        return isIt;
    }



}
