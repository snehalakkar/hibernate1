package com.bridgeLabz.Hql.util;

import com.bridgeLabz.Hql.dao.Bottle2;
import com.bridgeLabz.Hql.dto.Bottle;

public class Tester {
public static void main(String [] args) {
	Bottle b1=new Bottle();
	b1.setId(1);
	b1.setColor("blue");
	b1.setPrize(45.00);
	
	Bottle2 bdao=new Bottle2();
	bdao.save(b1);
	/*bdao.update(1, "red");*/
}
}
