package com.wanderingwonderland.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("homePageService")
public class HomeService {

	public List<String> homeContent() {
		List<String> model = new ArrayList<String>();
		String content = "We sell fine made vintage clothing and accessories. "
				+ "	All of our items are authentic and some still even have price "
				+ "tags! We source our items from the best. Be sure to stop by the eBay"
				+ " shop to see what's for sale. Move fast because once it's gone, it's gone!";
		model.add(content);
		return model;
	}
}
