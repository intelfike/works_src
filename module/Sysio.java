package module;
import java.io.*;
//�P�ꕶ���A�Q�z��A�R�z��ԍ��w��
public class Sysio
{
	//���������Ɠ����^�ŕԂ�
	public static int in(int suu) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		suu = Integer.parseInt(str);
		return suu;
	}
	public static double in(double suu) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		suu = Double.parseDouble(str);
		return suu;
	}
	String in(String suu) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		return str;
	}
	//���͗v�����ɕ������\������
	public static int in(int suu, String moji) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(moji);
		String str = br.readLine();
		suu = Integer.parseInt(str);
		return suu;
	}
	public static double in(double suu, String moji) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(moji);
		String str = br.readLine();
		suu = Double.parseDouble(str);
		return suu;
	}
	public static String in(String suu, String moji) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(moji);
		String str = br.readLine();
		return str;
	}
	//�����z��
	public static int[] in(int[] suu) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < suu.length; n++){
			str = br.readLine();
			suu[n] = Integer.parseInt(str);
		}
		return suu;
	}
	public static double[] in(double[] suu) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < suu.length; n++){
			str = br.readLine();
			suu[n] = Double.parseDouble(str);
		}
		return suu;
	}
	public static String[] in(String[] suu) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int n = 0; n < suu.length; n++){
			suu[n] = br.readLine();
		}
		return suu;
	}
	//���͗v�����ɕ������\������(��x)
	public static int[] in(int[] suu, String moji) throws IOException
	{
		System.out.print(moji);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < suu.length; n++){
			str = br.readLine();
			suu[n] = Integer.parseInt(str);
		}
		return suu;
	}
	public static double[] in(double[] suu, String moji) throws IOException
	{
		System.out.print(moji);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < suu.length; n++){
			str = br.readLine();
			suu[n] = Double.parseDouble(str);
		}
		return suu;
	}
	public static String[] in(String[] suu, String moji) throws IOException
	{
		System.out.print(moji);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int n = 0; n < suu.length; n++){
			suu[n] = br.readLine();
		}
		return suu;
	}
	//���͗v�����ɕ������\������(���x)
	public static int[] in(int[] suu, String[] moji) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < suu.length; n++){
			System.out.print(moji[n]);
			str = br.readLine();
			suu[n] = Integer.parseInt(str);
		}
		return suu;
	}
	public static double[] in(double[] suu, String[] moji) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < suu.length; n++){
			System.out.print(moji[n]);
			str = br.readLine();
			suu[n] = Double.parseDouble(str);
		}
		return suu;
	}
	public static String[] in(String[] suu, String[] moji) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int n = 0; n < suu.length; n++){
			System.out.print(moji[n]);
			suu[n] = br.readLine();
		}
		return suu;
	}
	
	//�����z��A���͗v����
	public static int[] in(int[] suu, int kai) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < kai; n++){
			str = br.readLine();
			suu[n] = Integer.parseInt(str);
		}
		return suu;
	}
	public static double[] in(double[] suu, int kai) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < kai; n++){
			str = br.readLine();
			suu[n] = Double.parseDouble(str);
		}
		return suu;
	}
	public static String[] in(String[] suu, int kai) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int n = 0; n < kai; n++){
			suu[n] = br.readLine();
		}
		return suu;
	}
	//���͗v�����ɕ������\������(��x)
	public static int[] in(int suu[], int kai, String moji) throws IOException
	{
		System.out.print(moji);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < kai; n++){
			
			str = br.readLine();
			suu[n] = Integer.parseInt(str);
		}
		return suu;
	}
	public static double[] in(double[] suu, int kai, String moji) throws IOException
	{
		System.out.print(moji);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < kai; n++){
			str = br.readLine();
			suu[n] = Double.parseDouble(str);
		}
		return suu;
	}
	public static String[] in(String[] suu, int kai, String moji) throws IOException
	{
		System.out.print(moji);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int n = 0; n < kai; n++){
			suu[n] = br.readLine();
		}
		return suu;
	}
	
	
	//���͗v�����ɕ������\������(���x)
	public static int[] in(int suu[], int kai, String[] moji) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < kai; n++){
			System.out.print(moji[n]);
			str = br.readLine();
			suu[n] = Integer.parseInt(str);
		}
		return suu;
	}
	public static double[] in(double[] suu, int kai, String[] moji) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for(int n = 0; n < kai; n++){
			System.out.print(moji[n]);
			str = br.readLine();
			suu[n] = Double.parseDouble(str);
		}
		return suu;
	}
	public static String[] in(String[] suu, int kai, String[] moji) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int n = 0; n < kai; n++){
			System.out.print(moji[n]);
			suu[n] = br.readLine();
		}
		return suu;
	}
	//2�����z��̕������\�ŕ\������
	public static void out(String[][] str){
		for(int n = 0; n < str.length; n++){
			for(int m = 0; m < str[0].length; m++){
				System.out.print(str[n][m] + "\t");
			}
			System.out.print("\n");
		}
	}
}