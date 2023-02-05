package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if(height==3){
            for(int x =0; x<height;x++){
                for(int y=0;y<height;y++){
                    if(x==0){
                        if(y==height-1){
                            System.out.println("8");
                        }
                        else {
                            System.out.print("8");
                        }
                    }
                    if(x==1){
                        if(y==1){
                            System.out.print(" ");
                            System.out.print("8");
                            System.out.println(" ");
                        }
                    }
                    if(x==2){
                        if(y==height-1){
                            System.out.print("8");
                        }
                        else {
                            System.out.print("8");
                        }
                    }
                }
            }
        }
        else if(height==6){
            for(int x =0; x<height;x++){
                for(int y=0;y<height;y++){
                    if(x==0){
                        if(y==height-1){
                            System.out.println("8");
                        }
                        else {
                            System.out.print("8");
                        }
                    }
                    if (x==1){
                        if(y==height-2){
                            System.out.print("8");
                            System.out.println(" ");
                        }
                        else if(y==1){
                            System.out.print(" ");
                            System.out.print("8");
                        }
                        else if(y==2){
                            System.out.print("8");
                        }
                        else if(y==3){
                            System.out.print("8");
                        }
                    }
                    if(x==2){
                        if(y==3){
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print("8");
                            System.out.print("8");
                            System.out.print(" ");
                            System.out.println(" ");
                        }
                    }
                    if(x==3){
                        if(y==3){
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print("8");
                            System.out.print("8");
                            System.out.print(" ");
                            System.out.println(" ");
                        }
                    }
                    if (x==4){
                        if(y==height-2){
                            System.out.print("8");
                            System.out.println(" ");
                        }
                        else if(y==1){
                            System.out.print(" ");
                            System.out.print("8");
                        }
                        else if(y==2){
                            System.out.print("8");
                        }
                        else if(y==3){
                            System.out.print("8");
                        }
                    }
                    if(x==5){
                        if(y==height-1){
                            System.out.print("8");
                        }
                        else {
                            System.out.print("8");
                        }
                    }
                }
            }
        }
        else{
        for(int x =0; x<height;x++){
            for(int y=0;y<height;y++){
                if(x==0){
                    if(y==height-1){
                        System.out.println("8");
                    }
                    else {
                        System.out.print("8");
                    }
                }
                if (x==1){
                    if(y==height-2){
                        System.out.print("8");
                        System.out.println(" ");
                    }
                    else if(y==1){
                        System.out.print(" ");
                        System.out.print("8");
                    }
                    else if(y==2){
                        System.out.print("8");
                    }
                }
                if(x==2){
                    if(y==3){
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("8");
                        System.out.print(" ");
                        System.out.println(" ");
                    }
                }
                if (x==3){
                    if(y==height-2){
                        System.out.print("8");
                        System.out.println(" ");
                    }
                    else if(y==1){
                        System.out.print(" ");
                        System.out.print("8");
                    }
                    else if(y==2){
                        System.out.print("8");
                    }
                }
                if(x==4){
                    if(y==height-1){
                        System.out.print("8");
                    }
                    else {
                        System.out.print("8");
                    }
                }
            }
        }

    }
    }
}
