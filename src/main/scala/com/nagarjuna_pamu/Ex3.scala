package com.nagarjuna_pamu

object Name {
  def unapplySeq(name: String): Option[Seq[String]] = {
    val pieces = name.split("\\s+")
    if (pieces.length == 0) None else Some(pieces.toSeq)
  }
}

object Ex3 {
  def main(args: Array[String]): Unit = {
    var Name(first, last) = "Pamu Nagarjuna"
    println(s"first name :  $first and second name : $last")
  }
}