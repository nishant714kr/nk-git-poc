package com.programs.poc.filextract;

import java.sql.SQLException;
import java.util.List;

public class Application {
	
	public static void main (String args[]) throws SQLException {
		DBFileDtlFetcher objDb = new DBFileDtlFetcher();
		List<FileAttr> fileList = objDb.collectDocumentDetails();
		objDb = null;
		SFTPFileCopier objSftp = new SFTPFileCopier();
		for(FileAttr fileDtl : fileList) {
			System.out.println(fileDtl.getBinaryPath()+"/"+fileDtl.getDocId()+"\t\t"+fileDtl.getFileName());
			objSftp.importFiles(fileDtl.getBinaryPath()+"/"+fileDtl.getDocId(), fileDtl.getFileName());
		}
		objSftp = null;
	}

}
