public class RangeLister {

    private String name;

    public static void main(String[] args) {
        RangeLister rangeLister = new RangeLister();
        int[] range = rangeLister.makeRange(4,13);
        rangeLister.show(range);

    }

    int[] makeRange(int lower, int upper){

        int[] range = new int[(upper-lower)+1];

        for (int i=1; i<range.length; i++){
            range[i] = lower++;
        }

        return range;
    }

    void show(int[] range){
        System.out.print("Tablica: [");
        for(int i=1; i<range.length; i++){
            System.out.print(range[i] + " ");
        }
        System.out.println("]");
    }

    void setName(String name){
        this.name = name;
    }

}
