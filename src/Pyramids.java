public class Pyramids {
    public static void main(String[] args){
        System.out.println("\n\n#####  Task 1 #####\n\n");
        int k = 10;
        for (int i=0; i < k; i++){
            for(int j=0; j < k-i; j++){
                System.out.print(j);
              }
            System.out.println();
        }
        System.out.println("\n\n#####  Task 2 #####\n\n");
        String space ="";
        for (int i=0; i < k; i++){
            for(int j=0; j < k-i; j++){
                System.out.print(j);
            }
            System.out.println();
            space += " ";
            System.out.print(space);
        }

        System.out.println("\n\n#####  Task 3 #####\n\n");
        String space1 ="";
        int l=10;
        for (int i=0; i < l; i++){
            for(int j=0; j < 2*(l-i)-1; j++){
                System.out.print(9-j>0 ? 9-j : j-9);
            }
            System.out.println();
            space1 += " ";
            System.out.print(space1);
        }
    }
}









