package service.impl;
import service.CalculatorService;
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public Integer tambah(int bill, int bil2) {
		return bill + bil2;
	}
	
	@Override
	public Integer kurang(int bill, int bil2) {
		return bill - bil2;
	}
	
	@Override
	public Integer kali(int bill, int bil2) {
		return bill * bil2;
	}
	
	@Override
	public Integer bagi(int bill, int bil2) {
		return bill / bil2;
	}
}