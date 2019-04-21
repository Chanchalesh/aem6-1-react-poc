package com.aem6dot1pocjoshi.aem.react.api;

public interface OsgiServiceFinder {
  /**
   * returns the osgi service assuing there is only one.
   *
   * @param name
   *          fully qualified class name
   * @return A JsProxy wrapped around the osgi service
   */
  public JsProxy get(String name);
}
