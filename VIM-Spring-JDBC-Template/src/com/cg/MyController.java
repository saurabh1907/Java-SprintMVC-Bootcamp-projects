package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.dao.CarDAO;
import com.cg.dto.CarDTO;

@Controller
@RequestMapping("/controller")

public class MyController {

	@Autowired
	private CarDAO carDAO;

	private static final String ACTION_KEY = "action";
	private static final String VIEW_CAR_LIST_ACTION = "viewCarList";
	private static final String ADD_CAR_ACTION = "addCar";
	private static final String SAVE_CAR_ACTION = "saveCar";
	private static final String EDIT_CAR_ACTION = "editCar";
	private static final String DELETE_CAR_ACTION = "deleteCar";
	private static final String ERROR_KEY = "errorMessage";

	@RequestMapping(method = RequestMethod.GET)
	String viewAllCars(@RequestParam("action") String action, ModelMap map) {
		System.out.println(action);
		
		if(VIEW_CAR_LIST_ACTION.equals(action)){
			
			
		}else if(ADD_CAR_ACTION.equals(action)){
			return "carForm";
		}
		
		return "carList";
	}
	
	@ModelAttribute("carList")
	public List<CarDTO> getCarList(){
		System.out.println("Got cars from repository");
		return carDAO.findAll();
	}
	
	
	
	@ModelAttribute("car")
	public CarDTO getCar(){
		System.out.println("Created car in memory");
		return new CarDTO();
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveCar(@ModelAttribute("car") CarDTO car, @RequestParam("action") String action, ModelMap map){
		if(SAVE_CAR_ACTION.equals(action)){
			carDAO.create(car);
		}
		
		return "carList";
	}
	
	
	
}
