class main{
    public static void main(String[]args){
int sum = 0;
int []arr= {[1,2,3],[4,5,6],[7,8,9]}

    for (int i = 1; i<arr.length; i++){
      for (int j = 1;j< arr[0].length; j++){
         if (i == j){
            sum += arr[i][j];
         }
         if (i + j == arr.length-1) {
            sum += arr[i][j];
         }
       }
     return sum;
    }

}
