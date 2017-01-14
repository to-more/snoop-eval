package com.snoop.repository.workspace;

import org.springframework.stereotype.Component;

import com.snoop.model.workspace.Workspace;

@Component
public class WorkspaceRepositoryImpl implements WorkspaceRepository{

	public String workspaceRepositoryImpl = "WorkspaceRepositoryImpl";

	@Override
	public Workspace save(Workspace workspace) {

		return workspace;
	}

	@Override
	public Workspace get(Long id) {
		Workspace workspace = new Workspace(id);
		if(workspace == null) throws Exception("")
		return workspace;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

}
