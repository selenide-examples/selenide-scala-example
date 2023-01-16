package org.selenide.examples.scala2

import java.time.LocalDate
import java.time.temporal.ChronoUnit

final class RetiredPerson(
  birthDate: LocalDate,
  private val retirementDate: LocalDate
) extends Person(birthDate) {
  def workingYears(): Int = ChronoUnit.YEARS.between(birthDate, retirementDate).toInt
}
