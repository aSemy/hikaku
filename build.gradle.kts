plugins {
  idea
  id("com.github.ben-manes.versions") version "0.39.0"
}

group = "de.codecentric.hikaku"
version = "3.2.1-SNAPSHOT"


//
//subprojects {
//    apply plugin: 'maven'
//    apply plugin: 'signing'
//
//    sourceCompatibility = jvmVersion
//    targetCompatibility = jvmVersion
//

//    dependencies {
//        api "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
//        api "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
//        api "org.jetbrains.kotlin:kotlin-test:$kotlinVersion"
//
//        testImplementation 'org.junit.platform:junit-platform-launcher:1.7.2'
//        testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.7.2'
//        testImplementation "org.jetbrains.kotlin:kotlin-test-junit5:$kotlinVersion"
//        testImplementation 'org.assertj:assertj-core:3.20.2'
//    }
//
//    signing {
//        sign configurations.archives
//    }
//
//    uploadArchives {
//        repositories {
//            mavenDeployer {
//                beforeDeployment { MavenDeployment deployment -> signing.signPom(deployment) }
//
//                repository(url: "https://oss.sonatype.org/service/local/staging/deploy/maven2/") {
//                    authentication(userName: findProperty('ossrhUsername'), password: findProperty('ossrhPassword'))
//                }
//
//                snapshotRepository(url: "https://oss.sonatype.org/content/repositories/snapshots/") {
//                    authentication(userName: findProperty('ossrhUsername'), password: findProperty('ossrhPassword'))
//                }
//
//                pom.project {
//                    packaging = 'jar'
//
//                    url ='https://github.com/codecentric/hikaku'
//
//                    scm {
//                        connection = 'scm:git:git://github.com/codecentric/hikaku.git'
//                        developerConnection = 'scm:git:ssh://git@github.com:codecentric/hikaku.git'
//                        url = 'https://github.com/codecentric/hikaku'
//                    }
//
//                    licenses {
//                        license {
//                            name = 'Apache License, Version 2.0'
//                            url = 'http://www.apache.org/licenses/LICENSE-2.0'
//                        }
//                    }
//
//                    developers {
//                        developer {
//                            id = 'cc-jhr'
//                            name = 'Jannes Heinrich'
//                            email = '34243889+cc-jhr@users.noreply.github.com'
//                        }
//                        developer {
//                            id = 'lmller'
//                            name = 'Lovis Möller'
//                            email = 'lovis.moeller@codecentric.de'
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
