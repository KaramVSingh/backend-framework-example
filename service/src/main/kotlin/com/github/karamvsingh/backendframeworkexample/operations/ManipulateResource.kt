package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.ManipulateResourceInput
import com.github.karamvsingh.backendframeworkexample.ManipulateResourceOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "ManipulateResource")
fun manipulateResource(input: ManipulateResourceInput, context: Context): ManipulateResourceOutput {
    val thing = input.structure?.let { "${it.memberOne} + ${it.memberTwo}" } ?: "no-structure-provided"
    return ManipulateResourceOutput("you done been manipulated: ${input.query} + ${input.label} + $thing")
}