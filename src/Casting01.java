public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint

        short myShort = 128;
        //Declare and initialize a short with a value of 128
        byte myByte = 127;
        //Create a print statement that casts this short to a byte
        myShort = (short)myByte;
        
       //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        
        myByte++;
        System.out.println(myByte);
        //Add 1 to this variable again and print it again
        
        myByte++;
        System.out.println(myByte);
        
        
    }    
}
