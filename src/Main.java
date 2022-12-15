import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        MyList<Object> myList=new MyList<>();
        System.out.println("Liste  durumu: "+ (myList.isEmpty()? "Bos":"Dolu"));
        System.out.println("Dizinin kapasitesi: "+myList.getSize());
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Dizideki eleman sayisi: ");
        System.out.println("Dizinin kapasitesi: "+myList.getSize());
        System.out.println("2. indisteki deger: "+myList.get(2));
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);
        System.out.println("Dizideki eleman sayisi: ");
        System.out.println("Dizinin kapasitesi: "+myList.getSize());
        System.out.println("2. indisteki deger: "+myList.get(2));
        System.out.println("Liste  durumu: "+ (myList.isEmpty()? "Bos":"Dolu"));
        System.out.println("Index: "+myList.indexOf(20));
        System.out.println("Index: "+myList.indexOf(100));
        System.out.println("last Index: "+myList.lastIndexOf(20));

        //listeyi Object[] dizisi olarak geri verir
        Object[] dizi=myList.toArray(new Object[0]);
        System.out.println("Dizi "+Arrays.toString(dizi));


        // Liste veri türünde alt bir liste oluşturdu
        MyList<Object> altList = myList.sublist(0,3);
        System.out.println("Gorunum "+altList.toString());

        //değerin listede olup olmadığını sorguladık
        System.out.println("80 degeri "+myList.contains(80));
        System.out.println("120 degeri "+myList.contains(120));

        //Listeyi tamamen bosaltma islemi
        myList.clear();
        System.out.println("Liste bosaltma"+ myList);







    }
}
