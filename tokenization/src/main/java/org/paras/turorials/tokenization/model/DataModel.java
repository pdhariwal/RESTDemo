package org.paras.turorials.tokenization.model;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "data")
public class DataModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "account")
	private String account;

	@XmlElement(name = "token")
	private String token;

	@XmlElement(name = "encodedAccount")
	private String encodedAccount;

	@XmlElement(name = "encodedToken")
	private String encodedToken;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEncodedAccount() {
		return encodedAccount;
	}

	public void setEncodedAccount(String encodedAccount) {
		this.encodedAccount = encodedAccount;
	}

	public String getEncodedToken() {
		return encodedToken;
	}

	public void setEncodedToken(String encodedToken) {
		this.encodedToken = encodedToken;
	}

}
