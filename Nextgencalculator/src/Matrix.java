public class Matrix {
    public static double FindDet(double[][] mat)
    {
        double matDet = mat[0][0] * (mat[1][1] * mat[2][2] - mat[2][1] * mat[1][2])
                - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
                + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);

        return matDet;
    }

    public static double[][] Transpose(double[][] mat)
    {
        double[][] transpose = new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=mat[j][i];
            }
        }
        return transpose;
    }


}
