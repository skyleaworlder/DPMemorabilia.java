import java.util.ArrayList;

public class InnerASL extends Node {
    private ArrayList<Node> nodes = new ArrayList<Node>();

    InnerASL(String name, int id) {
        super(name, id, 0);
    }

    @Override
    public Node getNode() {
        return this;
    }

    @Override
    public double getWeight() {
        return this.nodes.stream().mapToDouble(Node::getWeight).sum();
    }

    @Override
    public Node insert(Node another) {
        this.nodes.add(another);
        return this;
    }
}
