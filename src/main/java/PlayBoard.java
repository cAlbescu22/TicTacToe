public class PlayBoard {
    Symbol[][] matrix;
    public PlayBoard(){
        this.matrix=new Symbol[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                matrix[i][j]=Symbol.I;
            }

        }
    }

    @Override
    public String toString() {
        String txt="";
        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col <3 ; col++) {
                txt+= matrix[row][col]+" ";

            }
            txt+="\n";


        }
        return txt;
    }
    public void fill(int[] coords,Symbol s){
        int row=coords[0];
        int col=coords[1];
        matrix[row][col]=s;
    }
    public boolean isEmpty(int[] coords){
        int row=coords[0];
        int col=coords[1];
        return matrix[row][col]==Symbol.I;

    }
    public Symbol getWinner() {
        Symbol s=Symbol.I;
        for (int i = 0; i < 3; i++) {
            if ((matrix[i][0] == matrix[i][1]) && (matrix[i][0] == matrix[i][2])) {
                s = matrix[i][0];
            }
            for (int j = 0; j < 3; j++) {
                if ((matrix[0][j] == matrix[1][j]) && (matrix[0][j] == matrix[2][j])) {
                    s = matrix[0][j]; }


                }
                if ((matrix[1][1] == matrix[0][0]) && (matrix[0][0] == matrix[2][2])) {
                    s = matrix[0][0];
                }
                if ((matrix[1][1] == matrix[0][2]) && (matrix[1][1] == matrix[2][0])) {
                    s = matrix[1][1];

                }

            }


        return s;
    }
}
