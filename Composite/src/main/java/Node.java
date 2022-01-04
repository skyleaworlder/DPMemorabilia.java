public abstract class Node {
    private String name;
    private int id;
    private double weight;

    Node(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * insert is not to be implemented in Node,
     * just a composite design pattern needed.
     * @param another
     */
    public abstract Node insert(Node another);

    /**
     * getNode is to get Node itself.
     * to test whether it's a container(like ASL)
     * @return
     */
    public Node getNode() {
        return null;
    }
}
