package io.github.vineetur1983;

public class SeleniumTest {
	
	private String name;
	private int issueNumber;
	
	public SeleniumTest(String name, int issueNumber) {
		super();
		this.name = name;
		this.issueNumber = issueNumber;
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
	

}
