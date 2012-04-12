package model;

public class DesignLayerModel {
	private String Des_ID;
	public String getDes_ID() {
		return Des_ID;
	}
	public void setDes_ID(String desID) {
		Des_ID = desID;
	}
	public String getLayer() {
		return Layer;
	}
	public void setLayer(String layer) {
		Layer = layer;
	}
	public String getWeightage() {
		return Weightage;
	}
	public void setWeightage(String weightage) {
		Weightage = weightage;
	}
	private String Layer;
	private String Weightage;
}
