package com.digital.marketing.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "segments")
public class Segment {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String segmentId;

    @DynamoDBAttribute
    private String segmentName;

    @DynamoDBAttribute
    private String lastName;

    @DynamoDBAttribute
    private Integer age;
}