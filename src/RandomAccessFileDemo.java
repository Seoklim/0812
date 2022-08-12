import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	private File file;
	private RandomAccessFile raf;
	public RandomAccessFileDemo() throws FileNotFoundException{
		file = new File("count.txt");
		raf = new RandomAccessFile(file, "rw");
	}
	public static void main(String[] args) throws IOException{
		RandomAccessFileDemo rafd = new RandomAccessFileDemo();
		rafd.countUp();
	}
	void countUp()throws IOException{
		String line = this.raf.readLine();
		int count = Integer.parseInt(line);
		count++;
	}
}
