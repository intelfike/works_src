package module;
import java.io.*;
public class Fileout
{

	private PrintWriter pw;
	//�R���X�g���N�^�Ńt�@�C�������̓t�@�C�����J��
	//�Ȃ���΃t�@�C�����쐬
	public Fileout(){}
	public Fileout(String filename)throws IOException
	{
		try{
			File newfile = new File(filename);
			if(!(newfile.exists())){
				newfile.createNewFile();
				System.out.println(filename + "���쐬���܂���");
			}
			pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		}catch(IOException e){
			
		}
	}
	public Fileout(String filename, boolean post)throws IOException
	{
		this(filename);
		pw = new PrintWriter(new BufferedWriter(new FileWriter(filename, post)));
	}
	//�t�@�C�������
	public void close(){
		pw.close();
	}
	
	//�t�@�C���ɏ�������
	public void out(String str){
		pw.println(str);
	}
//�����z��ő��쁡��

	//�����o�́@�z������
	public void out(int[] osuu)
	{
		for(int n = 0; n < osuu.length; n++)
		{
			pw.println(osuu[n]);
		}
	} 
	public void out(double[] osuu)
	{
		for(int n = 0; n < osuu.length; n++)
		{
			pw.println(osuu[n]);
		}
			
	} 
	public void out(String[] osuu)
	{
		for(int n = 0; n < osuu.length; n++)
		{
				pw.println(osuu[n]);
		}
	} 
	//�����o�́@�񎟌��z�񁡁�
	public void out(int[][] osuu)
	{
		for(int n = 0; n < osuu.length; n++){
			for(int m = 0; m < osuu[n].length; m++){
				pw.println(osuu[n][m]);
			}
		}
	}
	public void out(double[][] osuu)
	{
		for(int n = 0; n < osuu.length; n++){
			for(int m = 0; m < osuu[n].length; m++){
				pw.println(osuu[n][m]);
			}
		}
	}
	public void out(String[][] osuu)
	{
		for(int n = 0; n < osuu.length; n++){
			for(int m = 0; m < osuu[n].length; m++){
					pw.println(osuu[n][m]);
			}
		}
		
	}
	//�����o�́@�O�����z��A����
	public void out(int[][][] osuu)
	{
		
			
		for(int n = 0; n < osuu.length; n++){
	 		for(int m = 0; m < osuu[n].length; m++){
				for(int k = 0; k < osuu[n][m].length; k++){
					pw.println(osuu[n][m][k]);
				}
			}
		}
		
	}
	public void out(double[][][] osuu)
	{
		for(int n = 0; n < osuu.length; n++){
			for(int m = 0; m < osuu[n].length; m++){
				for(int k = 0; k < osuu[n][m].length; k++){
					pw.println(osuu[n][m][k]);
				}
			}
		}
	}
	public void out(String[][][] osuu)
	{
		for(int n = 0; n < osuu.length; n++){
			for(int m = 0; m < osuu[n].length; m++){
				for(int k = 0; k < osuu[n][m].length; k++){
					pw.println(osuu[n][m]);
				}
			}
		}
	}
}