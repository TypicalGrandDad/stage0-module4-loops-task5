package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for(int x = 0; x<sideLength; x++){
            for(int y =0; y<sideLength;y++){
                if(x==0 || x==sideLength-1){
                    System.out.print("8");
                    if(y==sideLength-1 && x==0){
                        System.out.println();
                    }
                }

                else{
                    if(y==1 || y==sideLength){
                        System.out.print("8");
                        for (int i =0; i<sideLength-2;i++){
                            System.out.print(" ");
                        }
                        System.out.println("8");
                    }
                }
            }
        }
    }
}
