/*
* Copyright 2013 John Ahlroos
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package fi.jasoft.plugin.configuration

/**
 * Class for configuring Jrebel
 */
class JRebelConfiguration {

    /**
     * Should JRebel be enabled for the project
     */
    boolean enabled = false

    /**
     * The location of the jrebel JAR archive
     */
    String location

    /**
     * @see JRebelConfiguration#enabled
     *
     * @param enabled
     */
    void enabled(boolean enabled) {
        this.enabled = enabled
    }

    /**
     * @see JRebelConfiguration#location
     *
     * @param location
     */
    void location(String location) {
        this.location = location
    }
}
