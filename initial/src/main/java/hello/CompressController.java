package hello;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompressController {

	@PostMapping(path = "/compress/", consumes = "application/json", produces = "application/json")
    public String test(@RequestParam(value="name", defaultValue="Facundo") String name) {
        return Test.compressString("AAABBAAAAABBBCCCCCCCCAAAAA");
    }
	
//	public ResponseEntity<CompressResult> compress(@RequestBody Compress toCompress) throws Exception {      
//		String compressedStr = Test.compressString(toCompress.getValue());
//		CompressResult compRes = new CompressResult(compressedStr);
//		return new ResponseEntity<CompressResult>(compRes, HttpStatus.OK);
//	}
	
	@PostMapping(path = "/compressTest/", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public CompressResult doSomeThing(Object input){
		CompressResult cr = new CompressResult(Test.compress(input.getValor()));
	    return cr;
	}
	
	@PostMapping(path = "/compressTest2/", consumes = "application/json", produces = "application/json")
    public CompressResult createUser(@RequestBody Compress compress) {
		CompressResult returnValue = new CompressResult(Test.compress(compress.getValor()));
//                
//        UserDto userDto = new UserDto();
//        BeanUtils.copyProperties(requestUserDetails, userDto);
//        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(compress, returnValue);
        return returnValue;
    }
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	public ResponseEntity<Car> update(@RequestBody Car car) {

	    if (car != null) {
	        car.setMiles(car.getMiles() + 100);
	    }

	    // TODO: call persistence layer to update
	    return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/compressTest3/", method = RequestMethod.POST)
	public ResponseEntity<CompressResult> update(@RequestBody Compress compress) {
		CompressResult returnValue = new CompressResult(Test.compress(compress.getValor()));
	   

	    // TODO: call persistence layer to update
	    return new ResponseEntity<CompressResult>(returnValue, HttpStatus.OK);
	}
}