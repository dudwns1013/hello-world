package ds;
/** 
* �µ���ȯ
*  
*/ 
public interface Temperature { 
	/** @return �����µ� */ 
	public double getCelsius(); 
	/** @return ȭ���µ� */ 
	public double getFahrenheit(); 
	/** @param �����ϰ��� �ϴ� �����µ� */ 
	public void setCelsius(double celsius); 
	/** @param �����ϰ��� �ϴ� ȭ���µ�  */ 
	public void setFahrenheit(double fahrenheit); 
}