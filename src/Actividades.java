import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Actividades {
    private static int nums[] = new int [10];

    //region Ejercicio1
    public static void readNums(File f){
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            for (int i=0;i<nums.length;i++){
                String [] l = new String[nums.length];
                while ((l[i] = br.readLine()) != null){
                    nums[i] = Integer.parseInt(l[i]);
                }
            }
            br.close();
        }catch (IOException e){
            System.err.println(e);
        }

    }

    public static void showNums(){
        for (int i=0;i<nums.length;i++){
            System.out.println("El número " + nums[i] + " está en la posición " + i);
        }
    }
    //endregion

    //region Ejercicio2

    //endregion
}
