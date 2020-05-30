package com.alfalahsfotech.enm;

import java.util.stream.Stream;

public enum ErrorCode{
	INVALID_FORMAT("INVALID_DATAOUT_FORMAT","ERS-0001",""),
	INVALID_DATE_FORMAT("INVALID_DATAOUT_FORMAT","ERS-0001","");
	ErrorCode(String erroMsgID, String code,String detail){}
}


class TestEnum{
	public static void main(String[] args) {
		Stream.of(ErrorCode.values()).forEach(System.out::print);
		System.out.println(WeekDays.FRIDAY);
	}
}