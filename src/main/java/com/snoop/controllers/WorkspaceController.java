package com.snoop.controllers;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snoop.model.workspace.Workspace;
import com.snoop.repository.workspace.WorkspaceRepository;

@Controller
public class WorkspaceController {

	private final Logger logger = LoggerFactory.getLogger(WorkspaceController.class);
	private static final AtomicLong counter = new AtomicLong();
	 	
	private WorkspaceRepository workspaceRepository;
	
	@Autowired
	public void setWorkspaceRepository(WorkspaceRepository workspaceRepository) {
		this.workspaceRepository = workspaceRepository;
	}
	
	public WorkspaceRepository getWorkspaceRepository() {
		return workspaceRepository;
	}


	@ResponseBody
	@RequestMapping(value = "/workspaces/{id}", method = RequestMethod.GET)
	public Workspace getWorkspace(@PathVariable Long id) {
		return workspaceRepository.get(id);
	}

	@ResponseBody
	@RequestMapping(value = "/workspaces", method = RequestMethod.POST)
	public Workspace saveWorkspace() {
		Workspace workspace = new Workspace(counter.getAndIncrement());
		return workspaceRepository.save(workspace);
	}

	@ResponseBody
	@RequestMapping(value = "/workspaces/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		workspaceRepository.delete(id);
	}	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

		logger.debug("index() is executed!");

		Workspace wkps = new Workspace(new Long(1));
		
		if(wkps.getId().equals(null + "")){
			//TODO: do something!
		}

		workspaceRepository.save(wkps);
		
		Workspace worksFromRedis = workspaceRepository.get(wkps.getId());
		
		if(logger.isDebugEnabled()){
			logger.debug(worksFromRedis.toString());
		}
		if(logger.isInfoEnabled()){
			logger.info(worksFromRedis.toString());
		}
				
		model.put("title", "Hallo");
		model.put("msg", "Desc");
		
		return "index";
	}
	
}
