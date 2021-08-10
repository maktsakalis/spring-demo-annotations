package com.springpractice.annotations.fortuneservices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyRandomFortuneService implements FortuneService {

	@Value("${foo.fortunes}")
	private String[] randomMessagesArray;

	private String[] randomMessagesArrayFromFile;

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(randomMessagesArrayFromFile.length);
		return randomMessagesArrayFromFile[index];
//		int index = myRandom.nextInt(randomMessagesArray.length);
//		return randomMessagesArray[index];
	}

	@PostConstruct
	public void initFortunesFromFile() throws IOException {
		File file = new File("/home/makis/Desktop/fortunes.txt");

		System.out.println("Inside initFortunesFromFile()");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			List<String> list = Arrays.asList(st.split(","));
			randomMessagesArrayFromFile = new String[list.size()];
			list.toArray(randomMessagesArrayFromFile);
			System.out.println(Arrays.deepToString(randomMessagesArrayFromFile));
		}
	}

}
