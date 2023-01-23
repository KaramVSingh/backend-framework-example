$version: "2"
namespace github.karamvsingh.backendframeworkexample

resource ChildResource {
    identifiers: { organizationId: OrganizationId, resourceId: ResourceId, childId: String },
    read: GetChildResource,
    create: PutChildResource,
    list: ListChildResources,
}

@readonly
operation ListChildResources {
    input: ListChildResourcesInput,
    output: ListChildResourcesOutput,
}

@input
structure ListChildResourcesInput for ChildResource {
    @required
    $organizationId

    @required
    $resourceId
}

@output
structure ListChildResourcesOutput {
    @required
    @notProperty
    names: NameList
}

list NameList {
    member: String
}

operation PutChildResource {
    input: PutChildResourceInput,
    output: PutChildResourceOutput,
}

@input
structure PutChildResourceInput for ChildResource {
    @required
    $organizationId

    @required
    $resourceId

    @required
    data: String
}

@output
structure PutChildResourceOutput {
    @required
    @notProperty
    name: String
}

@readonly
operation GetChildResource {
    input: GetChildResourceInput,
    output: GetChildResourceOutput
}

@input
structure GetChildResourceInput for ChildResource {
    @required
    $organizationId

    @required
    $resourceId

    @required
    $childId
}

@output
structure GetChildResourceOutput {
    @required
    @notProperty
    name: String
}