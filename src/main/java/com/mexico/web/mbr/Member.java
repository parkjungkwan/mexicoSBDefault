package com.mexico.web.mbr;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public class Member {
	private String memberId;
	private String password;
	private String name;
	private int age;
	private String ssn;
	private String gender;
	private String address;
	private String eMail;
	private String phoneNum;
}
