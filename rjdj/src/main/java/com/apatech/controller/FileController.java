package com.apatech.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;





@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping("/toPage")
	public String toPage() {
		return "file/page";
	}
	private String sfile = "";//存放图片名称
	
	 /**
     * 单个文件上传
     * @param request
     * @return
     */
    @RequestMapping(value="/upload2",produces="text/html;charset=utf-8")
    @ResponseBody
    private String upload2(@RequestParam(value = "file",required = false) CommonsMultipartFile  partFile,HttpServletRequest request) {
        try {
           String path = "/Users";
           System.out.println("这个临时文件的路径是:"+ path);
           //UUID是jdk自带的一个主键策略
      	 	String newName = UUID.randomUUID().toString().replaceAll("-", "");
      	 	//获取后缀名
      	 	System.out.println(partFile.toString());
      	 	String ententionName = partFile.getOriginalFilename().substring(partFile.getOriginalFilename().lastIndexOf("."));
           System.out.println("文件的名字："+newName+ententionName);
           partFile.transferTo(new File(path + File.separator + newName + ententionName));
           sfile=newName+ententionName;
   		return sfile;
       } catch (Exception e) {
           e.printStackTrace();
           return "文件上传失败！";
       } 
   }
	
	
	/**
	 * form表单文件上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/upload")
	 @ResponseBody
	public String upload(MultipartFile [] files) {
		System.out.println("进入upload表单文件上传");
		System.out.println(files.toString());
		
		File directory = new File("C:\\Users\\刘成\\git\\rjdj2\\rjdj\\src\\main\\resources\\static\\images");//文件保存路径
		if(!directory.exists()) {//判断是否有此文件夹
			directory.mkdirs();//创建文件夹
		}
		try {
			for(MultipartFile l : files) {
				String url = "C:\\Users\\刘成\\git\\rjdj2\\rjdj\\src\\main\\resources\\static\\images";
			   System.out.println("这个图片的上传路径是:"+ url);
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				sfile=url;
			   System.out.println("文件的名字："+url);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return "文件上传失败！";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return "文件上传失败！";
		}
		return sfile;
	}
	
	/**
	 * ajax文件上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile [] files) {
		File directory = new File("/Users/tangyong/upload");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/Users/tangyong/upload/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 文件下载
	 * @return
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte []> download(){
		try {
			FileInputStream is = new FileInputStream("/Users/tangyong/upload/QR.jpg");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", "qr.jpg");
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
