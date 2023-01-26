public class ClubHouseUser {
    protected String id,bio;
    protected int numFollowers;
    protected static int numClubHouseUsers;

    public ClubHouseUser(String id) {
        this.id = id;
    }

    public ClubHouseUser(String id, String bio) {
        this.id = id;
        this.bio = bio;
    }

    public int getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(int numFollowers) {
        this.numFollowers = numFollowers;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getId() {
        return id;
    }

    public static int getNumClubHouseUsers() {
        return numClubHouseUsers;
    }
}