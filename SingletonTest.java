
public class SingletonTest {
	public static void main(String[] args){
		for(int i = 0; i < 1000; i++){
			Renban renban = Renban.getNumber();
			renban.print();
		}
	}
}
class Renban{
	private static int Number;
	private static Renban bangou = new Renban();
	public static Renban getNumber(){
		Number++;
		return bangou;
	}
	public void print(){
		if(Number < 10){
			System.out.println("製造番号は000" + Number + "です。");
		}else if(Number < 100){
			System.out.println("製造番号は00" + Number + "です。");
		}else if(Number < 1000){
			System.out.println("製造番号は0" + Number + "です。");
		}else{
			System.out.println("製造番号は" + Number + "です。");
		}
	}
}
