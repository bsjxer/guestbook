package com.bit2016.guestbook.dao.test;

import java.util.List;

import com.bit2016.guestbook.dao.GuestBookDao;
import com.bit2016.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {
	public static void main(String[] args) {
		// insertTest();
		//
		// getListTest();

		// String str = "1\t\n2\t\n3\t\n";
		// String str1 = "1<br>2<br>3<br>";
		// str = str.replaceAll("\t\n", "<br>");
		// System.out.println(str);
		// System.out.println(str1);

		String str = "2";
		Long a;
		a = Long.parseLong(str);
		System.out.println(a);
	}

	public static void insertTest() {
		GuestBookVo vo = new GuestBookVo();
		vo.setName("배승진");
		vo.setContent("아아아아아아");
		vo.setPassword("1234");

		GuestBookDao dao = new GuestBookDao();
		dao.insert(vo);
	}

	public static void getListTest() {
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.getList();

		for (GuestBookVo vo : list) {
			System.out.println(vo);
		}
	}
}
