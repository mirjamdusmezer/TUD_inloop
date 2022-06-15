public class StaffMember {
    private String name;
    private String job;


    public StaffMember(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getJob(){
        return job;
    }

    public boolean addDirectSubordinate(StaffMember subordinate){
        return 1;
    }

    public boolean removeDirectSubordinate(StaffMember subordinate){
        return 1;
    }

    public SortedSet<StaffMember> getDirectSubordinate(){

    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", job='" + getJob() + "'" +
            "}";
    }

}
