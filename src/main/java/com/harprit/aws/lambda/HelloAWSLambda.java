package com.harprit.aws.lambda;

import java.util.HashMap;

public class HelloAWSLambda {

	public Response handler(Request request) {
		String message = String.format("Hello %s", request.pathParameters.get("name"));
		return new Response(200, message);
	}
	
	public static class Request {
		public HashMap<String, String> pathParameters = new HashMap<>();
	}
	
	public static class Response {
		public Integer statusCode;
		public String body;
		
		public Response(Integer statusCode, String body)  {
			this.statusCode = statusCode;
			this.body = body;
		}
	}
}
