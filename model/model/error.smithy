$version: "2"
namespace com.github.karamvsingh.backendframeworkexample

@error("client")
@retryable
@httpError(429)
structure ResourceNotFound {
    id: String
}