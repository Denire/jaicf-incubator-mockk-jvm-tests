rootProject.name = "jaicf-mockk-jvm-tests"
include("mockk-jvm-tests")
include("examples:hello-mocks")
findProject(":examples:hello-mocks")?.name = "hello-mocks"
