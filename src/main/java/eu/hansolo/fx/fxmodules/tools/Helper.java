/*
 * Copyright (c) 2021 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.fxmodules.tools;

public class Helper {
    public static final int clamp(final int min, final int max, final int value) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static final long clamp(final long min, final long max, final long value) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static final float clamp(final float min, final float max, final float value) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static final double clamp(final double min, final double max, final double value) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static final OperatingSystem getOperatingSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.indexOf("win") >= 0)
            return OperatingSystem.WINDOWS;
        if (os.indexOf("mac") >= 0)
            return OperatingSystem.MACOS;
        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0)
            return OperatingSystem.LINUX;
        if (os.indexOf("sunos") >= 0) {
            return OperatingSystem.SOLARIS;
        }
        return OperatingSystem.NONE;
    }
}
