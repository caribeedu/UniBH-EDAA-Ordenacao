package me.caribeedu.unibh.edaa.ordenacao;

import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author Edu Caribé
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Comparativo de Ordenação - Insertion Sort vs. Merge Sort");
        
        System.out.println();
        
        System.out.println("Array de 20 números");
        
        int[] items = generateArrayOfRandomNumbers(20);
        
        testInsertionSort(items);
        testMergeSort(items);
        
        System.out.println();
        
        System.out.println("Array de 20.000 números");
        
        items = generateArrayOfRandomNumbers(20000);
        
        testInsertionSort(items);
        testMergeSort(items);
    }        
    
    private static void testInsertionSort(int[] items) {
        long startTimeInsertionSort = System.currentTimeMillis();
        
        InsertionSort.sort(items);
        
        long elapsedTimeInsertionSort = System.currentTimeMillis() - startTimeInsertionSort;
        
        System.out.println(String.format("Insertion Sort - Ordenado em %sms", elapsedTimeInsertionSort));
    }
    
    private static void testMergeSort(int[] items) {
        long startTimeMergeSort = System.currentTimeMillis();
        
        MergeSort.sort(items);
        
        long elapsedTimeMergeSort = System.currentTimeMillis() - startTimeMergeSort;
        
        System.out.println(String.format("Merge Sort - Ordenado em %sms", elapsedTimeMergeSort));
    }
    
    private static int[] generateArrayOfRandomNumbers(int size) {
        final int maxNumber = 1000;        
        return IntStream.generate(() -> new Random().nextInt(maxNumber)).limit(size).toArray();
    }
}
