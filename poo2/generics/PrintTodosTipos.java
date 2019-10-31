public class PrintTodosTipos{

    public static <T> void printArray(T[] vetor) {
        for (T var : vetor) {
            System.out.print(var + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer [] n = {1,3,4,5};
        Double [] v = {1.4,1.6,1.5};
        String [] p = {"df","fgg"};

        printArray(n);
        printArray(v);
        printArray(p);

    }
}