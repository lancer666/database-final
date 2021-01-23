package com.cuterwrite.dbfinal.dao;

import com.cuterwrite.dbfinal.entity.CartItem;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * CartItemDAO继承基类
 */
@Repository
public interface CartItemDAO extends MyBatisBaseDao<CartItem, Long> {
	List<CartItem>selectAll();
}