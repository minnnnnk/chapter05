package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.javaex.ex03.Person;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {
		//split사용 
		//Person클래스를 만들어서 name hp company 만들기
		//리스트에서 add로 데이터 자기데이터 하나 추가
		//그 후에 txt파일을 다시만듬
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		List<Person> pList = new ArrayList<Person>();
		
		//배열 split
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] str1 = str.split(",");
			
			
			String name = str1[0];
			String hp = str1[1];
			String company = str1[2];
			
			Person person = new Person(name, hp, company);
			pList.add(person);
			
		}
	
		
		for(Person person : pList) {
			System.out.println("이름: " +person.getName());
			System.out.println("핸드폰: " +person.getHp());
			System.out.println("회사 :" +person.getCompany());
			System.out.println("");
		}
	
		System.out.println(pList.get(0).getName());
		
		
		
		br.close();
		
		
	}	
}
