public class PrintTwoDArray {
    public static void print2DArray(int input[][]) {
        if(input.length==0){
            return;
        }
		for(int i=0;i<input.length;i++){
            for(int k=i;k<input.length;k++){
            for(int j=0;j<input[0].length;){
               
                   System.out.print(input[i][j]+" ");
                   j++;
                
            }
            System.out.println();
        }
        }

	}
    public static void main(String[] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        print2DArray(matrix);
    }
}
