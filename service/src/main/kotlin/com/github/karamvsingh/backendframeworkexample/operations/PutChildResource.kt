package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.PutChildResourceInput
import com.github.karamvsingh.backendframeworkexample.PutChildResourceOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "PutChildResource")
fun putChildResource(input: PutChildResourceInput, context: Context): PutChildResourceOutput {
    return PutChildResourceOutput(input.data)
}