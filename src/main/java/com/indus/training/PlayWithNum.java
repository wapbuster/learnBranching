package com.indus.training;

public class PlayWithNum {

    public Integer findDuplicate(int[] myArray) {
        Integer result = null;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i] == myArray[j]) {
                    result = myArray[i];
                }

            }
        }
        return result;
    }

    public Integer findMissingNum(int[] myArray) {

        Integer result = null;

        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray.length - 1) {
                break;
            }
            if (myArray[i + 1] - myArray[i] == 2) {
                result = ((myArray[i + 1] + myArray[i]) / 2);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 3, 4, 6};

        PlayWithNum dObj = new PlayWithNum();

        System.out.println(dObj.findDuplicate(myArray));
        
        System.out.println(dObj.findMissingNum(myArray));

        System.out.println("this is final commit");
        System.out.println("Final bye");

        System.out.println("hasta la vista..!");


    }
}
