package Common;

public class KeyValue {
	String key, value;
	
	public KeyValue (String key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getValue() {return value;}
	public String getKey() {return key;}
	
	public String toString() {return value;}
	
	public boolean equals (Object obj) {
		if (obj instanceof KeyValue) {
			KeyValue kv = (KeyValue)obj;
			return (kv.value.equals(this.value));
		}
		return false;
		
	}
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + (this.value != null ? this.value.hashCode() : 0);
		return hash;
	}
}
