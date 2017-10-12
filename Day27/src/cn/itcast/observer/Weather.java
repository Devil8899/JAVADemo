package cn.itcast.observer;

//订阅天气预报的接口  定义一个接口让子类去实现
public interface Weather {
	
	
	public void notifyWeather(String weather);

}
