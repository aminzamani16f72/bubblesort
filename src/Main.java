import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array=new int[]{2,5,8,12,15,18};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void BubbleSort(int[] array){
        int length=array.length;
        int tmp;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
}