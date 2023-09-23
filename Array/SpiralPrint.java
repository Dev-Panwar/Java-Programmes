public class SpiralPrint {
    public static void spiralPrint(int matrix[][]){
		int nRows=matrix.length;
        if(nRows==0){
            return;
        }
        int mCols=matrix[0].length;
        int i, colStart=0,rowStart=0,count=0;
        int TotalNum=mCols*nRows;
        while(count<TotalNum){
            for(i=colStart;count<TotalNum&&i<mCols;++i){
                System.out.print(matrix[rowStart][i]+" ");
                count++;
            }
           rowStart++;
           for(i=rowStart;count<TotalNum&&i<nRows;++i){
               System.out.print(matrix[i][mCols-1]+" ");
               count++;
           }
           mCols--;
           for(i=mCols-1;count<TotalNum&&i>=colStart;--i){
               System.out.print(matrix[nRows-1][i]+" ");
               count++;
           }
           nRows--;
           for(i=nRows-1;count<TotalNum&&i>=rowStart;--i){
               System.out.print(matrix[i][colStart]+" ");
               count++;
           }
           colStart++;
        }

	}
    public static void main(String[] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        spiralPrint(matrix);
    }
}
