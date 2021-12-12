package io.github.vineetur1983;

/**
 * 
 * @author Vineet
 * @category Test
 * @version 0.1
 * @since Dec 2021
 */
public class SeleniumTest {
	
	private String name;
	private int issueNumber;
	private double versionNo;
	
	public SeleniumTest() {
		this.name = "Demo";
		this.issueNumber = 1;
	}
	
	public SeleniumTest(String name, int issueNumber) {
		super();
		this.name = name;
		this.issueNumber = issueNumber;
	}
	
	public SeleniumTest(String name) {
		this.name = name;
		this.issueNumber = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	public double getVersion() {
		return versionNo;
	}
	
	public void setVersion(double version) {
		this.versionNo = version;
	}
	

}
