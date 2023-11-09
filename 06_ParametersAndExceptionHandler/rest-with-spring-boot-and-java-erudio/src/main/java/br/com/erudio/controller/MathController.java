package br.com.erudio.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {

	private static final AtomicLong counter= new AtomicLong();
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numerOne}/{numerTwo}", method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numerOne") String numberOne,
			@PathVariable(value = "numerTwo") String numberTwo
			) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please a set a numeric value!");
		}
		
		return math.sum(NumberConverter.convertToDouble(numberOne) ,NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/subtraction/{numerOne}/{numerTwo}", method = RequestMethod.GET)
	public Double subtraction(
			@PathVariable(value = "numerOne") String numberOne,
			@PathVariable(value = "numerTwo") String numberTwo
			) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please a set a numeric value!");
		}
		
		return math.subtraction(NumberConverter.convertToDouble(numberOne) ,NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/multiplication/{numerOne}/{numerTwo}", method = RequestMethod.GET)
	public Double multiplication(
			@PathVariable(value = "numerOne") String numberOne,
			@PathVariable(value = "numerTwo") String numberTwo
			) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please a set a numeric value!");
		}
		
		return math.multiplication(NumberConverter.convertToDouble(numberOne) ,NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/division/{numerOne}/{numerTwo}", method = RequestMethod.GET)
	public Double division(
			@PathVariable(value = "numerOne") String numberOne,
			@PathVariable(value = "numerTwo") String numberTwo
			) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please a set a numeric value!");
		}
		
		return math.division(NumberConverter.convertToDouble(numberOne) ,NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/average/{numerOne}/{numerTwo}", method = RequestMethod.GET)
	public Double average(
			@PathVariable(value = "numerOne") String numberOne,
			@PathVariable(value = "numerTwo") String numberTwo
			) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please a set a numeric value!");
		}
		
		
		return math.average(NumberConverter.convertToDouble(numberOne) ,NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/square/{numer}", method = RequestMethod.GET)
	public Double square (
			@PathVariable(value = "numer") String number
			) throws Exception {
		if(!NumberConverter.isNumeric(number) ) {
			throw new UnsupportedMathOperationException("Please a set a numeric value!");
		}
		
		return math.square(NumberConverter.convertToDouble(number)) ;
	}
	
	
	
}
