package Heritage;

import monitorable.Plant;
import monitorable.PlantSample;
import monitorable.PlantSampleListener;

	public class PlantSampleListenerImpl implements PlantSampleListener {

		public static PlantSampleListenerImpl instance = new PlantSampleListenerImpl();

		public void sampleTaken(PlantSample arg0) {
			Plant plant = arg0.getPlant();
			float higher = plant.getHigherBound();
			float humidity = arg0.getHumidity();
			if (humidity <= higher - 0.5)
				plant.water(20);
		}

	
	}


