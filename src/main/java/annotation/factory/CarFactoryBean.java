package annotation.factory;

import org.springframework.beans.factory.FactoryBean;

import annotation.bean.Car;

public class CarFactoryBean implements FactoryBean<Car>{

	private String carInfo;
	
	@Override
	public Car getObject() throws Exception {
		String[] info = carInfo.split(",");
		
		Car car = new Car();
		car.setBrand(info[0].trim());
		car.setMaxSpeed(Integer.parseInt(info[1].trim()));
		car.setPrice(Double.valueOf(info[2].trim()));
		
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

}
