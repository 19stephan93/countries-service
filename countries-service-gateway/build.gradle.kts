allprojects {
    dependencies {
        implementation("com.fasterxml.jackson.core:jackson-databind")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.apache.httpcomponents:httpclient")
        implementation("org.jetbrains.kotlin:kotlin-noarg")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("org.springframework.boot:spring-boot-starter-actuator")
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation(project(":countries-service-common"))
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("io.springfox:springfox-swagger2:3.0.0") // swagger2
    }
}

subprojects {
    dependencies {
        implementation(project(":countries-service-gateway"))
    }
}