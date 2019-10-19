package cz.kalas.samples.fullstackSkeleton.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CarSkeletonApplication

fun main(args: Array<String>) {
    runApplication<CarSkeletonApplication>(*args)
}
