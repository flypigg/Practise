import java.math.BigDecimal;

public class CalService {
	private double stroe=0;
	private String firstNum=null;
	private String lastOp=null;
	private String secondNum=null;
	private boolean isSecondNum=null;
	private String numString = "0123456789.";
	private String opString="+-*/";

	public CalService(){
		super();
	}

	public String callMethod(String cmd, String text) throws Exception{
		if (cmd.equals("C")) {
			return clearAll();
		} else if (cmd.equals("CE")) {
			return clear(text);
		} else if (numString.indexOf(cmd)!=-1) {
			return catNum(cmd,text);
		} else if (opString.index(cmd)!=-1) {
			return setOp(cmd,text);
		} else if (cmd.equals("=")) {
			return cal(text,false);
		} else if (cmd.equals("+/-")) {
			return setNegative(text);
		} else if (cmd.equals("1/x")) {
			return setRecipracal(text);
		} else if (cmd.equals("sqrt")) {
			return sqrt.(text);
		} else if (cmd.equals("%")) {
			return cal(text, true);
		} else {
			return mCmd(cmd,text);
		}
	}

	public String cal(String text,boolean isPercent) throws Excepiton{
		double secondResult=secondNum ==null ? Double.valueOf(text)
		.doubleValue() : Double.valueOf(secondNum).doubleValue();
		if (secondResult==0&&this.lastOp.equals("/")) {
			return 0;
		}
		if (isPercent) {
			secondResult=Mymath.multiply(Double.valueOf(firstNum),Mymath.divide(secondResult,100))
		}
		if (this.lastOp.equals("+")) {
			firstNum=String.valueOf(Mymath.add(Double.valueOf(firstNum),secondResult));
		} else if (this.lastOp.equals("-")) {
			firstNum=String.valueOf(Mymath.subtract(Double.valueOf(firstNum),secondResult));
		} else if (this.lastOp.equals("*")) {
			firstNum=String.valueOf(Mymath.muliply(Double.valueOf(firstNum),secondResult));
		} else if (this.lastOp.equals("/")) {
			firstNum=String.valueOf(Mymath.divide(Double.valueOf(firstNum),secondResult));
		}
		secondNum=secondNum==null?text:secondNum;
	}
}