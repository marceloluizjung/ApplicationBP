package br.com.breakingpizza.breakingpizza.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.breakingpizza.breakingpizza.database.TenantContext;

@Component
public class TenantInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String tenantSchema = request.getHeader("tenant-schema");
		TenantContext.setTenantSchema(tenantSchema);
		System.out.println("#################### " + tenantSchema);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		TenantContext.setTenantSchema(null);
	}

}