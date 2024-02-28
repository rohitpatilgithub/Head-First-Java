public class LoopPuzzle {
    public static void main(String[] args) {
        //Q : little confusing word puzzle using loop

        //Output : you have to write in such a that it follows a pattern of :
        //a noise
        //annoys
        //an oyster

        int x = 0;
        while(x<4){
            System.out.print("a");
        if(x<1){
            System.out.print(" ");
        }
        System.out.print("n");
        if(x<1){
            System.out.print("oise");
            x = x - 1;
        }
        if(x==1){
            System.out.print("noys");
        }
        if(x>1){
                System.out.print(" oyster");
        }
        System.out.println();
        x = x + 2;
        }
    }
}
