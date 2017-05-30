package multichainResult;

import java.util.Arrays;

import org.json.JSONObject;

public class MultichainGetInfoResult extends MultichainResultDefaultAttribute{

	private String version;
	private int nodeVersion;
	private int protocolVersion;
	private String chainName;
	private String description;
	private String protocol;
	private int port;
	private int setupBlocks;
	private String nodeAddress;
	private String burnAddress;
	private boolean incomingPaused;
	private boolean miningPaused;
	private int walletVersion;
	private double balance;
	private int walletDbVersion;
	private boolean reIndex;
	private int blocks;
	private double timeOffset;
	private int connections;
	private String proxy;
	private double difficulty;
	private boolean testnet;
	private double keypoolOldest;
	private int keypoolSize;
	private double payTxFee;
	private double relayFee;
	private String errors;
	
	
	public MultichainGetInfoResult(String JsonResultString) {
		super(MultichainSplitJsonStringResult.SPLIT_JSON_STRING_INTO_JSON_OBJECT_ARRAY(JsonResultString));

//		System.out.println(JsonResultString);
		
		JSONObject jsonGetInfoResult = MultichainSplitJsonStringResult.SPLIT_JSON_STRING_INTO_JSON_OBJECT_ARRAY(JsonResultString)[0];
		
		version = jsonGetInfoResult.getString("version");
		nodeVersion = jsonGetInfoResult.getInt("nodeversion");
		protocolVersion = jsonGetInfoResult.getInt("protocolversion");
		chainName = jsonGetInfoResult.getString("chainname");
		description = jsonGetInfoResult.getString("description");
		protocol = jsonGetInfoResult.getString("protocol");
		port = jsonGetInfoResult.getInt("port");
		setupBlocks = jsonGetInfoResult.getInt("setupblocks");
		nodeAddress = jsonGetInfoResult.getString("nodeaddress");
		burnAddress = jsonGetInfoResult.getString("burnaddress");
		incomingPaused = jsonGetInfoResult.getBoolean("incomingpaused");
		walletVersion = jsonGetInfoResult.getInt("walletversion");
		balance = jsonGetInfoResult.getDouble("balance");
		walletDbVersion = jsonGetInfoResult.getInt("walletdbversion");
		reIndex = jsonGetInfoResult.getBoolean("reindex");
		blocks = jsonGetInfoResult.getInt("blocks");
		timeOffset = jsonGetInfoResult.getDouble("timeoffset");
		connections = jsonGetInfoResult.getInt("connections");
		proxy = jsonGetInfoResult.getString("proxy");
		difficulty = jsonGetInfoResult.getDouble("difficulty");
		testnet = jsonGetInfoResult.getBoolean("testnet");
		keypoolOldest = jsonGetInfoResult.getDouble("keypoololdest");
		keypoolSize = jsonGetInfoResult.getInt("keypoolsize");
		payTxFee = jsonGetInfoResult.getDouble("paytxfee");
		relayFee = jsonGetInfoResult.getDouble("relayfee");
		errors = jsonGetInfoResult.getString("errors");
	}


	public String getVersion() {
		return version;
	}


	public int getNodeVersion() {
		return nodeVersion;
	}


	public int getProtocolVersion() {
		return protocolVersion;
	}


	public String getChainName() {
		return chainName;
	}


	public String getDescription() {
		return description;
	}


	public String getProtocol() {
		return protocol;
	}


	public int getPort() {
		return port;
	}


	public int getSetupBlocks() {
		return setupBlocks;
	}


	public String getNodeAddress() {
		return nodeAddress;
	}


	public String getBurnAddress() {
		return burnAddress;
	}


	public boolean isIncomingPaused() {
		return incomingPaused;
	}


	public boolean isMiningPaused() {
		return miningPaused;
	}


	public int getWalletVersion() {
		return walletVersion;
	}


	public double getBalance() {
		return balance;
	}


	public int getWalletDbVersion() {
		return walletDbVersion;
	}


	public boolean isReIndex() {
		return reIndex;
	}


	public int getBlocks() {
		return blocks;
	}


	public double getTimeOffset() {
		return timeOffset;
	}


	public int getConnections() {
		return connections;
	}


	public String getProxy() {
		return proxy;
	}


	public double getDifficulty() {
		return difficulty;
	}


	public boolean isTestnet() {
		return testnet;
	}


	public double getKeypoolOldest() {
		return keypoolOldest;
	}


	public int getKeypoolSize() {
		return keypoolSize;
	}


	public double getPayTxFee() {
		return payTxFee;
	}


	public double getRelayFee() {
		return relayFee;
	}


	public String getErrors() {
		return errors;
	}


	@Override
	public String toString() {
		return "MultichainGetInfoResult [\n\tversion=" + version + ",\n\tnodeVersion=" + nodeVersion + ",\n\tprotocolVersion="
				+ protocolVersion + ",\n\tchainName=" + chainName + ",\n\tdescription=" + description + ",\n\tprotocol="
				+ protocol + ",\n\tport=" + port + ",\n\tsetupBlocks=" + setupBlocks + ",\n\tnodeAddress=" + nodeAddress
				+ ",\n\tburnAddress=" + burnAddress + ",\n\tincomingPaused=" + incomingPaused + ",\n\tminingPaused="
				+ miningPaused + ",\n\twalletVersion=" + walletVersion + ",\n\tbalance=" + balance + ",\n\twalletDbVersion="
				+ walletDbVersion + ",\n\treIndex=" + reIndex + ",\n\tblocks=" + blocks + ",\n\ttimeOffset=" + timeOffset
				+ ",\n\tconnections=" + connections + ",\n\tproxy=" + proxy + ",\n\tdifficulty=" + difficulty + ",\n\ttestnet="
				+ testnet + ",\n\tkeypoolOldest=" + keypoolOldest + ",\n\tkeypoolSize=" + keypoolSize + ",\n\tpayTxFee="
				+ payTxFee + ",\n\trelayFee=" + relayFee + ",\n\terrors=" + errors + "]\n\n\n\n"
						+ ""
						+ "MultichainResultDefaultAttribute [\n\tmethod=" + method + ",\n\tparams=" + Arrays.toString(params) + ",\n\tid="
				+ id + ",\n\tchainName=" + chainName + "\n]";
	}

	
	
	

}
