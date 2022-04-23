import java.util.*;
import java.lang.Math;

public class mergesort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, k;
        
        n = input.nextInt();
        int[] data = new int[n];
        
        for (i = 0; i <= n - 1; i++) {
            data[i] = input.nextInt();
        }
        
        // cetak array data
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println(" ]");
        mergeSort(data, n);
        
        // cetak hasil shorting
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println(" ]");
    }
    
    public static void merge(int[] data, int[] dataKiri, int[] dataKanan, int sData, int sKiri, int sKanan) {
        int n, i, j, k;
        
        n = sData;
        i = 0;
        j = 0;
        k = 0;
        while (i < sKiri && j < sKanan) {
            if (dataKiri[i] < dataKanan[j]) {
                data[k] = dataKiri[i];
                i = i + 1;
                k = k + 1;
            } else {
                data[k] = dataKanan[j];
                j = j + 1;
                k = k + 1;
            }
        }
        while (i < sKiri) {
            data[k] = dataKiri[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < sKanan) {
            data[k] = dataKanan[j];
            j = j + 1;
            k = k + 1;
        }
    }
    
    public static void mergeSort(int[] data, int n) {
        if (n >= 2) {
            int tengah;
            
            tengah = (int) ((double) n / 2);
            int sKiri, sKanan;
            
            sKiri = tengah;
            sKanan = n - tengah;
            int[] dataKiri = new int[sKiri];
            int[] dataKanan = new int[sKanan];
            int i;
            
            for (i = 0; i <= sKiri - 1; i++) {
                dataKiri[i] = data[i];
            }
            for (i = 0; i <= sKanan - 1; i++) {
                dataKanan[i] = data[tengah + i];
            }
            mergeSort(dataKiri, sKiri);
            mergeSort(dataKanan, sKanan);
            merge(data, dataKiri, dataKanan, n, sKiri, sKanan);
        }
    }
}
