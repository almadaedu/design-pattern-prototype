public class Tool implements Cloneable{
    private String material;
    private String tool_type;

    public String getMaterial() {
        return material;
    }

    public Tool setMaterial(String material) {
        this.material = material;
        return this;
    }

    public String getTool_type() {
        return tool_type;
    }

    public Tool setTool_type(String tool_type) {
        this.tool_type = tool_type;
        return this;
    }

    public String getToolDescription(){
        return String.format("a %s %s.", this.getMaterial(), this.getTool_type());
    }

    @Override
    protected Tool clone() throws CloneNotSupportedException {
        return (Tool) super.clone();
    }
}