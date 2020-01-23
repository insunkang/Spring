package di.constructor03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.WritableResource;

import book.exam.constructor.TV;
import di.constructor.basic.Insa;

public class TestMain {

	public static void main(String[] args) {
	
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("config/bean.xml");
		WriteArticleMgr MGR = factory.getBean("MGR", WriteArticleMgr.class);
		
		MGR.write(new ArticleDTO("a","b","c","d"));
		
		
	}

}