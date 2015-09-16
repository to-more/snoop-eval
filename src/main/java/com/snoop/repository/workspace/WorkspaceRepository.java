package com.snoop.repository.workspace;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.snoop.model.workspace.Workspace;

public interface WorkspaceRepository {

	  @CachePut("workspaces")
	  public Workspace save(Workspace workspace);


	  @Cacheable("workspaces")
	  public Workspace get(Long id);

	  @CacheEvict("workspaces")
	  public void delete(Long id);
}
