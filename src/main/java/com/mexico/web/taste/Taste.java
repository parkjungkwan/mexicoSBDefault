package com.mexico.web.taste;

import java.util.Date;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public class Taste {
	private int tasteSeq;
	private int quantity;
	private String dirName;
	private double grade;
	private Date tasteDate;
	private Date tasteTime;
	private String flag;
	private int tagSeq;
	private String memberId;
	private int itemSeq;
}
