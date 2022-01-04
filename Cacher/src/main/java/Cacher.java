interface CalcuMethod<T> {
    T calcu();
}

public class Cacher<T> {
    private T calcuValRes;
    private CalcuMethod<T> method;

    Cacher(CalcuMethod<T> method) {
        this.method = method;
    }

    private boolean nullValue() {
        return this.calcuValRes == null;
    }

    private boolean outOfDate() {
        return false;
    }

    private T calcuVal() {
        return this.method.calcu();
    }

    public T getVal() {
        if (this.nullValue() || this.outOfDate()) {
            System.out.println("Calcu Value");
            this.calcuValRes = this.calcuVal();
        }
        System.out.println("Get Value");
        return this.calcuValRes;
    }

}
