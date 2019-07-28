package priv.jihua.struts2.web.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件上传
 * 
 * @author 焦计划
 * @date 2019年7月7日 上午9:01:00
 */
public class UploadAction extends ActionSupport {
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public void doUpload() {
		System.out.println(upload.getName());
		System.out.println(upload.getAbsolutePath());
		System.out.println(uploadContentType);
		System.out.println(uploadFileName);
	}

}
