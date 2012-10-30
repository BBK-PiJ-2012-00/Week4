public class KeyStore {
	private String name;
	private int key;
	private static int keyCount;
	private KeyStore nextKey = null;
	
	public KeyStore(int key, String name) {
		this.name = name;
		this.key = key;
		this.nextKey = null;
		keyCount++;
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
	
	public static void incrementKeyCount() {
		keyCount++;
	}
	
	public static int getKeyCount() {
		return keyCount;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}