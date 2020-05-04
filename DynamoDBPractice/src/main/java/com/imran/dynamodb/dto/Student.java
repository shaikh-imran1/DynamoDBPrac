package com.imran.dynamodb.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@DynamoDBTable(tableName = "student")
public class Student
{
	@DynamoDBHashKey(attributeName = "studentId")
	@DynamoDBAutoGeneratedKey
	private String id;
	
	@DynamoDBAttribute
	private String firstName;
	
	@DynamoDBRangeKey
	private String lastName;
	
	@DynamoDBAttribute
	private Address address;
}
