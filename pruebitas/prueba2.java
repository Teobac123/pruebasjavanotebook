import java.util.Scanner;
public class prueba2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int [][] matriz1=new int[4][4];
        int [] diagonal=new int[4];

        for(int i=0; i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                System.out.println("Ingrese el número en la posición " + i + " y " + j);
                matriz1[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<4;i++){
            diagonal[i]=matriz1[i][i];
        }
        System.out.println("La diagonal principal de la matriz es: ");
        for(int i=0; i<4;i++){
            System.out.println(diagonal[i] + " ");
        }
    }
}
