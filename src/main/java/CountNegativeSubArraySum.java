public class CountNegativeSubArraySum {

    public static void main(String[] args) {
        Integer[] array = {1, -2, 4, -5, 1};

        int count=0;

        for(int j=0; j< array.length; j++){
            int sum=0;
            for(int k=j; k< array.length; k++){
                sum= array[k]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
