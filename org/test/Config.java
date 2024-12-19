package org.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Config {

	//private static final String IOException = null;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String configFilepath = "config.file";
		
		Properties properties = new Properties();
		
		try(FileInputStream fis = new FileInputStream(configFilepath)){
			
			properties.load(fis);
			
			String url = properties.getProperty("url");
			//String Email = properties.getProperty("Email");
			//String Pass = properties.getProperty("Pass");
			
			System.out.println("url: " + url);
			//System.out.println("Email " + Email);
			//System.out.println("Pass " + Pass);
			
		} catch (IOException e) {
			// TODO: handle exception
		
			System.err.println("Error reading the config file:"+ e.getMessage());
	
			
		}
	}

}
