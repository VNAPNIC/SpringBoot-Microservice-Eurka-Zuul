package com.am.app.emp.client.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.am.app.emp.client.bean.AlbumBean;

// For testing External Rest APi using OpenFeign
@FeignClient(url="https://jsonplaceholder.typicode.com", name="album-service")
public interface AlbumClientService {
	
	@GetMapping("/albums")
	public List<AlbumBean> getAllAlbums();

}
