package org.codelogger.web.filter;

import org.codelogger.web.bean.SpringMarvelServlet;

public abstract class SpringMarvelFilter<T extends SpringMarvelServlet> extends MarvelFilter<T> {

  @Override
  public abstract T buildMarvelServlet();

}
