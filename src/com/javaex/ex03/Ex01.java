package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

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
				
			} else {
				String[] str1 = str.split(",");
				pList.add(new Person(str1[0],str1[1],str1[2]));
			}
			System.out.println(str);
		}
		
	
		
		
		
		
		br.close();
	}

}
