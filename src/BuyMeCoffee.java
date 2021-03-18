
// https://www.buymeacoffee.com/SergeiD

public class BuyMeCoffee {
    public static void main(String[] args) {
        String str = "https://www.buymeacoffee.com/SergeiD";
        String coded = "";
        char[] ch = str.toCharArray();
        for (char c : ch){
            c += 3;
            coded += c;
            //System.out.print(c);
        }
        System.out.println(coded);
        String uncoded = "";
        char[] chen = coded.toCharArray();
        for (char c1 : chen){
            c1 -= 3;
            uncoded += c1;
            //System.out.print(c);
        }
        System.out.println(uncoded);


    }
}
