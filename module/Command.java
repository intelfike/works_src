package module;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Command{
	
  	private static InputStream in = null;   	
  	
  	private static InputStream ein = null;
  	
  	private static OutputStream out = null;
  	
  	private static BufferedReader br = null;
  	
  	private static BufferedReader ebr = null;
	
  	private static Process process = null;
	
  	private static String line = null;
	
  	private static String errLine = null;
	
  	private static Thread stdRun  = null;
    
  	private static Thread errRun  = null;    
    

	public Command() {	
	}	
	
	public static void execCmd(String[] cmd) throws IOException, InterruptedException{	 
		try{
			process = Runtime.getRuntime().exec(cmd);
			
			/* 1 �T�u�v���Z�X�̓��̓X�g���[�����擾 */
			in = process.getInputStream(); 
			
			/* 2 �T�u�v���Z�X�̃G���[�X�g���[�����擾 */
			ein = process.getErrorStream();
			
			/* 3 �T�u�v���Z�X�̏o�̓X�g���[�����擾 �����ł͎g�p���܂���B*/
			out = process.getOutputStream();
			
			/* ��L��3�̃X�g���[���� finally �ŃN���[�Y���܂��B */
					
			try {
			/*��L 1 �̃X�g���[����ʃX���b�h�ŏo�͂��܂��B*/
			Runnable inputStreamThread = new Runnable(){
				public void run(){		
					try {
						br = 
						new BufferedReader(new InputStreamReader(in));
						while ((line = br.readLine()) != null) {
							System.out.println(line);
						}
					} catch (Exception e) {		
						e.printStackTrace();      	
					}
				}
			};
			/*��L 2 �̃X�g���[����ʃX���b�h�ŏo��*/
			Runnable errStreamThread = new Runnable(){
				public void run(){
					try {
						ebr = new BufferedReader(new InputStreamReader(ein));
						while ((errLine = ebr.readLine()) != null) {
							System.err.println(errLine);
						}          	
					} catch (Exception e) {
				  	  e.printStackTrace();
					}          
				}
			};
				
			stdRun = new Thread(inputStreamThread);
			errRun = new Thread(errStreamThread);
				
			/* �X���b�h���J�n���܂��B */
			stdRun.start();        
			errRun.start();
				
			/*�v���Z�X���I�����Ă��Ȃ���ΏI������܂őҋ@*/
			int c = process.waitFor();
				
			/* �T�u�X���b�h���I������̂�ҋ@ */
			stdRun.join();
			errRun.join();
				
			/*�v���Z�X�I���R�[�h�o�� */
			//System.out.println(c);
				
			} catch (Exception e) {		
			  	e.printStackTrace();		
			}finally{
			  	if(br!=null)br.close();
			  	if(ebr!=null)ebr.close();
				
			  	/* �q�v���Z�X */
			  	if(in!=null)in.close();
			  	if(ein!=null)ein.close();
			  	if(out!=null)out.close();		
			}
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}

}