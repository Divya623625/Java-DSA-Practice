public class Bin_Dec_Conversion {
    public static void BinToDec(int binNum){
        int Mynum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastdigit=binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow)); 
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal Of " + Mynum + " = " + decNum);
    }
    public static void main(String[] args) {
        BinToDec(1111);
    }
}
