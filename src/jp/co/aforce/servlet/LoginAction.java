package jp.co.aforce.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Member;
import jp.co.aforce.dao.MemberDAO;
import jp.co.aforce.tool.Action;

public class LoginAction extends Action{

	public String execute(
		HttpServletRequest request, HttpServletResponse response
	)throws Exception{

		HttpSession session=request.getSession();

		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberDAO dao=new MemberDAO();
		Member member=dao.search(id, password);

		if(member!=null) {
			session.setAttribute("member", member);
			return "login-success.jsp";
		}

		request.setAttribute("id",id);
		return "login-error.jsp";
	}
}
