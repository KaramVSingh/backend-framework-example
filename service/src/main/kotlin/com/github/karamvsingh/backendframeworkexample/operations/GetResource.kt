package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.ResourceNotFound
import com.github.karamvsingh.backendframeworkexample.GetResourceInput
import com.github.karamvsingh.backendframeworkexample.GetResourceOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "GetResource")
fun getResource(input: GetResourceInput, context: Context): GetResourceOutput {
    throw ResourceNotFound("WOW")
    return GetResourceOutput("resource-name")
}