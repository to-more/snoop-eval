package com.snoop.repository.workspace;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.snoop.model.workspace.Workspace;

public interface WorkspaceRepository {

	/**
	   * The User that is saved from this method will be stored in the
	   * cache and referenced by its' ID.
	   */
	  @CachePut("workspaces")
	  public Workspace save(Workspace workspace);

	  /**
	   * This method should never actually be executed, since the User will
	   * always be retrieved from the cached output of saveUser.
	   */
	  @Cacheable("workspaces")
	  public Workspace get(Long id);

	  /**
	   * When this method is called, the cached User will be deleted from
	   * the cache.
	   */
	  @CacheEvict("workspaces")
	  public void delete(Long id);
}
