public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        int RowSum[]=new int[mat.length];
		for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            RowSum[i]+=mat[i][j];
        }
        }
        for(int i=0;i<mat.length;i++){
        System.out.print(RowSum[i]+" ");
        }
	}
    public static void main(String[] args){
        int mat[][]={{2,3,4},{2,5,6,7,8},{1,2,3,2,1,6},{1,9}};
        rowWiseSum(mat);
    }
}
