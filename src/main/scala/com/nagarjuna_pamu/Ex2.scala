package com.nagarjuna_pamu

object Number {
  def unapply(number: String): Option[Long] = {
    try {
      Some(number.toLong)
    }
    catch {case ex: NumberFormatException => None}
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val Number(n) = "1234"
    println(s"$n is of type : ${n getClass}")
  }
}