package com.test1;

public class ConcurrentModificationExceptionScheduler {
	private Integer hashMapFileName;
	private String interruptingThread;
	private String reentrantThread;
	private String interThreadCommunication;
	private String sunchronizedBlockingMechanism;
	private String networks;
	private String sslProxyEngine;
	private String sslProxyVerify;
	private String sslProxyCheckPeerCN;
	private String sslProxyCheckPeerName;
	private String proxyRequests;
	private String proxyTimeOut;
	private String modifiedDate;

	public ConcurrentModificationExceptionScheduler() {

	}

	public ConcurrentModificationExceptionScheduler(Integer hashMapFileName, String interruptingThread,
			String reentrantThread, String interThreadCommunication, String sunchronizedBlockingMechanism,
			String networks, String sslProxyEngine, String sslProxyVerify, String sslProxyCheckPeerCN,
			String sslProxyCheckPeerName, String proxyRequests, String proxyTimeOut, String modifiedDate) {
		super();
		this.hashMapFileName = hashMapFileName;
		this.interruptingThread = interruptingThread;
		this.reentrantThread = reentrantThread;
		this.interThreadCommunication = interThreadCommunication;
		this.sunchronizedBlockingMechanism = sunchronizedBlockingMechanism;
		this.networks = networks;
		this.sslProxyEngine = sslProxyEngine;
		this.sslProxyVerify = sslProxyVerify;
		this.sslProxyCheckPeerCN = sslProxyCheckPeerCN;
		this.sslProxyCheckPeerName = sslProxyCheckPeerName;
		this.proxyRequests = proxyRequests;
		this.proxyTimeOut = proxyTimeOut;
		this.modifiedDate = modifiedDate;
	}

	public Integer getHashMapFileName() {
		return hashMapFileName;
	}

	public void setHashMapFileName(Integer hashMapFileName) {
		this.hashMapFileName = hashMapFileName;
	}

	public String getInterruptingThread() {
		return interruptingThread;
	}

	public void setInterruptingThread(String interruptingThread) {
		this.interruptingThread = interruptingThread;
	}

	public String getReentrantThread() {
		return reentrantThread;
	}

	public void setReentrantThread(String reentrantThread) {
		this.reentrantThread = reentrantThread;
	}

	public String getInterThreadCommunication() {
		return interThreadCommunication;
	}

	public void setInterThreadCommunication(String interThreadCommunication) {
		this.interThreadCommunication = interThreadCommunication;
	}

	public String getSunchronizedBlockingMechanism() {
		return sunchronizedBlockingMechanism;
	}

	public void setSunchronizedBlockingMechanism(String sunchronizedBlockingMechanism) {
		this.sunchronizedBlockingMechanism = sunchronizedBlockingMechanism;
	}

	public String getNetworks() {
		return networks;
	}

	public void setNetworks(String networks) {
		this.networks = networks;
	}

	public String getSslProxyEngine() {
		return sslProxyEngine;
	}

	public void setSslProxyEngine(String sslProxyEngine) {
		this.sslProxyEngine = sslProxyEngine;
	}

	public String getSslProxyVerify() {
		return sslProxyVerify;
	}

	public void setSslProxyVerify(String sslProxyVerify) {
		this.sslProxyVerify = sslProxyVerify;
	}

	public String getSslProxyCheckPeerCN() {
		return sslProxyCheckPeerCN;
	}

	public void setSslProxyCheckPeerCN(String sslProxyCheckPeerCN) {
		this.sslProxyCheckPeerCN = sslProxyCheckPeerCN;
	}

	public String getSslProxyCheckPeerName() {
		return sslProxyCheckPeerName;
	}

	public void setSslProxyCheckPeerName(String sslProxyCheckPeerName) {
		this.sslProxyCheckPeerName = sslProxyCheckPeerName;
	}

	public String getProxyRequests() {
		return proxyRequests;
	}

	public void setProxyRequests(String proxyRequests) {
		this.proxyRequests = proxyRequests;
	}

	public String getProxyTimeOut() {
		return proxyTimeOut;
	}

	public void setProxyTimeOut(String proxyTimeOut) {
		this.proxyTimeOut = proxyTimeOut;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
