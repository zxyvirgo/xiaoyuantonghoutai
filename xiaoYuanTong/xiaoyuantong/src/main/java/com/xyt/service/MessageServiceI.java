package com.xyt.service;

import java.util.List;

import com.xyt.model.Committbl;
import com.xyt.model.Messagetbl;
import com.xyt.pageModel.Commit;
import com.xyt.pageModel.Message;


//这一块暂时还没有做
public interface MessageServiceI {


		public List<Messagetbl> getMessageService(String userid); //根据用户的编号取出用户所拥有的消息列表
		public List<Committbl> getCommitService(String messageid); //找到针对某条消息的全部评论
		 
	//	public List<TransmitTbl> getTransmitService();   //读取出转发消息


	    public void insertMessage(Message message);//将消息插入数据库，完成用户的消息发送

		public void insertCommit(Commit commit); //将评论插入数据库

	//	public void inserTransmit(Transmit transmit); //将某条消息转发


}
