package com.example.projectbrad.api.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("upload")
public class UploadController {
	
	@PostMapping("/upload")
	//@PostApiResponse
	@Transactional
	public void upload(@RequestParam MultipartFile vmExcel) throws IOException {
//		InventoryUpload inventory = inventoryService.parseAndSaveInventoryUpload(vmExcel, name);
//		inventoryService.saveLocalFile(vmExcel, name, inventory);
	}

}
