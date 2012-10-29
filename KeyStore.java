public class KeyStore {
	private String name;
	private int key;
	private static keyCount;
	
	public KeyStore(String name, int key) {
		this.name = name;
		this.key = key;
		this.nextKey = null;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKey() {
		return key;
	}
	
	public KeyStore getNext() {
		return this.nextKey;
	}
	
	public void setNext(KeyStore keyStore) {
		this.nextKey = keyStore;
	}
	
	public void incrementKeyCount() {
		keyCount++;
	}
	
	public int getKeyCount() {
		return keyCount;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}