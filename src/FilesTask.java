import java.io.*;
//import org.apache.commons.io.FileUtils;
//import org.springframework.util.FileSystemUtils;
//import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
public class FilesTask {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\ProgDir");
		File filedir=new File("C:\\ProgDir2");
		if(!(file.isDirectory() && file.exists())) {
			file.mkdir();            //creation of directory
		}else {
			System.out.println("The Directory already exists!"); 
		}
		if(!(filedir.isDirectory() && filedir.exists())) {
			filedir.mkdir();            //creation of directory
		}else {
			System.out.println("The Directory already exists!"); 
		}

        File file1 = new File("C:\\ProgDir\\sample.txt");
        File file2= new File("C:\\ProgDir\\sample1.doc");
        File file3= new File("C:\\ProgDir\\sample2.html");
		 try {
	          //  if(file1.createNewFile())
	            //    System.out.println("File creation successful");
	           // else
	             //   System.out.println("Error while creating File, file already exists in specified path");
	  
		 if(file2.createNewFile())
             System.out.println("File creation successfull");
         else
             System.out.println("Error while creating File, file already exists in specified path");
     
	if(file3.createNewFile())
        System.out.println("File creation successfull");
    else
        System.out.println("Error while creating File, file already exists in specified path");
}
	        catch(IOException io) {
	            io.printStackTrace();
	        }
		 
		 
		   
		//file.delete();
		//File[] files = file.listFiles((d, name) -> name.endsWith(".xml"));
		 List<File> list = Arrays.asList(file.listFiles(new FilenameFilter(){

		        public boolean accept(File list, String name) {
		        	//return name.endsWith(".txt");
		            //return name.startsWith("sample"); 
		        	return name.matches("[a-zA-z 0-9]+\\.[a-z]+");
		            
		        }}));
	    System.out.println(list);
	    
	    
	    
		// String[] listsoffiles=file.list();    //listing of files
		//for(int i=0;i<listsoffiles.length;i++) {
			//System.out.println(listsoffiles[i]);
		//}
	    FileInputStream fis = null;
        FileOutputStream fos = null;
	    
        try {
 
            
            fis = new FileInputStream("C:\\Adirectioryy\\sampletxt.txt\\");
 
           
            fos = new FileOutputStream("C:\\Adirectioryyy\\sampletzt2.txt\\");
 
            int c;
 
            while ((c = fis.read()) != -1) {
 
                
                fos.write(c);
            }
 
            
            System.out.println(
                "copied the file successfully");
        }
 
       
        finally {
 
            
 
            if (fis != null) {
 
                
                fis.close();
            }
            if (fos != null) {
 
               
                fos.close();
            }
        }
    
	    
		
		System.out.println(file1.getParent());
		System.out.println(file1.getParentFile());
		
		//System.out.println(file.getParent());
		//System.out.println(file1.isHidden());
		//System.out.println(file.isHidden());
	}
}

