public class Ex22 {
    public static void main(String[] args) {
        for(int i = 10; i < 100; i++){
            int a = i / 10;
            int b = i % 10;
            int i2 = i * 2;
            int a1 = i2 / 10;
            int b2 = i2 % 10;
            if(a + b == a1 + b2){
                System.out.println(i);
            }
        }
    }
}