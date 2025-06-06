package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Ran C.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "rankesterc";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-01");
        team.addMember("Alec S.");
        team.addMember("Eyob T.");
        team.addMember("Hao J.");
        team.addMember("Lexuan H.");
        team.addMember("Oscar L.");
        team.addMember("Ran C.");
        return team;
    }
}
