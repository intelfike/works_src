package module;
import java.util.*;
import java.io.*;
import jp.hishidama.eval.*;

public class Strop
{
	//�����񒆂̕����̌���Ԃ� �Ώۂ̕�����A�����镶����

	public static int count(String str, String chr)
	{
		int strlen = str.length();
		int chrlen = chr.length();
		int count = 0;
		int s = 0;
		while(count < strlen)
		{
			int index = str.indexOf(chr, s);
			if(index == -1)
				break;
			s = index + chrlen;
			count++;
		}
		return count;
	}

	//�͂��܂ꂽ�Ώۂ��폜�@�ΏہA��O�A���̕�����
	public static String del(String str, String strb, String strt)
	{
		int count = 0;
		int sb = 0, st = 0;
		int lenb = strb.length(), lent = strt.length(), lens = str.length();
		while(str.length() > count)
		{
			int indexb = str.indexOf(strb, sb);
			int indext = str.indexOf(strt, st);
			if(indexb == -1 || indext == -1)//������Ȃ������甲����
				break;
			if(indexb < indext){
				str = str.substring(0, indexb + lenb) + str.substring(indext);
				sb = indexb + lenb;
			}
			
			st = indexb + lenb + lent;
			count++;
		}
		return str;
	}
	//�͂��܂ꂽ�Ώۂ��擾ArrayList�@�ΏہA��O�A���̕�����
	public static ArrayList<String> extAl(String str, String strb, String strt)
	{
		ArrayList<String> al = new ArrayList<String>();
		int count = 0;
		int sb = 0, st = 0;
		int lenb = strb.length(), lent = strt.length(), lens = str.length();
		while(str.length() > count)
		{
			int indexb = str.indexOf(strb, sb);
			int indext = str.indexOf(strt, st);
			if(indexb == -1 || indext == -1)//������Ȃ������甲����
				break;
			if(indexb < indext){
				al.add(str.substring(indexb + lenb, indext));
				sb = indexb + lenb;
			}
			
			st = indexb + lenb;
			count++;
		}
		return al;
	}
	//�ŏ��ɂ͂��܂ꂽ�Ώۂ��擾
	public static String ext(String str, String strb, String strt){
		int indexb = str.indexOf(strb);
		int indext = str.indexOf(strt, indexb);
		str = str.substring(indexb + strb.length(), indext);
		return str;
	}
	//�ŏ��ɂ͂��܂ꂽ�Ώۂ��擾(index�ȍ~�̂�)
	public static String ext(String str, String strb, String strt, int index){
		int indexb = str.indexOf(strb, index);
		int indext = str.indexOf(strt, indexb);
		str = str.substring(indexb + strb.length(), indext);
		return str;
	}
	//�͂��܂ꂽ�Ώۂ��擾String�@�ΏہA��O�A���̕�����
	public static String extStr(String str, String strb, String strt)
	{
		String rv = "";
		if(!(strb.equals(strt))){
			int count = 0;
			int sb = 0, st = 0;
			int lenb = strb.length(), lent = strt.length(), lens = str.length();
			while(str.length() > count)
			{
				int indexb = str.indexOf(strb, sb);
				int indext = str.indexOf(strt, st);
				if(indexb == -1 || indext == -1)//������Ȃ������甲����
					break;
				if(indexb < indext){
					rv += str.substring(indexb + lenb, indext);
					sb = indexb + lenb;
				}
				
				st = indexb + lenb + lent;
				count++;
			}
		}else{
			int beg= 0;//�n�_
			int count = 0;
			int s = 0;
			while(str.length() > count)
			{
				int index = str.indexOf(strb, s);
				if(index == -1)//������Ȃ������甲����
					break;
				//��Ƌ�����"�𔻒f���ď���
				if(count % 2 == 0){
					beg = index;
				}else{
					rv += str.substring(beg + 1, index);
				}
				s = str.indexOf(strb, s) + 1;
				count++;
			}
		}
		return rv;
	}
	//�͂��܂ꂽ(�O�㕶������܂�)�Ώۂ��擾String�@�ΏہA��O�A���̕���
	public static String extStrp(String str, String strb, String strt, int eflag)
	{
		
		String rv = "";
		int count = 0;
		int s = 0;
		int lenb = strb.length(), lent = strt.length(), lens = str.length();
		int indexb = 0, indext = 0;
		while(str.length() > count)
		{
			
			//�G�X�P�[�v���邩�H
			if(eflag == 1){
				indexb = str.indexOf(strb, s);
				
				while(indexb > 0 && str.substring(indexb - 1).indexOf("\\") == 0){
					
					indexb = str.indexOf(strb, indexb + 1);
				}
				indext = str.indexOf(strt, indexb + 1);
				while(indext > 0 && str.substring(indext - 1).indexOf("\\") == 0){
					indext = str.indexOf(strt, indext + 1);
				}
			}else{
				indexb = str.indexOf(strb, s);
				indext = str.indexOf(strt, indexb + 1);
			}
			if(indexb == -1 || indext == -1)//������Ȃ������甲����
				break;
			//���o
			if(indexb < indext){
				String a = str.substring(indexb + lenb, indext);
				//�󔒂��G�X�P�[�v
				if(a.length() == 0)
					a = "escspacef903q0gjaw2r09";
				rv += strb + a + strt + "\r\n";
				s = indext + lenb;
			}
			
			count++;
		}
		
		return rv;
	}
		//�u���̑�� �Ώۂ̕�����A�u���O�A�u����
	public static String priRep(String str, String bef, String aft){
		//System.out.println(str + " " + bef + " " + aft);
		int count = 0;
		int s = 0;
		int lenb = bef.length(), lena = aft.length(), lens = str.length();
		while(lens > count)
		{
			int indexb = str.indexOf(bef, s);
			if(indexb == -1)//������Ȃ������甲����
				break;
			str = str.substring(0, indexb) + aft + str.substring(indexb + lenb);
			
			s = indexb + lena;
			count++;
		}
		
		return str;
	}
	//�u���̑�� �Ώۂ̕�����A�u���O�A�u����
	public static String priRepfor(String str, String bef, String aft){
		String aft2 = "";
		int repcount = 0;
		int count = 0;
		int s = 0;
		int lens = str.length();
		while(lens > count)
		{
			String bef2 = forn(bef, "#for(", ")#");
			int indexb = str.indexOf(bef2, s);
			if(indexb == -1)//������Ȃ������甲����
				break;
			
			//for������
			fornAdd();
			aft2 = forn2(aft, "#for(", ")#");
			str = str.substring(0, indexb) + aft2 + str.substring(indexb + bef2.length());
			s = indexb + aft2.length();
			
			count++;
		}
		
		return str;
	}
	//���͒u�������@�ΏہA�u���O�A�u����A���C���h�J�[�h
	public static String repWild(String str, String bef, String aft, String wild, int eflag)
	{
		if(aft.indexOf(wild) == -1){//bef���C���h�J�[�h����
			int count = 0;
			int s = 0;
			
			int indexb = 0, indext = 0;
			while(str.length() > count)
			{
				String bef2 = forn(bef, "#for(", ")#");
				
				String strb = beg(bef2, wild);
				String strt = tar(bef2, wild);
				int lenb = strb.length(), lent = strt.length();
				//�G�X�P�[�v���邩��
				if(eflag == 1){
					
					indexb = str.indexOf(strb, s);
					while(indexb > 0 && str.substring(indexb - 1).indexOf("\\") == 0){
						indexb = str.indexOf(strb, indexb + 1);
					}
					indext = str.indexOf(strt, indexb + 1);
					while(indext > 0 && str.substring(indext - 1).indexOf("\\") == 0){
						indext = str.indexOf(strt, indext + 1);
					}
				}else{
					indexb = str.indexOf(strb, s);
					indext = str.indexOf(strt, indexb + 1);
				}
				//�O����낪���w��̏ꍇ�ɑΏ�����
				if(strb.length() == 0)
					indexb = 0;
				if(strt.length() == 0)
					indext = str.length();
				if(indexb == -1 || indext == -1)break;//������Ȃ������甲����
				
				//for������
				fornAdd();
				String aft2 = forn2(aft, "#for(", ")#");
				str = str.substring(0, indexb) + aft2 + str.substring(indext + lent);
				s = indexb + aft2.length();
					
				
				count++;
				if(strb.length() == 0 && strt.length() == 0)break;
			}
			
		}else{//bef,aft�Ƀ��C���h�J�[�h����
			int count = 0;
			int s = 0;
			while(str.length() > count)
			{
				String bef2 = forn(bef, "#for(", ")#");
				
				String strb = beg(bef2, wild);
				String strt = tar(bef2, wild);
				int lenb = strb.length(), lent = strt.length();
				//�G�X�P�[�v���邩��
				int indexb = 0, indext = 0;
				if(eflag == 1){
					indexb = str.indexOf(strb, s);
					while(indexb > 0 && str.substring(indexb - 1).indexOf("\\") == 0){
						
						indexb = str.indexOf(strb, indexb + 1);
					}
					indext = str.indexOf(strt, indexb + 1);
					while(indext > 0 && str.substring(indext - 1).indexOf("\\") == 0){
						indext = str.indexOf(strt, indext + 1);
					}
				}else{
					indexb = str.indexOf(strb, s);
					indext = str.indexOf(strt, indexb + 1);
				}
				//�O����낪���w��̏ꍇ�ɑΏ�����
				if(strb.length() == 0){
					indexb = 0;
				}
				if(strt.length() == 0){
					indext = str.length();
				}
				
				//������Ȃ������甲����
				if(indexb == -1 || indext == -1)break;
				
				String onestr = str.substring(indexb + lenb, indext);
				String str1 = str.substring(0, indexb);
				str = str.substring(indext + lent);
				
				//for������
				fornAdd();
				String aft2 = forn2(aft, "#for(", ")#");
				str = str1 + priRep(aft2, wild, onestr) + str;
				s = indexb + priRep(aft2, wild, onestr).length();
				
				count++;
				if(strb.length() == 0 && strt.length() == 0)break;
			}
			
		}
		return str;
	}
	//������̒��o
	public static String extWild(String str, String bef, String wild, int eflag)
	{
		int count = 0;
		int s = 0;
		int indexb = 0, indext = 0;
		String rv = "";
		while(str.length() > count)
		{
			String bef2 = forn(bef, "#for(", ")#");
			
			String strb = beg(bef2, wild);
			String strt = tar(bef2, wild);
			int lenb = strb.length(), lent = strt.length();
			//�G�X�P�[�v���邩��
			if(eflag == 1){
				
				indexb = str.indexOf(strb, s);
				while(indexb > 0 && str.substring(indexb - 1).indexOf("\\") == 0){
					indexb = str.indexOf(strb, indexb + 1);
				}
				indext = str.indexOf(strt, indexb + 1);
				while(indext > 0 && str.substring(indext - 1).indexOf("\\") == 0){
					indext = str.indexOf(strt, indext + 1);
				}
			}else{
				indexb = str.indexOf(strb, s);
				indext = str.indexOf(strt, indexb + 1);
			}
			//�O����낪���w��̏ꍇ�ɑΏ�����
			if(strb.length() == 0)
				indexb = 0;
			if(strt.length() == 0)
				indext = str.length();
			if(indexb == -1 || indext == -1)break;//������Ȃ������甲����
			//for������
			fornAdd();
			rv += strb + str.substring(indexb + lenb, indext) + strt;
			s = indexb + lenb;
			count++;
			if(strb.length() == 0 && strt.length() == 0)break;
		}
		return rv;
	}
	//#for()#�̒��g�𔲂��o���Čv�Z���Ēu��������
	private static int repcount = 0;
	public static void resetrep(){repcount = 0;repcount2 = 0;}
	public static String forn(String aft, String beg, String tar){
		if(aft.indexOf("#for(") != -1 && aft.indexOf(")#") != -1){
			String formu = extStr(aft, beg, tar);
			formu = priRep(formu, "n", String.valueOf(repcount));//���������o��
			Rule rule = ExpRuleFactory.getDefaultRule();//�C���X�^���X��
			Expression exp = rule.parse(formu);	//���
			long result = exp.evalLong(); 	//�v�Z���{
			String wc = extStrp(aft, beg, tar, 0);
			wc = priRep(wc, "\r\n", "");
			return priRep(aft, wc, String.valueOf(result));
		}else
			return aft;
	}
	public static void fornAdd(){repcount++;}
	private static int repcount2 = 0;
	public static String forn2(String aft, String beg, String tar){
		if(aft.indexOf("#for(") != -1 && aft.indexOf(")#") != -1){
			String formu = extStr(aft, beg, tar);
			formu = priRep(formu, "n", String.valueOf(repcount2++));//���������o��
			Rule rule = ExpRuleFactory.getDefaultRule();//�C���X�^���X��
			Expression exp = rule.parse(formu);	//���
			long result = exp.evalLong(); 	//�v�Z���{
			String wc = extStrp(aft, beg, tar, 0);
			wc = priRep(wc, "\r\n", "");
			return priRep(aft, wc, String.valueOf(result));
		}else
			return aft;
	}
	public static String beg(String str, String chr){
		if(str.indexOf(chr) != -1)
			str = str.substring(0, str.indexOf(chr));
		else
			str = "";
		return str;
	}
	public static String tar(String str, String chr){
		if(str.indexOf(chr) != -1)
			str = str.substring(str.indexOf(chr) + chr.length());
		else
			str = "";
		return str;
	}
	//���s�P�ʂŕ�������(�󔒍s�J�b�g����)�@�������镶����
	public static String[] splitln(String str){
		str += "\n";
		ArrayList<String> al2 = new ArrayList<String>();
		int index = 0;
		int h = -1;
		int cou = 0;
		while(true){
			index = str.indexOf("\n", h + 1);
			if(index == -1)break;
				String a = str.substring(h + 1, index);
				if(a.length() != 0)
					al2.add(a);
			h = index;
			cou++;
		}
		String[] rv = al2.toArray(new String[al2.size()]);
		return rv;
	}
	//String�^�����̒l�ɐi�߂�(�������啶����������)
	public static String nextString(String str){
		int leng = str.length() - 1;
		char[] c = str.toCharArray();//String�𕡎�
		int n;
		for(n = 0 ; n < leng + 1; n++){
			int index = leng - n;
			if(c[index] == '9')
				c[index] += 'A' - '9';		//9��A�ɕϊ�
			else if(c[index] == 'Z')
				c[index] += 'a' - 'Z';		//Z��a�ɕϊ�
			else if(c[index] == 'z'){
				c[index] += '0' - 'z';		//z��0�ɕϊ�
				continue;			//���̕����ɐi�߂�(���オ��)
			}
			else
				c[index]++;			//��������i�߂�
			break;					//continue��������ΏI��
		}
		str = String.valueOf(c);
		if(n - 1 == leng && c[0] == '0')str = '0' + str;	//�ő包�Ō��オ�肵����擪��0�ǉ�
		return str;
	}
	
	//��ʓI�ȃR�}���h���C�������̑Ó������m�F���邽�߂̐��K�\����Ԃ�
	//"ops"��-op -p -pos �Ȃǂ𐳂������̂Ƃ���
	public String getSeiki(String ops){
		String seiki = "-([" + ops + "])(?!\\1)";
		for(int n = 2; n < ops.length(); n++)
		{
			seiki += "([" + ops + "])?";
			for(int m = 1; m <= n; m++)
				seiki += "(?!\\" + m + ")";
		}
		seiki += "[" + ops + "]?$";
		return seiki;
	}
}
