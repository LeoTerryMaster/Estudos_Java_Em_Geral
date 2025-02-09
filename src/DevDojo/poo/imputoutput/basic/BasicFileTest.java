package DevDojo.poo.imputoutput.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileTest{

	public static void main(String[] args) throws IOException{
		
		
		LocalDateTime date = LocalDateTime.now().minusDays(10);
		File file = new File("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\pastas\\novo.txt");
		boolean isCreated = file.createNewFile();
		System.out.println(isCreated);
		boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
		System.out.println(isModified);
		
		
		
		
		Path path = Paths.get("I:\\GITHUB\\PROJETOS_EM_ANDAMENTOS\\Estudos_Java_Em_Geral\\pastas\\novo2.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
		Files.setLastModifiedTime(path, fileTime);
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
	
	}
	
	
	
	
}
