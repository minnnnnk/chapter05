package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
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
		
		
		//텍스트 파일을 1줄씩 읽어서 리스트에 추가 
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
		
		
		
		
		
		//추가할 데이터 생성
		Person my= new Person("김민규","010-1234-1234","02-123-1234");
		pList.add(my);
		
		//출력하기
		for(Person person : pList) {
			System.out.println("이름: " +person.getName());
			System.out.println("핸드폰: " +person.getHp());
			System.out.println("회사 :" +person.getCompany());
			System.out.println("");
		}
	
		////////////////////////////////////////////////////////
		//파일에 저장
		
		
		//쓰기 스트림
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	
		for (Person person:pList) {
			String saveStr = person.getName() + "," +person.getHp() +","+person.getCompany();
			System.out.println(saveStr);
			
			bw.write(saveStr);
			bw.newLine();
		}
		
	
		
		
		bw.close();
		br.close();
	}	
}
