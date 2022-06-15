import java.util.ArrayList;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public abstract class AbstractUnit extends AbstractEnterpriseUnit{
    private Set <AbstractEnterpriseUnit> childNodes = new ArrayList<>();


    public AbstractUnit(String name) {
        super(name);
    }

    public boolean add(AbstractEnterpriseUnit childNode){
        return childNodes.add(childNode);
    }

    public boolean remove(AbstractEnterpriseUnit childNode){
        return childNodes.remove(childNode);
    }


    public Set<AbstractEnterpriseUnit> getChildNodes() {
        return this.childNodes;
    }

}
