package Heritage;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.Sample;


public class StatsImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAverageHum() {
		
		
		{
			//StatsImpl a = new StatsImpl();
	        Sample [] samples = new Sample[3]; 
	        samples[0] = new Sample(20,(float)72,new time.Instant(new Date(2017,12,20)));
	        samples[1] = new Sample(15,(float)50,new time.Instant(new Date(2017,12,20)));
	        samples[2] = new Sample(25,(float)30,new time.Instant(new Date(2017,12,20)));
	        
	       
	        // La reponse dévrait etre 20
	        //Assert.assertThat(a.getAverageTemp(samples)).isEqualto(20);
	       // Assert.assertEquals(20,a.getAverageTemp(samples));
	    } 
	}

	
}
