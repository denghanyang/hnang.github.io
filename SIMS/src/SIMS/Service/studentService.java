package SIMS.Service;

import SIMS.Entity.Student;

public interface studentService {
	//��ͨ�û���¼
	Student login(String name,String password);
	//��ͨ���û�ע��
	Student signup(String name, String password, String _class, String grade, int age, String email);
	
	
}
