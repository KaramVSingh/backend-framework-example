package com.github.karamvsingh.backendframeworkexample

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent

@Suppress("unused")
class FrameworkHandler : RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    override fun handleRequest(input: APIGatewayProxyRequestEvent, context: Context): APIGatewayProxyResponseEvent {
        context.logger.log("Running request: ${input}")

        return APIGatewayProxyResponseEvent().apply {
            statusCode = 200
            body = "It's working!"
        }
    }
}