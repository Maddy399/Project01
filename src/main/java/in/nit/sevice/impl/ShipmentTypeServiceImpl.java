package in.nit.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IshipmentTypeDao;
import in.nit.model.ShipmentType;
import in.nit.sevice.IshipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IshipmentTypeService {
	
	@Autowired
	private IshipmentTypeDao dao;
	

	@Transactional
	public Integer SaveShipmentType(ShipmentType ob) {
		return dao.SaveShipmentType(ob);
	}

}
