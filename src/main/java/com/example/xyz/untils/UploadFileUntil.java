package com.example.xyz.untils;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

@Service
public class UploadFileUntil {
    public File hanleFile(MultipartFile file )
    {
          String Folderpath ="D:\\xyz\\src\\main\\webapp\\Storage";
        File myUploadFolder = new File(Folderpath);
        // kiểm tra foler có tồn tại hay ko
       if( !myUploadFolder.exists())    // nếu ko tồn tại thì phải tạo nó ra
       {
           myUploadFolder.mkdir(); // tạo moới
       }
      File saveFile=null;
       try {
           // lưu vào file thư mục đã chọn
           String uuid = UUID.randomUUID().toString();   // sinh ra tên ngẫu nhiên nhưng phải định dạng cho nó như .png....
           String fileName = uuid +"_"+ file.getOriginalFilename();
         //c2:
           saveFile = new File(myUploadFolder,fileName);
           file.transferTo(saveFile);

//     c1:    saveFile = new File(myUploadFolder, file.getOriginalFilename()); //getOriginalFilename : lấy tên gốc của file tải eeen để lưu
//          file.transferTo(saveFile);
       }catch (Exception e)
       {
           e.printStackTrace();
       }
       return  saveFile;
    }
}
