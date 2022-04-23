import java.util.*;
import java.lang.Math;
public class selectionsort {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList();
        Scanner scan= new Scanner (System.in);
        System.out.print("Inputlah Panjang Array : ");
        int panjang = scan.nextInt();
        for (int i = 0; i <= panjang-1; i++) {
            System.out.print("Index ke "+i+" : ");
            int nilai = scan.nextInt();
            arr.add (nilai);
        }
        for (int i = 0; i <=panjang-2; i++) {
            int Lisa=i;
            for (int j = i+1; j <=panjang-1; j++) {
                if (arr.get(j) < arr.get(Lisa)) {
                    Lisa =j;
                }
            }
            if (Lisa != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(Lisa));
                arr.set (Lisa, temp);
            }
        }
        System.out.println(arr);
    }
}