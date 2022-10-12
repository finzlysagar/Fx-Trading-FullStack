package com.fxtrading.FxTradingApplication.dao;

import com.fxtrading.FxTradingApplication.entity.Print;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TradeDao  extends JpaRepository<Print, Integer>{

}
