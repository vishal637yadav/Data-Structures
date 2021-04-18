package com.collections.api;

public class Combination {
    static char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};

    public static void main(String[] args) {
        printAllTwoCombination(a);
        System.out.println("---------------------------------------------");
        printAllThreeCombination(a);
        System.out.println("---------------------------------------------");
        printAllFourCombination(a);
        System.out.println("---------------------------------------------");
        printAllFiveCombination(a);

    }

    public static void printAllThreeCombination(char[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    System.out.print(++cnt + ". ");
                    System.out.println((char) a[i] + "-" + (char) a[j] + "-" + (char) a[k]);
                }
            }
        }
    }

    public static void printAllTwoCombination(char[] a) {
        int cnt = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                System.out.print(++cnt + ". ");
                System.out.println((char) a[j] + "-" + (char) a[k]);
            }
        }

    }

    public static void printAllFourCombination(char[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length - 3; i++) {
            for (int j = i + 1; j < a.length - 2; j++) {
                for (int k = j + 1; k < a.length - 1; k++) {
                    for (int l = k + 1; l < a.length; l++) {
                        System.out.print(++cnt + ". ");
                        System.out.println((char) a[i] + "-" + (char) a[j] + "-" + (char) a[k] + "-" + (char) a[l]);
                    }
                }
            }
        }
    }

    public static void printAllFiveCombination(char[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length - 4; i++) {
            for (int j = i + 1; j < a.length - 3; j++) {
                for (int k = j + 1; k < a.length - 2; k++) {
                    for (int l = k + 1; l < a.length - 1; l++) {
                        for (int m = l + 1; m < a.length; m++) {
                            System.out.print(++cnt + ". ");
                            System.out.println((char) a[i] + "-" + (char) a[j] + "-" + (char) a[k] + "-" + (char) a[l] + "-" + (char) a[m]);
                        }
                    }
                }
            }
        }
    }
}
