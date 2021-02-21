
public class Numero implements RestituzioneQuadroCubo {
	private int num;

	public Numero(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public Numero alQuadrato() {
		return new Numero(num * num);
	}

	@Override
	public Numero alCubo() {
		return new Numero(num * num * num);
	}
	
	
}
