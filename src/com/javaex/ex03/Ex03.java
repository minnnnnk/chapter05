package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		//split사용 
		//Person클래스를 만들어서 name hp company 만들기
		//리스트에서 add로 데이터 자기데이터 하나 추가
		//그 후에 txt파일을 다시만듬
		
		//사진 불러오기
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		List<Person> pList = new ArrayList<Person>();
		Person p = new Person("김민규","010-2300-2040","02-0301-4203");
		pList.add(p);
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB-copy.txt");
		OutputStreamWriter osr = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osr);
		
		// 배열을 spilt 으로 추가
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
				
			} else {
				String[] str1 = str.split(",");
				pList.add(new Person(str1[0],str1[1],str1[2]));
			}
			
			bw.write(str);
			bw.newLine();
		}
		bw.write("김민규,010-2300-2040,02-0301-4203");
		
		//데이터 추가
		
		
		//한번더 보기
		for(Person per : pList) {
			per.showInfo();
		}
		
		
		
		
		bw.close();
		br.close();
	}
}
