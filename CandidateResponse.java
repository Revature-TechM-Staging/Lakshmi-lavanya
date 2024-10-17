package com.revature.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	public class CandidateResponse {
		
		
	
	private Long id;
    private String name;
    private String email;
    private String Address;
    
	}
