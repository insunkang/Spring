package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fornt.fw.Action;
//�߰��� ������ ����� �������Ͽ� ��ûpath�� ������ Ŭ������ ���
//���� ó���� Ŭ������ �߰�
public class LoginAction implements Action {
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�α��� ó���ϱ�");

	}

}
