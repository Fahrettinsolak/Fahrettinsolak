package WardsAndTeams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HospitalWards_Test {

    private HospitalWards hospital;
    private Team team1;
    private Team team2;
    private Ward ward1;
    private Ward ward2;

    @Before
    public void setUp() {
        hospital = new HospitalWards("Test Hospital", "123 Main St", "555-555-5555");
        team1 = hospital.addTeam("Team 1");
        team2 = hospital.addTeam("Team 2");
        ward1 = new Ward("Ward 1", null, 0, hospital);
        ward2 = new Ward("Ward 2", null, 0, hospital);
        hospital.addWard(ward1);
        hospital.addWard(ward2);
    }

    @Test
    public void testSetName() {
        assertTrue(hospital.setName("New Name"));
        assertEquals("New Name", hospital.getName());
    }

    @Test
    public void testSetAddress() {
        assertTrue(hospital.setAddress("456 Main St"));
        assertEquals("456 Main St", hospital.getAddress());
    }

    @Test
    public void testSetPhone() {
        assertTrue(hospital.setPhone("555-123-4567"));
        assertEquals("555-123-4567", hospital.getPhone());
    }

    @Test
    public void testGetTeam() {
        assertEquals(team1, hospital.getTeam(0));
        assertEquals(team2, hospital.getTeam(1));
    }

    @Test
    public void testGetTeams() {
        List<Team> expectedTeams = new ArrayList<Team>();
        expectedTeams.add(team1);
        expectedTeams.add(team2);
        assertEquals(expectedTeams, hospital.getTeams());
    }

    @Test
    public void testNumberOfTeams() {
        assertEquals(2, hospital.numberOfTeams());
    }

    @Test
    public void testHasTeams() {
        assertTrue(hospital.hasTeams());
        hospital = new HospitalWards("Test Hospital", "123 Main St", "555-555-5555");
        assertFalse(hospital.hasTeams());
    }

    @Test
    public void testIndexOfTeam() {
        assertEquals(0, hospital.indexOfTeam(team1));
        assertEquals(1, hospital.indexOfTeam(team2));
    }

    @Test
    public void testGetWard() {
        assertEquals(ward1, hospital.getWard(0));
        assertEquals(ward2, hospital.getWard(1));
    }

    @Test
    public void testGetWards() {
        List<Ward> expectedWards = new ArrayList<Ward>();
        expectedWards.add(ward1);
        expectedWards.add(ward2);
        assertEquals(expectedWards, hospital.getWards());
    }

    @Test
    public void testNumberOfWards() {
        assertEquals(2, hospital.numberOfWards());
    }

    @Test
    public void testHasWards() {
        assertTrue(hospital.hasWards());
        hospital = new HospitalWards("Test Hospital", "123 Main St", "555-555-5555");
        assertFalse(hospital.hasWards());
    }

    @Test
    public void testIndexOfWard() {
        assertEquals(0, hospital.indexOfWard(ward1));
        assertEquals(1, hospital.indexOfWard(ward2));
    }
    @Before
	public void setUp1() {
		hospital = new HospitalWards("Hospital", "Address", "1234567890");
		ward1 = hospital.addWard("Ward 1", "male", 5);
		ward2 = hospital.addWard("Ward 2", "female", 10);
		team1 = hospital.addTeam("Team 1");
		team2 = hospital.addTeam("Team 2");
	}
	
	@Test
	public void testAddWard() {
		Ward ward3 = hospital.addWard("Ward 3", "male", 7);
		assertTrue(hospital.getWards().contains(ward3));
	}
	
	@Test
	public void testRemoveWard() {
		assertFalse(hospital.removeWard(ward1));
		assertTrue(hospital.getWards().contains(ward1));
	}
	
	@Test
	public void testAddTeam() {
		Team team3 = hospital.addTeam("Team 3");
		assertTrue(hospital.getTeams().contains(team3));
	}
	
	@Test
	public void testRemoveTeam() {
		assertFalse(hospital.removeTeam(team1));
		assertTrue(hospital.getTeams().contains(team1));
	}
	
	@Test
	public void testAddWardAt() {
		Ward ward3 = hospital.addWard("Ward 3", "male", 7);
		assertFalse(hospital.addWardAt(ward3, 1));
		assertNotEquals(ward3, hospital.getWards().get(1));
	}
	
	@Test
	public void testAddOrMoveTeamAt() {
		assertTrue(hospital.addOrMoveTeamAt(team1, 0));
		assertEquals(team1, hospital.getTeams().get(0));
		assertTrue(hospital.addOrMoveTeamAt(team1, 1));
		assertEquals(team1, hospital.getTeams().get(1));
	}
	
	@Test
	public void testDelete() {
		hospital.delete();
		assertTrue(hospital.getTeams().isEmpty());
		assertTrue(hospital.getWards().isEmpty());
	}
}