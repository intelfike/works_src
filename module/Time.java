package module;
import java.util.*;
public class Time
{
	private static long times;
	private static double scale;
	
	private static long before = 0;
	private static int count = 0;
	//�X�P�[����ݒ肹��������
	public Time(){
		times = 0;
		scale = 1.0;
	}
	//�X�P�[����ݒ�
	public Time( double scale ){
		times = 0;
		this.scale = scale;
	}
	
	//�X�g�b�v�E�H�b�`�X�^�[�g�A���ݎ����ԋp
	public static void timerStart(){
		times = System.currentTimeMillis();
	}
	//�X�g�b�v�A������Ԃ�
	public static long timerStop(){
		return (long)( ( System.currentTimeMillis() - times ) * scale );
	}
	
	//���ԂɃX�^���v
	public static void stamp(){
		long stamp = System.currentTimeMillis();
		if(count != 0)
			System.out.println("[" + count + "] " + (stamp - before) + "ms");
		before = stamp;
		count++;
	}
	public static void stamp(int count){
		long stamp = System.currentTimeMillis();
		if(count != 0)
			System.out.println("[" + count + "] " + (stamp - before) + "ms");
		before = stamp;
	}
	
	//���ݎ�����Ԃ�
	public static long now(){
		return System.currentTimeMillis();
	}
	//�����Ƃ̍������o��
	public static long now(long times){
		return System.currentTimeMillis() - times;
	}
	//�v���O�������w�肵�����Ԓ�~������
	public static void sleep( long interval ){
		try{
			Thread.sleep( (long)(interval / scale) );
		}catch( InterruptedException ie ){}
	}
}