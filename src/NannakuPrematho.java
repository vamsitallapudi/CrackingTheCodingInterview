import java.util.*;

public class NannakuPrematho {
    private static List<Integer> b = new ArrayList<>();
    public static void main(String[] args) {

    for(int i=0;i<100;i++){
        b.add(i+1);
    }
        eliminateNext(0);
        System.out.println(b.get(0));

    }

    private static void eliminateNext(int i) {

        if(i>b.size()-1){
            i=0;
        }
        if(b.get(i+1)==null){
            eliminateNext(i+1);
        } else {
            b.set(i+1,null);
            eliminateNext(i+1);
        }
    }
}
