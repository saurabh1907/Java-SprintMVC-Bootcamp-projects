package com.flp.ems.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateParser {
public static Date dateParser(String dateToParse) throws java.text.ParseException{
	 DateFormat dateformatter = new SimpleDateFormat("dd/mm/yyyy"); 
	 Date date= dateformatter.parse(dateToParse);
	 return date;
}
}
