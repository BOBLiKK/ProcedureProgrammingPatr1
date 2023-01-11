public class Main {

    //Task1
    public static int findMaxCommonDivider(int a, int b){
        int temp1;
        int result;
        if(a < b){
            temp1 = a;
            a = b;
            b = temp1;
        }

        int remainder;
        int temp;

        temp =  a / b;
        remainder = a % b;

        while(remainder != 0){
            a = b;
            b = remainder;
            temp = a / b;
            remainder = a % b;
        }

        result = b;
        return result;
    }
    public static int findMinimumCommonMultiple(int a, int b){
        int result;
        int temp;
        temp = findMaxCommonDivider(a,b);
        result = a * b / temp;
        return result;
    }

    //Task2
    public static void  findMaxCommonDividerOf4Digits(int a, int b, int c, int d){
        int temporaryResult1;
        int temporaryResult2;
        int result;
        temporaryResult1 = findMaxCommonDivider(a,b);
        temporaryResult2 = findMaxCommonDivider(temporaryResult1,c);
        result = findMaxCommonDivider(temporaryResult2,d);
        System.out.println("НОД 4 натуральных чисел равен: " + result);
    }

    //Task3
    public static void findMinimumCommonMultipleOf3Digit(int a, int b, int c){
        int temporaryResult;
        int result;
        temporaryResult = findMinimumCommonMultiple(a, b);
        result = findMinimumCommonMultiple(temporaryResult, c);
        System.out.println("НОК 3 чисел равен: " + result);
    }

    //Task4
    public static int Factorial(int a){
        int result = 1;
        for (int i = 1; i <=a; i ++){
            result = result *i ;
        }
        return result;
    }
    public static void sumOfFactorials(){
        int size = 9;
        int[] array = new int[size];
        int j = 1;

        for(int i = 0; i < size; i++){
            array[i] = j;
            j++;
        }

        int sum = 0;
        int temp;

        for(int i = 0; i < size; i += 2){
            temp = Factorial(array[i]);
            sum+=temp;
        }
        System.out.println("Сумма факториалов равна: " + sum);
    }

    //Task5
    public static int findMax(int[] arr){
        int skipIndex = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                skipIndex = i;
            }
        }
        return skipIndex;
    }
    public static void findSecondMax(int[] arr){
        int secondMax = 0;
        int skipIndex = findMax(arr);
        for(int i = 0; i < arr.length; i++){
            if(i == skipIndex){
                continue;
            }
            if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("Второй по величине элемент массива: " + secondMax);

    }

    //Проверка работы методов

    public static void main(String[] args) {
       int a1 = 18;
       int b2 = 24;
       int c;
       c = findMaxCommonDivider(a1,b2);
       System.out.println("Наибольший общий делитель равен: " + c);

        int a = 12;
        int b = 14;
        int result;
        result = findMinimumCommonMultiple(a,b);
        System.out.println("Наименьшее общее кратное: " + result);

        findMaxCommonDividerOf4Digits(580,480,320,160);
        findMinimumCommonMultipleOf3Digit(6, 8, 9);
        sumOfFactorials();

        int[] array = new int[]{1, 2,3,4,5,6,7,8};
        findSecondMax(array);
    }
}