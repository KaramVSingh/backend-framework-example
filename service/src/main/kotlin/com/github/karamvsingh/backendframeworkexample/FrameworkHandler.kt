package com.github.karamvsingh.backendframeworkexample

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent

@Suppress("unused")
class FrameworkHandler : RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    override fun handleRequest(input: APIGatewayProxyRequestEvent, context: Context): APIGatewayProxyResponseEvent {
        context.logger.log("Running request: $input")
//        val resource = input.resource
//        val method = input.httpMethod
//
//        val apiContext = com.github.karamvsingh.backendframework.servicelibrary.context.Context()
//
//        val result = try {
//            when ("$method+$resource") {
//                // GetResource
//                "GET+/Resource/{organizationId}/{resourceId}" -> try {
//                    getResource(GetResourceInput.from(input), apiContext).toApiOutput()
//                } catch (e: ServiceError) {
//                    when (e) {
//                        is ResourceNotFound -> e.toApiOutput()
//                        else -> throw IllegalStateException("NO")
//                    }
//                }
//                // ManipulateResource
//                "POST+/Resource/{organizationId}/{resourceId}/wow/{label}" -> manipulateResource()
//                // GetChildResource
//                "GET+/Resource/{organizationId}/{resourceId}/ChildResource/{childId}" -> ""
//                // PutChildResource
//                "POST+/Resource/{organizationId}/{resourceId}/ChildResource/{childId}" -> ""
//                // ListChildResources
//                "GET+/Resource/{organizationId}/{resourceId}/ChildResource" -> ""
//                else -> throw OperationNotFound("NO")
//            }
//        } catch (e: FrameworkError) {
//
//        } catch (e: Exception) {
//
//        }

        return APIGatewayProxyResponseEvent().apply {
            statusCode = 200
            body = "It's working!"
        }
    }
}