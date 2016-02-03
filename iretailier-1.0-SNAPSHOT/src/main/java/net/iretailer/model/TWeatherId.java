package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * TWeatherId generated by hbm2java
 */
public class TWeatherId implements java.io.Serializable {

	private String id;
	private String cityId;
	private String weatherDate;
	private String weatherName;
	private String imageUrl;
	private Integer lowTemp;
	private Integer highTemp;
	private Integer humidity;
	private Integer pm25;
	private Integer pollutionLevel;

	public TWeatherId() {
	}

	public TWeatherId(String id, String cityId, String weatherDate) {
		this.id = id;
		this.cityId = cityId;
		this.weatherDate = weatherDate;
	}

	public TWeatherId(String id, String cityId, String weatherDate, String weatherName, String imageUrl,
			Integer lowTemp, Integer highTemp, Integer humidity, Integer pm25, Integer pollutionLevel) {
		this.id = id;
		this.cityId = cityId;
		this.weatherDate = weatherDate;
		this.weatherName = weatherName;
		this.imageUrl = imageUrl;
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
		this.humidity = humidity;
		this.pm25 = pm25;
		this.pollutionLevel = pollutionLevel;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getWeatherDate() {
		return this.weatherDate;
	}

	public void setWeatherDate(String weatherDate) {
		this.weatherDate = weatherDate;
	}

	public String getWeatherName() {
		return this.weatherName;
	}

	public void setWeatherName(String weatherName) {
		this.weatherName = weatherName;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getLowTemp() {
		return this.lowTemp;
	}

	public void setLowTemp(Integer lowTemp) {
		this.lowTemp = lowTemp;
	}

	public Integer getHighTemp() {
		return this.highTemp;
	}

	public void setHighTemp(Integer highTemp) {
		this.highTemp = highTemp;
	}

	public Integer getHumidity() {
		return this.humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Integer getPm25() {
		return this.pm25;
	}

	public void setPm25(Integer pm25) {
		this.pm25 = pm25;
	}

	public Integer getPollutionLevel() {
		return this.pollutionLevel;
	}

	public void setPollutionLevel(Integer pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TWeatherId))
			return false;
		TWeatherId castOther = (TWeatherId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getCityId() == castOther.getCityId()) || (this.getCityId() != null
						&& castOther.getCityId() != null && this.getCityId().equals(castOther.getCityId())))
				&& ((this.getWeatherDate() == castOther.getWeatherDate())
						|| (this.getWeatherDate() != null && castOther.getWeatherDate() != null
								&& this.getWeatherDate().equals(castOther.getWeatherDate())))
				&& ((this.getWeatherName() == castOther.getWeatherName())
						|| (this.getWeatherName() != null && castOther.getWeatherName() != null
								&& this.getWeatherName().equals(castOther.getWeatherName())))
				&& ((this.getImageUrl() == castOther.getImageUrl()) || (this.getImageUrl() != null
						&& castOther.getImageUrl() != null && this.getImageUrl().equals(castOther.getImageUrl())))
				&& ((this.getLowTemp() == castOther.getLowTemp()) || (this.getLowTemp() != null
						&& castOther.getLowTemp() != null && this.getLowTemp().equals(castOther.getLowTemp())))
				&& ((this.getHighTemp() == castOther.getHighTemp()) || (this.getHighTemp() != null
						&& castOther.getHighTemp() != null && this.getHighTemp().equals(castOther.getHighTemp())))
				&& ((this.getHumidity() == castOther.getHumidity()) || (this.getHumidity() != null
						&& castOther.getHumidity() != null && this.getHumidity().equals(castOther.getHumidity())))
				&& ((this.getPm25() == castOther.getPm25()) || (this.getPm25() != null && castOther.getPm25() != null
						&& this.getPm25().equals(castOther.getPm25())))
				&& ((this.getPollutionLevel() == castOther.getPollutionLevel())
						|| (this.getPollutionLevel() != null && castOther.getPollutionLevel() != null
								&& this.getPollutionLevel().equals(castOther.getPollutionLevel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getCityId() == null ? 0 : this.getCityId().hashCode());
		result = 37 * result + (getWeatherDate() == null ? 0 : this.getWeatherDate().hashCode());
		result = 37 * result + (getWeatherName() == null ? 0 : this.getWeatherName().hashCode());
		result = 37 * result + (getImageUrl() == null ? 0 : this.getImageUrl().hashCode());
		result = 37 * result + (getLowTemp() == null ? 0 : this.getLowTemp().hashCode());
		result = 37 * result + (getHighTemp() == null ? 0 : this.getHighTemp().hashCode());
		result = 37 * result + (getHumidity() == null ? 0 : this.getHumidity().hashCode());
		result = 37 * result + (getPm25() == null ? 0 : this.getPm25().hashCode());
		result = 37 * result + (getPollutionLevel() == null ? 0 : this.getPollutionLevel().hashCode());
		return result;
	}

}
