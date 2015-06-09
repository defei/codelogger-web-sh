package org.codelogger.web.bean;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.i18n.LocaleContextHolder;

public class SpringMarvelServlet extends MarvelServlet {

  @Override
  public HttpServletRequest getRequest() {

    return super.getRequest();
  }

  @Override
  public void setRequest(final HttpServletRequest request) {

    super.setRequest(request);
  }

  @Override
  public HttpServletResponse getResponse() {

    return super.getResponse();
  }

  @Override
  public void setResponse(final HttpServletResponse response) {

    super.setResponse(response);
  }

  public Locale getLocale() {

    return LocaleContextHolder.getLocale();
  }

}
