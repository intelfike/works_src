package module;
public class Other
{
	//���l��͈͓��Ɏ��߂�@���߂������l�A����or����ł͈͎̔w��
	public static int scorp(int suu, int k, int j)
	{
		if(k < j)
		{
			if(suu < k){
				suu = k;
			}else if(suu > j)
			{
				suu = j;
			}
		}else
		{
			if(suu > k){
				suu = k;
			}else if(suu < j)
			{
				suu = j;
			}
		}
		if(k == j)suu = k;
		
		return suu;
	}
	public static int top(int suu, int k)
	{
		if(suu > k){
			suu = k;
		}
		return suu;
	}
	public static int bottom(int suu, int k)
	{
		if(suu < k){
			suu = k;
		}
		return suu;
	}
	//01���]
	public static int not(int suu)
	{
		if(suu == 0){
		suu = 1;
		}else if(suu == 1){
		suu = 0;
		}
		return suu;
	}
	//�񎟌��z��̏c������
	public static int[][] lineChange(int[][] suu){
		int work;
		int[][] num = new int[suu[0].length][suu.length];
		for(int n = 0; n < suu.length; n++){
			for(int m = 0; m < suu[0].length; m++){
				num[m][n] = suu[n][m];
			}	
		}
		return num;
	}
	//�z��̗v�f����ς���
	public static int[] sizeChange(int[] num, int size){
		int[] newnum = new int[size];
		for(int n = 0; n < newnum.length; n++){
			if(num.length > n)
				newnum[n] = num[n];
		}
		return newnum;
	}
	public static int[] resize(int[] num, int size, int number){
		int[] newnum = new int[size];
		for(int n = 0; n < newnum.length; n++){
			if(num.length > n)
				newnum[n] = num[n];
			else
				newnum[n] = number;
		}
		return newnum;
	}
}
