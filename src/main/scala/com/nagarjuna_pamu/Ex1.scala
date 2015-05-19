package com.nagarjuna_pamu

class Fraction(val num: Int, val denum: Int) {
  def *(that: Fraction) = Fraction(this.num * that.num, this.denum * that.denum)
  override def toString = s"$num/$denum"
}

object Fraction {
  def apply(num: Int, denum: Int) = new Fraction(num, denum)
  def unapply(input: Fraction) = if (input.denum == 0) None else Some((input.num, input.denum))
}

object DemoIt {
  def main(args: Array[String]): Unit = {
    var Fraction(num, denum) = Fraction(1, 2) * Fraction(1, 4)
    println(num + " " + denum)
  }
}