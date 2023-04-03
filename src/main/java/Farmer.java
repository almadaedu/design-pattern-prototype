public class Farmer implements Cloneable {
    private String job;
    private Tool tool;

    public String getJob() {
        return job;
    }

    public Farmer setJob(String job) {
        this.job = job;
        return this;
    }

    public Tool getTool() {
        return tool;
    }

    public Farmer setTool(Tool tool) {
        this.tool = tool;
        return this;
    }

    public String getToolDescription(){
        return String.format("This %s is holding %s", this.getJob(), this.tool.getToolDescription());
    }

    @Override
    protected Farmer clone() throws CloneNotSupportedException {
        Farmer newFarmer = (Farmer) super.clone();
        newFarmer.setTool(this.tool.clone());

        return newFarmer;
    }
}