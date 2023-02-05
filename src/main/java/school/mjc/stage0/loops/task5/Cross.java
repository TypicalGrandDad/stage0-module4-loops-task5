package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if(sideLength==3){
            for(int x = 0; x<sideLength; x++){
                for(int y =0; y<sideLength;y++){
                    if(x==1){
                        System.out.print("8");
                        if(y==sideLength-1){
                            System.out.println("");
                        }
                    }
                    else if(x==sideLength-1){
                        if(y==1) {
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                            System.out.print("8");
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                        }}
                    else{
                        if(y==1) {
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                            System.out.print("8");
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("");
                        }
                    }

                }
            }
        }
        else {
            for(int x = 0; x<sideLength; x++){
                for(int y =0; y<sideLength;y++){
                    if(x==2){
                        System.out.print("8");
                        if(y==sideLength-1){
                            System.out.println("");
                        }
                    }
                    else if(x==sideLength-1){
                        if(y==1) {
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                            System.out.print("8");
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                        }}
                    else{
                        if(y==1) {
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                            System.out.print("8");
                            for (int i = 0; i < sideLength / 2; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("");
                        }
                    }

                }
            }
        }
    }
}
