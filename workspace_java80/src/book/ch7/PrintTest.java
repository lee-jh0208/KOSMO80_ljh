package book.ch7;

public class PrintTest {
	int i[] = null;
	public void init() {
		i = new int[] {2,5,7,9,3};
	}
	public void printArray() {
		init();
		System.out.println("배열 : ");
		if(i!=null) {//너 배열 아니지?
			for(int x=0;x<i.length;x++) {
				System.out.println("%3d", i[x]);
			}////////end of for
			System.out.println();
		}////////////end of if
	}
	public static void main(String[] args) {
		PrintTest pt = new PrintTest();
		pt.printArray();
		System.out.println("=================================");
		int i = 10;
		String str = "안녕";
		System.out.println("%5d", i);
		System.out.println("%5d %s", i, str);
		System.out.println("%5d%n %s", i, str);
	}

}
