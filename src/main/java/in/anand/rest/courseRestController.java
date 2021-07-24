package in.anand.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseRestController {
	
	@GetMapping("/course/{cname}")
	public String getCourseDetails(@PathVariable("cname") String cname)
	{
		
		String msg="";
		if("SBMS".equals(cname))
		{
			msg="morning classes";
		}else if("JRTP".equals(cname))
		{
			msg="Evening time";
		}else {
			msg="contat admin";
		}
		return msg;
	}
	
	@GetMapping("/Fee/{cname}/trainer/{tname}")
	public String getCourseFee(@PathVariable("cname") String cname,@PathVariable("tname") String tname) {
		
		String msg="";
		
		msg=cname+" teached by"+tname+" and fee is 5000 INR only";
		return msg;
		
	}

}
