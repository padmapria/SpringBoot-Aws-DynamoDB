# SpringBoot-Aws-DynamoDB
User should have this policy added
{    
    "Version": "2012-10-17",        
    "Statement": [    
        {
            "Effect": "Allow",    
            "Action": "dynamodb:PutItem",    
            "Resource": "*"    
        }    
        ]    
}
