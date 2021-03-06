/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rowangames.ascii2048

import org.cosplay.*
import CPColor.*
import CPKeyboardKey.*
import prefabs.images.ani.*
import prefabs.scenes.*
import prefabs.shaders.*
import CPFIGLetFont.*

val CS = Seq(C_NAVY_BLUE, C_DARK_GREEN, C_STEEL_BLUE13, C_LIGHT_SEA_GREEN, C_SPRING_GREEN4)


object Ascii2048:
    def main(args: Array[String]): Unit =
        val bgPx = CPPixel('.', C_GRAY2, C_GRAY1) // Background pixel.
        val dim = CPDim(80, 20) // Dimension for the scenes.

        // Initialize the engine.
        CPEngine.init(CPGameInfo(name = "ASCII 2048", initDim = Option(dim)))

        try CPEngine.startGame(
            new CPLogoScene("logo", None, bgPx, CS, "title"),
        )
        finally CPEngine.dispose()
    
        sys.exit(0)
