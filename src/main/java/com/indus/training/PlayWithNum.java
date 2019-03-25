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


    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 3, 4, 6};

        PlayWithNum dObj = new PlayWithNum();
        System.out.println(dObj.findDuplicate(myArray));


    }
}
