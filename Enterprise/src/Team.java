import java.util.*;
public class Team extends AbstractEnterpriseUnit{
    private StaffMember teamLeader;

    public Team(String name, StaffMember teamLeader){
        super(name);
        this.teamLeader = teamLeader;
    }
}
