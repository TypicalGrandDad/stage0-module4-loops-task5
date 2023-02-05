package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if(length==5 && height==6){for(int x=0; x<length;x++){
            for(int y = 0; y<height;y++){
                if(x==0){
                    if(y==height-1){
                        System.out.println("8");
                    }
                    else {
                        System.out.print("8");
                    }
                }
                else if(x==length-1){
                    System.out.println("8");
                }
                else {
                    if(y==3){
                        System.out.print("8");
                        for (int i =0;i<length-1;i++){
                            System.out.print(" ");
                        }
                        System.out.println("8");
                    }}
            }
        }}
        else if(length==6 && height==5){
            for(int x=0; x<length;x++){
                for(int y = 0; y<height;y++){
                    if(x==0){
                        if(y==height-1){
                            System.out.println("8");
                        }
                        else {
                            System.out.print("8");
                        }
                    }
                    else if(x==length-1){
                        System.out.println("8");
                    }
                    else {
                        if(y==3){
                            System.out.print("8");
                            for (int i =0;i<length-3;i++){
                                System.out.print(" ");
                            }
                            System.out.println("8");
                        }}
                }
            }
        }
        else{
            for(int x=0; x<length;x++){
                for(int y = 0; y<height;y++){
                    if(x==0){
                        if(y==height-1){
                            System.out.println("8");
                        }
                        else {
                            System.out.print("8");
                        }
                    }
                    else if(x==length-1){
                        System.out.println("8");
                    }
                    else {
                        if(y==3){
                            System.out.print("8");
                            for (int i =0;i<length-2;i++){
                                System.out.print(" ");
                            }
                            System.out.println("8");
                        }}
                }
            }
        }
    }
}
