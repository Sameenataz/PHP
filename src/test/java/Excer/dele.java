package Excer;

public class dele {

    public static void main(String[] args){
        char[][] values = {{'a','b','c','d'},{'d','e','f','g'},{'h','i','j','k'}};
        for (int i=0;i<values.length;i++){
            System.out.println(values[(i*2)%2][(i%2)+2]);
        }
    }
}
