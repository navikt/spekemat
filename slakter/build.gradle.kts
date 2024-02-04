val rapidsAndRiversVersion = "2024020421571707080262.b74e641fd6dd"
val tbdLibsVersion = "2024.01.24-11.14-4b94ed8b"
val mockkVersion = "1.13.9"

dependencies {
    api("com.github.navikt:rapids-and-rivers:$rapidsAndRiversVersion")
    api("com.github.navikt.tbd-libs:azure-token-client-default:$tbdLibsVersion")

    testImplementation("com.github.navikt.tbd-libs:mock-http-client:$tbdLibsVersion")
    testImplementation("io.mockk:mockk:$mockkVersion")
}
