class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal\n");
        int[] newArr = ArrayUtillity.arraynum();
        reverseArr(newArr);
        ArrayUtillity.displayArray(newArr);
    }

    public static void reverseArr(int[] newArr){
        int i = 0;
        while(i < newArr.length / 2){
            int swap = newArr[i];
            newArr[i] = newArr[(newArr.length - 1) - i];
            newArr[(newArr.length - 1) - i] = swap;
            i++;
        }

    }
}
