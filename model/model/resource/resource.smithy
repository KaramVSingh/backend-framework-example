$version: "2"
namespace com.github.karamvsingh.backendframeworkexample

resource Resource {
    identifiers: { organizationId: OrganizationId, resourceId: ResourceId },
    read: GetResource,
    list: ListResources,
    operations: [ ManipulateResource ],
    resources: [ ChildResource ]
}

@pattern("^[A-Za-z0-9 ]+$")
string ResourceId

@pattern("^[A-Za-z0-9 ]+$")
@length(min: 0, max: 20)
string OrganizationId

@readonly
operation ListResources {
    input: ListResourcesInput,
    output: ListResourcesOutput,
}

@input
structure ListResourcesInput for Resource {
    @httpQuery("someLabel")
    label: String
}

@output
structure ListResourcesOutput {
    resources: ListResourceList

    @httpHeader("numberOfResources")
    number: String
}

list ListResourceList {
    member: ListResourceShape
}

structure ListResourceShape {
    @required
    some: String
    structure: String
}

@readonly
operation GetResource {
    input: GetResourceInput,
    output: GetResourceOutput,
    errors: [ ResourceNotFound ]
}

@input
structure GetResourceInput for Resource {
    @required
    $organizationId

    @required
    $resourceId
}

@output
structure GetResourceOutput {
    @notProperty
    name: String
}

@http(method: "POST", uri: "/wow/{label}", code: 204)
operation ManipulateResource {
    input: ManipulateResourceInput,
    output: ManipulateResourceOutput,
}

@input
structure ManipulateResourceInput for Resource {
    @required
    $organizationId

    @required
    $resourceId

    @required
    @httpLabel
    label: String

    @httpQuery("query")
    @length(min: 0, max: 20)
    query: String

    structure: MyStructure
}

structure MyStructure {
    memberOne: String
    memberTwo: String
}

@output
structure ManipulateResourceOutput {
    @required
    @notProperty
    name: String
}
