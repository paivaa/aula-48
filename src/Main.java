import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array: \n");
        for (int i : arr) {
            System.out.println(i);
        }
        //TIP imprimindo array invertido
        reverse(arr, arr.length);
        System.out.println();

        //TIP Função para add x no array arr
        addX(arr.length, arr, 60);
        System.out.println();

        //TIP Função para remover x no array arr
        removeX(arr, 40);

        System.out.println();
        //TIP Função para procurar x no array arr
        procuraX(arr, 20);

        System.out.println();
        int[][] a1 = {
                {10, 20, 30},
                {1, 2, 3},
                {100, 200, 300}
        };

        //TIP Função para rotacionar matriz a1 em 90 graus
        rotacionarMatriz(a1);

        System.out.println();

        //TIP Função para procurar x na matriz a1
        procuraEmMatrizX(a1, 100);
    }


    static void reverse(int[] a, int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("Array reverso: \n");
        for (int i : b) {
            System.out.println(i);
        }
    }

    public static void addX(int n, int[] arr, int x) {
        // create a new array of size n+1
        int[] newarr = new int[n + 1];

        int j = 0;
        for (int i : arr){
            newarr[j] = i;
            j++;
        }

        newarr[n] = x;

        System.out.println("Array novo: \n");
        for (int i : newarr) {
            System.out.println(i);
        }
    }

    public static void removeX(int[] arr, int x){

        ArrayList<Integer> arr_new = new ArrayList<>();
        for (int j : arr) {
            if (j != x) {
                arr_new.add(j);
            }
        }
        System.out.println("Antes de deletar :" + Arrays.toString(arr));
        System.out.println("Depois de deletar:" + arr_new);
    }

    public static void procuraX(int[] arr, int x){
        int i=0;
        boolean flag = false;

        for(int j : arr){
            if( j == x){
                System.out.println("Número: "+x+" encontrado no index: "+i);
                flag = true;
            }
            i++;
        }
        if(!flag){
            System.out.println("Não encontrado no numero: "+x+" no array.");
        }
    }

    public static void rotacionarMatriz(int[][] matriz){
        int largura = matriz.length;
        int altura = matriz[0].length;
        int[][] ret = new int[altura][largura];
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
        }
        System.out.println("Matriz normal ");
        for(int[] m : matriz){
            System.out.println(Arrays.toString(m));
        }
        System.out.println("Matriz rotacionada: ");
        for(int[] m : ret){
            System.out.println(Arrays.toString(m));
        }
    }

    public static void procuraEmMatrizX(int[][] arr, int x){
        int linha=1;
        int coluna=1;
        boolean flag = false;

        for(int[] i : arr){
            for(int j : i){
                if( j == x){
                    System.out.println("Número: "+x+" encontrado na linha: "+linha+" coluna: "+coluna);
                    flag = true;
                }
                coluna++;
            }
            coluna=1;
            linha++;
        }
        if(!flag){
            System.out.println("Não encontrado no numero: "+x+" na matriz.");
        }
    }
}