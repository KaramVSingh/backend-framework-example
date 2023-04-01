package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.ListResourceShape
import com.github.karamvsingh.backendframeworkexample.ListResourcesInput
import com.github.karamvsingh.backendframeworkexample.ListResourcesOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "ListResources")
fun getResource(input: ListResourcesInput, context: Context): ListResourcesOutput {
    val label = input.label
    val list = listOf(
        ListResourceShape(some = "SOME", structure = label),
        ListResourceShape(some = "SOME", structure = label),
        ListResourceShape(some = "SOME", structure = label),
        ListResourceShape(some = "SOME", structure = label),
    )

    return ListResourcesOutput(
        resources = list,
        number = "25"
    )
}