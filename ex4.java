import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("ex4.html");
		FileWriter fw = null;
		BufferedWriter bf = null;
		try {
			fw = new FileWriter(file);
			bf = new BufferedWriter(fw);
			System.out.print("Enter number of lines: ");
			int n = sc.nextInt();

			String content = "<html><head><style> .c2 {background-color: deeppink;} .c0 {background-color: rebeccapurple;} .c1 {background-color: cornflowerblue;}</style></head><body>";
			bf.write(content);

			for(int i=0; i<n; i++){
				content="<div class=\"c"+ i%3 +"\" style=\"width: " + 100/n +"%; height: 100%; float: left\"></div>";
				bf.write(content);
			}
			
			content="</body></html>";
			bf.write(content);
			
			bf.flush();
			fw.flush();
			bf.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
