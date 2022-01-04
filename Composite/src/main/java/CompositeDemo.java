public class CompositeDemo {
    public static void main(String[] args) {
        Node para_node = new ParallelNode("para1", 1)
                .insert(
                        new InnerASL("asl1", 2)
                        .insert(new TaskNode("task1", 3, 2.4, "t1"))
                        .insert(new TaskNode("task2", 4, 4.5, "t1"))
                )
                .insert(
                        new InnerASL("asl2", 5)
                        .insert(new TaskNode("task3", 6, 6.0, "t2"))
                );

        Node out_asl = new InnerASL("asl3", 7)
                .insert(para_node)
                .insert(new InnerASL("asl4", 8)
                    .insert(new TaskNode("task4", 9, 0.8, "t3"))
                );

        System.out.println(out_asl.getWeight());
    }
}
