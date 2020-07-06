public class Java {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 7, 1, 7, 3, 2};
        
        int last = array.length-1;
        QuickSort(array, 0, last);

        for(int i =0; i < array.length; i++){System.out.println(array[i]);}
    }

    private static void QuickSort(int[] array, int startind, int lastind) {  //слева - больше, справа - меньше
        if(startind >= lastind) return;  //если остался один элемент

        int l = startind; //i
        int r = lastind; //j

        int mid = l - (l - r) / 2; 
        
        while (l < r){
            while(l < mid && (array[l] <= array[mid])) l++;
            while(r > mid && (array[mid] <= array[r])) r--;
            
            if(l < r){
                int tmp = array[l];
                array[l] = array[r];
                array[r] = tmp;
                if (l == mid) mid = r;
                else if (r == mid) mid = l;
            }
        }

        QuickSort(array, startind, mid); //если до r что то осталось
        QuickSort(array, mid + 1, lastind); //если после l чет осталось
    }
}