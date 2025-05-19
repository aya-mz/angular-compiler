package Classes;

public class TemplateNode extends ComponentEntryNode{
    TemplateBodyNode templateBodyNode;

    public TemplateNode(int line, int column) {
        super(line, column);
    }

    public TemplateBodyNode getTemplateBodyNode() {
        return templateBodyNode;
    }

    public void setTemplateBodyNode(TemplateBodyNode templateBodyNode) {
        this.templateBodyNode = templateBodyNode;
    }

    @Override
    public String toString() {
        return "TemplateNode{" +
                "templateBodyNode=" + templateBodyNode +
                '}';
    }
}
