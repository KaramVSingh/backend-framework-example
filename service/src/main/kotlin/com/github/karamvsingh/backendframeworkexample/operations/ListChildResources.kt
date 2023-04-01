package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.ListChildResourcesInput
import com.github.karamvsingh.backendframeworkexample.ListChildResourcesOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "ListChildResources")
fun listChildResources(input: ListChildResourcesInput, context: Context): ListChildResourcesOutput {
    return ListChildResourcesOutput(listOf(input.organizationId, input.resourceId))
}