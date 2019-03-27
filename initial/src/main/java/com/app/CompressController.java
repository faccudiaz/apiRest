package com.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.models.Compress;
import com.models.CompressResult;
import com.services.CompressService;

@RestController
public class CompressController {
	
	@RequestMapping(value = "/compress/", method = RequestMethod.POST)
	public ResponseEntity<CompressResult> update(@RequestBody Compress compress) {
		CompressResult returnValue = new CompressResult(CompressService.compress(compress.getValue()));
	    return new ResponseEntity<CompressResult>(returnValue, HttpStatus.OK);
	}
}