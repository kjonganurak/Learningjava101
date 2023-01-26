public class VIPClubHouseUser extends ClubHouseUser {
    private int numHostedRooms;

    public VIPClubHouseUser(String id){
        super(id);
    }
    public VIPClubHouseUser(String id,String bio,int numFollowers){
        super(id,bio);
        this.numFollowers = numFollowers;
    }

    public int getNumHostedRooms() {
        return numHostedRooms;
    }

    public void setNumHostedRooms(int numHostedRooms) {
        this.numHostedRooms = numHostedRooms;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", Bio:" + bio + ", Number of followers:" + numFollowers + ", Number of hosted rooms: " + numHostedRooms ;
    }

}


