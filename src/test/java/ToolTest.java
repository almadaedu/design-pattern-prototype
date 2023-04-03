import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToolTest {


    @Test
    void mustReturnMaterial() {
        Tool tool = new Tool().setMaterial("Iron");
        assertEquals("Iron", tool.getMaterial());
    }

    @Test
    void mustReturnToolType() {
        Tool tool = new Tool().setTool_type("Bucket");
        assertEquals("Bucket", tool.getTool_type());
    }

    @Test
    void mustReturnToolDescription() {
        Tool tool = new Tool().setMaterial("Iron").setTool_type("Hoe");
        assertEquals("a Iron Hoe.", tool.getToolDescription());
    }

    @Test
    void mustBeClonedIntoADifferentObject() throws CloneNotSupportedException{
        Tool tool = new Tool().setMaterial("Iron").setTool_type("Hoe");

        Tool dummy = tool;
        assertEquals(dummy.hashCode(), tool.hashCode());

        Tool weaponclone = tool.clone();
        assertNotEquals(weaponclone.hashCode(), tool.hashCode());
    }
}