package module;
public class Search
{
	//�ő�l�����߂�(�v�f�ԍ���Ԃ�)
	public static int max(int[] suu)
	{
		int max = 0, n;
		for(n = 0; n < suu.length; n++){
			if(suu[max] < suu[n])max = n;
		}
		return max;
	}
	public static int max(double[] suu)
	{
		int max = 0, n;
		for(n = 0; n < suu.length; n++){
			if(suu[max] < suu[n])max = n;
		}
		return max;
	}
	//�ŏ��l�����߂�
	public static int min(int[] suu)
	{
		int min = 0, n;
		for(n = 0; n < suu.length; n++){
			if(suu[min] > suu[n])min = n;
		}
		return min;
	}
	public static int min(double[] suu)
	{
		int min = 0, n;
		for(n = 0; n < suu.length; n++){
			if(suu[min] > suu[n])min = n;
		}
		return min;
	}
	//���`�T��
	public static int search1(int[] suu, int mokuteki)
	{
		int n;
		for(n = 0; n < suu.length; n++){
			if(mokuteki== suu[n])break;
		}
		return n;
	}
	public static int search1(double[] suu, double mokuteki)
	{
		int n;
		for(n = 0; n < suu.length; n++){
			if(mokuteki == suu[n])break;
		}
		return n;
	}
	public static int search1(String[] suu, String mokuteki)
	{
		int n;
		for(n = 0; n < suu.length; n++){
			if(suu[n].equals(mokuteki))break;
		}
		return n;
	}
	//���`�T�� index�͊J�n�ʒu
	public static int search1(int[] suu, int mokuteki, int index)
	{
		int n;
		for(n = index; n < suu.length; n++){
			if(mokuteki== suu[n])break;
		}
		return n;
	}
	public static int search1(double[] suu, double mokuteki, int index)
	{
		int n;
		for(n = index; n < suu.length; n++){
			if(mokuteki == suu[n])break;
		}
		return n;
	}
	public static int search1(String[] suu, String mokuteki, int index)
	{
		int n;
		for(n = index; n < suu.length; n++){
			if(suu[n].equals(mokuteki))break;
		}
		return n;
	}
	//�񕪒T��
	
	//����̒l�̌���Ԃ�
	public static int count(int[] suu, int mokuteki)
	{
		int a = 0;
		for(int n = 0; n < suu.length; n++){
			if(mokuteki == suu[n])a++;
		}
		return a;
	}
	public static int count(double[] suu, double mokuteki)
	{
		int a = 0;
		for(int n = 0; n < suu.length; n++){
			if(mokuteki == suu[n])a++;
		}
		return a;
	}
	public static int count(String[] suu, String mokuteki)
	{
		int a = 0;
		for(int n = 0; n < suu.length; n++){
			if(mokuteki == suu[n])a++;
		}
		return a;
	}

}
