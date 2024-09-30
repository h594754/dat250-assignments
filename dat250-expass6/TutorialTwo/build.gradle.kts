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

tasks.register<JavaExec>("runNewTask") {
    mainClass.set("org.example.NewTask")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("runWorker") {
    mainClass.set("org.example.Worker")
    classpath = sourceSets["main"].runtimeClasspath
}