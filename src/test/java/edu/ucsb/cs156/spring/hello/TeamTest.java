package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team, team2, team3;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
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

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void object_equal_case1() {
        assert(team.equals(team));
    }
    @Test
    public void object_equal_case2() {
        assert(!team.equals(1));
    }
    @Test
    public void object_equal_case3() {
        team2 = new Team("test-team"); 
        assert(team.equals(team2));
    }
    @Test
    public void object_equal_case4() {
        team3 = new Team("fail_test-team"); 
        assert(!team.equals(team3));
    }

}
