import java.util.Arrays;

public class Sort_High_CGPA_To_Low_CGPA {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i=0;i<cgpa.length;i++){
            for (int j=i+1 ;j<cgpa.length;j++){
                if (cgpa[i]<cgpa[j])
                {
                    double temp =cgpa[i];
                    cgpa[i]=cgpa[j];
                    cgpa[j]= temp;

                }
            }

        }
        System.out.println("Sort High CGPA TO LOW CGPA:");
        System.out.println(Arrays.toString(cgpa));
    }
}
