import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val p = project {
    name = "kobalt-test"
    group = "com.example"
    artifactId = name
    version = "0.1"

    dependencies {
//        compile("com.beust:jcommander:1.68")
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.3.50")
    }

    dependenciesTest {
        compile("org.testng:testng:6.11")
    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }
}
