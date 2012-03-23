package model;

public class DesignLayerModel {

	private String Layer_ID;
	public String getLayer_ID() {
		return Layer_ID;
	}
	public void setLayer_ID(String layerID) {
		Layer_ID = layerID;
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
