package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
    	String version = System.getProperty("java.version");
    	String[] parts = version.split("\\_")[0].split("\\.");
    	return Double.parseDouble(parts[0] + "." + parts[1]);
    }

    public static void main(String[] args) {
    	System.out.println(getVersion());
    	getVersion();
    }
}
