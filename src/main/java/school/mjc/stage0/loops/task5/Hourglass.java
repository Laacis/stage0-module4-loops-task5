package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        boolean isHeightEven = height % 2 ==0;
        int mid = (isHeightEven)? height/2 : height/2 +1;
        int counter = -1;

        for(int i = 1; i <= height; i++){
            if(i <mid){
                counter++;
                for (int j = 1; j <= height; j++){
                    if(j <= counter || j > (height-counter)) {
                        System.out.print(' ');
                    }else{
                        System.out.print('8');
                    }
                }
                System.out.println();
            } else if (!isHeightEven && i == mid) {
                for (int j = 1; j <= height; j++){
                    if(i == j){
                        System.out.print('8');
                    }else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else if (isHeightEven && (i == mid || i == mid+1)) {
                counter++;
                for (int j = 1; j <= height; j++) {
                    if(j <= counter || j >(height - counter) ) {
                        System.out.print(' ');
                    }else{
                        System.out.print('8');
                    }
                }
                System.out.println();
                counter--;
            }else{
                for (int j = 1; j <= height; j++) {
                    if(j <= counter || j > (height-counter)) {
                        System.out.print(' ');
                    }else{
                        System.out.print('8');
                    }
                }
                counter--;
                System.out.println();
            }
        }
    }
}
