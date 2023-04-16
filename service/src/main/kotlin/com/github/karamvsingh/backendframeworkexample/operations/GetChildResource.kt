package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.GetChildResourceInput
import com.github.karamvsingh.backendframeworkexample.GetChildResourceOutput
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

@Operation("com.github.karamvsingh.backendframeworkexample", "GetChildResource")
suspend fun getChildResource(input: GetChildResourceInput, context: Context): GetChildResourceOutput {
    println("processing request")
    delay(1000.milliseconds)
    println("finished processing")
    return GetChildResourceOutput(input.childId)
}