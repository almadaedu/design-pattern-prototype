import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void mustReturnJob(){
        Farmer farmer = new Farmer().setJob("Take care of cows");
        assertEquals("Take care of cows", farmer.getJob());
    }

    @Test
    void mustReturnTool(){
        Tool tool = new Tool().setTool_type("Bucket").setMaterial("Iron");
        Farmer farmer = new Farmer().setTool(tool);

        assertEquals(Farmer.class, farmer.getTool().getClass());
    }

    @Test
    void mustReturnToolDescription(){
        Tool tool = new Tool().setTool_type("Hoe").setMaterial("Iron");
        Farmer farmer = new Farmer().setJob("Farmer").setTool(tool);

        assertEquals("This Farmer is holding a Iron Hoe.", farmer.getToolDescription());
    }

    @Test
    void mustReturnDifferentClone() throws CloneNotSupportedException{
        Tool tool = new Tool().setTool_type("Bucket").setMaterial("Iron");
        Farmer farmer = new Farmer().setJob("Soldier").setTool(tool);

        Farmer dummy = farmer;
        assertEquals(dummy.hashCode(), farmer.hashCode());

        Farmer farmerClone = farmer.clone();
        assertNotEquals(farmerClone.hashCode(), farmer.hashCode());
    }

}