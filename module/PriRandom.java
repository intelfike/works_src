package module;
import java.util.*;
public class PriRandom
{
	private static ArrayList<Integer> ranlog = new ArrayList<Integer>();
//���������@�ő�l�A�ŏ��l
	public static int num(int min, int max)
	{
		int ran = (int)(Math.random() * (max - min + 1)) + min;
		return ran;
	}
	//�d�����Ȃ����������@�ő�A�ŏ�
	public static int uniNum(int min, int max)
	{
		int flag;
		int ran;
		//ranlog.add(ran);
		
		do{
			flag = 0;
			ran = (int)(Math.random() * (max - min + 1)) + min;
			for(int n = 0; n < ranlog.size(); n++)
				if(ran == ranlog.get(n))
					flag = 1;
		}while(flag == 1);
			
		ranlog.add(ran);
		return ran;
	}
	//�z��V���b�t��
	public static int[] shuffle(int[] suu)
	{
		int work;
		int ran;
		for(int n = 0; n < suu.length; n++){
			ran = (int)(Math.random() * suu.length);
			work = suu[n];
			suu[n] = suu[ran];
			suu[ran] = work;
		}
		return suu;
	}
	public static double[] shuffle(double[] suu)
	{
		double work;
		int ran;
		for(int n = 0; n < suu.length; n++){
			ran = (int)(Math.random() * suu.length);
			work = suu[n];
			suu[n] = suu[ran];
			suu[ran] = work;
		}
		return suu;
	}
	public static String[] shuffle(String[] suu)
	{
		String work;
		int ran;
		for(int n = 0; n < suu.length; n++){
			ran = (int)(Math.random() * suu.length);
			work = suu[n];
			suu[n] = suu[ran];
			suu[ran] = work;
		}
		return suu;
	}
	
}