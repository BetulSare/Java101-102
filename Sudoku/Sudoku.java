import java.lang.reflect.Array;
import java.util.Arrays;

public class Sudoku {
   static int[][] sudoku = {
           {5, 3, 4, 6, 7, 8, 9, 1, 2},
           {6, 7, 2, 1, 9, 5, 3, 4, 8},
           {1, 9, 8, 3, 4, 2, 5, 6, 7},
           {8, 5, 9, 7, 6, 1, 4, 2, 3},
           {4, 2, 6, 8, 5, 3, 7, 9, 1},
           {7, 1, 3, 9, 2, 4, 8, 5, 6},
           {9, 6, 1, 5, 3, 7, 2, 8, 4},
           {2, 8, 7, 4, 1, 9, 6, 3, 5},
           {3, 4, 5, 2, 8, 6, 1, 7, 9}
   };
   static int[] checkArray={1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        System.out.println(isValid(sudoku));
    }
    public static boolean isValid(int[][] sudoku) {
        //Bütün kontroller bu metotla birleşiyor
        if(checkAllRows()&&checkAllCols()&&checkAllBlock()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkRow(int[][] sudoku,int rowNumber){
        //parametre olarak alınan satır numarasındaki sayıların 1'den 9'a kadar eksiksiz ve tek seferde
        //kullanıldığını kontrol eder
        int[] rowArray=new int[9];
        rowArray=sudoku[rowNumber];
        //satırdaki sayıları kontrol etmek için küçükten büyüğe sıralar
        Arrays.sort(rowArray);

        for (int i=0;i<9;i++){
            if(rowArray[i]==checkArray[i]){
                return true;
            }else {
                return false;
            }
        }
        return false;

    }
    public static boolean checkCol(int[][] sudoku,int colNumber){
        //parametre olarak alınan sütun numarasındaki sayıların 1'den 9'a kadar eksiksiz ve tek seferde
        //kullanıldığını kontrol eder
        int[] colArray=new int[9];
        for(int i=0;i<9;i++){
            colArray[i]=sudoku[colNumber][i];
        }
        //satırdaki sayıları kontrol etmek için küçükten büyüğe sıralar
        Arrays.sort(colArray);
        for (int i=0;i<9;i++){
            if(colArray[i]==checkArray[i]){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    public static boolean checkAllRows(){
        //metottaki parametreyi for döngüsünden gelen i'nin artmasıyla bütün satırları kontrol eder
        for (int i=0;i<9;i++){
            if (!checkRow(sudoku,i)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAllCols(){
        //metottaki parametreyi for döngüsünden gelen i'nin artmasıyla bütün sütunları kontrol eder
        for (int i=0;i<9;i++){
            if (!checkCol(sudoku,i)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkBlock(int[][] sudoku,int startRow,int startCol){
        //parametre olarak alınan sınırlara göre blok taraması yapar
         int [] array=new int[9];
         int index=0;
         for (int i=startRow;i<startRow+3;i++){
             for (int j=startCol;j<startCol+3;j++){
                 array[index]=sudoku[i][j];
                 index++;
             }
             startCol=0;
         }
         Arrays.sort(array);
        for (int i=0;i<9;i++){
            if(array[i]==checkArray[i]){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    public static boolean checkAllBlock(){
        //tüm blokları aramak için checkBlock() metodunu kullanır
        int startRow=0;
        int startCol=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!checkBlock(sudoku,startRow,startCol)){
                    return false;
                }
                startCol+=3;
            }
            startRow+=3;
            startCol=0;
        }
        return true;
    }
}