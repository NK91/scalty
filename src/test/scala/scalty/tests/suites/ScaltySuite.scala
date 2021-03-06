package scalty.tests.suites

import org.scalatest.{FunSuite, Matchers}
import scalty.types.{AllTypesAlias, AllTypesExtensions}

/**
  * Created by kisilnazar on 01.10.16.
  */
trait ScaltySuite
    extends FunSuite
    with Matchers
    with AllTypesAlias
    with AllTypesExtensions
