package org.sample;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pom.Pageobj;

public class Sample extends BaseClass {

public static void main(String[] args) throws IOException {
	openbrowser(getpropertyvalue("browser"));
	urllaunch(getpropertyvalue("url"));
	Pageobj p=new Pageobj();
	p.login(getpropertyvalue("username"), getpropertyvalue("password"));
	p.submit();
	
	
	
	
	
	
	
	


}




















}
