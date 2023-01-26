public class TestClubHouseUser {
    public static void testConstructorsMethod(){
        ClubHouseUser apirak = new ClubHouseUser("apirak");
        ClubHouseUser jeng = new ClubHouseUser("jengguru", "Seeking new fun startup");
        apirak.setNumFollowers(407);
        jeng.setNumFollowers(93);
        apirak.setBio("Co-Founder UX Thailand Community");
        System.out.println(apirak.getId() + " has number of followers as " + apirak.getNumFollowers());
        System.out.println(apirak);
        System.out.println(jeng);
        System.out.println("Number of Club House Users is " + ClubHouseUser.getNumClubHouseUsers());
    }

    public static void testSuperclass(){
        VIPClubHouseUser gap = new VIPClubHouseUser("gab", "Nerd Squad", 719);
        gap.setNumHostedRooms(2);
        System.out.println(gap);
        System.out.println("Number of Club House Users is " + ClubHouseUser.getNumClubHouseUsers());
    } 

    public static void main(String[] args) {
        testConstructorsMethod();
        testSuperclass();
    }
}
