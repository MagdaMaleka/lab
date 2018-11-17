public class Loops {

    public static void main(String[] args) {

        final String FORBIDEN ="cztery";

        int i = 0;
        String[] strings = {"raz", "dwa", "trzy", "cztery", "piec", "dwa", "trzy"};

        System.out.println("----------------------------------------- START");
        while(i < strings.length){
            if (strings[i].equals(FORBIDEN)){
                i++;
                continue;
            }
            System.out.println(strings[i]);
            i++;
        }

        System.out.println("---------------------------------------- KONIEC");

      /*  while (i<100){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < 100);
        */

    }
}
