package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập số ở vị trí thứ " + i + " :\t");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số muốn xóa: ");
        int number = scanner.nextInt();
        int [] newArr = xoaPhanTuMang(arr, number);
        System.out.print("Mảng mới sau khi xóa là:\t" );
        for (int i: newArr) {
            System.out.print(i + "\t");
        }

    }

    public static int[] xoaPhanTuMang(int[] array, int num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        int [] newArray = new int[array.length - count];
        int index = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != num) {
                index++;
                newArray[index] = array[j];
            }
        }
        return newArray;
    }
}
