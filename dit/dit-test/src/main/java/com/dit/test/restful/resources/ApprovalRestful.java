package com.dit.test.restful.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.dit.test.restful.model.DarkInputParam;
import com.dit.test.restful.model.DarkList;
import com.dit.test.restful.model.DarkListBody;
import com.dit.test.restful.model.DarkListReturnData0;
import com.dit.test.restful.model.DarkListReturnData1;
import com.dit.test.restful.model.Head;


@Path("/dark")
@Component
public class ApprovalRestful {
	
	@POST
	@Path("/darkList")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public DarkList retrieveApprWaitList( DarkInputParam apprInput ) {
		
		// 접속 로그 남기기 : 추후 추가 
		
		DarkList result = new DarkList();
		
		try {
			
			// 3. 데이터 가공 및 JAXB 처리
			List<DarkListReturnData0> returnData0 = new ArrayList<DarkListReturnData0>();
					
			DarkListReturnData0 returnItem = new DarkListReturnData0();
			
			returnItem.setId("1111111111111");
			returnItem.setName("오민돌");

			returnData0.add(returnItem);
			
			DarkListReturnData1 returnData1 = new DarkListReturnData1(1, 10);
			
			Head head = new Head(0, Response.Status.OK.toString());
			DarkListBody body = new DarkListBody(returnData0, returnData1);
			result = new DarkList(head, body);
		
		} catch(Exception e) {
			Head head = new Head(1, "Error");
			result = new DarkList(head, null);
		}
		
		return result;
		
	}	

}