$version: "2"
namespace com.github.karamvsingh.backendframeworkexample

resource Resource {
    identifiers: { organizationId: OrganizationId, resourceId: ResourceId },
    read: GetResource,
    operations: [ ManipulateResource ],
    resources: [ ChildResource ]
}

@pattern("^[A-Za-z0-9 ]+$")
string ResourceId

@pattern("^[A-Za-z0-9 ]+$")
@length(min: 0, max: 20)
string OrganizationId

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
