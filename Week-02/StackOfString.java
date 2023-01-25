import java.util.*;

public class StackOfString{


    public static void main(String args[]){
        StackOfString stack = new StackOfString();
        while(!StdIn.inEmpty()){
            String s = StdIn.readString();
            if(s.equals("-")){
                StdOut.print(stack.pop());
            }else{
                stack.push(s);
            }
        }
    }
}