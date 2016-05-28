//comment is "SJIS"
package module;
import java.util.*;
//XML�e�L�X�g�̃R���g���[��(�v�f�̕����Ɠǂݎ��)
public class ReadXML
{
	private ArrayList<Data> data = new ArrayList<Data>();
	
	//con(�t�@�C���S�̃��b�Z�[�W�A���C���^�O)
	public ReadXML(String message, String main){
		message = extB(message, "<" + main + ">", "</" + main + ">");
		data.add(new Data(message));
		int count = 0;
		int index = 0;
		Data d = data.get(count);
		String inner = d.inner;
		while(count < data.size()){
			if(d.inner.indexOf("<", index) == -1){
				d = data.get(count);
				inner = d.inner;
				count++;
			}
			if(inner.indexOf("<", index) == -1)break;
			String tag = extB(inner, "<", ">", index);
			String element = getElement(tag);
			//�q�v�f�̐���
			Data child = new Data(extB(inner, tag , "</" + element + ">", index));
			data.add(child);
			d.child.add(child);
			index = inner.indexOf("</" + element + ">", index) + element.length() + 3;
		}
	}	
	
	//�ŏ��ɂ͂��܂ꂽ�Ώۂ��擾
	private static String ext(String str, String strb, String strt){
		return ext(str, strb, strt, 0);
	}
	//��(index�ȍ~�̂�)
	private static String ext(String str, String strb, String strt, int index){
		int indexb = str.indexOf(strb, index);
		int indext = str.indexOf(strt, indexb + strb.length());
		if(indexb == -1)throw new IndexOutOfBoundsException("������܂���ł���:" + strb);
		if(indext == -1)throw new IndexOutOfBoundsException("������܂���ł���:" + strt);
		return str.substring(indexb + strb.length(), indext);
	}
	
	//�ŏ��ɂ͂��܂ꂽ�Ώۂ��擾�A���񂾂��̂��c��
	private static String extB(String str, String strb, String strt){
		return extB(str, strb, strt, 0);
	}
	//��(index�ȍ~�̂�)
	private static String extB(String str, String strb, String strt, int index){
		return strb + ext(str, strb, strt, index) + strt;
	}
	
	//�^�O����v�f���擾
	private static String getElement(String tag){
		if(tag.indexOf("<") != -1){
			if(tag.indexOf(" ") != -1)
				return ext(tag, "<", " ");
			else
				return ext(tag, "<", ">");
		}else{
			if(tag.indexOf(" ") != -1)
				return ext(tag, "", " ");
			else
				return tag;
		}
	}
	
	
	//�^�O�v�f��S���\��
	public void dispAll(){
		System.out.println("---disp start---");
		for(Data d: data)
			System.out.println(d.toString() + "\n");
		System.out.println("\n---disp end---");
	}
	
	//�f�[�^�N���X
	static class Data
	{
		public String element;//�v�f
		public ArrayList<Attribute> attribute = new ArrayList<Attribute>();//����
		public String inner;//�^�O�ɋ��܂ꂽ�̒l
		public ArrayList<Data> child = new ArrayList<Data>();
		
		private String tag;
		//con(�v�f���A�������X�g�A�^�O��)
		Data(String element, ArrayList<Attribute> attribute, String inner){
			setData(element, attribute, inner);
		}
		//con(�^�O�A�^�O��)
		Data(String tag, String inner){
			setData(tag, inner);
		}
		//con(�^�O����I�[�^�O)
		Data(String all){
			setData(all);
		}
		
		//�R���X�g���N�^�̎󂯗���
		//�K�����s�����
		private void setData(String element, ArrayList<Attribute> attribute, String inner){
			this.element = element;
			this.attribute = attribute;
			this.inner = inner;
		}
		private void setData(String tag, String inner){
			ArrayList<Attribute> attribute = new ArrayList<Attribute>();
			String[] str = tag.split("[ ><]");
			for(int n = 1; n < str.length; n++)
				attribute.add(new Attribute(str[n]));
			String element = getElement(tag);
			setData(element, attribute, inner);
		}
		private void setData(String all){
			String tag = ext(all, "<", ">");
			String inner = ext(all, "<" + tag + ">", "</" + getElement(tag) + ">");
			setData(tag, inner);
		}
		
		public String toString(){
			String str = "";
			str += "[" + element + "]\n";
			for(Attribute att: attribute)
				str += att.toString() + "\n";
			if(child.size() != 0){
				for(Data chi: child)
					str += "child:<" + chi.element + ">\n";
				str += "\n";
			}
			str += inner;
			return str;
		}
	}
	
	//�����N���X
	static class Attribute
	{
		String name;
		String value;
		
		//con(�������A�����l)
		Attribute(String name, String value){
			setAttribute(name, value);
		}
		//con(�����Ƒ����l�̉�)
		Attribute(String attribute){
			setAttribute(attribute);
		}
		
		//�R���X�g���N�^�̎󂯗���
		private void setAttribute(String name, String value){
			this.name = name;
			this.value = value;
		}
		private void setAttribute(String attribute){
			String name = ext(attribute, "", "=");
			String value = ext(attribute, "\"", "\"");
			setAttribute(name, value);
		}
		
		public String toString(){
			return name + "=\"" + value + "\"";
		}
	}
}