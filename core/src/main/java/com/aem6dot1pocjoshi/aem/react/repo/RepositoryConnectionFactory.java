package com.aem6dot1pocjoshi.aem.react.repo;

public interface RepositoryConnectionFactory {

	public RepositoryConnection getConnection(String subServiceName);
}
