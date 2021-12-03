import java.util.*;

public class sort {
    public static Scanner scnr = new Scanner(System.in);
    public static int size = scnr.nextInt();;
    public static Random rand = new Random();
    public static int runSize = 1000;

    public static void bogo(int[] set) {
        int[] set2 = new int[size];
        for (int i = 1; i <= size; i++) {
            set2[i - 1] = i;
        }
        int[] setTemp = new int[size];
        for (int i = 0; i < size; i++) {
            setTemp[i] = set[i];
        }
        boolean truth = true;
        while (truth) {
                printNum(setTemp);
            System.out.println("");
            for (int i = setTemp.length - 1; i > 0; i--) {
                int index = rand.nextInt(i + 1);
                int a = setTemp[index];
                setTemp[index] = setTemp[i];
                setTemp[i] = a;

            }
            if (Arrays.equals(setTemp, set2)) {
                //for(int wau:set) { System.out.print(wau + " "); }
                //System.out.println("");
                //for(int wau:set2) { System.out.print(wau + " "); }

                    printNum(setTemp);
                    
                return;
            }

        }
        return;
    }

    public static void bubble(int[] set) {
        int[] set2 = new int[size];
        for (int i = 1; i <= size; i++) {
            set2[i - 1] = i;
        }
        boolean truth = true;
        while (truth) {
            printNum(set);
            System.out.println("");
            for (int i = 0; i < size - 1; i++) {
                if (set[i] > set[i + 1]) {
                    int temp = set[i + 1];
                    set[i + 1] = set[i];
                    set[i] = temp;
                    printNum(set);
                    System.out.println("");
                    if (Arrays.equals(set, set2)) {
                        return;
                    }
                }
            }
        }
        return;
    }

    public static int selection() {
        int count = 0;

        return count;
    }

    public static int[] creator() {
        int[] set = new int[size];
        for (int i = 1; i <= size; i++) {
            set[i - 1] = i;
        }
        for (int i = set.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = set[index];
            set[index] = set[i];
            set[i] = a;
        }

        return set;
    }

    public static void printNum(int[] num) {
        long startTime = System.currentTimeMillis();
        for(int j = 0; j < size; j++) {
        String printNum = "";
        for (int i = 0; i < num[j]; i++) {
            printNum += "#";
            
        }
        System.out.println(printNum);
        }
        while(System.currentTimeMillis() - startTime < 300 ) {
            
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to sort visualizer.");
        int[] setRand = creator();
        for (int wau : setRand) {
            System.out.print(wau + " ");
        }
        System.out.println("");
        boolean truth = true;
        while(truth) {
            System.out.println("Please choose a sort method, bogo, bubble, exit");
        
        String sort = scnr.next();
        System.out.println("");
        if(sort.trim().toLowerCase().equals("bogo")) {
            bogo(setRand);
        }
        if(sort.trim().toLowerCase().equals("bubble")) {
            bubble(setRand);
        }
        if(sort.trim().toLowerCase().equals("exit")) {
            return;
        }
    }
    }
}
