
public class Java {
    public static void main(String[] args) {
        int[] mas = new int[] {1, 3, 6, 1, 0, 9};
        
        for(int i = 0; i < mas.length-1; i++){
            int min_index = i;
            for(int j = i+1; j<mas.length-1; j++){
                if (mas[j]<mas[min_index]) min_index = j;
            }
            int tmp = mas[i];
            mas[i] = mas[min_index];
            mas[min_index] = tmp;
        }

        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}