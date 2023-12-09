public class Ex31 {
    public static void main(String[] args) {
        int ex1 = 1;
        int ex2 = 0;
        int first = 0;
        int last = 0;
        boolean count = false;
        int[] numbers = {5,4,3,0,3,2,5,2,8,0,5};
        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                ex1 *= numbers[i];
            }
            if(numbers[i] == 0 && !count){
                first = i;
                count = true;
            }
            if(numbers[i] == 0 && count){
                last = i;
            }
        }
        for(int j = first; j < last; j++){
            ex2 += numbers[j];
        }
        System.out.println("Произведение элементов массива с четными номерами: " + ex1);
        System.out.println("Сумма элементов массива, расположенных между первым и последним нулевыми элементами: " + ex2);
        System.out.print("Вывод массива: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
