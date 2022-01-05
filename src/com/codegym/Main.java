package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp số muốn tìm kiếm: ");
        int number = scanner.nextInt();

            int index = viTri(arr, number);
            if (index != -1) {
                int[] newArr = xoaPhanTu(arr, index);
                System.out.print("Mảng sau khi xóa số " + number + " là: " + "\t");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.print(newArr[i] + "\t");
                }
            } else {
            System.out.println("Số tìm kiếm không có trong mảng ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "\t");
                }
            }
        }

    public static int viTri(int[] array, int num) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] xoaPhanTu(int[] array, int index) {
        int newArray[] = new int[array.length - 1];
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
