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

	public Workspace getLong(Long id) throws Exception {
		Workspace workspace = new Workspace(id);
		if(workspace.getId().equals(null + "")) 
			throw new Exception("");
		return workspace;
	}

	@Override
	public Workspace get(Long id) {
		Workspace workspace = new Workspace(id);
		if(workspace.getId().equals(null + "")) {
			//TODO
		}
		return workspace;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

}
