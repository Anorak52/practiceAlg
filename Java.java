
public class Java {
    public static void main(String[] args) {
        int[] mas = new int[] {1, 3, 6, 1, 0, 9};
        
        for(int i = 1; i < mas.length; i++){
            for(int j =i; j > 0 && mas[j-1] > mas[j]; j--){
                int tmp = mas[j-1];
                mas[j-1] = mas[j];
                mas[j] = tmp;
            }
        }

        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}