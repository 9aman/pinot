/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.segment.local.io.writer.impl;

import java.io.Closeable;
import java.math.BigDecimal;


public interface VarByteChunkWriter extends Closeable {
  void putBigDecimal(BigDecimal value);

  void putString(String value);

  void putBytes(byte[] value);

  void putIntMV(int[] values);

  void putLongMV(long[] values);

  void putFloatMV(float[] values);

  void putDoubleMV(double[] values);

  void putStringMV(String[] values);

  void putBytesMV(byte[][] values);
}
