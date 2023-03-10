/*
 * Copyright 2017 GU.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.corpus_tools.pepperModules_SqueezerModule;
import org.corpus_tools.pepper.modules.PepperModuleProperties;
import org.corpus_tools.pepper.modules.PepperModuleProperty;
/**
 *
 * @author Luke Gessler
 */
public class SqueezerModuleManipulatorProperties extends PepperModuleProperties {
    public static final String PREFIX = "Squeezer.";
    public static final String TARGET_LAYER = PREFIX + "targetLayer";
    public SqueezerModuleManipulatorProperties() {
        this.addProperty(new PepperModuleProperty<String>(TARGET_LAYER, String.class, "When non-null, limit operations to nodes in this layer.", null, false));
    }
    public String getTargetLayer() {
        return (String) this.getProperty(TARGET_LAYER).getValue();
    }
}
