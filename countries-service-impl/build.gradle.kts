dependencies {
    implementation(project(":countries-service-common"))
    implementation(project(":countries-service-integration:v1"))
    implementation(project(":countries-service-gateway:countries"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}