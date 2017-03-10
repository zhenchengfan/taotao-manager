package com.taotao.service;

import org.springframework.stereotype.Service;

import com.taotao.pojo.TbItem;

/**
 * 
 * @author fanzc
 */
@Service
public interface ItemService {
	
	
	TbItem getItemById(long id);
	
}
