package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate mytemplate;
	//job���̺��� ���ڵ带 �����ϴ� �޼ҵ�
	public int count() {
		return mytemplate.queryForObject("select count(*) from jobs",Integer.class);
	}
}