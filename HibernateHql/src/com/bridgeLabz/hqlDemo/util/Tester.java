package com.bridgeLabz.hqlDemo.util;

import com.bridgeLabz.hqlDemo.dao.MobileDao;
import com.bridgeLabz.hqlDemo.dto.Mobile;

public class Tester {
public static void main(String[] args) {
	Mobile mob=new Mobile();
	
/*	mob.setId(2);*/
	mob.setModel("apple");
	mob.setPrize(77000.00);
	
	MobileDao mdao=new MobileDao();
	mdao.save(mob);
	mdao.update();
	mdao.delete();
	mdao.sumFunction();
	mdao.maxFunction();
	mdao.minFunction();
	mdao.countFunction();
	mdao.avgFunction();
}
}
