plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.rabbitmq:amqp-client:5.22.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<JavaExec>("runEmitLog") {
    mainClass.set("org.example.EmitLog")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("runReceiveLogs") {
    mainClass.set("org.example.ReceiveLogs")
    classpath = sourceSets["main"].runtimeClasspath
}