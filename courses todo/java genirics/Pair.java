public class Pair <T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public boolean isEqual(){
        return first.equals(second);
    }

    public void swap(){
        T t;
        t = this.second;
        this.second = this.first;
        this.first = t;
    }

    public void printPair(){
        System.out.println("first: "+this.first);
        System.out.println("second: "+this.second);
    }
    
}
