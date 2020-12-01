package com.digital.marketing.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Segments")
public class Segment {

    @DynamoDBHashKey(attributeName = "segment_id")
    private Integer id;

    @DynamoDBAttribute(attributeName = "segment_name")
    private String name;

    @DynamoDBAttribute(attributeName = "segment_desc")
    private String description;

}
