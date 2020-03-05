package ca.fieber.meat.baloney

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BaloneyApplication

fun main(args: Array<String>) {
  runApplication<BaloneyApplication>(*args)
}
