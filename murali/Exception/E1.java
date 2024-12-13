import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class E1{
    public static void main(String[] args){
        String fileName="test.txt";
        try{
            String fileContent=new E1().readFile(fileName);
            System.out.println(fileContent);
       }    catch(FileNotFoundException e){
                System.out.println("File "+fileName+" is missing"); 
   }        catch(IOException e){
                System.out.println("Fileis not having permission is missing"); 
   }
}
    public String readFile(String fileName) throws FileNotFoundException,IOException{
        FileInputStream fin;
        int i;
        String s="";
        fin=new FileInputStream(fileName);
        do{
	i=fin.read();
	if(i!=-1) s=s+(char)i+"";
        }
	while(i!=-1);
        fin.close();
        return s;
}
}
