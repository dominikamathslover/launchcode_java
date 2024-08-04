package technology;

public abstract class AbstractEntity {
    private int entityID;

    public AbstractEntity(int anEntityID){
        entityID = anEntityID;
    }

    public int getEntityID() {
        return entityID;
    }


}
