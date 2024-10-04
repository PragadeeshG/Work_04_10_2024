package com.test1;

public class ConcurrentModificationException {
	private Integer hashMapFileName;
	private Integer hashMapPassword;
	private String deepCopiedMap;
	private Integer indexOf;
	private String mainCert;
	private String sertType;
	private String trustoreType;
	private String staticSync;
	private String isSerializable;
	private String isImmutable;
	private String remarks;

	public ConcurrentModificationException() {

	}

	public ConcurrentModificationException(Integer hashMapFileName, Integer hashMapPassword, String deepCopiedMap,
			Integer indexOf, String mainCert, String sertType, String trustoreType, String staticSync,
			String isSerializable, String isImmutable, String remarks) {
		super();
		this.hashMapFileName = hashMapFileName;
		this.hashMapPassword = hashMapPassword;
		this.deepCopiedMap = deepCopiedMap;
		this.indexOf = indexOf;
		this.mainCert = mainCert;
		this.sertType = sertType;
		this.trustoreType = trustoreType;
		this.staticSync = staticSync;
		this.isSerializable = isSerializable;
		this.isImmutable = isImmutable;
		this.remarks = remarks;
	}

	public Integer getHashMapFileName() {
		return hashMapFileName;
	}

	public void setHashMapFileName(Integer hashMapFileName) {
		this.hashMapFileName = hashMapFileName;
	}

	public Integer getHashMapPassword() {
		return hashMapPassword;
	}

	public void setHashMapPassword(Integer hashMapPassword) {
		this.hashMapPassword = hashMapPassword;
	}

	public String getDeepCopiedMap() {
		return deepCopiedMap;
	}

	public void setDeepCopiedMap(String deepCopiedMap) {
		this.deepCopiedMap = deepCopiedMap;
	}

	public Integer getIndexOf() {
		return indexOf;
	}

	public void setIndexOf(Integer indexOf) {
		this.indexOf = indexOf;
	}

	public String getMainCert() {
		return mainCert;
	}

	public void setMainCert(String mainCert) {
		this.mainCert = mainCert;
	}

	public String getSertType() {
		return sertType;
	}

	public void setSertType(String sertType) {
		this.sertType = sertType;
	}

	public String getTrustoreType() {
		return trustoreType;
	}

	public void setTrustoreType(String trustoreType) {
		this.trustoreType = trustoreType;
	}

	public String getStaticSync() {
		return staticSync;
	}

	public void setStaticSync(String staticSync) {
		this.staticSync = staticSync;
	}

	public String getIsSerializable() {
		return isSerializable;
	}

	public void setIsSerializable(String isSerializable) {
		this.isSerializable = isSerializable;
	}

	public String getIsImmutable() {
		return isImmutable;
	}

	public void setIsImmutable(String isImmutable) {
		this.isImmutable = isImmutable;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
