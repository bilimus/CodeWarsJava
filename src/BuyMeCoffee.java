
// https://www.buymeacoffee.com/SergeiD

public class BuyMeCoffee {
    public static void main(String[] args) {
        String str = "https://www.buymeacoffee.com/SergeiD";
        StringBuilder coded = new StringBuilder();
        char[] ch = str.toCharArray();
        for (char c : ch){
            c += 3;
            coded.append(c);
        }

        System.out.println(coded);

        StringBuilder uncoded = new StringBuilder();
        char[] chen = coded.toString().toCharArray();
        for (char c1 : chen){
            c1 -= 3;
            uncoded.append(c1);
        }
        System.out.println(uncoded);


    }
}
