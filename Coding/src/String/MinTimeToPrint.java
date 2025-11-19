package String;

public class MinTimeToPrint {

    public static void main(String[] args) {
        /*

         */
        String str = "zba";

    int res = 0;
    char pointer = 'a';

        for(int i =0;i< str.length(); i++){
            char currentChar = str.charAt(i);

            int clockWise = Math.abs(pointer - currentChar);


            int anticlock =  26 - clockWise;

            res+= Math.min(clockWise, anticlock);

            pointer = currentChar;

        }
        System.out.println(res);
    }
}