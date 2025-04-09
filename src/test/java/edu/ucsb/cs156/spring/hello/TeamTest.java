package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team, team1, team2, team3, team4;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");   
        team1 = new Team("test-team"); 
        team2 = new Team("test-team"); 
        team2.addMember("Ran");
        team3 = new Team("fail_test-team"); 
        team4 = new Team("fail_test-team"); 
        team4.addMember("Ran");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));

    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void mutation_equal_hash() {
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

    @Test
    public void object_equal_case1() {
        assert(team.equals(team));
    }
    @Test
    public void object_equal_case2() {
        assert(!team.equals(1));
    }
    @Test
    public void object_equal_case31() {
        assert(team.equals(team1));
    }
    @Test
    public void object_equal_case32() {
        assert(!team.equals(team2));
    }
    @Test
    public void object_equal_case33() {
        assert(!team.equals(team3));
    }
    @Test
    public void object_equal_case34() {
        assert(!team.equals(team4));
    }

}
