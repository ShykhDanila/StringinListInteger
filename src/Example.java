public class Example<E> {

    E e;

    public Example() {
    }

    public Example(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    public static void add(Example example, String a){
        example.setE(a);
    }
}
