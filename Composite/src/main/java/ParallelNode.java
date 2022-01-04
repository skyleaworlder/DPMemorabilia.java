import java.util.ArrayList;

public class ParallelNode extends Node {
    private ArrayList<Node> branches = new ArrayList<Node>();

    ParallelNode(String name, int id) {
        super(name, id, 0);
    }

    @Override
    public double getWeight() {
        double result = 0;
        for (Node br : branches) {
            result += br.getWeight();
        }
        return result;
    }

    /**
     * insert
     * @param another ASL actually
     */
    @Override
    public Node insert(Node another) {
        this.branches.add(another);
        return this;
    }
}
