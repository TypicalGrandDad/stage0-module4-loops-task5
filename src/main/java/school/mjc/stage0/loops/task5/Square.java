package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
          for(int x = 0; x<sideLength; x++){
            for(int y =0; y<sideLength;y++){
                if(x==0 || x==sideLength-1){
                    if(x==0){
                        if(y==sideLength-1){
                        System.out.println("8");}
                        else{
                            System.out.print("8");
                        }
                    }
                    if(x==sideLength-1){
                        if(y==sideLength-1){
                            System.out.println("8");
                        }
                        else {
                        System.out.print(8);
                    }}
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
