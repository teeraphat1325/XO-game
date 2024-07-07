import java.util.Scanner;

public class XO {

    public static void main(String[] args) throws Exception {

        int size = 3;
        char[][] mainboard = new char[size][size];
        int i;
        int j;
        int k;
        int x;
        Scanner Input = new Scanner(System.in);
        int row;
        int col;
        System.out.println("\nWelcome to XO game!!!!!!!!!");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                mainboard[i][j] = '_';
                System.out.print(mainboard[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (k = 0; k < 20000; k++) {
            int Turn = 1;
            int draw = 0;
            for (x = 0; x < 20000; x++) {
                if(draw == 9){
                    System.out.println("!!! DRAW !!!");
                    System.exit(0);
                }
                if(Turn == 1){
                    System.out.println("TURN X");
                }else{
                    System.out.println("TURN O");
                }
                /*IN GAME LOOP */
                System.out.println("Please enter(row,col)");
                row = Input.nextInt();
                col = Input.nextInt();
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Out of index!!!");
                    System.out.println("*** TRY AGAIN ***");
                } else if (mainboard[row][col] == '_') {
                    if(Turn == 1) {
                        for (i = 0; i < 1; i++) {
                            for (i = 0; i < size; i++) {
                                for (j = 0; j < size; j++) {
                                    mainboard[row][col] = 'X';
                                    System.out.print(mainboard[i][j] + " ");
                                }
                                System.out.println(" ");
                            }
                            System.out.println(" ");
                        }
                        Turn++;
                        draw++;
                    }else if(Turn == 2){
                        for (i = 0; i < 1; i++) {
                            for (i = 0; i < size; i++) {
                                for (j = 0; j < size; j++) {
                                    mainboard[row][col] = 'O';
                                    System.out.print(mainboard[i][j] + " ");
                                }
                                System.out.println(" ");
                            }
                            System.out.println(" ");
                        }
                        Turn--;
                        draw++;
                    }
                } else if (mainboard[row][col] == 'X' || mainboard[row][col] == 'O'){
                    System.out.println("This space already enter!!!");
                    System.out.println("*** TRY AGAIN ***");
                }
                /*CHECK WIN */
                for (i = 0; i < 1; i++) {
                    for (j = 0; j < 3; j++) {
                        if(mainboard[j][0]=='X'&&mainboard[j][1]=='X'&&mainboard[j][2]=='X'){
                            System.out.println("PLAYER X WIN !!!");
                            System.exit(0);
                        }else if(mainboard[j][0]=='O'&&mainboard[j][1]=='O'&&mainboard[j][2]=='O'){
                            System.out.println("PLAYER O WIN !!!");
                            System.exit(0);
                        }else if(mainboard[0][j]=='X'&&mainboard[1][j]=='X'&&mainboard[2][j]=='X'){
                            System.out.println("PLAYER X WIN !!!");
                            System.exit(0);
                        }else if(mainboard[0][j]=='O'&&mainboard[1][j]=='O'&&mainboard[2][j]=='O'){
                            System.out.println("PLAYER O WIN !!!");
                            System.exit(0);
                        }else if(mainboard[0][0]=='X'&&mainboard[1][1]=='X'&&mainboard[2][2]=='X'){
                            System.out.println("PLAYER X WIN !!!");
                            System.exit(0);
                        }else if(mainboard[0][0]=='O'&&mainboard[1][1]=='O'&&mainboard[2][2]=='O'){
                            System.out.println("PLAYER O WIN !!!");
                            System.exit(0);
                        }else if(mainboard[0][2]=='X'&&mainboard[1][1]=='X'&&mainboard[2][0]=='X'){
                            System.out.println("PLAYER X WIN !!!");
                            System.exit(0);
                        }else if(mainboard[0][2]=='O'&&mainboard[1][1]=='O'&&mainboard[2][0]=='O'){
                            System.out.println("PLAYER O WIN !!!");
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
}