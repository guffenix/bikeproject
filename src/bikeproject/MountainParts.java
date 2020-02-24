package bikeproject;

public interface MountainParts {
//	public final String TERRAIN = "off_road";
	public final BikeUses terrain = BikeUses.off_road;
	public void setSuspension(String newValue);
	public String getSuspension();
	public void setType(String newValue);
	public String getType();
}
