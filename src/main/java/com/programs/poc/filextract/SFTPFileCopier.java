package com.programs.poc.filextract;

import com.jcraft.jsch.*;

public class SFTPFileCopier {
    public void importFiles(String binaryPathFile, String fileName) {
        JSch jsch = new JSch();
        Session session = null;
        ChannelSftp sftpChannel = null;
        try {
            session = jsch.getSession("sftp_username", "<sftp_host_ip>", 22);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword("sftp_password");
            session.connect();

            Channel channel = session.openChannel("sftp");
            channel.connect();
            sftpChannel = (ChannelSftp) channel;
            sftpChannel.get("<source path at sftp server>"+binaryPathFile
            		,"destination path at local machine"+fileName);
            sftpChannel.exit();
            session.disconnect();
        } catch (JSchException e) {
            e.printStackTrace();  
        } catch (SftpException e) {
            e.printStackTrace();
        } finally {
        	sftpChannel.exit();
            session.disconnect();
        }
    }
}