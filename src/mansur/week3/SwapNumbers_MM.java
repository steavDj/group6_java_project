package mansur.week3;

public class SwapNumbers_MM {

    public static void main(String[] args){

        int a = 5, b = 20;

        // Switching integers without a third variable is tricky but possible (Just give me 5 mins or more lol)

        a = a + b; // a is now 25
        b = a - b; // b is now 5 
        a = a - b; // a is now 20 

        // At first, we wonder " why is he doing these arithmetic expressions?" 
        // what's happening here is that with each addition or subtraction, the result becomes the new value of the variablr
        // a becomes 25 at first , then b becomes 5 because a (25) - b (10) which was the value of a

        // finally, a becomes 20 thanks to a (25) - b(5)
        // There you have it, it does change alot but we reach our end goal this way
       


    }
}
