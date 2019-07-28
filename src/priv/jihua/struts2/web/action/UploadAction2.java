package priv.jihua.struts2.web.action;

import java.io.File;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件上传，多个文件
 * 
 * @author 焦计划
 * @date 2019年7月7日 上午9:25:17
 */
public class UploadAction2 extends ActionSupport {
	private List<File> upload;
	private List<String> uploadFileType;
	private List<String> uploadFileName;

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadFileType() {
		return uploadFileType;
	}

	public void setUploadFileType(List<String> uploadFileType) {
		this.uploadFileType = uploadFileType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public void doUploads() {
		for(String name:uploadFileName) {
			System.out.println(name);
		}
	}

}
