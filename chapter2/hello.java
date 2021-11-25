// 0. public 在一個檔案中只會有一個 public class
// 1. hello為類名，需與檔名一致
// 2. public static void main(String[] args)是主要方法，程序的開始
// java hello 是針對 hello 這個類，所以不是java hello.class

public class hello {

	public static void main(String[] args){
		// System.out.println("hello world");
		System.out.println("�� is studying java!");
	}
}

// 一個檔案之中只會有一個public類，其他的類不限制
// main方法可以在非public的類之中執行

class dog {

	public static void main(String[] args){
		System.out.println("Hello doggy!");
	}

}