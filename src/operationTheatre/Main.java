package operationTheatre;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;

public class Main {
	public static void main(String ar[]) throws Exception {
		String s = "anubhavgmacom";
		System.out.println(Pattern.matches("[0-9A-Za-z\\.]*@[0-9A-Za-z\\.]*", s));
	}
}
