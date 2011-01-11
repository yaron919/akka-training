package akka.training

import akka.actor._
import akka.actor.Actor._
import akka.training.AccumulatorActor._

object AccumulatorActor {
  case class IncrementBy(num: BigInt)
  case object Sum
}

class AccumulatorActor extends Actor {
  def receive = {

  }
}