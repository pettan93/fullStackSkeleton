package cz.kalas.knet.approvalportal.deployer.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class DeployerApplication

fun main(args: Array<String>) {
    runApplication<DeployerApplication>(*args)
}
