public class TaskNode extends Node {
    private String taskName;

    TaskNode(String name, int id, double weight, String taskName) {
        super(name, id, weight);
        this.taskName = taskName;
    }

    @Override
    public Node insert(Node another) {
        return this;
    }

    @Override
    public Node getNode() {
        return this;
    }
}
