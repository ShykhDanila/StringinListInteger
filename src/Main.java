public class Main extends Example{
    public static void main(String[] args) {

         Example<Integer> integerExample = new Example<>();

        integerExample.setE(5);
        System.out.println(integerExample.getE());
        add(integerExample,"privet");
        System.out.println(integerExample.getE());

    }
}
