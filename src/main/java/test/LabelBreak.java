package test;

public class LabelBreak {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 10; i++) {
			inner: for (int j = 10; j > 0; j--) {
				if (i == j) {
					System.out.printf("i:%d, j:%d\n", i, j);
					break outer;
				} else {
					System.out.printf("-->> i:%d, j:%d\n", i, j);
					continue inner;
				}
			}
		}

		int a = -10;
		int b = 12;

		block1: {
			if (a < 0) {
				break block1;
			}
			if (b < 0) {
				break block1;
			}
			System.out.println(a + b);
		}
		
		
		System.out.println(System.getenv().get("Path"));
		
		System.out.println(Boolean.valueOf("true"));
	}
}
