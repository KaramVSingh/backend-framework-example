package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.GetChildResourceInput
import com.github.karamvsingh.backendframeworkexample.GetChildResourceOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "GetChildResource")
fun getChildResource(input: GetChildResourceInput, context: Context): GetChildResourceOutput {
    return GetChildResourceOutput(input.childId)
}