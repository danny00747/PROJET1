package Heritage;

import data.Sample;
import interfaces.Filter;
import interfaces.Stats;

public class StatsImpl implements Stats {
	public static StatsImpl instance = new StatsImpl();

	@Override
	public float correlationTempHum(Sample[] samples) {
		float sumTemp = 0, sumHum = 0, sumTempSquare = 0, sumHumSquare = 0, sumHumTemp = 0;
		int length = samples.length;
		int lengthSquare = length * length;
		for (int i = 0; i < length; ++i) {
			float temp = samples[i].getTemperature();
			float hum = samples[i].getHumidity();
			sumTemp += temp;
			sumHum += hum;
			sumTempSquare += temp * temp;
			sumHumSquare += hum * hum;
			sumHumTemp += temp * hum;
		}
		float a = sumHumTemp / length - sumTemp * sumHum / lengthSquare;
		float b = (float) Math.sqrt(sumTempSquare / length - sumTemp * sumTemp / lengthSquare);
		float c = (float) Math.sqrt(sumHumSquare / length - sumHum * sumHum / lengthSquare);
		return (float) a / b / c;
	}

	@Override
	public Sample[] filter(Sample[] samples, Filter filter) {
		int faux = 0;
		for (int a = 0; a < samples.length; a++) {
			if (!filter.matchedBy(samples[a])) {
				faux++;
			}
		}
		int valide = 0;
		Sample nouveauTableau[] = new Sample[(samples.length - faux)];
		for (int a = 0; valide < nouveauTableau.length; a++) {
			if (filter.matchedBy(samples[a])) {
				nouveauTableau[valide] = samples[a];
				valide++;
			}
		}
		return nouveauTableau;
	}

	@Override
	public float getAverageHum(Sample[] samples) {
		float sum = 0;
		for (Sample sample : samples)
			sum += sample.getHumidity();
		return sum / samples.length;
	}

	@Override
	public float getAverageTemp(Sample[] samples) {
		float sum = 0;
		for (Sample sample : samples) {
			sum += sample.getTemperature();
		}
		return sum / samples.length;
	}

	@Override
	public float getMaxHum(Sample[] arg0) {
		float max = Float.MIN_VALUE;
		for (Sample sample : arg0)
			if (sample.getHumidity() > max)
				max = sample.getHumidity();
		return max;

	}

	@Override
	public float getMaxTemp(Sample[] samples) {
		float max = Float.MIN_NORMAL;
		for (Sample sample : samples)
			if (sample.getTemperature() > max)
				max = sample.getTemperature();
		return max;

	}

	@Override
	public float getMinHum(Sample[] samples) {
		float min = Float.MAX_VALUE;
		for (Sample sample : samples)
			if (sample.getHumidity() < min)
				min = sample.getHumidity();
		return min;

	}

	@Override
	public float getMinTemp(Sample[] samples) {
		float min = Float.MAX_VALUE;
		for (Sample sample : samples)
			if (sample.getTemperature() < min)
				min = sample.getTemperature();
		return min;

	}

	@Override
	public float getStandardDeviationHum(Sample[] samples) {
		return (float) Math.sqrt(getVarianceHum(samples));

	}

	@Override
	public float getStandardDeviationTemp(Sample[] samples) {
		return (float) Math.sqrt(getVarianceTemp(samples));

	}

	@Override
	public float getVarianceHum(Sample[] samples) {
		float avg = getAverageHum(samples), temp = 0F;
		for (Sample sample : samples)
			temp += (sample.getHumidity() - avg) * (sample.getHumidity() - avg);
		return temp / samples.length;
	}

	@Override
	public float getVarianceTemp(Sample[] samples) {
		float avg = getAverageTemp(samples), temp = 0F;
		for (Sample sample : samples)
			temp += (sample.getTemperature() - avg) * (sample.getTemperature() - avg);
		return temp / samples.length;

	}

}
