package com.priya.springbootdynamodb.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@DynamoDBDocument
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	@DynamoDBAttribute
    private String city;
    
     @DynamoDBAttribute
    private String state;
     
     @DynamoDBAttribute
    private long pinCode;
}