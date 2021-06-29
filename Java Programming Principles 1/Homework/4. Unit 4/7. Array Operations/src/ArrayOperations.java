/*
 * This program was written by Kyle Martin on 6/13/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to use 4 different methods to retrieve data from one-dimensional arrays. The goal is to
 * total one array, get the average of one array, get the highest in one array, and get the lowest in one array.
 * See Chapter 7 Programming Exercise 11 Array Operations
 */
public class ArrayOperations {

    public static void main(String[] args) {
        int[] intArray = {8, 6, 7, 5, 3, 0, 9};
        float[] floatArray = {497812469, 478, 265, 80, 365, 420, 946};
        double[] doubleArray = {3.14, 2.46, 8.7, 0.2, 3.6, 5.0, 8.0};
        long[] longArray = {7654321, 1234567, 234567, 123456789, 666666666};


        System.out.println("""
                This will pull data from different arrays.\s
                The choices for my arrays are int, float, double, and longs.\s
                """);
        System.out.println("Total in int array: " + getTotal(intArray));
        System.out.println("Average in long array: " + getAverage(longArray));
        System.out.println("Highest in Float array: " + getHighest(floatArray));
        System.out.println("Lowest in Double array: " + getLowest(doubleArray));
    }

    //get the total of all values in an array.
    public static int getTotal(int[] arr) {
        int total = 0;
        for (int j : arr) {
            total = total + j;
        }
        return total;
    }

    public static float getTotal(float[] arr) {
        float total = 0;
        for (float v : arr) {
            total = total + v;
        }
        return total;
    }

    public static double getTotal(double[] arr) {
        double total = 0;
        for (double v : arr) {
            total = total + v;
        }
        return total;
    }

    public static long getTotal(long[] arr) {
        long total = 0;
        for (long l : arr) {
            total = total + l;
        }
        return total;
    }

    //get the average of all values in an array.
    public static int getAverage(int[] arr) {
        int total = 0;
        for (int j : arr) {
            total = total + j;
        }
        return total / arr.length;
    }

    public static float getAverage(float[] arr) {
        float total = 0;
        for (float v : arr) {
            total = total + v;
        }
        return total / arr.length;
    }

    public static double getAverage(double[] arr) {
        double total = 0;
        for (double v : arr) {
            total = total + v;
        }
        return total / arr.length;
    }

    public static long getAverage(long[] arr) {
        long total = 0;
        for (long l : arr) {
            total = total + l;
        }
        return total / arr.length;
    }


    //get the highest value in an array
    public static int getHighest(int[] arr) {
        int highest = arr[0];
        for (int j : arr) {
            if (j > highest) {
                highest = j;
            }
        }
        return highest;
    }

    public static float getHighest(float[] arr) {
        float highest = arr[0];
        for (float v : arr) {
            if (v > highest) {
                highest = v;
            }
        }
        return highest;
    }

    public static double getHighest(double[] arr) {
        double highest = arr[0];
        for (double v : arr) {
            if (v > highest) {
                highest = v;
            }
        }
        return highest;
    }

    public static long getHighest(long[] arr) {
        long highest = arr[0];
        for (long l : arr) {
            if (l > highest) {
                highest = l;
            }
        }
        return highest;
    }

    //get the lowest value in an array
    public static int getLowest(int[] arr) {
        int lowest = arr[0];
        for (int j : arr) {
            if (j < lowest) {
                lowest = j;
            }
        }
        return lowest;
    }

    public static float getLowest(float[] arr) {
        float lowest = arr[0];
        for (float v : arr) {
            if (v < lowest) {
                lowest = v;
            }
        }
        return lowest;
    }

    public static double getLowest(double[] arr) {
        double lowest = arr[0];
        for (double v : arr) {
            if (v < lowest) {
                lowest = v;
            }
        }
        return lowest;
    }

    public static long getLowest(long[] arr) {
        long lowest = arr[0];
        for (long l : arr) {
            if (l < lowest) {
                lowest = l;
            }
        }
        return lowest;
    }
}