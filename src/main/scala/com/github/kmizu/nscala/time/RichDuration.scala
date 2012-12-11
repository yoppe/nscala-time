/**
 * Copyright 2009 Jorge Ortiz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 **/
package com.github.kmizu.nscala.time

import org.joda.time._
import com.github.kmizu.nscala.PimpedType

class RichDuration(val underlying: Duration) extends AnyRef with PimpedType[Duration] {

  def seconds: Long = underlying.getStandardSeconds

  def -(amount: Long): Duration = underlying.minus(amount)

  def -(amount: ReadableDuration): Duration = underlying.minus(amount)

  def +(amount: Long): Duration = underlying.plus(amount)

  def +(amount: ReadableDuration): Duration = underlying.plus(amount)

}
