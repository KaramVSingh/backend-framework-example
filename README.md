# backend-framework-example
I decided to implement a backend framework using some tools that I've enjoyed working with. This is more a toy framework than anything production ready, but it handles very nicely for very simple apis.

## Tooling
1. Kotlin - This framework is built for Kotlin.
2. API Gateway + Lambda - This framework is deployed on API Gateway and Lambda with the help of the CDK.
3. CDK - This framework comes with a CDK construct that takes in your smithy model and creates a corresponding API Gateway + Lambda
4. Smithy - This is the API modeling spec used for this framework. The smithy model is used to define the API shape and that is used in the CDK to define the APIGW shape, and in the gradle plugin to generate pojos and the framework handler.

## Project Structure
/cdk - This directory contains the CDK package for the service. This is just declares one resouce, the service which is pulled in as a CDK construct

/model - This directory contains the smithy model that defines the API shape

/service - This directory contains the service implementation. It is just a few handler functions, annotated with references to the smithy model. All the pojos are generated by the gradle plugin

## How to build and deploy

First, clone the repository

```
cd backend-framework-example
gradle build
cd cdk
cdk deploy --profile []
```

This should build the API, deploy it, create all the relevant resources in your account, and enable you to use the API live

## Example API implementation:
```
@Operation("com.github.karamvsingh.backendframeworkexample", "GetResource")
suspend fun getResource(input: GetResourceInput, context: Context): GetResourceOutput {
    return GetResourceOutput(input.organizationId)
}
```

## Why Smithy + CDK
Smithy allows me to define a REST API that exports as a JSON spec. This can be parsed by the CDK to create a bunch of resources. Right now this is just creating an API Gateway. In the future this could be extended to create alarms, log groups, tables, etc - all in the context of a single cdk construct

## Where is the implementation of the framework
I was trying out CodeCatalyst, so its all in there. If you'd like to be invited to the space, message me.