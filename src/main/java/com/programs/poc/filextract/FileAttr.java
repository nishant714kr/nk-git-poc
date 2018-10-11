package com.programs.poc.filextract;

import java.io.Serializable;

public class FileAttr implements Serializable {

	private static final long serialVersionUID = -7931145450248279232L;
	
	private String binaryPath;
	private String docId;
	private String fileName;
	
	public FileAttr() {}

	public FileAttr(String binaryPath, String docId, String fileName) {
		super();
		this.binaryPath = binaryPath;
		this.docId = docId;
		this.fileName = fileName;
	}

	public String getBinaryPath() {
		return binaryPath;
	}

	public void setBinaryPath(String binaryPath) {
		this.binaryPath = binaryPath;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
		
}
