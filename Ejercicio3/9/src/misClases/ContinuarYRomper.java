package misClases;

public class ContinuarYRomper {
    public void enumerar() {
	int i = 0;
	for (i = 0; i < 10; i++) {
		if (i == 5) {
			continue;
		} else if (i == 8) {
			break;
		} else {
			System.out.println(i);
		}	
	}
    }
}
