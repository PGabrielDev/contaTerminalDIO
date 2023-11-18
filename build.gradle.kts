plugins {
    id("java")
    application
}

group = "com.pggm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    // Configuração da aplicação
    mainClass = "com.pggm.ContaTerminal"
}

tasks.test {
    useJUnitPlatform()
}


