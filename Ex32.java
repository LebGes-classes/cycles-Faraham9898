public class Ex32 {
    public static void main(String[] args) {
        int count = 0;
        boolean a = false;
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 0) {
                    a = true;
                    break;
                }
            }
            if(!a){
                count++;
            }
            a = false;
        }
        System.out.println("Количество строк, не содержащих ни одного нулевого элемента: " + count);
        System.out.println(" ");
        System.out.println("Вывод исходной матрицы:");
        for(int k = 0; k < matrix.length; k++){
            for(int l = 0; l < matrix[k].length; l++){
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }
        int[] swap = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = swap;
        System.out.println("Вывод измененной матрицы:");
        for(int k = 0; k < matrix.length; k++){
            for(int l = 0; l < matrix[k].length; l++){
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }
    }
}