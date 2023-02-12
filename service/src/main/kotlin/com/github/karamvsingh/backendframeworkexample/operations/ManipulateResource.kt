package com.github.karamvsingh.backendframeworkexample.operations

import com.github.karamvsingh.backendframework.servicelibrary.annotations.Operation
import com.github.karamvsingh.backendframework.servicelibrary.context.Context
import com.github.karamvsingh.backendframeworkexample.ManipulateResourceInput
import com.github.karamvsingh.backendframeworkexample.ManipulateResourceOutput

@Operation("com.github.karamvsingh.backendframeworkexample", "ManipulateResource")
fun manipulateResource(input: ManipulateResourceInput, context: Context): ManipulateResourceOutput {
    return ManipulateResourceOutput("you done been manipulated")
}