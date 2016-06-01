package module;
import java.util.*;
//���W����cin,cos,tan��p�x�A�ŒZ�������v�Z����
public class Coordinate{
	double criteria = 0;
	final static String TAB = "��������0���A��������90���Ƃ���";
	private int x, y;
	private double shotest;
	
	//���W�w��
	public Coordinate(int xa, int ya, int xb, int yb){
		this(xb - xa, yb - ya);
	}
	public Coordinate(int x, int y){
		this.x = x;
		this.y = y;
		shotest = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	//�p�x�̊
	public void setCriteria(double criteria){
		this.criteria = criteria;
	}
	
	//�X�P�[���ݒ�A�l���Čv�Z���Đݒ�
	public void setScale(double xscale, double yscale){
		x *= xscale;
		y *= yscale;
		shotest = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	//sin cos tan
	public double sin(){
		return y / shotest;
	}
	
	public double cos(){
		return x / shotest;
	}
	
	public double tan(){
		return (double)y / x;
	}
	
	
	//�p�x�𔻒�
	public double getAngle(){
		return Math.asin(sin()) / Math.PI * 180;
	}
	
	//
	public double getShotest(){
		return shotest;
	}
}