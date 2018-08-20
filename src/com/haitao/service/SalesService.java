package com.haitao.service;

import java.util.List;

import com.haitao.dao.SalesDao;
import com.haitao.entity.Sales;

public class SalesService {
	SalesDao dao = new SalesDao();
	// ���ۼ�¼�������Ϣ
	public boolean updateSales(Sales sales){
		return dao.updateSales(sales);
		
	}
	// ���ۼ�¼��ɾ����Ϣ
	public boolean  deleteSales(Integer SalesId){
		return dao.deleteSales(SalesId);
	}
	// ��ѯ���ۼ�¼��
	public List<Sales> selectAllsales(){
		return dao.selectAllSal();
	}
	// ͨ������id��ѯ
	public Sales selectsalesById(Integer  SalesId){
		return dao.selectSalById(SalesId);
	}
	// ѡ�񶩵���������
	public int SelectCount(){
		int i =dao.SelectCount();
		int count =(i%10==0)?(i/10):(i/10+1);
		return count;
	}
	// ѡ�񶩵���ǰҳ��
	public List<Sales> selectPagesales(Integer page){
		return dao.selectPageSal(page);
	}
	// ������������ѯ
	public List<Sales> select_TJ(String tj, String value) {
		return dao.select_TJ(tj, value);
	}
}
