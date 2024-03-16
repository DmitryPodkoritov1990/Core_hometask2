package Hometask2_Core;

public class Task1 {
    public static void main(String[] args) {
        int[] array01 = {8, 0, 0, 10, 5, -2, 4};
        System.out.println("Minimal value " + findMin(array01));
        System.out.println("Maximal value " + findMax(array01));
        System.out.println("Different Max and Min = " + diffMaxandMin(array01));
        System.out.println("Quantity indexes / 2 = " + summIndex(array01));
        neighbourZero(array01);
    }

    static int findMin(int[] array01){
        int minimal = array01[0];
        for(int item : array01){
            if(item < minimal){
                minimal = item;
            }
        }
        return minimal;
    }

    static int findMax(int[] array01){
        int maximal = array01[0];
        for(int item : array01){
            if(item > maximal){
                maximal = item;
            }
        }
        return maximal;
    }

    static int diffMaxandMin(int[] array01) {
        int diff1 = 0;
        if(array01 != null){
            diff1 = (findMax(array01) - findMin(array01));
        }
        return diff1;
    }

    static int summIndex(int[] array01){
        int summa=0;
        for(int i = 0; i < array01.length; i++){
            if(array01[i] % 2 == 0){
                summa++;
            }
        }
        return summa;
    }

    static void neighbourZero(int[] array01){
        for (int i =0; i < array01.length; i++){
            if(array01[i] == 0 && array01[i+1] == 0){
                System.out.println(true);

            }
        }

    }

}

