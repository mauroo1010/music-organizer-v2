

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CeroCancionesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CeroCancionesTest
{
    private MusicOrganizer musicOrg1;

    /**
     * Default constructor for test class CeroCancionesTest
     */
    public CeroCancionesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        musicOrg1 = new MusicOrganizer();
        musicOrg1.addFile("Loba - Shakira.mp3");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
