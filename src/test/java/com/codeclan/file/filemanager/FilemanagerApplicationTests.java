package com.codeclan.file.filemanager;

import com.codeclan.file.filemanager.models.file;
import com.codeclan.file.filemanager.repositories.FileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemanagerApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void createFile(){
		file cars = new file("Cars", "txt", 20);
	}

}
