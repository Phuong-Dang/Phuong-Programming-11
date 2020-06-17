import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Add Arrays
        System.out.println("Add Arrays\nInput:");
        int x = 5;
        int [] num = new int [x];
        for (int i=0; i < num.length; i++) {
            if (i == 5) break;
               num[i] = i;
        System.out.print(num[i] + " ");
        }
        System.out.println("\t");
        System.out.println("Output:");
        int [] num1 = new int [x+1];
        for (int z=0; z < num1.length; z++) {
                num1[z] = z;
        System.out.print(num1[z] + " ");
        }


        //Delete Arrays
        System.out.println("\n\nDelete Arrays");
        System.out.println("Input:");
        int [] pop = new int [x];
        for (int y=0; y < pop.length; y++) {
            pop[y]=y;
            System.out.print(pop[y] + " ");
        }
        System.out.println("\t");
        System.out.println("Output:");
        int []pop1 = new int [x-1];
        for (int v=0; v < pop1.length; v++) {
            pop1[v] = v;
        System.out.print(pop1[v] + " ");
        }


        //Insert Arrays
        System.out.println("\n\nInsert Arrays");
        System.out.println("Input:");
        int [] insert = {0, 1, 3, 4};
            System.out.print(Arrays.toString(insert));

        System.out.println("\t");
        System.out.println("Output:");
        int pos =3;
        int number=5;
        insert[pos] = number;
            System.out.print(Arrays.toString(insert));
    }
}
