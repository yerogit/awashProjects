package org.oib.service;

import java.util.List;

import org.oib.admin.mapper.EmployeeMapper;
import org.oib.model.Units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitService {
	@Autowired
	private EmployeeMapper map;

	public void addUnit(Units u) {
		u.setStatus(1);
		map.addUnit(u);

	}

	public List<Units> searchUnit(String searchKey) {
		return map.searchUnit(searchKey);

	}

	public Units getUnitById(Long id) {
		return map.getUnitById(id);
	}

	public void updateUnit(Units u) {
		map.UpdateUnit(u);

	}

	public void deleteUnit(Long id) {
		map.deleteUnit(id);

	}

}
