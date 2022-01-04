public class CacherDemo {
    public static void main(String[] args) {
        CalcuMethod<Double> m = () -> 2.0;
        Cacher<Double> cacher = new Cacher<Double>(m);
        System.out.println(cacher.getVal());
        System.out.println(cacher.getVal());
    }
}
