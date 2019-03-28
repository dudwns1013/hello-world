package ds;
/** 
* 온도변환
*  
*/ 
public interface Temperature { 
	/** @return 섭씨온도 */ 
	public double getCelsius(); 
	/** @return 화씨온도 */ 
	public double getFahrenheit(); 
	/** @param 설정하고자 하는 섭씨온도 */ 
	public void setCelsius(double celsius); 
	/** @param 설정하고자 하는 화씨온도  */ 
	public void setFahrenheit(double fahrenheit); 
}