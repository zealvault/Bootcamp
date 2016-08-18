import javafx.scene.shape.PathElement;

import java.util.Scanner;

/**
 * Created by vishal on 15/8/16.
 */
public class Patterns {
    static final int WIDTH =2;
    public static void main(String args[]){
        int noOfBox;
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of boxes:");
        noOfBox = scanner.nextInt();
        //Patterns pattern = new Patterns();
        Patterns.drawBoxes(noOfBox);
        System.out.println("\nEnter width of pattern:");
        width = scanner.nextInt();
        System.out.println("Enter height of pattern:");
        height = scanner.nextInt();
        Patterns.drawTiles(width,height);
    }

    public static void drawBoxes(int noOfBoxes){
        int i;
        int j;
        System.out.print("+");
        for(i = 0;i<noOfBoxes;i++){

            System.out.print("------+");
        }
        System.out.print("\n");
        for(j = 0;j<WIDTH ;j++){
            System.out.print("|");
            for(i = 0;i<noOfBoxes ;i++){
                System.out.print("      |");
            }
            System.out.print("\n");
        }
        System.out.print("+");
        for(i = 0;i<noOfBoxes;i++){

            System.out.print("------+");
        }

    }
    public static void drawTiles(int width , int height) {
        int i, j;
        for(j = 0;j<height;j++) {


            for (i = 0; i < width; i++) {
                System.out.print(" ____     ");
            }
            System.out.print("\n");
            for (i = 0; i < width; i++) {
                System.out.print("/    \\    ");
            }


            System.out.print("\n");

            for (i = 0; i < width; i++) {
                System.out.print("      ----");
            }

            System.out.print("\n");
            for (i = 0; i < width; i++) {
                System.out.print("\\    /    ");
            }
            System.out.print("\n");
        /*for (i = 0; i < width; i++) {
            System.out.print(" ----     ");
        }*/
        }
    }
}
