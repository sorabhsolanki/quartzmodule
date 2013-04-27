package com.quartz.module.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.filemaker.reader.UploadedFileListener;

public class FileListenerJob implements Job{

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		UploadedFileListener fileListener = new UploadedFileListener("[a-z]");
		System.out.println("File Listener Job : No Of Files Uploaded :: " + fileListener.getNumberOfFiles());
	}

}
